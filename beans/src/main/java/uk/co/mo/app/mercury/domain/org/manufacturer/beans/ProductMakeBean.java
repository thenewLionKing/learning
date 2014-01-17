package uk.co.mo.app.mercury.domain.org.manufacturer.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class ProductMakeBean implements Serializable{

	private static final long serialVersionUID = 6443974549944452897L;

	private Integer id;
	private String description;
	private String name;
	private String oraclePartyNumber;

	public ProductMakeBean() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(required=true)
	public String getOraclePartyNumber() {
		return oraclePartyNumber;
	}

	public void setOraclePartyNumber(String oraclePartyNumber) {
		this.oraclePartyNumber = oraclePartyNumber;
	}
}