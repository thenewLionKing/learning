/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

import uk.co.mo.app.mercury.cs.entity.AbstractAuditableEntity;


/**
 *  Class comments go here
 * 
 *	@author : VinayRa
 *  @date	: 26 Mar 2010
 *	@time	: 10:38:34
 *
 *  Change Log - Who : When : Comment
 */
@Entity
@Table(name = "product_offering_option")
@RooEntity
@RooToString
public class ProductOfferingOptionEntity extends AbstractAuditableEntity implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(columnDefinition="int")
	private Integer id;
	
	@Version
	@Column(columnDefinition="bigint")
	private Integer version;
	
	@ManyToOne
	@JoinColumn(name="product_offering_id",columnDefinition="int")
	private ProductOfferingEntity productOffering;
	
	@Column(name="product_option_type_id",columnDefinition="int")
	private Integer productOptionTypeId;
	
	@Column(name="description")
	private String description;
	
	@Column(name="cost", columnDefinition="money")
	private BigDecimal cost;
	
	@Column(name="insert_date")
	private Date insertDate;
	
	@Column(name="insert_user")
	private String insertUser;
	
	@Column(name="update_date")
	private Date updateDate;
	
	@Column(name="update_user")
	private String updateUser;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the version
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * @return the productOffering
	 */
	public ProductOfferingEntity getProductOffering() {
		return productOffering;
	}

	/**
	 * @return the productOptionTypeId
	 */
	public Integer getProductOptionTypeId() {
		return productOptionTypeId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the cost
	 */
	public BigDecimal getCost() {
		return cost;
	}

	/**
	 * @return the insertDate
	 */
	public Date getInsertDate() {
		return insertDate;
	}

	/**
	 * @return the insertUser
	 */
	public String getInsertUser() {
		return insertUser;
	}

	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * @return the updateUser
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * @param productOffering the productOffering to set
	 */
	public void setProductOffering(ProductOfferingEntity productOffering) {
		this.productOffering = productOffering;
	}

	/**
	 * @param productOptionTypeId the productOptionTypeId to set
	 */
	public void setProductOptionTypeId(Integer productOptionTypeId) {
		this.productOptionTypeId = productOptionTypeId;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(BigDecimal cost) {
		this.cost = cost;
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
