
package gov.nih.nci.coppa.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://common.coppa.nci.nih.gov}LimitOffsetType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "LimitOffset")
public class LimitOffset
    extends LimitOffsetType
{


    @Override
    public LimitOffset withLimit(int value) {
        setLimit(value);
        return this;
    }

    @Override
    public LimitOffset withOffset(int value) {
        setOffset(value);
        return this;
    }

}
