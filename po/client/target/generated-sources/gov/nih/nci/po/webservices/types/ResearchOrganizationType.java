
package gov.nih.nci.po.webservices.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResearchOrganizationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResearchOrganizationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CCR"/>
 *     &lt;enumeration value="DCY"/>
 *     &lt;enumeration value="CLC"/>
 *     &lt;enumeration value="CGP"/>
 *     &lt;enumeration value="CSM"/>
 *     &lt;enumeration value="NWK"/>
 *     &lt;enumeration value="RSB"/>
 *     &lt;enumeration value="COP"/>
 *     &lt;enumeration value="NCP"/>
 *     &lt;enumeration value="P2C"/>
 *     &lt;enumeration value="NCTN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResearchOrganizationType")
@XmlEnum
public enum ResearchOrganizationType {

    CCR("CCR"),
    DCY("DCY"),
    CLC("CLC"),
    CGP("CGP"),
    CSM("CSM"),
    NWK("NWK"),
    RSB("RSB"),
    COP("COP"),
    NCP("NCP"),
    @XmlEnumValue("P2C")
    P_2_C("P2C"),
    NCTN("NCTN");
    private final String value;

    ResearchOrganizationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResearchOrganizationType fromValue(String v) {
        for (ResearchOrganizationType c: ResearchOrganizationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
