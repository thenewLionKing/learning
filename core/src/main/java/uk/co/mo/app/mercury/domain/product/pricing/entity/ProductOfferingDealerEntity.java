/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 *  Class comments go here
 * 
 *	@author : VinayRa
 *  @date	: 26 Mar 2010
 *	@time	: 10:52:18
 *
 *  Change Log - Who : When : Comment
 */
@Entity
@Table(name = "product_offering_dealer")
@RooEntity
@RooToString
public class ProductOfferingDealerEntity implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
	@EmbeddedId
	private ProductOfferingDealerPK id;

	/**
	 * @return the id
	 */
	public ProductOfferingDealerPK getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(ProductOfferingDealerPK id) {
		this.id = id;
	}
    
	
	
	
	
	
}
