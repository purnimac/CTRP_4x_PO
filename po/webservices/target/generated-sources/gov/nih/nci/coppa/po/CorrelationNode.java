
package gov.nih.nci.coppa.po;

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
 *     &lt;extension base="{http://po.coppa.nci.nih.gov}CorrelationNodeType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CorrelationNode")
public class CorrelationNode
    extends CorrelationNodeType
{


    @Override
    public CorrelationNode withPlayer(EntityType value) {
        setPlayer(value);
        return this;
    }

    @Override
    public CorrelationNode withScoper(EntityType value) {
        setScoper(value);
        return this;
    }

    @Override
    public CorrelationNode withCorrelation(CorrelationType value) {
        setCorrelation(value);
        return this;
    }

}