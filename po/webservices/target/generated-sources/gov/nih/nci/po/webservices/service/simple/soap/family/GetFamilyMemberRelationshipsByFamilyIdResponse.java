
package gov.nih.nci.po.webservices.service.simple.soap.family;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.po.webservices.types.FamilyMemberRelationship;


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
 *         &lt;element name="familyMemberRelationshipList" type="{gov.nih.nci.po.webservices.types}FamilyMemberRelationship" maxOccurs="unbounded" minOccurs="0"/>
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
    "familyMemberRelationshipList"
})
@XmlRootElement(name = "getFamilyMemberRelationshipsByFamilyIdResponse")
public class GetFamilyMemberRelationshipsByFamilyIdResponse {

    protected List<FamilyMemberRelationship> familyMemberRelationshipList;

    /**
     * Gets the value of the familyMemberRelationshipList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyMemberRelationshipList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyMemberRelationshipList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyMemberRelationship }
     * 
     * 
     */
    public List<FamilyMemberRelationship> getFamilyMemberRelationshipList() {
        if (familyMemberRelationshipList == null) {
            familyMemberRelationshipList = new ArrayList<FamilyMemberRelationship>();
        }
        return this.familyMemberRelationshipList;
    }

}
