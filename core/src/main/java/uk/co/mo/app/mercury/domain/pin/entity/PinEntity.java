package uk.co.mo.app.mercury.domain.pin.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import uk.co.mo.app.mercury.cs.entity.AbstractAuditableEntity;
import uk.co.mo.app.mercury.domain.agreement.entity.AgreementEntity;
import uk.co.mo.app.mercury.domain.customer.entity.CustomerEntity;

/**
 * Entity implementation class for Entity: PinEntity
 *
 */
@Entity
@Table (name="pin")
public class PinEntity extends AbstractAuditableEntity implements Serializable {

	private static final long serialVersionUID = -8518128866944210933L;

	private Integer pinId;
	private Date insertDate;	
	private String pin;
	private String insertUser;
	private List<CustomerEntity> customers;
	private List<AgreementEntity> agreements;	
	private PinTypeEntity pinType;
	private List<PinRequestAuditEntity> requestAudit;	
	
	/**
	 * @param requestAudit the requestAudit to set
	 */
	public void setRequestAudit(List<PinRequestAuditEntity> requestAudit) {
		this.requestAudit = requestAudit;
	}
	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(List<CustomerEntity> customers) {
		this.customers = customers;
	}
	/**
	 * @param agreements the agreements to set
	 */
	public void setAgreements(List<AgreementEntity> agreements) {
		this.agreements = agreements;
	}
	
	/**
	 * @return the pinType
	 */
	@ManyToOne    
	@JoinColumn(name = "pin_type_id")
	public PinTypeEntity getPinType() {
		return pinType;
	}
	/**
	 * @param pinType the pinType to set
	 */
	public void setPinType(PinTypeEntity pinType) {
		this.pinType = pinType;
	}

	
	public PinEntity() {
		super();
	}   
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pin_id", columnDefinition = "tinyint")
	public Integer getPinId() {
		return this.pinId;
	}

	public void setPinId(Integer pinId) {
		this.pinId = pinId;
	}   
	public String getPin() {
		return this.pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}   
	
	@Column(name="insert_date")
	public Date getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}   
	
	@Column(name="insert_user")
	public String getInsertUser() {
		return this.insertUser;
	}

	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}
	/**
	 * @return the requestAudit
	 */
	@NotNull
	@OneToMany(mappedBy="pin",cascade= CascadeType.ALL) 
	public List<PinRequestAuditEntity> getRequestAudit() {
		return requestAudit;
	}
	/**
	 * @return the customers
	 */
	
	//bi-directional many-to-many association to PinEntity
	@NotNull
    @ManyToMany(mappedBy="pins",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
	public List<CustomerEntity> getCustomers() {
		return customers;
	}
	/**
	 * @return the agreements
	 */

	  //bi-directional many-to-many association to PinEntity
    @ManyToMany(mappedBy="pins",cascade= CascadeType.ALL)
	public List<AgreementEntity> getAgreements() {
		return agreements;
	}
	
	public void addAgreement(AgreementEntity agreement){
		if(agreements==null) agreements = new ArrayList();
		agreements.add(agreement);
	}
	public void addCustomer(CustomerEntity customer){
		if(customers==null) customers = new ArrayList();
		customers.add(customer);
	}
}
