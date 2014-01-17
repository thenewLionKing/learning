package uk.co.mo.app.mercury.domain.agreement.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.cs.entity.AbstractAuditableEntity;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementProductBean;
import uk.co.mo.app.mercury.domain.product.entity.BasicColourEntity;
import uk.co.mo.app.mercury.domain.product.pricing.entity.ProductPriceProfileEntity;

@Entity
@Table(name = "agreement_product")
public class AgreementProductEntity  extends AbstractAuditableEntity implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
//    private List<AgreementProductCustomisationEntity> customisations;
/*    private ProductTypeEntity productType;	 
*/	private BasicColourEntity basicColour;
	private ProductPriceProfileEntity priceProfile;
	private AgreementEntity agreement;	 

	private AgreementProductBean agreementProductBean = new AgreementProductBean();

	@Transient
	public AgreementProductBean getAgreementProductBean() {
		return agreementProductBean;
	}
	public void setAgreementProductBean(AgreementProductBean agreementProductBean) {
		this.agreementProductBean = agreementProductBean;
	}

	@Column(name="asset_number")
	public String getAssetNumber() {    
	    return this.agreementProductBean.getAssetNumber();        
	}    
	
	public void setAssetNumber(String assetNumber) {    
	    this.agreementProductBean.setAssetNumber(assetNumber);        
	}    

	@Column(name="chassis_number")
	public String getChassisNumber() {    
	    return this.agreementProductBean.getChassisNumber();        
	}    
	
	public void setChassisNumber(String chassisNumber) {    
	    this.agreementProductBean.setChassisNumber(chassisNumber);        
	}    
	@Column(name="transaxle_number" )
	public String getTransaxleNumber() {    
	    return this.agreementProductBean.getTransaxleNumber();        
	}    
	
	public void setTransaxleNumber(String transaxleNumber) {    
	    this.agreementProductBean.setTransaxleNumber(transaxleNumber);        
	}    
	
	@Column(name="battery_number")
	public String getBatteryNumber() {    
	    return this.agreementProductBean.getBatteryNumber();        
	}    
	
	public void setBatteryNumber(String batteryNumber) {    
	    this.agreementProductBean.setBatteryNumber(batteryNumber);        
	}    
	@Column(name="motor_number")
	public String getMotorNumber() {    
	    return this.agreementProductBean.getMotorNumber();        
	}    
	
	public void setMotorNumber(String motorNumber) {    
	    this.agreementProductBean.setMotorNumber(motorNumber);        
	}
	
	@Column(name="registration_number")
	public String getRegistrationNumber() {
	    return this.agreementProductBean.getRegistrationNumber();
	}
	
	public void setRegistrationNumber(String registrationNumber) {
	    this.agreementProductBean.setRegistrationNumber(registrationNumber);
	}

	@Column(name="registration_date")
	public Date getRegistrationDate() {    
	    return this.agreementProductBean.getRegistrationDate();        
	}    
	
	public void setRegistrationDate(Date registrationDate) {    
	    this.agreementProductBean.setRegistrationDate(registrationDate);        
	}    

	@Column(name="effective_from")
	public Date getEffectiveFrom() {    
	    return this.agreementProductBean.getEffectiveFrom();        
	}    
	
	public void setEffectiveFrom(Date effectiveFrom) {    
	    this.agreementProductBean.setEffectiveFrom(effectiveFrom);        
	}    
	
	@Column(name="effective_to")
	public Date getEffectiveTo() {    
	    return this.agreementProductBean.getEffectiveTo();        
	}    
	
	public void setEffectiveTo(Date effectiveTo) {    
	    this.agreementProductBean.setEffectiveTo(effectiveTo);        
	}    
	
	@Column(name="insert_date")
	public Date getInsertDate() {    
	    return this.agreementProductBean.getInsertDate();        
	}    
	
	public void setInsertDate(Date insertDate) {    
	    this.agreementProductBean.setInsertDate(insertDate);        
	}    

	@Column(name="update_date")
	public Date getUpdateDate() {    
	    return this.agreementProductBean.getUpdateDate();        
	}    
	
	public void setUpdateDate(Date updateDate) {    
	    this.agreementProductBean.setUpdateDate(updateDate);        
	}    
	
	@Column(name="insert_user")
	public String getInsertUser() {    
	    return this.agreementProductBean.getInsertUser();        
	}    
	
	public void setInsertUser(String insertUser) {    
	    this.agreementProductBean.setInsertUser(insertUser);        
	}    

	@Column(name="update_user")
	public String getUpdateUser() {    
	    return this.agreementProductBean.getUpdateUser();        
	}    
	
	public void setUpdateUser(String updateUser) {    
	    this.agreementProductBean.setUpdateUser(updateUser);        
	}
	
	/**
	 * @return the customisations
	 */
