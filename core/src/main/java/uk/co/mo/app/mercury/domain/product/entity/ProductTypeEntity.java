package uk.co.mo.app.mercury.domain.product.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import java.util.Set;


/**
 * The persistent class for the product_type database table.
 * 
 */
@Entity
@org.hibernate.annotations.Entity (dynamicUpdate = true)


 
//( finders = { "findProductTypeEntitysByNameEquals"})
@Table(name="product_type")
public class ProductTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;



	private String description;

	//bi-directional many-to-one association to OriginatorProductTypeEntity
	//@OneToMany(mappedBy="productType")
	//private Set<OriginatorProductTypeEntity> originatorProductTypes;

	//bi-directional many-to-one association to ProductClassificationEntity
	@OneToMany(mappedBy="productType")
	private Set<ProductClassificationEntity> productClassifications;

	//bi-directional many-to-one association to ProductModelEntity
	@OneToMany(mappedBy="productType")
	private Set<ProductModelEntity> productModels;


	//bi-directional many-to-many association to ProductMakeEntity
    @ManyToMany
	@JoinTable(
		name="product_type_make"
		, joinColumns={
			@JoinColumn(name="product_type_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="product_make_id")
			}
		)
	private Set<ProductMakeEntity> productMakes;

    public ProductTypeEntity() {
    }

	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	
/**	
	public Set<OriginatorProductTypeEntity> getOriginatorProductTypes() {
		return this.originatorProductTypes;
	}

	public void setOriginatorProductTypes(Set<OriginatorProductTypeEntity> originatorProductTypes) {
		this.originatorProductTypes = originatorProductTypes;
	}
	**/
	public Set<ProductClassificationEntity> getProductClassifications() {
		return this.productClassifications;
	}

	public void setProductClassifications(Set<ProductClassificationEntity> productClassifications) {
		this.productClassifications = productClassifications;
	}
	
	public Set<ProductModelEntity> getProductModels() {
		return this.productModels;
	}

	public void setProductModels(Set<ProductModelEntity> productModels) {
		this.productModels = productModels;
	}
	
	
	public Set<ProductMakeEntity> getProductMakes() {
		return this.productMakes;
	}

	public void setProductMakes(Set<ProductMakeEntity> productMakes) {
		this.productMakes = productMakes;
	}
	
}