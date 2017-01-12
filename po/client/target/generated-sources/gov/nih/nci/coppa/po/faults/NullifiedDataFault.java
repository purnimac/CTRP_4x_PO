
package gov.nih.nci.coppa.po.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NullifiedDataFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NullifiedDataFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://faults.po.coppa.nci.nih.gov}BaseFaultType">
 *       &lt;sequence>
 *         &lt;element name="nullifiedEntries" type="{http://faults.po.coppa.nci.nih.gov}SimpleIIMapType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NullifiedDataFault", propOrder = {
    "nullifiedEntries"
})
@XmlSeeAlso({
    NullifiedRoleFault.class,
    NullifiedEntityFault.class
})
public abstract class NullifiedDataFault
    extends BaseFaultType
{

    @XmlElement(required = true)
    protected SimpleIIMapType nullifiedEntries;

    /**
     * Gets the value of the nullifiedEntries property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIIMapType }
     *     
     */
    public SimpleIIMapType getNullifiedEntries() {
        return nullifiedEntries;
    }

    /**
     * Sets the value of the nullifiedEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIIMapType }
     *     
     */
    public void setNullifiedEntries(SimpleIIMapType value) {
        this.nullifiedEntries = value;
    }

}
