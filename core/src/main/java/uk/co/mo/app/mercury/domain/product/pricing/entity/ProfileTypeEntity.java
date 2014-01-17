package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import java.util.Set;


/**
 * The persistent class for the profile_types database table.
 * 
 */
@Entity
@Table(name="profile_types")



public class ProfileTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="profile_type", columnDefinition="char(2)")
	private String profileType;

	@Column(name="type_desc")
	private String typeDesc;

	//bi-directional many-to-one association to ProductPriceProfile
	@OneToMany(mappedBy="profileType")
	private Set<ProductPriceProfileEntity> productPriceProfiles;

    public ProfileTypeEntity() {
    }

	public String getProfileType() {
		return this.profileType;
	}

	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}

	public String getTypeDesc() {
		return this.typeDesc;
	}

	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}

	public Set<ProductPriceProfileEntity> getProductPriceProfiles() {
		return this.productPriceProfiles;
	}

	public void setProductPriceProfiles(Set<ProductPriceProfileEntity> productPriceProfiles) {
		this.productPriceProfiles = productPriceProfiles;
	}
	
}