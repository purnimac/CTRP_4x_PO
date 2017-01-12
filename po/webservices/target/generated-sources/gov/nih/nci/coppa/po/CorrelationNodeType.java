
package gov.nih.nci.coppa.po;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                     A CorrelationNodeDTO ...
 *                 
 * 
 * <p>Java class for CorrelationNodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrelationNodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="player" type="{http://po.coppa.nci.nih.gov}EntityType"/>
 *         &lt;element name="scoper" type="{http://po.coppa.nci.nih.gov}EntityType"/>
 *         &lt;element name="correlation" type="{http://po.coppa.nci.nih.gov}CorrelationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrelationNodeType", propOrder = {
    "player",
    "scoper",
    "correlation"
})
@XmlSeeAlso({
    CorrelationNode.class
})
public class CorrelationNodeType {

    @XmlElement(required = true)
    protected EntityType player;
    @XmlElement(required = true)
    protected EntityType scoper;
    @XmlElement(required = true)
    protected CorrelationType correlation;

    /**
     * Gets the value of the player property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getPlayer() {
        return player;
    }

    /**
     * Sets the value of the player property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setPlayer(EntityType value) {
        this.player = value;
    }

    /**
     * Gets the value of the scoper property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getScoper() {
        return scoper;
    }

    /**
     * Sets the value of the scoper property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setScoper(EntityType value) {
        this.scoper = value;
    }

    /**
     * Gets the value of the correlation property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationType }
     *     
     */
    public CorrelationType getCorrelation() {
        return correlation;
    }

    /**
     * Sets the value of the correlation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationType }
     *     
     */
    public void setCorrelation(CorrelationType value) {
        this.correlation = value;
    }

    public CorrelationNodeType withPlayer(EntityType value) {
        setPlayer(value);
        return this;
    }

    public CorrelationNodeType withScoper(EntityType value) {
        setScoper(value);
        return this;
    }

    public CorrelationNodeType withCorrelation(CorrelationType value) {
        setCorrelation(value);
        return this;
    }

}
