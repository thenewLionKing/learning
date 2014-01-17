package uk.co.mo.app.mercury.domain.org.dealer.beans;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class DealerPersonnelBean implements Serializable {

	private static final long serialVersionUID = 2915341491751692176L;
	private Integer dealerPersonnelId;
	private Boolean active;
	private String firstName;
	private String lastName;
	private List<DealerPersonnelDealerLinkBean> dealerPersonnelDealerLinksBean;
	private List<DealerPersonnelTrainingBean> dealerPersonnelTrainingsBean;

	public DealerPersonnelBean() {
	}

	@XmlElement(required=true)
	public Integer getDealerPersonnelId() {
		return dealerPersonnelId;
	}

	public void setDealerPersonnelId(Integer dealerPersonnelId) {
		this.dealerPersonnelId = dealerPersonnelId;
	}
	
	@XmlElement(required=true)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	@XmlElement(required=true)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@XmlElement(required=true)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDealerPersonnelDealerLinksBean(
			List<DealerPersonnelDealerLinkBean> dealerPersonnelDealerLinksBean) {
		this.dealerPersonnelDealerLinksBean = dealerPersonnelDealerLinksBean;
	}

	public List<DealerPersonnelDealerLinkBean> getDealerPersonnelDealerLinksBean() {
		return dealerPersonnelDealerLinksBean;
	}

	public void setDealerPersonnelTrainingsBean(
			List<DealerPersonnelTrainingBean> dealerPersonnelTrainingsBean) {
		this.dealerPersonnelTrainingsBean = dealerPersonnelTrainingsBean;
	}

	public List<DealerPersonnelTrainingBean> getDealerPersonnelTrainingsBean() {
		return dealerPersonnelTrainingsBean;
	}
}