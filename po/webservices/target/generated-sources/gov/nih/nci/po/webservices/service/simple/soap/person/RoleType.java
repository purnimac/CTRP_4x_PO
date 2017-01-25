
package gov.nih.nci.po.webservices.service.simple.soap.person;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="roleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HealthCareProvider"/>
 *     &lt;enumeration value="OrganizationalContact"/>
 *     &lt;enumeration value="ClinicalResearchStaff"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "roleType")
@XmlEnum
public enum RoleType {

    @XmlEnumValue("HealthCareProvider")
    HEALTH_CARE_PROVIDER("HealthCareProvider"),
    @XmlEnumValue("OrganizationalContact")
    ORGANIZATIONAL_CONTACT("OrganizationalContact"),
    @XmlEnumValue("ClinicalResearchStaff")
    CLINICAL_RESEARCH_STAFF("ClinicalResearchStaff");
    private final String value;

    RoleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleType fromValue(String v) {
        for (RoleType c: RoleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}