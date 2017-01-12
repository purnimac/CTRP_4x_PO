
package gov.nih.nci.po.webservices.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FamilyMemberType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FamilyMemberType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ORGANIZATIONAL"/>
 *     &lt;enumeration value="CONTRACTUAL"/>
 *     &lt;enumeration value="AFFILIATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FamilyMemberType")
@XmlEnum
public enum FamilyMemberType {

    ORGANIZATIONAL,
    CONTRACTUAL,
    AFFILIATION;

    public String value() {
        return name();
    }

    public static FamilyMemberType fromValue(String v) {
        return valueOf(v);
    }

}
