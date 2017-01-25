# CTRP_4x_PO

Requirements:

  * Ant 1.8 or higher

  * Maven 2.2 or higher

  * Java 7 & JRE 1.7 
   


Build Commands
-------------
For CI environment
-----------------
"mvn -Dhttps.protocols=TLSv1.1,TLSv1.2 clean install" to build po.ear and run all the unit and integration tests.

For Integration Test environment
---------------------------------
ant -f build-lite.xml install 

ant -buildfile build-po/build-lite.xml dist -Dproject-home=/local/content/ctrppo -DANT_HOME=/usr/local/ant-1.8.2 -Dpogrid-3.2.jndi.credentials=***** -Dpogrid-3.2.jndi.credentials.encrypted=***** -Dpogrid-3.0.jndi.credentials=***** -Dctep.****word=***** -Ddatabase.****word=***** -Dtier=qa2

"mvn -Dhttps.protocols=TLSv1.1,TLSv1.2 -Pquick clean install" to build po.ear quickly without running tests.

"mvn -Djboss.home=<po jboss home> cargo:deploy" will copy po.ear into JBoss deployment directory.

 

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/3fa6a9e70cbb4d468f1823bdadc26690)](https://www.codacy.com/app/FNLCR/CTRP_4x_PO?utm_source=github.com&utm_medium=referral&utm_content=CBIIT/CTRP_4x_PO&utm_campaign=badger)


External Dependencies
---------------------
ctep-services  
Nexus -  https://ncimvn.nci.nih.gov/nexus/content/groups/public/gov/nih/nci/coppa/ctep-services/2.0.1/

Properties
----------
Properties at  CTRP_4x_PO/build-po/tier-properties (for IntTest and later. CI will pull from local properties in the pom.xml).

Developers Guide at - https://wiki.nci.nih.gov/display/CTRPproject/CTRP+Developer%27s+Guide
