# Base image 
FROM centos:7
MAINTAINER Jeremy Pumphrey <jeremypumphrey@gmail.com>

# Install packages necessary to run EAP
#RUN yum update -y && yum -y install xmlstarlet saxon augeas bsdtar unzip && yum clean all
RUN yum update -y && yum -y install xmlstarlet saxon augeas bsdtar unzip postgresql && yum clean all

# Create a user and group used to launch processes
# The user ID 1000 is the default for the first "regular" user on Fedora/RHEL,
# so there is a high chance that this ID will be equal to the current user
# making it easier to use volumes (no permission issues)
RUN groupadd -r jboss -g 1000 && useradd -u 1000 -r -g jboss -m -d /opt/jboss -s /sbin/nologin -c "JBoss user" jboss && \
    chmod 755 /opt/jboss

# Set the working directory to jboss' user home directory
WORKDIR /opt/jboss

# Install necessary packages
#RUN yum -y install java-1.8.0-openjdk-devel && yum clean all
RUN yum -y install java-1.7.0-openjdk-devel && yum clean all

#RUN  yum groupinstall jboss-eap6 -y && yum clean all
#ADD jboss-eap-6.2.0.zip /opt/
ADD https://s3.amazonaws.com/ctrp-repos/Installs/jboss-eap-6.2.0.zip /opt/
RUN ln -s /opt/jboss /opt/jboss-eap-6.2
#ADD https://s3.amazonaws.com/ctrp-repos-inttest/Installs/jboss-eap-6.2.0.zip /opt/
RUN unzip /opt/jboss-eap-6.2.0.zip

# Set the JAVA_HOME variable to make it clear where Java is located
ENV JAVA_HOME /usr/lib/jvm/java
ENV EAP_HOME /opt/jboss/jboss-eap-6.2
ENV JBOSS_HOME /opt/jboss/jboss-eap-6.2
RUN ls $JBOSS_HOME

# Add postgres module
ADD https://s3.amazonaws.com/ctrp-repos/Installs/jboss-postgres-jdbc-module.zip /tmp
RUN unzip /tmp/jboss-postgres-jdbc-module.zip
RUN mv /opt/jboss/org $JBOSS_HOME/modules/
RUN find $JBOSS_HOME/modules/ -type d

############### Box Build ABOVE ################
############### Code/Build output BELOW ########

# Add ear and standalone.xml from build
ADD target/po/dist/exploded/po-ear/po.ear $JBOSS_HOME/standalone/deployments/
RUN ls -alth $JBOSS_HOME/standalone/deployments/
COPY target/po/dist/exploded/common/resources/jboss-conf/standalone.xml $JBOSS_HOME/standalone/configuration/
RUN ls -alth $JBOSS_HOME/standalone/configuration/

# ADD Environment specific properties files
COPY ctrp.inttest.properties    $JBOSS_HOME/ctrp/ctrp.inttest.properties
COPY ctrp.uat.properties        $JBOSS_HOME/ctrp/ctrp.uat.properties
COPY ctrp.production.properties $JBOSS_HOME/ctrp/ctrp.production.properties
RUN ls -alth $JBOSS_HOME/ctrp/

#USER jboss

RUN ls -alth $JBOSS_HOME/bin/standalone*
CMD $JBOSS_HOME/bin/standalone.sh
