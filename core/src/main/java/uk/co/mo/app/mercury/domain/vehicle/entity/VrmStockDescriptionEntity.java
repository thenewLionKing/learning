package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.VrmStockDescriptionBean;


/**
 * The persistent class for the vrm_stock_description database table.
 * 
 */
@Entity
@Table(name="vrm_stock_description")
public class VrmStockDescriptionEntity implements Serializable {

	private static final long serialVersionUID = 6240262761771851431L;

	private VrmStockDescriptionBean vrmStockDescriptionBean = new VrmStockDescriptionBean();

	public VrmStockDescriptionEntity() {
    }

	@Transient
	public VrmStockDescriptionBean getVrmStockDescriptionBean() {
		return vrmStockDescriptionBean;
	}


	public void setVrmStockDescriptionBean(VrmStockDescriptionBean vrmStockDescriptionBean) {
		this.vrmStockDescriptionBean = vrmStockDescriptionBean;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stock_id", unique=true, nullable=false)
	public Integer getStockId() {
		return this.vrmStockDescriptionBean.getStockId();
	}

	public void setStockId(Integer stockId) {
		this.vrmStockDescriptionBean.setStockId(stockId);
	}


	@Column(name="Alternate_Registration", length=8, columnDefinition="CHAR")
	public String getAlternate_Registration() {
		return this.vrmStockDescriptionBean.getAlternate_Registration();
	}

	public void setAlternate_Registration(String alternate_Registration) {
		this.vrmStockDescriptionBean.setAlternate_Registration(alternate_Registration);
	}


	@Column(name="body_style_id")
	public Integer getBodyStyleId() {
		return this.vrmStockDescriptionBean.getBodyStyleId();
	}

	public void setBodyStyleId(Integer bodyStyleId) {
		this.vrmStockDescriptionBean.setBodyStyleId(bodyStyleId);
	}


	@Column(name="Carburation_Type_Id")
	public Integer getCarburation_Type_Id() {
		return this.vrmStockDescriptionBean.getCarburation_Type_Id();
	}

	public void setCarburation_Type_Id(Integer carburation_Type_Id) {
		this.vrmStockDescriptionBean.setCarburation_Type_Id(carburation_Type_Id);
	}


	@Column(name="Cherished_Plate", nullable=false)
	public Boolean getCherished_Plate() {
		return this.vrmStockDescriptionBean.isCherished_Plate();
	}

	public void setCherished_Plate(Boolean cherished_Plate) {
		this.vrmStockDescriptionBean.setCherished_Plate(cherished_Plate);
	}


	@Column(length=30)
	public String getDerivative() {
		return this.vrmStockDescriptionBean.getDerivative();
	}

	public void setDerivative(String derivative) {
		this.vrmStockDescriptionBean.setDerivative(derivative);
	}


	@Column(name="engine_capacity", length=20)
	public String getEngineCapacity() {
		return this.vrmStockDescriptionBean.getEngineCapacity();
	}

	public void setEngineCapacity(String engineCapacity) {
		this.vrmStockDescriptionBean.setEngineCapacity(engineCapacity);
	}


	@Column(name="fuel_type_id")
	public Integer getFuelTypeId() {
		return this.vrmStockDescriptionBean.getFuelTypeId();
	}

	public void setFuelTypeId(Integer fuelTypeId) {
		this.vrmStockDescriptionBean.setFuelTypeId(fuelTypeId);
	}


	@Column(name="gear_box", length=1, columnDefinition="CHAR")
	public String getGearBox() {
		return this.vrmStockDescriptionBean.getGearBox();
	}

	public void setGearBox(String gearBox) {
		this.vrmStockDescriptionBean.setGearBox(gearBox);
	}


	@Column(name="gear_speed", columnDefinition="TINYINT")
	public Short getGearSpeed() {
		return this.vrmStockDescriptionBean.getGearSpeed();
	}

	public void setGearSpeed(Short gearSpeed) {
		this.vrmStockDescriptionBean.setGearSpeed(gearSpeed);
	}


	@Column(name="Gearbox_Type_Id")
	public Integer getGearbox_Type_Id() {
		return this.vrmStockDescriptionBean.getGearBox_Type_Id();
	}

	public void setGearbox_Type_Id(Integer gearBox_Type_Id) {
		this.vrmStockDescriptionBean.setGearBox_Type_Id(gearBox_Type_Id);
	}


	@Column(name="Hand_Book", length=1, columnDefinition="CHAR")
	public String getHand_Book() {
		return this.vrmStockDescriptionBean.getHand_Book();
	}

	public void setHand_Book(String hand_Book) {
		this.vrmStockDescriptionBean.setHand_Book(hand_Book);
	}


	@Column(name="inspection_date")
	public Date getInspectionDate() {
		return this.vrmStockDescriptionBean.getInspectionDate();
	}

	public void setInspectionDate(Date inspectionDate) {
		this.vrmStockDescriptionBean.setInspectionDate(inspectionDate);
	}


	@Column(name="manufacturer_code", length=2, columnDefinition="CHAR")
	public String getManufacturerCode() {
		return this.vrmStockDescriptionBean.getManufacturerCode();
	}

	public void setManufacturerCode(String manufacturerCode) {
		this.vrmStockDescriptionBean.setManufacturerCode(manufacturerCode);
	}


	@Column(name="master_key", length=1, columnDefinition="CHAR")
	public String getMasterKey() {
		return this.vrmStockDescriptionBean.getMasterKey();
	}

	public void setMasterKey(String masterKey) {
		this.vrmStockDescriptionBean.setMasterKey(masterKey);
	}


	@Column(length=1, columnDefinition="CHAR")
	public String getMot() {
		return this.vrmStockDescriptionBean.getMot();
	}

	public void setMot(String mot) {
		this.vrmStockDescriptionBean.setMot(mot);
	}


	@Column(name="number_doors", columnDefinition="TINYINT")
	public Short getNumberDoors() {
		return this.vrmStockDescriptionBean.getNumberDoors();
	}

	public void setNumberDoors(Short numberDoors) {
		this.vrmStockDescriptionBean.setNumberDoors(numberDoors);
	}


	@Column(name="Paint_Colour", length=30)
	public String getPaint_Colour() {
		return this.vrmStockDescriptionBean.getPaint_Colour();
	}

	public void setPaint_Colour(String paint_Colour) {
		this.vrmStockDescriptionBean.setPaint_Colour(paint_Colour);
	}


	@Column(name="Paint_Type_Id")
	public Integer getPaint_Type_Id() {
		return this.vrmStockDescriptionBean.getPaint_Type_Id();
	}

	public void setPaint_Type_Id(Integer paint_Type_Id) {
		this.vrmStockDescriptionBean.setPaint_Type_Id(paint_Type_Id);
	}


	@Column(name="range_code", length=2, columnDefinition="CHAR")
	public String getRangeCode() {
		return this.vrmStockDescriptionBean.getRangeCode();
	}

	public void setRangeCode(String rangeCode) {
		this.vrmStockDescriptionBean.setRangeCode(rangeCode);
	}


	@Column(length=9, columnDefinition="CHAR")
	public String getRegistration() {
		return this.vrmStockDescriptionBean.getRegistration();
	}

	public void setRegistration(String registration) {
		this.vrmStockDescriptionBean.setRegistration(registration);
	}


	@Column(name="Service_Book", length=1, columnDefinition="CHAR")
	public String getService_Book() {
		return this.vrmStockDescriptionBean.getService_Book();
	}

	public void setService_Book(String service_Book) {
		this.vrmStockDescriptionBean.setService_Book(service_Book);
	}


	@Column(name="service_history", length=1, columnDefinition="CHAR")
	public String getServiceHistory() {
		return this.vrmStockDescriptionBean.getServiceHistory();
	}

	public void setServiceHistory(String serviceHistory) {
		this.vrmStockDescriptionBean.setServiceHistory(serviceHistory);
	}


	@Column(name="spare_key", length=1, columnDefinition="CHAR")
	public String getSpareKey() {
		return this.vrmStockDescriptionBean.getSpareKey();
	}

	public void setSpareKey(String spareKey) {
		this.vrmStockDescriptionBean.setSpareKey(spareKey);
	}


	@Column(name="speedo_change_mileage")
	public Integer getSpeedoChangeMileage() {
		return this.vrmStockDescriptionBean.getSpeedoChangeMileage();
	}

	public void setSpeedoChangeMileage(Integer speedoChangeMileage) {
		this.vrmStockDescriptionBean.setSpeedoChangeMileage(speedoChangeMileage);
	}


	@Column(name="speedo_working")
	public Boolean getSpeedoWorking() {
		return this.vrmStockDescriptionBean.isSpeedoWorking();
	}

	public void setSpeedoWorking(Boolean speedoWorking) {
		this.vrmStockDescriptionBean.setSpeedoWorking(speedoWorking);
	}


	@Column(name="Trim_Colour", length=20)
	public String getTrim_Colour() {
		return this.vrmStockDescriptionBean.getTrim_Colour();
	}

	public void setTrim_Colour(String trim_Colour) {
		this.vrmStockDescriptionBean.setTrim_Colour(trim_Colour);
	}


	@Column(name="Trim_Type_Id")
	public Integer getTrim_Type_Id() {
		return this.vrmStockDescriptionBean.getTrim_Type_Id();
	}

	public void setTrim_Type_Id(Integer trim_Type_Id) {
		this.vrmStockDescriptionBean.setTrim_Type_Id(trim_Type_Id);
	}


	@Column(length=1, columnDefinition="CHAR")
	public String getV5() {
		return this.vrmStockDescriptionBean.getV5();
	}

	public void setV5(String v5) {
		this.vrmStockDescriptionBean.setV5(v5);
	}


	@Column(length=30)
	public String getVin() {
		return this.vrmStockDescriptionBean.getVin();
	}

	public void setVin(String vin) {
		this.vrmStockDescriptionBean.setVin(vin);
	}

}