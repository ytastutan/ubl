//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.10 at 04:56:56 PM EET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EmergencyProceduresCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExtensionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PlacardEndorsementType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PlacardNotationType;


/**
 * <p>Java class for SecondaryHazardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondaryHazardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlacardNotation" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlacardEndorsement" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EmergencyProceduresCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondaryHazardType", propOrder = {
    "id",
    "placardNotation",
    "placardEndorsement",
    "emergencyProceduresCode",
    "extension"
})
public class SecondaryHazardType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "PlacardNotation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PlacardNotationType placardNotation;
    @XmlElement(name = "PlacardEndorsement", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PlacardEndorsementType placardEndorsement;
    @XmlElement(name = "EmergencyProceduresCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EmergencyProceduresCodeType emergencyProceduresCode;
    @XmlElement(name = "Extension", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Gets the value of the placardNotation property.
     * 
     * @return
     *     possible object is
     *     {@link PlacardNotationType }
     *     
     */
    public PlacardNotationType getPlacardNotation() {
        return placardNotation;
    }

    /**
     * Sets the value of the placardNotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacardNotationType }
     *     
     */
    public void setPlacardNotation(PlacardNotationType value) {
        this.placardNotation = value;
    }

    /**
     * Gets the value of the placardEndorsement property.
     * 
     * @return
     *     possible object is
     *     {@link PlacardEndorsementType }
     *     
     */
    public PlacardEndorsementType getPlacardEndorsement() {
        return placardEndorsement;
    }

    /**
     * Sets the value of the placardEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacardEndorsementType }
     *     
     */
    public void setPlacardEndorsement(PlacardEndorsementType value) {
        this.placardEndorsement = value;
    }

    /**
     * Gets the value of the emergencyProceduresCode property.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyProceduresCodeType }
     *     
     */
    public EmergencyProceduresCodeType getEmergencyProceduresCode() {
        return emergencyProceduresCode;
    }

    /**
     * Sets the value of the emergencyProceduresCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyProceduresCodeType }
     *     
     */
    public void setEmergencyProceduresCode(EmergencyProceduresCodeType value) {
        this.emergencyProceduresCode = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionType>();
        }
        return this.extension;
    }

}
