package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import uk.co.mo.app.mercury.cs.entity.AbstractAuditableEntity;
import uk.co.mo.app.mercury.cs.entity.AuditTypes;
import uk.co.mo.app.mercury.domain.agreement.entity.AgreementProductCustomisationEntity;
import uk.co.mo.app.mercury.domain.agreement.entity.AgreementProductEntity;
import uk.co.mo.app.mercury.domain.product.entity.ProductTypeEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;


/**
 * The persistent class for the product_offering database table.
 * 
 */
@Entity
@Table(name="product_offering")



public class ProductOfferingEntity extends AbstractAuditableEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id       
    @Column(name = "id",columnDefinition="Integer")    
    private Integer id;  

	@Column(name="description")
	private  String description;
	
	@Column(name="effective_from")
	private Date effectiveFrom;

	@Column(name="effective_to")
	private Date effectiveTo;

	@Column(name="insert_date")
	private Date insertDate;

	@Column(name="insert_user")
	private String insertUser;

	@Column(name="is_hidden")
	private Boolean isHidden;

	@Column(name="is_one_off")
	private Boolean isOneOff;

	@Column(name="product_code", columnDefinition="char(8)")
	private String productCode;

	@Column(name="product_model_id")
	private Integer productModelId;

	//bi-directional many-to-one association to ProfileType
    @ManyToOne
	@JoinColumn(name="product_type_id")
	private ProductTypeEntity productType;
    
  //bi-directional many-to-many association to PinEntity
    @OneToMany (mappedBy="productOffering", cascade= CascadeType.ALL)
	List<ProductOfferingOptionEntity> options;

    @OneToMany (mappedBy="id.productOffering", cascade= CascadeType.ALL)
	List<ProductOfferingDealerEntity> productOfferingDealer;

    
    
	/**
	 * @return the productType
	 */
	public ProductTypeEntity getProductType() {
		return productType;
	}

	/**
	 * @param productType the productType to set
	 */
	public void setProductType(ProductTypeEntity productType) {
		this.productType = productType;
	}

	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_user")
	private String updateUser;

	//bi-directional many-to-one association to ProductCustomisation
	//@OneToMany(mappedBy="productOffering")
	//private Set<ProductCustomisationEntity> productCustomisations;
	
	//@ManyToMany
	//private 

	//bi-directional many-to-one association to ProductPriceProfile
	@OneToMany(mappedBy="productOffering")
	private Set<ProductPriceProfileEntity> productPriceProfiles;

    public ProductOfferingEntity() {
    }

    public Integer getId() {    
        return this.id;        
    }    
    
    public void setId(Integer id) {    
        this.id = id;        
    }    
    
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEffectiveFrom() {
		return this.effectiveFrom;
	}

	public void setEffectiveFrom(Date effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}

	public Date getEffectiveTo() {
		return this.effectiveTo;
	}

	public void setEffectiveTo(Date effectiveTo) {
		this.effectiveTo = effectiveTo;
	}

	public Date getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public String getInsertUser() {
		return this.insertUser;
	}

	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}

	public Boolean getIsHidden() {
		return this.isHidden;
	}

	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	public Boolean getIsOneOff() {
		return this.isOneOff;
	}

	public void setIsOneOff(Boolean isOneOff) {
		this.isOneOff = isOneOff;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Integer getProductModelId() {
		return this.productModelId;
	}

	public void setProductModelId(Integer productModelId) {
		this.productModelId = productModelId;
	}


	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	/*public Set<ProductCustomisationEntity> getProductCustomisations() {
		return this.productCustomisations;
	}

	public void setProductCustomisations(Set<ProductCustomisationEntity> productCustomisations) {
		this.productCustomisations = productCustomisations;
	}*/
	
	public Set<ProductPriceProfileEntity> getProductPriceProfiles() {
		return this.productPriceProfiles;
	}

	public void setProductPriceProfiles(Set<ProductPriceProfileEntity> productPriceProfiles) {
		this.productPriceProfiles = productPriceProfiles;
	}

	/**
	 * @return the options
	 */
	public List<ProductOfferingOptionEntity> getOptions() {
		return options;
	}

	/**
	 * @param options the options to set
	 */
	public void addOption(final ProductOfferingOptionEntity option) {
		if(this.options==null) this.options = new ArrayList<ProductOfferingOptionEntity>(0);
		this.addObserver(new Observer(){
			private ProductOfferingOptionEntity productOption = option;
			public void update(Observable o,Object args){
				ProductOfferingEntity changedOffering = (ProductOfferingEntity) o;
				productOption.setInsertDate(changedOffering.getInsertDate());
				productOption.setInsertUser(changedOffering.getInsertUser());
				productOption.audit((AuditTypes)args);			
			}
		});		
		this.options.add(option);
	}
	
	public void removeAllOptions(){
		if(this.options!=null && this.options.size()>0){
			for(ProductOfferingOptionEntity entity : this.options){
				entity.remove();
			}
			this.options.clear();
		}
		
	}
	
	public void addProductOfferingDealer( ProductOfferingDealerEntity oneOff) {
		if(this.productOfferingDealer==null) this.productOfferingDealer = new ArrayList<ProductOfferingDealerEntity>(0);
		this.productOfferingDealer.add(oneOff);
	}
	
	public void setProductOfferingDealer( List<ProductOfferingDealerEntity> oneOff) {
		this.productOfferingDealer = oneOff;
	}
	public List<ProductOfferingDealerEntity> getProductOfferingDealers(){
		return this.productOfferingDealer;
	}
}