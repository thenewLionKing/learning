package uk.co.mo.app.mercury.domain.product.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import java.sql.Date;
import java.util.Set;


/**
 * The persistent class for the product_classification entitybase table.
 * 
 */
@Entity


 //(finders = {"findProductClassificationEntitysByNameEquals"})
@Table(name="product_classification")
public class ProductClassificationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Column(name="insert_user")
	private String createdBy;

	@Column(name="insert_date")
	private Date dateCreated;

	private String description;

	@Column(name="effective_from")
	private Date effectiveFrom;

	@Column(name="effective_to")
	private Date effectiveTo;

	@Column(name="update_date")
	private Date lastUpdated;

	private String name;

	@Column(name="update_user")
	private String updatedBy;
	
	@Column(name="is_custom_product")
	private Boolean customProduct;

	

	//bi-directional many-to-one association to ProductTypeEntity
    @ManyToOne
	@JoinColumn(name="product_type_id")
	private ProductTypeEntity productType;

	//bi-directional many-to-one association to ProductModelEntity
	@OneToMany(mappedBy="productClassification")
	private Set<ProductModelEntity> productModels;

    public ProductClassificationEntity() {
    }


	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDescription() {
		return this.description;
	}

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

	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public ProductTypeEntity getProductType() {
		return this.productType;
	}

	public void setProductType(ProductTypeEntity productType) {
		this.productType = productType;
	}
	
	public Set<ProductModelEntity> getProductModels() {
		return this.productModels;
	}

	public void setProductModels(Set<ProductModelEntity> productModels) {
		this.productModels = productModels;
	}
	
	/**
	 * @return the customProduct
	 */
	public Boolean isCustomProduct() {
		return customProduct;
	}

	/**
	 * @param customProduct the customProduct to set
	 */
	public void setCustomProduct(Boolean customProduct) {
		this.customProduct = customProduct;
	}
	
}