
package gov.nih.nci.po.webservices.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationalContactType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganizationalContactType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IRB"/>
 *     &lt;enumeration value="Responsible Party"/>
 *     &lt;enumeration value="Site"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganizationalContactType")
@XmlEnum
public enum OrganizationalContactType {

    IRB("IRB"),
    @XmlEnumValue("Responsible Party")
    RESPONSIBLE_PARTY("Responsible Party"),
    @XmlEnumValue("Site")
    SITE("Site");
    private final String value;

    OrganizationalContactType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganizationalContactType fromValue(String v) {
        for (OrganizationalContactType c: OrganizationalContactType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