/*    @OneToMany(mappedBy="agreementProduct",cascade= CascadeType.ALL)
	public List<AgreementProductCustomisationEntity> getCustomisations() {
		return customisations;
	}
*/	
/*	*//**
	 * @param customisation the customisations to set
	 *//*
		public void addCustomisations(
				final AgreementProductCustomisationEntity customisation) {
			if(this.customisations == null) customisations = new ArrayList<AgreementProductCustomisationEntity>(0);
			this.addObserver(new Observer(){
				private AgreementProductCustomisationEntity productCustomisation = customisation;
				public void update(Observable o,Object args){
					productCustomisation.audit(AuditTypes.AUDIT_CREATE);
				}
			});		
			customisations.add(customisation);
		}
	
	public void removeAllCustomisations(){
	    if(this.customisations!=null && this.customisations.size()>0){
	        for(AgreementProductCustomisationEntity entity : this.customisations){
	            entity.remove();
	        }
	        this.customisations.clear();
	    }
	
	    this.deleteObservers();
	}*/
		/**
	 * @return the keptSecure
	 */
	@Column(name="is_kept_secure")
	public Boolean isKeptSecure() {
		return agreementProductBean.isKeptSecure();
	}
	/**
	 * @return the secrureDuringTransit
	 */
	@Column(name="is_secure_during_transit", columnDefinition="tinyint")
	public Short isSecrureDuringTransit() {
		return agreementProductBean.getSecrureDuringTransit();
	}
	/**
	 * @param keptSecure the keptSecure to set
	 */
	public void setKeptSecure(Boolean keptSecure) {
		this.agreementProductBean.setKeptSecure(keptSecure);
	}
	/**
	 * @param secrureDuringTransit the secrureDuringTransit to set
	 */
	public void setSecrureDuringTransit(short secrureDuringTransit) {
		this.agreementProductBean.setSecrureDuringTransit((short) secrureDuringTransit);
	}
	/**
	 * @return the soleUser
	 */
	@Column(name="is_sole_user")
	public Boolean isSoleUser() {
		return agreementProductBean.isSoleUser();
	}
	/**
	 * @param soleUser the soleUser to set
	 */
	public void setSoleUser(Boolean soleUser) {
		this.agreementProductBean.setSoleUser(soleUser);
	}
	
	@Column(name="colour", insertable=false, updatable=false)
	public String getColour() {    
	    return this.agreementProductBean.getColour();        
	}    
	
	public void setColour(String colour) {    
	    this.agreementProductBean.setColour(colour);        
	}    
	
	
	@ManyToOne	
	@JoinColumn(name="colour", nullable=true)
	public BasicColourEntity getBasicColour() {
		return basicColour;
	}

	public void setBasicColour(BasicColourEntity basicColour) {
		this.basicColour = basicColour;
	}
	
	//bi-directional many-to-one association 
/*  @ManyToOne
	@JoinColumn(name="product_type_id")
	public ProductTypeEntity getProductType() {    
	    return this.productType;        
	}    
	    
	public void setProductType(ProductTypeEntity productType) {    
	    this.productType = productType;        
	}    

*/
	@ManyToOne
	@JoinColumn(name="agreement_id" , nullable=true)
	public AgreementEntity getAgreement() {    
		return this.agreement;        
	}    
	
	public void setAgreement(AgreementEntity agreement) {    
		this.agreement = agreement;        
	}    

	@ManyToOne
	@JoinColumn(name="product_price_profile_id")
	public ProductPriceProfileEntity getPriceProfile() {    
	    return this.priceProfile;        
	}    
	
	public void setPriceProfile(ProductPriceProfileEntity priceProfile) {    
	    this.priceProfile = priceProfile;        
	}    
}