package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import java.util.Set;


/**
 * The persistent class for the benifit_types database table.
 * 
 */
@Entity
@Table(name="benifit_types")



public class BenifitTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="benifit_code")
	private String benifitCode;

	@Column(name="benifit_desc")
	private String benifitDesc;

	//bi-directional many-to-one association to ProductPriceProfile
	@OneToMany(mappedBy="benifitType")
	private Set<ProductPriceProfileEntity> productPriceProfiles;

    public BenifitTypeEntity() {
    }

	public String getBenifitCode() {
		return this.benifitCode;
	}

	public void setBenifitCode(String benifitCode) {
		this.benifitCode = benifitCode;
	}

	public String getBenifitDesc() {
		return this.benifitDesc;
	}

	public void setBenifitDesc(String benifitDesc) {
		this.benifitDesc = benifitDesc;
	}

	public Set<ProductPriceProfileEntity> getProductPriceProfiles() {
		return this.productPriceProfiles;
	}

	public void setProductPriceProfiles(Set<ProductPriceProfileEntity> productPriceProfiles) {
		this.productPriceProfiles = productPriceProfiles;
	}
	
}