
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
import javax.xml.bind.annotation.XmlIDREF;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{uri:iso.org:21090}content"/>
 *         &lt;element ref="{uri:iso.org:21090}linkHtml"/>
 *         &lt;element ref="{uri:iso.org:21090}sub"/>
 *         &lt;element ref="{uri:iso.org:21090}sup"/>
 *         &lt;element ref="{uri:iso.org:21090}br"/>
 *         &lt;element ref="{uri:iso.org:21090}footnote"/>
 *         &lt;element ref="{uri:iso.org:21090}footnoteRef"/>
 *         &lt;element ref="{uri:iso.org:21090}renderMultiMedia"/>
 *         &lt;element ref="{uri:iso.org:21090}paragraph"/>
 *         &lt;element ref="{uri:iso.org:21090}list"/>
 *       &lt;/choice>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="styleCode" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" />
 *       &lt;attribute name="abbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="axis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="headers" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="scope">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="row"/>
 *             &lt;enumeration value="col"/>
 *             &lt;enumeration value="rowgroup"/>
 *             &lt;enumeration value="colgroup"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rowspan" type="{http://www.w3.org/2001/XMLSchema}string" default="1" />
 *       &lt;attribute name="colspan" type="{http://www.w3.org/2001/XMLSchema}string" default="1" />
 *       &lt;attribute name="align">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="left"/>
 *             &lt;enumeration value="center"/>
 *             &lt;enumeration value="right"/>
 *             &lt;enumeration value="justify"/>
 *             &lt;enumeration value="char"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="char" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="charoff" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="valign">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="top"/>
 *             &lt;enumeration value="middle"/>
 *             &lt;enumeration value="bottom"/>
 *             &lt;enumeration value="baseline"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
@XmlRootElement(name = "td")
public class Td {

    @XmlElementRefs({
        @XmlElementRef(name = "paragraph", namespace = "uri:iso.org:21090", type = Paragraph.class, required = false),
        @XmlElementRef(name = "sup", namespace = "uri:iso.org:21090", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "content", namespace = "uri:iso.org:21090", type = Content.class, required = false),
        @XmlElementRef(name = "sub", namespace = "uri:iso.org:21090", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "footnoteRef", namespace = "uri:iso.org:21090", type = FootnoteRef.class, required = false),
        @XmlElementRef(name = "br", namespace = "uri:iso.org:21090", type = Br.class, required = false),
        @XmlElementRef(name = "footnote", namespace = "uri:iso.org:21090", type = Footnote.class, required = false),
        @XmlElementRef(name = "linkHtml", namespace = "uri:iso.org:21090", type = LinkHtml.class, required = false),
        @XmlElementRef(name = "list", namespace = "uri:iso.org:21090", type = org.iso._21090.List.class, required = false),
        @XmlElementRef(name = "renderMultiMedia", namespace = "uri:iso.org:21090", type = RenderMultiMedia.class, required = false)
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
    @XmlAttribute(name = "abbr")
    protected String abbr;
    @XmlAttribute(name = "axis")
    protected String axis;
    @XmlAttribute(name = "headers")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected java.util.List<Object> headers;
    @XmlAttribute(name = "scope")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scope;
    @XmlAttribute(name = "rowspan")
    protected String rowspan;
    @XmlAttribute(name = "colspan")
    protected String colspan;
    @XmlAttribute(name = "align")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String align;
    @XmlAttribute(name = "char")
    protected String _char;
    @XmlAttribute(name = "charoff")
    protected String charoff;
    @XmlAttribute(name = "valign")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String valign;

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
     * {@link Content }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Paragraph }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link FootnoteRef }
     * {@link Br }
     * {@link String }
     * {@link LinkHtml }
     * {@link Footnote }
     * {@link RenderMultiMedia }
     * {@link org.iso._21090.List }
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

    /**
     * Gets the value of the abbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * Sets the value of the abbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbr(String value) {
        this.abbr = value;
    }

    /**
     * Gets the value of the axis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxis() {
        return axis;
    }

    /**
     * Sets the value of the axis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxis(String value) {
        this.axis = value;
    }

    /**
     * Gets the value of the headers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public java.util.List<Object> getHeaders() {
        if (headers == null) {
            headers = new ArrayList<Object>();
        }
        return this.headers;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the rowspan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowspan() {
        if (rowspan == null) {
            return "1";
        } else {
            return rowspan;
        }
    }

    /**
     * Sets the value of the rowspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowspan(String value) {
        this.rowspan = value;
    }

    /**
     * Gets the value of the colspan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColspan() {
        if (colspan == null) {
            return "1";
        } else {
            return colspan;
        }
    }

    /**
     * Sets the value of the colspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColspan(String value) {
        this.colspan = value;
    }

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        return align;
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
    }

    /**
     * Gets the value of the char property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChar() {
        return _char;
    }

    /**
     * Sets the value of the char property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChar(String value) {
        this._char = value;
    }

    /**
     * Gets the value of the charoff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharoff() {
        return charoff;
    }

    /**
     * Sets the value of the charoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharoff(String value) {
        this.charoff = value;
    }

    /**
     * Gets the value of the valign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValign() {
        return valign;
    }

    /**
     * Sets the value of the valign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValign(String value) {
        this.valign = value;
    }

    public Td withContent(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getContent().add(value);
            }
        }
        return this;
    }

    public Td withContent(Collection<Object> values) {
        if (values!= null) {
            getContent().addAll(values);
        }
        return this;
    }

    public Td withID(String value) {
        setID(value);
        return this;
    }

    public Td withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    public Td withStyleCode(String... values) {
        if (values!= null) {
            for (String value: values) {
                getStyleCode().add(value);
            }
        }
        return this;
    }

    public Td withStyleCode(Collection<String> values) {
        if (values!= null) {
            getStyleCode().addAll(values);
        }
        return this;
    }

    public Td withAbbr(String value) {
        setAbbr(value);
        return this;
    }

    public Td withAxis(String value) {
        setAxis(value);
        return this;
    }

    public Td withHeaders(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getHeaders().add(value);
            }
        }
        return this;
    }

    public Td withHeaders(Collection<Object> values) {
        if (values!= null) {
            getHeaders().addAll(values);
        }
        return this;
    }

    public Td withScope(String value) {
        setScope(value);
        return this;
    }

    public Td withRowspan(String value) {
        setRowspan(value);
        return this;
    }

    public Td withColspan(String value) {
        setColspan(value);
        return this;
    }

    public Td withAlign(String value) {
        setAlign(value);
        return this;
    }

    public Td withChar(String value) {
        setChar(value);
        return this;
    }

    public Td withCharoff(String value) {
        setCharoff(value);
        return this;
    }

    public Td withValign(String value) {
        setValign(value);
        return this;
    }

}