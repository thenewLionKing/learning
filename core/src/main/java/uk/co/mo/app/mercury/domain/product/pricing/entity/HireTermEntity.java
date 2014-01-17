package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the hire_term database table.
 * 
 */
@Entity
@Table(name="hire_term")



public class HireTermEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String code;

	@Column(name="effective_from")
	private Timestamp effectiveFrom;

	@Column(name="effective_to")
	private Timestamp effectiveTo;

	@Column(name="insert_date")
	private Timestamp insertDate;

	@Column(name="insert_user")
	private String insertUser;

	@Column(name="term_months")
	private Integer termMonths;

	@Column(name="term_weeks")
	private Integer termWeeks;

	@Column(name="term_years")
	private Integer termYears;

	@Column(name="update_date")
	private Timestamp updateDate;

	@Column(name="update_user")
	private String updateUser;

	//bi-directional many-to-one association to ProductPriceProfile
	@OneToMany(mappedBy="hireTerm")
	private Set<ProductPriceProfileEntity> productPriceProfiles;

    public HireTermEntity() {
    }

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Timestamp getEffectiveFrom() {
		return this.effectiveFrom;
	}

	public void setEffectiveFrom(Timestamp effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}

	public Timestamp getEffectiveTo() {
		return this.effectiveTo;
	}

	public void setEffectiveTo(Timestamp effectiveTo) {
		this.effectiveTo = effectiveTo;
	}

	public Timestamp getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(Timestamp insertDate) {
		this.insertDate = insertDate;
	}

	public String getInsertUser() {
		return this.insertUser;
	}

	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}

	public Integer getTermMonths() {
		return this.termMonths;
	}

	public void setTermMonths(Integer termMonths) {
		this.termMonths = termMonths;
	}

	public Integer getTermWeeks() {
		return this.termWeeks;
	}

	public void setTermWeeks(Integer termWeeks) {
		this.termWeeks = termWeeks;
	}

	public Integer getTermYears() {
		return this.termYears;
	}

	public void setTermYears(Integer termYears) {
		this.termYears = termYears;
	}

	public Timestamp getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
	public Set<ProductPriceProfileEntity> getProductPriceProfiles() {
		return this.productPriceProfiles;
	}

	public void setProductPriceProfiles(Set<ProductPriceProfileEntity> productPriceProfiles) {
		this.productPriceProfiles = productPriceProfiles;
	}
	
}