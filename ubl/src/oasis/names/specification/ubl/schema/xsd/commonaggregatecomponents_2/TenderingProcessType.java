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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CandidateReductionConstraintIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ContractingSystemCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpenseCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GovernmentAgreementConstraintIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NegotiationDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OriginalContractingSystemIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PartPresentationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProcedureCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SubmissionMethodCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UrgencyCodeType;


/**
 * <p>Java class for TenderingProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TenderingProcessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OriginalContractingSystemID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NegotiationDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcedureCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UrgencyCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpenseCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PartPresentationCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContractingSystemCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubmissionMethodCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CandidateReductionConstraintIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GovernmentAgreementConstraintIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentAvailabilityPeriod" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderSubmissionDeadlinePeriod" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InvitationSubmissionPeriod" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ParticipationRequestReceptionPeriod" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NoticeDocumentReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalDocumentReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcessJustification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EconomicOperatorShortList" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OpenTenderEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AuctionTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FrameworkAgreement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderingProcessType", propOrder = {
    "id",
    "originalContractingSystemID",
    "description",
    "negotiationDescription",
    "procedureCode",
    "urgencyCode",
    "expenseCode",
    "partPresentationCode",
    "contractingSystemCode",
    "submissionMethodCode",
    "candidateReductionConstraintIndicator",
    "governmentAgreementConstraintIndicator",
    "documentAvailabilityPeriod",
    "tenderSubmissionDeadlinePeriod",
    "invitationSubmissionPeriod",
    "participationRequestReceptionPeriod",
    "noticeDocumentReference",
    "additionalDocumentReference",
    "processJustification",
    "economicOperatorShortList",
    "openTenderEvent",
    "auctionTerms",
    "frameworkAgreement"
})
public class TenderingProcessType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "OriginalContractingSystemID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OriginalContractingSystemIDType originalContractingSystemID;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "NegotiationDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NegotiationDescriptionType> negotiationDescription;
    @XmlElement(name = "ProcedureCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProcedureCodeType procedureCode;
    @XmlElement(name = "UrgencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UrgencyCodeType urgencyCode;
    @XmlElement(name = "ExpenseCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpenseCodeType expenseCode;
    @XmlElement(name = "PartPresentationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PartPresentationCodeType partPresentationCode;
    @XmlElement(name = "ContractingSystemCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ContractingSystemCodeType contractingSystemCode;
    @XmlElement(name = "SubmissionMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubmissionMethodCodeType submissionMethodCode;
    @XmlElement(name = "CandidateReductionConstraintIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CandidateReductionConstraintIndicatorType candidateReductionConstraintIndicator;
    @XmlElement(name = "GovernmentAgreementConstraintIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GovernmentAgreementConstraintIndicatorType governmentAgreementConstraintIndicator;
    @XmlElement(name = "DocumentAvailabilityPeriod")
    protected PeriodType documentAvailabilityPeriod;
    @XmlElement(name = "TenderSubmissionDeadlinePeriod")
    protected PeriodType tenderSubmissionDeadlinePeriod;
    @XmlElement(name = "InvitationSubmissionPeriod")
    protected PeriodType invitationSubmissionPeriod;
    @XmlElement(name = "ParticipationRequestReceptionPeriod")
    protected PeriodType participationRequestReceptionPeriod;
    @XmlElement(name = "NoticeDocumentReference")
    protected List<DocumentReferenceType> noticeDocumentReference;
    @XmlElement(name = "AdditionalDocumentReference")
    protected List<DocumentReferenceType> additionalDocumentReference;
    @XmlElement(name = "ProcessJustification")
    protected List<ProcessJustificationType> processJustification;
    @XmlElement(name = "EconomicOperatorShortList")
    protected EconomicOperatorShortListType economicOperatorShortList;
    @XmlElement(name = "OpenTenderEvent")
    protected List<EventType> openTenderEvent;
    @XmlElement(name = "AuctionTerms")
    protected AuctionTermsType auctionTerms;
    @XmlElement(name = "FrameworkAgreement")
    protected FrameworkAgreementType frameworkAgreement;

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
     * Gets the value of the originalContractingSystemID property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalContractingSystemIDType }
     *     
     */
    public OriginalContractingSystemIDType getOriginalContractingSystemID() {
        return originalContractingSystemID;
    }

    /**
     * Sets the value of the originalContractingSystemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalContractingSystemIDType }
     *     
     */
    public void setOriginalContractingSystemID(OriginalContractingSystemIDType value) {
        this.originalContractingSystemID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the negotiationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the negotiationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNegotiationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NegotiationDescriptionType }
     * 
     * 
     */
    public List<NegotiationDescriptionType> getNegotiationDescription() {
        if (negotiationDescription == null) {
            negotiationDescription = new ArrayList<NegotiationDescriptionType>();
        }
        return this.negotiationDescription;
    }

    /**
     * Gets the value of the procedureCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureCodeType }
     *     
     */
    public ProcedureCodeType getProcedureCode() {
        return procedureCode;
    }

    /**
     * Sets the value of the procedureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureCodeType }
     *     
     */
    public void setProcedureCode(ProcedureCodeType value) {
        this.procedureCode = value;
    }

    /**
     * Gets the value of the urgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link UrgencyCodeType }
     *     
     */
    public UrgencyCodeType getUrgencyCode() {
        return urgencyCode;
    }

    /**
     * Sets the value of the urgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrgencyCodeType }
     *     
     */
    public void setUrgencyCode(UrgencyCodeType value) {
        this.urgencyCode = value;
    }

    /**
     * Gets the value of the expenseCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExpenseCodeType }
     *     
     */
    public ExpenseCodeType getExpenseCode() {
        return expenseCode;
    }

    /**
     * Sets the value of the expenseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpenseCodeType }
     *     
     */
    public void setExpenseCode(ExpenseCodeType value) {
        this.expenseCode = value;
    }

    /**
     * Gets the value of the partPresentationCode property.
     * 
     * @return
     *     possible object is
     *     {@link PartPresentationCodeType }
     *     
     */
    public PartPresentationCodeType getPartPresentationCode() {
        return partPresentationCode;
    }

    /**
     * Sets the value of the partPresentationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartPresentationCodeType }
     *     
     */
    public void setPartPresentationCode(PartPresentationCodeType value) {
        this.partPresentationCode = value;
    }

    /**
     * Gets the value of the contractingSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link ContractingSystemCodeType }
     *     
     */
    public ContractingSystemCodeType getContractingSystemCode() {
        return contractingSystemCode;
    }

    /**
     * Sets the value of the contractingSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractingSystemCodeType }
     *     
     */
    public void setContractingSystemCode(ContractingSystemCodeType value) {
        this.contractingSystemCode = value;
    }

    /**
     * Gets the value of the submissionMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionMethodCodeType }
     *     
     */
    public SubmissionMethodCodeType getSubmissionMethodCode() {
        return submissionMethodCode;
    }

    /**
     * Sets the value of the submissionMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionMethodCodeType }
     *     
     */
    public void setSubmissionMethodCode(SubmissionMethodCodeType value) {
        this.submissionMethodCode = value;
    }

    /**
     * Gets the value of the candidateReductionConstraintIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateReductionConstraintIndicatorType }
     *     
     */
    public CandidateReductionConstraintIndicatorType getCandidateReductionConstraintIndicator() {
        return candidateReductionConstraintIndicator;
    }

    /**
     * Sets the value of the candidateReductionConstraintIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateReductionConstraintIndicatorType }
     *     
     */
    public void setCandidateReductionConstraintIndicator(CandidateReductionConstraintIndicatorType value) {
        this.candidateReductionConstraintIndicator = value;
    }

    /**
     * Gets the value of the governmentAgreementConstraintIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link GovernmentAgreementConstraintIndicatorType }
     *     
     */
    public GovernmentAgreementConstraintIndicatorType getGovernmentAgreementConstraintIndicator() {
        return governmentAgreementConstraintIndicator;
    }

    /**
     * Sets the value of the governmentAgreementConstraintIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernmentAgreementConstraintIndicatorType }
     *     
     */
    public void setGovernmentAgreementConstraintIndicator(GovernmentAgreementConstraintIndicatorType value) {
        this.governmentAgreementConstraintIndicator = value;
    }

    /**
     * Gets the value of the documentAvailabilityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getDocumentAvailabilityPeriod() {
        return documentAvailabilityPeriod;
    }

    /**
     * Sets the value of the documentAvailabilityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setDocumentAvailabilityPeriod(PeriodType value) {
        this.documentAvailabilityPeriod = value;
    }

    /**
     * Gets the value of the tenderSubmissionDeadlinePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getTenderSubmissionDeadlinePeriod() {
        return tenderSubmissionDeadlinePeriod;
    }

    /**
     * Sets the value of the tenderSubmissionDeadlinePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setTenderSubmissionDeadlinePeriod(PeriodType value) {
        this.tenderSubmissionDeadlinePeriod = value;
    }

    /**
     * Gets the value of the invitationSubmissionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getInvitationSubmissionPeriod() {
        return invitationSubmissionPeriod;
    }

    /**
     * Sets the value of the invitationSubmissionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setInvitationSubmissionPeriod(PeriodType value) {
        this.invitationSubmissionPeriod = value;
    }

    /**
     * Gets the value of the participationRequestReceptionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getParticipationRequestReceptionPeriod() {
        return participationRequestReceptionPeriod;
    }

    /**
     * Sets the value of the participationRequestReceptionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setParticipationRequestReceptionPeriod(PeriodType value) {
        this.participationRequestReceptionPeriod = value;
    }

    /**
     * Gets the value of the noticeDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noticeDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoticeDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getNoticeDocumentReference() {
        if (noticeDocumentReference == null) {
            noticeDocumentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.noticeDocumentReference;
    }

    /**
     * Gets the value of the additionalDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getAdditionalDocumentReference() {
        if (additionalDocumentReference == null) {
            additionalDocumentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.additionalDocumentReference;
    }

    /**
     * Gets the value of the processJustification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processJustification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessJustification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessJustificationType }
     * 
     * 
     */
    public List<ProcessJustificationType> getProcessJustification() {
        if (processJustification == null) {
            processJustification = new ArrayList<ProcessJustificationType>();
        }
        return this.processJustification;
    }

    /**
     * Gets the value of the economicOperatorShortList property.
     * 
     * @return
     *     possible object is
     *     {@link EconomicOperatorShortListType }
     *     
     */
    public EconomicOperatorShortListType getEconomicOperatorShortList() {
        return economicOperatorShortList;
    }

    /**
     * Sets the value of the economicOperatorShortList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicOperatorShortListType }
     *     
     */
    public void setEconomicOperatorShortList(EconomicOperatorShortListType value) {
        this.economicOperatorShortList = value;
    }

    /**
     * Gets the value of the openTenderEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the openTenderEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpenTenderEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventType }
     * 
     * 
     */
    public List<EventType> getOpenTenderEvent() {
        if (openTenderEvent == null) {
            openTenderEvent = new ArrayList<EventType>();
        }
        return this.openTenderEvent;
    }

    /**
     * Gets the value of the auctionTerms property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionTermsType }
     *     
     */
    public AuctionTermsType getAuctionTerms() {
        return auctionTerms;
    }

    /**
     * Sets the value of the auctionTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionTermsType }
     *     
     */
    public void setAuctionTerms(AuctionTermsType value) {
        this.auctionTerms = value;
    }

    /**
     * Gets the value of the frameworkAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link FrameworkAgreementType }
     *     
     */
    public FrameworkAgreementType getFrameworkAgreement() {
        return frameworkAgreement;
    }

    /**
     * Sets the value of the frameworkAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrameworkAgreementType }
     *     
     */
    public void setFrameworkAgreement(FrameworkAgreementType value) {
        this.frameworkAgreement = value;
    }

}