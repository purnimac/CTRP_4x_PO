
package gov.nih.nci.coppa.po;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.iso._21090.BL;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://po.coppa.nci.nih.gov}EntityNodeType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "EntityNode")
public class EntityNode
    extends EntityNodeType
{


    @Override
    public EntityNode withCorrelationOverflow(BL value) {
        setCorrelationOverflow(value);
        return this;
    }

    @Override
    public EntityNode withPlayers(CorrelationType value) {
        setPlayers(value);
        return this;
    }

    @Override
    public EntityNode withScopers(CorrelationType value) {
        setScopers(value);
        return this;
    }

    @Override
    public EntityNode withEntity(EntityType value) {
        setEntity(value);
        return this;
    }

}
