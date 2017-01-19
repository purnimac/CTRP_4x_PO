# CTRP_4x_PO

Requirements:

  * Ant 1.8 or higher

  * Maven 2.2 or higher

  * Java 7
 

Maven Commands
-------------
ant -f build-lite.xml install 

"mvn -Dhttps.protocols=TLSv1.1,TLSv1.2 -Pquick clean install" to build po.ear quickly without running tests.

"mvn -Dhttps.protocols=TLSv1.1,TLSv1.2 clean install" to build po.ear and run all the unit and integration tests.

"mvn -Djboss.home=<po jboss home> cargo:deploy" will copy po.ear into JBoss deployment directory.


[![Codacy Badge](https://api.codacy.com/project/badge/Grade/3fa6a9e70cbb4d468f1823bdadc26690)](https://www.codacy.com/app/FNLCR/CTRP_4x_PO?utm_source=github.com&utm_medium=referral&utm_content=CBIIT/CTRP_4x_PO&utm_campaign=badger)


External Dependencies
---------------------
ctep-services  
Nexus -  https://ncimvn.nci.nih.gov/nexus/content/groups/public/gov/nih/nci/coppa/ctep-services/2.0.1/

Properties
----------
CI properties at  CTRP_4x_PO/build-po/tier-properties/ci.properties

