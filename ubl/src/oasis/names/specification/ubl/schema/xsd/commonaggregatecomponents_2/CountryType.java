//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.10 at 04:56:56 PM EET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IdentificationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;


/**
 * <p>Java class for CountryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IdentificationCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryType", propOrder = {
    "identificationCode",
    "name"
})
public class CountryType {

    @XmlElement(name = "IdentificationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IdentificationCodeType identificationCode;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected NameType name;

    /**
     * Gets the value of the identificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationCodeType }
     *     
     */
    public IdentificationCodeType getIdentificationCode() {
        return identificationCode;
    }

    /**
     * Sets the value of the identificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationCodeType }
     *     
     */
    public void setIdentificationCode(IdentificationCodeType value) {
        this.identificationCode = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

}
