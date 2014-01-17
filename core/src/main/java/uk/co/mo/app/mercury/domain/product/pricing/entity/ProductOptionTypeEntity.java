/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.*;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
/**
 *  Class comments go here
 * 
 *	@author : VinayRa
 *  @date	: 26 Mar 2010
 *	@time	: 10:28:28
 *
 *  Change Log - Who : When : Comment
 */
@Entity
@Table(name = "product_option_type")
@RooEntity
@RooToString
public class ProductOptionTypeEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	
	private String description;
	
	//bi-directional many-to-many association to PinEntity
    @ManyToMany (cascade= CascadeType.ALL)
	@JoinTable(
		name="product_offering_option"
		, joinColumns={
			@JoinColumn(name="product_option_type_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="product_offering_id")
			}
		)
	private List<ProductOfferingEntity> productOfferings;
	

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	

}
