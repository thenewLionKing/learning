package uk.co.mo.app.mercury.domain.product.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.cs.entity.AbstractAuditableEntity;
import uk.co.mo.app.mercury.domain.org.manufacturer.beans.ProductMakeBean;


/**
 * The persistent class for the product_make database table.
 * 
 */
@Entity
@Table(name="product_make")
public class ProductMakeEntity extends AbstractAuditableEntity implements Serializable{

	private static final long serialVersionUID = -424949042840587484L;

	private ProductMakeBean productMakeBean = new ProductMakeBean();
/*	private Set<ProductTypeEntity> productTypes;
	private Set<ProductRangeEntity> productRanges;
*/

    public ProductMakeEntity() {
    }

    @Transient
    public ProductMakeBean getProductMakeBean() {
    	return productMakeBean;
    }
    
    
    public void setProductMakeBean(ProductMakeBean productMakeBean) {
    	this.productMakeBean = productMakeBean;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public Integer getId() {
		return this.productMakeBean.getId();
	}

	public void setId(Integer id) {
		this.productMakeBean.setId(id);
	}


	@Column(length=250)
	public String getDescription() {
		return this.productMakeBean.getDescription();
	}

	public void setDescription(String description) {
		this.productMakeBean.setDescription(description);
	}

	@Column(length=100)
	public String getName() {
		return this.productMakeBean.getName();
	}

	public void setName(String name) {
		this.productMakeBean.setName(name);
	}


	@Column(name="oracle_party_number", nullable=false, length=20)
	public String getOraclePartyNumber() {
		return this.productMakeBean.getOraclePartyNumber();
	}

	public void setOraclePartyNumber(String oraclePartyNumber) {
		this.productMakeBean.setOraclePartyNumber(oraclePartyNumber);
	}


/*	//bi-directional many-to-many association to ProductMakeEntity
	@ManyToMany
	@JoinTable(name="product_type_make", joinColumns={@JoinColumn(name="product_make_id")}
				, inverseJoinColumns={@JoinColumn(name="product_type_id")})
	public Set<ProductTypeEntity> getProductTypes() {
		return this.productTypes;
	}

	public void setProductTypes(Set<ProductTypeEntity> productTypes) {
		this.productTypes = productTypes;
	}
	
	//bi-directional many-to-one association to ProductRangeEntity
	@OneToMany(mappedBy="productMake")
	public Set<ProductRangeEntity> getProductRanges() {
		return this.productRanges;
	}

	public void setProductRanges(Set<ProductRangeEntity> productRanges) {
		this.productRanges = productRanges;
	}
*/
}