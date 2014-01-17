package uk.co.mo.app.mercury.domain.product.entity;

import java.io.Serializable;
import javax.persistence.*;

import uk.co.mo.app.mercury.cs.entity.AbstractAuditableEntity;
import uk.co.mo.app.mercury.cs.entity.AuditTypes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * The persistent class for the product_range database table.
 * 
 */
@Entity


//(finders = { "findProductRangeEntitysByNameEquals" })
@Table(name = "product_range")
public class ProductRangeEntity extends AbstractAuditableEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	 @Id    
	 @Column(name = "id", columnDefinition="Integer")    
	 private Integer id;    
	

	private String description;

	@Column(name = "effective_from")
	private Date effectiveFrom;

	@Column(name = "effective_to")
	private Date effectiveTo;

	@Column(name="insert_date")
    protected Date insertDate;
	@Column(name="insert_user")
    protected String insertUser;
	@Column(name="update_user")
    protected String updateUser;
	@Column(name="update_date")
    protected Date updateDate;
	
	private String name;

	// bi-directional many-to-one association to ProductModelEntity
	@OneToMany(mappedBy = "productRange")
	private List<ProductModelEntity> productModels;

	// bi-directional many-to-one association to ProductMakeEntity
	@ManyToOne
	@JoinColumn(name = "product_make_id")
	private ProductMakeEntity productMake;


	public ProductRangeEntity() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProductModelEntity> getProductModels() {
		return this.productModels;
	}

	public void setProductModels(ArrayList<ProductModelEntity> productModels) {
		this.productModels = productModels;
	}

    public void addProductModel(final ProductModelEntity productModel){
		if(this.productModels==null){
			this.productModels = new ArrayList<ProductModelEntity>(0);
		}
		addObserver(new Observer(){
			private ProductModelEntity model = productModel;
			public void update(Observable o,Object args){
				ProductRangeEntity changedRange = (ProductRangeEntity) o;
				model.setInsertDate(changedRange.getInsertDate());
				model.setInsertUser(changedRange.getInsertUser());
				model.audit((AuditTypes)args);			
			}
		});
		this.productModels.add(productModel);
	}

	public ProductMakeEntity getProductMake() {
		return this.productMake;
	}

	public void setProductMake(ProductMakeEntity productMake) {
		this.productMake = productMake;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	  public Date getInsertDate() {
	        return insertDate;
	    }

	    public void setInsertDate(Date insertDate) {
	        this.insertDate = insertDate;
	    }

	    public String getInsertUser() {
	        return insertUser;
	    }

	    public void setInsertUser(String insertUser) {
	        this.insertUser = insertUser;
	    }

	    public String getUpdateUser() {
	        return updateUser;
	    }

	    public void setUpdateUser(String updateUser) {
	        this.updateUser = updateUser;
	    }

	    public Date getUpdateDate() {
	        return updateDate;
	    }

	    public void setUpdateDate(Date updateDate) {
	        this.updateDate = updateDate;
	    }





}