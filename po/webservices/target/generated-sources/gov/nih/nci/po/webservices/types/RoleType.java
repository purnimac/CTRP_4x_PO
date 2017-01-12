
package gov.nih.nci.po.webservices.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CRS"/>
 *     &lt;enumeration value="HCP"/>
 *     &lt;enumeration value="OC"/>
 *     &lt;enumeration value="OPI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleType")
@XmlEnum
public enum RoleType {

    CRS,
    HCP,
    OC,
    OPI;

    public String value() {
        return name();
    }

    public static RoleType fromValue(String v) {
        return valueOf(v);
    }

}
