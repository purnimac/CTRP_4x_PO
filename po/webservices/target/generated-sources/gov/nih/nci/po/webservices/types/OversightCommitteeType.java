
package gov.nih.nci.po.webservices.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OversightCommitteeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OversightCommitteeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Institutional Review Board (IRB)"/>
 *     &lt;enumeration value="Ethics Committee"/>
 *     &lt;enumeration value="Research Ethics Board"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OversightCommitteeType")
@XmlEnum
public enum OversightCommitteeType {

    @XmlEnumValue("Institutional Review Board (IRB)")
    INSTITUTIONAL_REVIEW_BOARD_IRB("Institutional Review Board (IRB)"),
    @XmlEnumValue("Ethics Committee")
    ETHICS_COMMITTEE("Ethics Committee"),
    @XmlEnumValue("Research Ethics Board")
    RESEARCH_ETHICS_BOARD("Research Ethics Board");
    private final String value;

    OversightCommitteeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OversightCommitteeType fromValue(String v) {
        for (OversightCommitteeType c: OversightCommitteeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
