/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 *  Class comments go here
 * 
 *	@author : VinayRa
 *  @date	: 26 Mar 2010
 *	@time	: 12:07:52
 *
 *  Change Log - Who : When : Comment
 */

@Embeddable
public class ProductOfferingDealerPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="product_offering_id")
	private ProductOfferingEntity productOffering;

	@Column(name="dealer_code", columnDefinition="char (5)")
	private String dealerCode;

	public ProductOfferingEntity getProductOfferingId() {
		return this.productOffering;
	}
	public void setProductOffering(ProductOfferingEntity productOffering) {
		this.productOffering = productOffering;
	}
	public String getDealerCode() {
		return this.dealerCode;
	}
	public void setDealerCode(String dealerCode) {
		this.dealerCode = dealerCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProductOfferingDealerPK)) {
			return false;
		}
		ProductOfferingDealerPK castOther = (ProductOfferingDealerPK)other;
		return 
			(this.productOffering.equals(castOther.productOffering))
			&& (this.dealerCode.equals(castOther.dealerCode));

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.productOffering.getId();
		//hash = hash * prime + this.dealerCode;
		
		return hash;
    }
	

}
