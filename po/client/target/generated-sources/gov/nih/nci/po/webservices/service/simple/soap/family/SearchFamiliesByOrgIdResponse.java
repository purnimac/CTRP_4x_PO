
package gov.nih.nci.po.webservices.service.simple.soap.family;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.po.webservices.types.Family;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="familyList" type="{gov.nih.nci.po.webservices.types}Family" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "familyList"
})
@XmlRootElement(name = "searchFamiliesByOrgIdResponse")
public class SearchFamiliesByOrgIdResponse {

    protected List<Family> familyList;

    /**
     * Gets the value of the familyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Family }
     * 
     * 
     */
    public List<Family> getFamilyList() {
        if (familyList == null) {
            familyList = new ArrayList<Family>();
        }
        return this.familyList;
    }

}