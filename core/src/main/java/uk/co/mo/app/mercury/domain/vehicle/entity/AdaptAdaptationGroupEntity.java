package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import javax.persistence.*;

import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptAdaptationGroupBean;

import java.util.Set;


/**
 * The persistent class for the adapt_adaptation_group database table.
 * 
 */
@Entity
@Table(name="adapt_adaptation_group")
public class AdaptAdaptationGroupEntity implements Serializable {

	private static final long serialVersionUID = 4758143394869099401L;
	private AdaptAdaptationGroupBean adaptAdaptationGroupBean = new AdaptAdaptationGroupBean();

	public AdaptAdaptationGroupEntity() {
    }

	@Transient
	public AdaptAdaptationGroupBean getAdaptAdaptationGroupBean() {
		return this.adaptAdaptationGroupBean;
	}
	
	public void setAdaptationGroupBean(AdaptAdaptationGroupBean adaptAdaptationGroupBean ) {
		this.adaptAdaptationGroupBean = adaptAdaptationGroupBean;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="group_id", unique=true, nullable=false)
	public Integer getGroupId() {
		return this.adaptAdaptationGroupBean.getGroupId();
	}

	public void setGroupId(Integer groupId) {
		this.adaptAdaptationGroupBean.setGroupId(groupId);
	}


	@Column(name="active_ind", nullable=false)
	public Boolean getActiveInd() {
		return this.adaptAdaptationGroupBean.isActiveInd();
	}

	public void setActiveInd(Boolean activeInd) {
		this.adaptAdaptationGroupBean.setActiveInd(activeInd);
	}


	@Column(name="group_name", nullable=false, length=50)
	public String getGroupName() {
		return this.adaptAdaptationGroupBean.getGroupName();
	}

	public void setGroupName(String groupName) {
		this.adaptAdaptationGroupBean.setGroupName(groupName);
	}
}