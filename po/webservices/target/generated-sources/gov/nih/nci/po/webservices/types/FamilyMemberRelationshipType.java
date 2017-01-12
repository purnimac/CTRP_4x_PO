
package gov.nih.nci.po.webservices.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FamilyMemberRelationshipType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FamilyMemberRelationshipType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PEER"/>
 *     &lt;enumeration value="PARENT"/>
 *     &lt;enumeration value="CHILD"/>
 *     &lt;enumeration value="DIVISION"/>
 *     &lt;enumeration value="SUBDIVISION"/>
 *     &lt;enumeration value="DEPARTMENT"/>
 *     &lt;enumeration value="SUBDEPARTMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FamilyMemberRelationshipType")
@XmlEnum
public enum FamilyMemberRelationshipType {

    PEER,
    PARENT,
    CHILD,
    DIVISION,
    SUBDIVISION,
    DEPARTMENT,
    SUBDEPARTMENT;

    public String value() {
        return name();
    }

    public static FamilyMemberRelationshipType fromValue(String v) {
        return valueOf(v);
    }

}
