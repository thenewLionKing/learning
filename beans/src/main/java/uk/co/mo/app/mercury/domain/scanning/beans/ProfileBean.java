package uk.co.mo.app.mercury.domain.scanning.beans;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class ProfileBean implements Serializable{

	private static final long serialVersionUID = 6334684217076124818L;

	private String ABSTRACT;
	private Integer agreement_id;
	private Integer APPLICATION;
	private String applicationName;
	private Integer AUTHOR;
	private Integer BATCH_NO;
	private Character CLASS_ID;
	private Integer correspondentID;
	private Date CREATION_DATE;
	private Date CREATION_TIME;
	private Integer customer_ID;
	private Boolean customerIndexed;
	private Integer DEALER_NO;
	private Character DELETED_CLASS;
	private Character DELETED_DEPT;
	private Character DEPARTMENT;
	private Integer DOC_STATUS;
	private String DOCNAME;
	private Integer DOCNUMBER;
	private Integer docServer_LocId;
	private Integer globalTitleID;
	private Integer LAST_ACCESS_ID;
	private Integer NO_KEYS;
	private String PATH;
	private Integer RANDOM_KEY;
	private Integer reasonCodeID;
	private Integer STATUS;
	private Character STORAGETYPE;
	private Integer TYPIST;
	private Integer versionId;
	private String fullPath;
	
	public String getABSTRACT() {
		return ABSTRACT;
	}
	public void setABSTRACT(String aBSTRACT) {
		ABSTRACT = aBSTRACT;
	}
	public Integer getAgreement_id() {
		return agreement_id;
	}
	public void setAgreement_id(Integer agreement_id) {
		this.agreement_id = agreement_id;
	}
	public Integer getAPPLICATION() {
		return APPLICATION;
	}
	public void setAPPLICATION(Integer aPPLICATION) {
		APPLICATION = aPPLICATION;
	}
	public Integer getAUTHOR() {
		return AUTHOR;
	}
	public void setAUTHOR(Integer aUTHOR) {
		AUTHOR = aUTHOR;
	}
	public Integer getBATCH_NO() {
		return BATCH_NO;
	}
	public void setBATCH_NO(Integer bATCH_NO) {
		BATCH_NO = bATCH_NO;
	}
	public Character getCLASS_ID() {
		return CLASS_ID;
	}
	public void setCLASS_ID(Character cLASS_ID) {
		CLASS_ID = cLASS_ID;
	}
	public Integer getCorrespondentID() {
		return correspondentID;
	}
	public void setCorrespondentID(Integer correspondentID) {
		this.correspondentID = correspondentID;
	}
	public Date getCREATION_DATE() {
		return CREATION_DATE;
	}
	public void setCREATION_DATE(Date cREATION_DATE) {
		CREATION_DATE = cREATION_DATE;
	}
	public Date getCREATION_TIME() {
		return CREATION_TIME;
	}
	public void setCREATION_TIME(Date cREATION_TIME) {
		CREATION_TIME = cREATION_TIME;
	}
	public Integer getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(Integer customer_ID) {
		this.customer_ID = customer_ID;
	}
	public Boolean getCustomerIndexed() {
		return customerIndexed;
	}
	public void setCustomerIndexed(Boolean customerIndexed) {
		this.customerIndexed = customerIndexed;
	}
	public Integer getDEALER_NO() {
		return DEALER_NO;
	}
	public void setDEALER_NO(Integer dEALER_NO) {
		DEALER_NO = dEALER_NO;
	}
	public Character getDELETED_CLASS() {
		return DELETED_CLASS;
	}
	public void setDELETED_CLASS(Character dELETED_CLASS) {
		DELETED_CLASS = dELETED_CLASS;
	}
	public Character getDELETED_DEPT() {
		return DELETED_DEPT;
	}
	public void setDELETED_DEPT(Character dELETED_DEPT) {
		DELETED_DEPT = dELETED_DEPT;
	}
	public Character getDEPARTMENT() {
		return DEPARTMENT;
	}
	public void setDEPARTMENT(Character dEPARTMENT) {
		DEPARTMENT = dEPARTMENT;
	}
	public Integer getDOC_STATUS() {
		return DOC_STATUS;
	}
	public void setDOC_STATUS(Integer dOC_STATUS) {
		DOC_STATUS = dOC_STATUS;
	}
	public String getDOCNAME() {
		return DOCNAME;
	}
	public void setDOCNAME(String dOCNAME) {
		DOCNAME = dOCNAME;
	}
	
	@XmlElement(required=true)
	public Integer getDOCNUMBER() {
		return DOCNUMBER;
	}
	public void setDOCNUMBER(Integer dOCNUMBER) {
		DOCNUMBER = dOCNUMBER;
	}
	public Integer getDocServer_LocId() {
		return docServer_LocId;
	}
	public void setDocServer_LocId(Integer docServer_LocId) {
		this.docServer_LocId = docServer_LocId;
	}
	public Integer getGlobalTitleID() {
		return globalTitleID;
	}
	public void setGlobalTitleID(Integer globalTitleID) {
		this.globalTitleID = globalTitleID;
	}
	public Integer getLAST_ACCESS_ID() {
		return LAST_ACCESS_ID;
	}
	public void setLAST_ACCESS_ID(Integer lAST_ACCESS_ID) {
		LAST_ACCESS_ID = lAST_ACCESS_ID;
	}
	public Integer getNO_KEYS() {
		return NO_KEYS;
	}
	public void setNO_KEYS(Integer nO_KEYS) {
		NO_KEYS = nO_KEYS;
	}
	public String getPATH() {
		return PATH;
	}
	public void setPATH(String pATH) {
		PATH = pATH;
	}
	public Integer getRANDOM_KEY() {
		return RANDOM_KEY;
	}
	public void setRANDOM_KEY(Integer rANDOM_KEY) {
		RANDOM_KEY = rANDOM_KEY;
	}
	public Integer getReasonCodeID() {
		return reasonCodeID;
	}
	public void setReasonCodeID(Integer reasonCodeID) {
		this.reasonCodeID = reasonCodeID;
	}
	public Integer getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(Integer sTATUS) {
		STATUS = sTATUS;
	}
	public Character getSTORAGETYPE() {
		return STORAGETYPE;
	}
	public void setSTORAGETYPE(Character sTORAGETYPE) {
		STORAGETYPE = sTORAGETYPE;
	}
	public Integer getTYPIST() {
		return TYPIST;
	}
	public void setTYPIST(Integer tYPIST) {
		TYPIST = tYPIST;
	}
	public Integer getVersionId() {
		return versionId;
	}
	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}
	public String getFullPath() {
		return fullPath;
	}
	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public String getApplicationName() {
		return applicationName;
	}
}