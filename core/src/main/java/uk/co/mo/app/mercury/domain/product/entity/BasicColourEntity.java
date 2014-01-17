package uk.co.mo.app.mercury.domain.product.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

import uk.co.mo.app.mercury.domain.agreement.entity.AgreementProductEntity;

import java.util.Set;


/**
 * The persistent class for the basic_colour entitybase table.
 * 
 */
@Entity
@Table(name="basic_colour")


public class BasicColourEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String name;

	@Column(name="display_sequence", columnDefinition="tinyint")
	private Short displaySequence;

	//bi-directional many-to-one association to AgreementProductEntity
	@OneToMany(mappedBy="basicColour")
	private Set<AgreementProductEntity> agreementProducts;

    public BasicColourEntity() {
    }

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Short displaySequence) {
		this.displaySequence = displaySequence;
	}

	public Set<AgreementProductEntity> getAgreementProducts() {
		return this.agreementProducts;
	}

	public void setAgreementProducts(Set<AgreementProductEntity> agreementProducts) {
		this.agreementProducts = agreementProducts;
	}
	
}