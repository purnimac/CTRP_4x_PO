# Base image 
FROM centos:7
MAINTAINER Jeremy Pumphrey <jeremypumphrey@gmail.com>

# Install packages necessary to run EAP
RUN yum update -y && yum -y install xmlstarlet saxon augeas bsdtar unzip && yum clean all

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
ADD https://developers.redhat.com/download-manager/file/jboss-eap-6.2.0.GA.zip /opt/
RUN unzip /opt/jboss-eap-6.2.0.zip

RUN ls /opt/jboss*



# Switch back to jboss user
USER jboss
# Set the JAVA_HOME variable to make it clear where Java is located
ENV JAVA_HOME /usr/lib/jvm/java
ENV EAP_HOME /opt/jboss
ENV JBOSS_HOME /opt/jboss

RUN which jboss
Run jboss -version
Run which java
Run java -version

ADD target/po/dist/exploded/po-ear/po.ear $JBOSS_HOME/standalone/deployments
ADD /home/travis/build/CBIIT/CTRP_4x_PO/target/po/dist/exploded/po-ear/po.ear $JBOSS_HOME/standalone/deployments
