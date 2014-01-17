package uk.co.mo.app.mercury.domain.org.dealer.beans;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;


public class DealerPersonnelTrainingBean implements Serializable {

	private static final long serialVersionUID = 988200358081164791L;
	private Integer id;
	private Date accreditationDate;
	private Date courseDate;
	private String courseId;
	private String courseStatusId;
	private Date expiryDate;

	public DealerPersonnelTrainingBean() {
	}
	
	@XmlElement(required=true)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getAccreditationDate() {
		return accreditationDate;
	}

	public void setAccreditationDate(Date accreditationDate) {
		this.accreditationDate = accreditationDate;
	}

	@XmlElement(required=true)
	public Date getCourseDate() {
		return courseDate;
	}

	public void setCourseDate(Date courseDate) {
		this.courseDate = courseDate;
	}

	@XmlElement(required=true)
	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	@XmlElement(required=true)
	public String getCourseStatusId() {
		return courseStatusId;
	}

	public void setCourseStatusId(String courseStatusId) {
		this.courseStatusId = courseStatusId;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
}