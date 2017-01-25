
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PIVL_TS.DateTime.Full complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIVL_TS.DateTime.Full">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_TS.DateTime.Full">
 *       &lt;sequence>
 *         &lt;element name="phase" type="{uri:iso.org:21090}IVL_TS.DateTime.Full" minOccurs="0"/>
 *         &lt;element name="period" type="{uri:iso.org:21090}PQ" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="alignment" type="{uri:iso.org:21090}CalendarCycle" />
 *       &lt;attribute name="institutionSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIVL_TS.DateTime.Full", propOrder = {
    "phase",
    "period"
})
public class PIVLTSDateTimeFull
    extends QSETTSDateTimeFull
{

    protected IVLTSDateTimeFull phase;
    protected PQ period;
    @XmlAttribute(name = "alignment")
    protected CalendarCycle alignment;
    @XmlAttribute(name = "institutionSpecified")
    protected Boolean institutionSpecified;

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTSDateTimeFull }
     *     
     */
    public IVLTSDateTimeFull getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTSDateTimeFull }
     *     
     */
    public void setPhase(IVLTSDateTimeFull value) {
        this.phase = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setPeriod(PQ value) {
        this.period = value;
    }

    /**
     * Gets the value of the alignment property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarCycle }
     *     
     */
    public CalendarCycle getAlignment() {
        return alignment;
    }

    /**
     * Sets the value of the alignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarCycle }
     *     
     */
    public void setAlignment(CalendarCycle value) {
        this.alignment = value;
    }

    /**
     * Gets the value of the institutionSpecified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstitutionSpecified() {
        return institutionSpecified;
    }

    /**
     * Sets the value of the institutionSpecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstitutionSpecified(Boolean value) {
        this.institutionSpecified = value;
    }

    public PIVLTSDateTimeFull withPhase(IVLTSDateTimeFull value) {
        setPhase(value);
        return this;
    }

    public PIVLTSDateTimeFull withPeriod(PQ value) {
        setPeriod(value);
        return this;
    }

    public PIVLTSDateTimeFull withAlignment(CalendarCycle value) {
        setAlignment(value);
        return this;
    }

    public PIVLTSDateTimeFull withInstitutionSpecified(Boolean value) {
        setInstitutionSpecified(value);
        return this;
    }

    @Override
    public PIVLTSDateTimeFull withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public PIVLTSDateTimeFull withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public PIVLTSDateTimeFull withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public PIVLTSDateTimeFull withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public PIVLTSDateTimeFull withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public PIVLTSDateTimeFull withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public PIVLTSDateTimeFull withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public PIVLTSDateTimeFull withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}