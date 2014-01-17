package uk.co.mo.app.mercury.domain.product.entity;

import java.io.Serializable;
import javax.persistence.*;

import uk.co.mo.app.mercury.cs.entity.AbstractAuditableEntity;

import java.util.Date;

/**
 * The persistent class for the product_model database table.
 * 
 */
@Entity


@Table(name = "product_model")

public class ProductModelEntity extends AbstractAuditableEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id    
    @Column(name = "id", columnDefinition="Integer")    
    private Integer id; 
    
    @Column(name = "effective_from")
    private Date effectiveFrom;

    @Column(name = "effective_to")
    private Date effectiveTo;

    @Column(name = "height_cm", columnDefinition = "decimal(5,2)")
    private Double heightCm;

    @Column(name = "invalid_carriage_class", columnDefinition = "tinyint")
    private Integer invalidCarriageClass;

    //@Column(name = "is_one_off")
    //private boolean oneOff;

    @Column(name = "length_cm", columnDefinition = "decimal(5,2)")
    private Double lengthCm;

    @Column(name = "maximum_user_weight_kg", columnDefinition = "decimal(5,2)")
    private Double maxUserWeightKg;

    @Column(name = "maximum_range_miles", columnDefinition = "decimal(5,2)")
    private Double maximumRangeMiles;

    @Column(name = "maximum_speed_mph", columnDefinition = "decimal(5,2)")
    private Double maximumSpeedMph;

    private String name;

    @Column(name = "number_of_wheels", columnDefinition = "tinyint")
    private Integer numberOfWheels;

    @Column(name = "weight_kg", columnDefinition = "decimal(5,2)")
    private Double weightKg;

    @Column(name = "width_cm", columnDefinition = "decimal(5,2)")
    private Double widthCm;

    @Column(name="insert_date")
	private Date insertDate;

	@Column(name="insert_user")
	private String insertUser;
	
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_user")
	private String updateUser;
	
   
    @ManyToOne 
    @JoinColumn(name = "product_classification_id")
    private ProductClassificationEntity productClassification;

    @ManyToOne (cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name = "product_range_id")
    private ProductRangeEntity productRange;

    @ManyToOne
    @JoinColumn(name = "product_type_id")
    private ProductTypeEntity productType;

    public ProductModelEntity() {
    }

  
    /**
	 * @return the insertUser
	 */
    public String getInsertUser() {
        return this.insertUser;
    }

    /**
	 * @return the insertDate
	 */
    public Date getInsertDate() {
        return this.insertDate;
    }

    /**
	 * @return the updateUser
	 */
    public String getUpdateUser() {
        return this.updateUser;
    }

    /**
	 * @return the updateDate
	 */
    public Date getUpdateDate() {
        return this.updateDate;
    }

    /**
	 * @param isOneOff the isOneOff to set
	 */
   /* public void setOneOff(boolean isOneOff) {
        this.oneOff = isOneOff;
    }
*/

    /**
	 * @return the oneOff
	 */
   /* public boolean isOneOff() {
        return oneOff;
    }
*/
 

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

    public Double getHeightCm() {
        return this.heightCm;
    }

    public void setHeightCm(Double heightCm) {
        this.heightCm = heightCm;
    }

    public Integer getInvalidCarriageClass() {
        return this.invalidCarriageClass;
    }

    public void setInvalidCarriageClass(Integer invalidCarriageClass) {
        this.invalidCarriageClass = invalidCarriageClass;
    }

    public Double getLengthCm() {
        return this.lengthCm;
    }

    public void setLengthCm(Double lengthCm) {
        this.lengthCm = lengthCm;
    }

    public Double getMaxUserWeightKg() {
        return this.maxUserWeightKg;
    }

    public void setMaxUserWeightKg(Double maxUserWeightKg) {
        this.maxUserWeightKg = maxUserWeightKg;
    }

    public Double getMaximumRangeMiles() {
        return this.maximumRangeMiles;
    }

    public void setMaximumRangeMiles(Double maximumRangeMiles) {
        this.maximumRangeMiles = maximumRangeMiles;
    }

    public Double getMaximumSpeedMph() {
        return this.maximumSpeedMph;
    }

    public void setMaximumSpeedMph(Double maximumSpeedMph) {
        this.maximumSpeedMph = maximumSpeedMph;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public Double getWeightKg() {
        return this.weightKg;
    }

    public void setWeightKg(Double weightKg) {
        this.weightKg = weightKg;
    }

    public Double getWidthCm() {
        return this.widthCm;
    }

    public void setWidthCm(Double widthCm) {
        this.widthCm = widthCm;
    }


    public ProductClassificationEntity getProductClassification() {
        return this.productClassification;
    }

    public void setProductClassification(ProductClassificationEntity productClassification) {
        this.productClassification = productClassification;
    }

    public ProductRangeEntity getProductRange() {
        return this.productRange;
    }

    public void setProductRange(ProductRangeEntity productRange) {
        this.productRange = productRange;
    }

    public ProductTypeEntity getProductType() {
        return this.productType;
    }

    public void setProductType(ProductTypeEntity productType) {
        this.productType = productType;
    }


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getId() {
		return id;
	}


	/**
	 * @param insertDate the insertDate to set
	 */
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}


	/**
	 * @param insertUser the insertUser to set
	 */
	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}


	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}


	/**
	 * @param updateUser the updateUser to set
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
}
