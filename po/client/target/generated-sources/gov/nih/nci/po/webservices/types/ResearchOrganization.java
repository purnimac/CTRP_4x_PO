
package gov.nih.nci.po.webservices.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Research Organization role
 * 
 * <p>Java class for ResearchOrganization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResearchOrganization">
 *   &lt;complexContent>
 *     &lt;extension base="{gov.nih.nci.po.webservices.types}OrganizationRole">
 *       &lt;sequence>
 *         &lt;element name="name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="160"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ctepId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="type" type="{gov.nih.nci.po.webservices.types}ResearchOrganizationType" minOccurs="0"/>
 *         &lt;element name="fundingMechanism" type="{gov.nih.nci.po.webservices.types}FundingMechanism" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResearchOrganization", propOrder = {
    "name",
    "ctepId",
    "type",
    "fundingMechanism"
})
public class ResearchOrganization
    extends OrganizationRole
{

    protected String name;
    protected String ctepId;
    protected ResearchOrganizationType type;
    protected FundingMechanism fundingMechanism;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the ctepId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtepId() {
        return ctepId;
    }

    /**
     * Sets the value of the ctepId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtepId(String value) {
        this.ctepId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ResearchOrganizationType }
     *     
     */
    public ResearchOrganizationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResearchOrganizationType }
     *     
     */
    public void setType(ResearchOrganizationType value) {
        this.type = value;
    }

    /**
     * Gets the value of the fundingMechanism property.
     * 
     * @return
     *     possible object is
     *     {@link FundingMechanism }
     *     
     */
    public FundingMechanism getFundingMechanism() {
        return fundingMechanism;
    }

    /**
     * Sets the value of the fundingMechanism property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingMechanism }
     *     
     */
    public void setFundingMechanism(FundingMechanism value) {
        this.fundingMechanism = value;
    }

}
