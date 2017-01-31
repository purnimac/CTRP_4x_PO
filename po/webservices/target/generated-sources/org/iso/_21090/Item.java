
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{uri:iso.org:21090}caption" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{uri:iso.org:21090}content"/>
 *           &lt;element ref="{uri:iso.org:21090}linkHtml"/>
 *           &lt;element ref="{uri:iso.org:21090}sub"/>
 *           &lt;element ref="{uri:iso.org:21090}sup"/>
 *           &lt;element ref="{uri:iso.org:21090}br"/>
 *           &lt;element ref="{uri:iso.org:21090}footnote"/>
 *           &lt;element ref="{uri:iso.org:21090}footnoteRef"/>
 *           &lt;element ref="{uri:iso.org:21090}renderMultiMedia"/>
 *           &lt;element ref="{uri:iso.org:21090}paragraph"/>
 *           &lt;element ref="{uri:iso.org:21090}list"/>
 *           &lt;element ref="{uri:iso.org:21090}table"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="styleCode" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "item")
public class Item {

    @XmlElementRefs({
        @XmlElementRef(name = "table", namespace = "uri:iso.org:21090", type = Table.class, required = false),
        @XmlElementRef(name = "sub", namespace = "uri:iso.org:21090", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "list", namespace = "uri:iso.org:21090", type = org.iso._21090.List.class, required = false),
        @XmlElementRef(name = "paragraph", namespace = "uri:iso.org:21090", type = Paragraph.class, required = false),
        @XmlElementRef(name = "footnote", namespace = "uri:iso.org:21090", type = Footnote.class, required = false),
        @XmlElementRef(name = "caption", namespace = "uri:iso.org:21090", type = Caption.class, required = false),
        @XmlElementRef(name = "renderMultiMedia", namespace = "uri:iso.org:21090", type = RenderMultiMedia.class, required = false),
        @XmlElementRef(name = "br", namespace = "uri:iso.org:21090", type = Br.class, required = false),
        @XmlElementRef(name = "sup", namespace = "uri:iso.org:21090", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "footnoteRef", namespace = "uri:iso.org:21090", type = FootnoteRef.class, required = false),
        @XmlElementRef(name = "linkHtml", namespace = "uri:iso.org:21090", type = LinkHtml.class, required = false),
        @XmlElementRef(name = "content", namespace = "uri:iso.org:21090", type = Content.class, required = false)
    })
    @XmlMixed
    protected java.util.List<Object> content;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String language;
    @XmlAttribute(name = "styleCode")
    @XmlSchemaType(name = "NMTOKENS")
    protected java.util.List<String> styleCode;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Table }
     * {@link org.iso._21090.List }
     * {@link Footnote }
     * {@link RenderMultiMedia }
     * {@link FootnoteRef }
     * {@link LinkHtml }
     * {@link Content }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Paragraph }
     * {@link String }
     * {@link Caption }
     * {@link Br }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public java.util.List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the styleCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public java.util.List<String> getStyleCode() {
        if (styleCode == null) {
            styleCode = new ArrayList<String>();
        }
        return this.styleCode;
    }

    public Item withContent(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getContent().add(value);
            }
        }
        return this;
    }

    public Item withContent(Collection<Object> values) {
        if (values!= null) {
            getContent().addAll(values);
        }
        return this;
    }

    public Item withID(String value) {
        setID(value);
        return this;
    }

    public Item withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    public Item withStyleCode(String... values) {
        if (values!= null) {
            for (String value: values) {
                getStyleCode().add(value);
            }
        }
        return this;
    }

    public Item withStyleCode(Collection<String> values) {
        if (values!= null) {
            getStyleCode().addAll(values);
        }
        return this;
    }

}
