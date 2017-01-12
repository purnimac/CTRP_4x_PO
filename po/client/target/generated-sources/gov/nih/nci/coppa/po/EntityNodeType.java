
package gov.nih.nci.coppa.po;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.iso._21090.BL;


/**
 * 
 *                     A EntityNodeDto ...
 *                 
 * 
 * <p>Java class for EntityNodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityNodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correlationOverflow" type="{uri:iso.org:21090}BL"/>
 *         &lt;element name="players" type="{http://po.coppa.nci.nih.gov}CorrelationType"/>
 *         &lt;element name="scopers" type="{http://po.coppa.nci.nih.gov}CorrelationType"/>
 *         &lt;element name="entity" type="{http://po.coppa.nci.nih.gov}EntityType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityNodeType", propOrder = {
    "correlationOverflow",
    "players",
    "scopers",
    "entity"
})
@XmlSeeAlso({
    EntityNode.class
})
public class EntityNodeType {

    @XmlElement(required = true)
    protected BL correlationOverflow;
    @XmlElement(required = true)
    protected CorrelationType players;
    @XmlElement(required = true)
    protected CorrelationType scopers;
    @XmlElement(required = true)
    protected EntityType entity;

    /**
     * Gets the value of the correlationOverflow property.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getCorrelationOverflow() {
        return correlationOverflow;
    }

    /**
     * Sets the value of the correlationOverflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setCorrelationOverflow(BL value) {
        this.correlationOverflow = value;
    }

    /**
     * Gets the value of the players property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationType }
     *     
     */
    public CorrelationType getPlayers() {
        return players;
    }

    /**
     * Sets the value of the players property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationType }
     *     
     */
    public void setPlayers(CorrelationType value) {
        this.players = value;
    }

    /**
     * Gets the value of the scopers property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationType }
     *     
     */
    public CorrelationType getScopers() {
        return scopers;
    }

    /**
     * Sets the value of the scopers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationType }
     *     
     */
    public void setScopers(CorrelationType value) {
        this.scopers = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setEntity(EntityType value) {
        this.entity = value;
    }

}
