package uk.co.mo.app.mercury.domain.product.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import uk.co.mo.app.mercury.cs.entity.AbstractAuditableEntity;

import java.sql.Date;
import java.util.Set;


/**
 * The persistent class for the make_product_type database table.
 * 
 */
@Entity



@Table(name="product_type_make")
public class ProductTypeMakeEntity extends AbstractAuditableEntity implements Serializable {
	private static final long serialVersionUID = 1L;



	@Column(name="insert_user")
	private String createdBy;

	@Column(name="insert_date")
	private Date dateCreated;

	@Column(name="effective_from")
	private Date effectiveFrom;

	@Column(name="effective_to")
	private Date effectiveTo;

	@Column(name="update_date")
	private Date lastUpdated;

	@Column(name="update_user")
	private String updatedBy;

	

	//bi-directional many-to-one association to ProductMakeEntity
    @ManyToOne
	@JoinColumn(name="product_make_id")
	private ProductMakeEntity productMake;

	//bi-directional many-to-one association to ProductTypeEntity
    @ManyToOne
	@JoinColumn(name="product_type_id")
	private ProductTypeEntity productType;

	


    public ProductTypeMakeEntity() {
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

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	

	public ProductMakeEntity getProductMake() {
		return this.productMake;
	}

	public void setProductMake(ProductMakeEntity productMake) {
		this.productMake = productMake;
	}
	
	public ProductTypeEntity getProductType() {
		return this.productType;
	}

	public void setProductType(ProductTypeEntity productType) {
		this.productType = productType;
	}
	
}