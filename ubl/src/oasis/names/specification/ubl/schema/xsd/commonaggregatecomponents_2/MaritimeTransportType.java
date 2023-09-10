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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GrossTonnageMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NetTonnageMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RadioCallSignIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ShipsRequirementsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.VesselIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.VesselNameType;


/**
 * <p>Java class for MaritimeTransportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaritimeTransportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VesselID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VesselName" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RadioCallSignID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShipsRequirements" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossTonnageMeasure" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetTonnageMeasure" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RegistryCertificateDocumentReference" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RegistryPortLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaritimeTransportType", propOrder = {
    "vesselID",
    "vesselName",
    "radioCallSignID",
    "shipsRequirements",
    "grossTonnageMeasure",
    "netTonnageMeasure",
    "registryCertificateDocumentReference",
    "registryPortLocation"
})
public class MaritimeTransportType {

    @XmlElement(name = "VesselID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected VesselIDType vesselID;
    @XmlElement(name = "VesselName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected VesselNameType vesselName;
    @XmlElement(name = "RadioCallSignID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RadioCallSignIDType radioCallSignID;
    @XmlElement(name = "ShipsRequirements", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ShipsRequirementsType> shipsRequirements;
    @XmlElement(name = "GrossTonnageMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GrossTonnageMeasureType grossTonnageMeasure;
    @XmlElement(name = "NetTonnageMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NetTonnageMeasureType netTonnageMeasure;
    @XmlElement(name = "RegistryCertificateDocumentReference")
    protected DocumentReferenceType registryCertificateDocumentReference;
    @XmlElement(name = "RegistryPortLocation")
    protected LocationType registryPortLocation;

    /**
     * Gets the value of the vesselID property.
     * 
     * @return
     *     possible object is
     *     {@link VesselIDType }
     *     
     */
    public VesselIDType getVesselID() {
        return vesselID;
    }

    /**
     * Sets the value of the vesselID property.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselIDType }
     *     
     */
    public void setVesselID(VesselIDType value) {
        this.vesselID = value;
    }

    /**
     * Gets the value of the vesselName property.
     * 
     * @return
     *     possible object is
     *     {@link VesselNameType }
     *     
     */
    public VesselNameType getVesselName() {
        return vesselName;
    }

    /**
     * Sets the value of the vesselName property.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselNameType }
     *     
     */
    public void setVesselName(VesselNameType value) {
        this.vesselName = value;
    }

    /**
     * Gets the value of the radioCallSignID property.
     * 
     * @return
     *     possible object is
     *     {@link RadioCallSignIDType }
     *     
     */
    public RadioCallSignIDType getRadioCallSignID() {
        return radioCallSignID;
    }

    /**
     * Sets the value of the radioCallSignID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioCallSignIDType }
     *     
     */
    public void setRadioCallSignID(RadioCallSignIDType value) {
        this.radioCallSignID = value;
    }

    /**
     * Gets the value of the shipsRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipsRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipsRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipsRequirementsType }
     * 
     * 
     */
    public List<ShipsRequirementsType> getShipsRequirements() {
        if (shipsRequirements == null) {
            shipsRequirements = new ArrayList<ShipsRequirementsType>();
        }
        return this.shipsRequirements;
    }

    /**
     * Gets the value of the grossTonnageMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link GrossTonnageMeasureType }
     *     
     */
    public GrossTonnageMeasureType getGrossTonnageMeasure() {
        return grossTonnageMeasure;
    }

    /**
     * Sets the value of the grossTonnageMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossTonnageMeasureType }
     *     
     */
    public void setGrossTonnageMeasure(GrossTonnageMeasureType value) {
        this.grossTonnageMeasure = value;
    }

    /**
     * Gets the value of the netTonnageMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link NetTonnageMeasureType }
     *     
     */
    public NetTonnageMeasureType getNetTonnageMeasure() {
        return netTonnageMeasure;
    }

    /**
     * Sets the value of the netTonnageMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetTonnageMeasureType }
     *     
     */
    public void setNetTonnageMeasure(NetTonnageMeasureType value) {
        this.netTonnageMeasure = value;
    }

    /**
     * Gets the value of the registryCertificateDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getRegistryCertificateDocumentReference() {
        return registryCertificateDocumentReference;
    }

    /**
     * Sets the value of the registryCertificateDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setRegistryCertificateDocumentReference(DocumentReferenceType value) {
        this.registryCertificateDocumentReference = value;
    }

    /**
     * Gets the value of the registryPortLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getRegistryPortLocation() {
        return registryPortLocation;
    }

    /**
     * Sets the value of the registryPortLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setRegistryPortLocation(LocationType value) {
        this.registryPortLocation = value;
    }

}
