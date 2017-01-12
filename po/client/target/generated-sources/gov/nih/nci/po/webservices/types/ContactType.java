
package gov.nih.nci.po.webservices.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="PHONE"/>
 *     &lt;enumeration value="FAX"/>
 *     &lt;enumeration value="TTY"/>
 *     &lt;enumeration value="URL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactType")
@XmlEnum
public enum ContactType {

    EMAIL,
    PHONE,
    FAX,
    TTY,
    URL;

    public String value() {
        return name();
    }

    public static ContactType fromValue(String v) {
        return valueOf(v);
    }

}
