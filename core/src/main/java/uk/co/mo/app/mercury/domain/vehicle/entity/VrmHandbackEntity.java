package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.VrmHandbackBean;


/**
 * The persistent class for the vrm_handback database table.
 * 
 */
@Entity
@Table(name="vrm_handback")
public class VrmHandbackEntity implements Serializable {

	private static final long serialVersionUID = 882224538752560400L;

	private VrmHandbackBean vrmHandbackBean = new VrmHandbackBean();
	private VrmOrganisationEntity vrmOrganisationEntity; 

	public VrmHandbackEntity() {
    }

	
	@Transient
	public VrmHandbackBean getVrmHandbackBean() {
		return vrmHandbackBean;
	}

	public void setVrmHandbackBean(VrmHandbackBean vrmHandbackBean) {
		this.vrmHandbackBean = vrmHandbackBean;
	}

	@Id
	@Column(name="handback_id", unique=true, nullable=false)
	public Integer getHandbackId() {
		return this.vrmHandbackBean.getHandbackId();
	}

	public void setHandbackId(Integer handbackId) {
		this.vrmHandbackBean.setHandbackId(handbackId);
	}


	@Column(length=1, columnDefinition="CHAR")
	public String getAbs() {
		return this.vrmHandbackBean.getAbs();
	}

	public void setAbs(String abs) {
		this.vrmHandbackBean.setAbs(abs);
	}


	@Column(name="accident_damage_flag", length=1, columnDefinition="CHAR")
	public String getAccidentDamageFlag() {
		return this.vrmHandbackBean.getAccidentDamageFlag();
	}

	public void setAccidentDamageFlag(String accidentDamageFlag) {
		this.vrmHandbackBean.setAccidentDamageFlag(accidentDamageFlag);
	}


	@Column(name="adaptation_status", length=1, columnDefinition="CHAR")
	public String getAdaptationStatus() {
		return this.vrmHandbackBean.getAdaptationStatus();
	}

	public void setAdaptationStatus(String adaptationStatus) {
		this.vrmHandbackBean.setAdaptationStatus(adaptationStatus);
	}


	@Column(name="agreement_id", nullable=false)
	public Integer getAgreementId() {
		return this.vrmHandbackBean.getAgreementId();
	}

	public void setAgreementId(Integer agreementId) {
		this.vrmHandbackBean.setAgreementId(agreementId);
	}


	@Column(name="air_conditioning", length=1, columnDefinition="CHAR")
	public String getAirConditioning() {
		return this.vrmHandbackBean.getAirConditioning();
	}

	public void setAirConditioning(String airConditioning) {
		this.vrmHandbackBean.setAirConditioning(airConditioning);
	}


	@Column(length=1, columnDefinition="CHAR")
	public String getAlarm() {
		return this.vrmHandbackBean.getAlarm();
	}

	public void setAlarm(String alarm) {
		this.vrmHandbackBean.setAlarm(alarm);
	}


	@Column(length=1, columnDefinition="CHAR")
	public String getAlloys() {
		return this.vrmHandbackBean.getAlloys();
	}

	public void setAlloys(String alloys) {
		this.vrmHandbackBean.setAlloys(alloys);
	}


	@Column(name="antennae_badges_decals")
	public Integer getAntennaeBadgesDecals() {
		return this.vrmHandbackBean.getAntennaeBadgesDecals();
	}

	public void setAntennaeBadgesDecals(Integer antennaeBadgesDecals) {
		this.vrmHandbackBean.setAntennaeBadgesDecals(antennaeBadgesDecals);
	}


	@Column(name="avr_number", length=20)
	public String getAvrNumber() {
		return this.vrmHandbackBean.getAvrNumber();
	}

	public void setAvrNumber(String avrNumber) {
		this.vrmHandbackBean.setAvrNumber(avrNumber);
	}


	@Column(name="batch_trans_id")
	public Integer getBatchTransId() {
		return this.vrmHandbackBean.getBatchTransId();
	}

	public void setBatchTransId(Integer batchTransId) {
		this.vrmHandbackBean.setBatchTransId(batchTransId);
	}


	public Integer getBonnet() {
		return this.vrmHandbackBean.getBonnet();
	}

	public void setBonnet(Integer bonnet) {
		this.vrmHandbackBean.setBonnet(bonnet);
	}


	@Column(name="boot_lid_tailgate")
	public Integer getBootLidTailgate() {
		return this.vrmHandbackBean.getBootLidTailgate();
	}

	public void setBootLidTailgate(Integer bootLidTailgate) {
		this.vrmHandbackBean.setBootLidTailgate(bootLidTailgate);
	}


	@Column(name="bumper_body_mouldings")
	public Integer getBumperBodyMouldings() {
		return this.vrmHandbackBean.getBumperBodyMouldings();
	}

	public void setBumperBodyMouldings(Integer bumperBodyMouldings) {
		this.vrmHandbackBean.setBumperBodyMouldings(bumperBodyMouldings);
	}


	@Column(length=1, columnDefinition="CHAR")
	public String getCat() {
		return this.vrmHandbackBean.getCat();
	}

	public void setCat(String cat) {
		this.vrmHandbackBean.setCat(cat);
	}


	@Column(name="cd_player", length=1, columnDefinition="CHAR")
	public String getCdPlayer() {
		return this.vrmHandbackBean.getCdPlayer();
	}

	public void setCdPlayer(String cdPlayer) {
		this.vrmHandbackBean.setCdPlayer(cdPlayer);
	}


	@Column(name="central_locking", length=1, columnDefinition="CHAR")
	public String getCentralLocking() {
		return this.vrmHandbackBean.getCentralLocking();
	}

	public void setCentralLocking(String centralLocking) {
		this.vrmHandbackBean.setCentralLocking(centralLocking);
	}


	@Column(length=512)
	public String getComments() {
		return this.vrmHandbackBean.getComments();
	}

	public void setComments(String comments) {
		this.vrmHandbackBean.setComments(comments);
	}


	@Column(name="controls_audio_eqpt")
	public Integer getControlsAudioEqpt() {
		return this.vrmHandbackBean.getControlsAudioEqpt();
	}

	public void setControlsAudioEqpt(Integer controlsAudioEqpt) {
		this.vrmHandbackBean.setControlsAudioEqpt(controlsAudioEqpt);
	}


	@Column(name="cruise_control", length=1, columnDefinition="CHAR")
	public String getCruiseControl() {
		return this.vrmHandbackBean.getCruiseControl();
	}

	public void setCruiseControl(String cruiseControl) {
		this.vrmHandbackBean.setCruiseControl(cruiseControl);
	}


	@Column(name="customer_signed_flag", length=1, columnDefinition="CHAR")
	public String getCustomerSignedFlag() {
		return this.vrmHandbackBean.getCustomerSignedFlag();
	}

	public void setCustomerSignedFlag(String customerSignedFlag) {
		this.vrmHandbackBean.setCustomerSignedFlag(customerSignedFlag);
	}


	@Column(name="dashboard_central_console")
	public Integer getDashboardCentralConsole() {
		return this.vrmHandbackBean.getDashboardCentralConsole();
	}

	public void setDashboardCentralConsole(Integer dashboardCentralConsole) {
		this.vrmHandbackBean.setDashboardCentralConsole(dashboardCentralConsole);
	}


	@Column(name="driver_airbag", length=1, columnDefinition="CHAR")
	public String getDriverAirbag() {
		return this.vrmHandbackBean.getDriverAirbag();
	}

	public void setDriverAirbag(String driverAirbag) {
		this.vrmHandbackBean.setDriverAirbag(driverAirbag);
	}


	@Column(name="electric_aerial", length=1, columnDefinition="CHAR")
	public String getElectricAerial() {
		return this.vrmHandbackBean.getElectricAerial();
	}

	public void setElectricAerial(String electricAerial) {
		this.vrmHandbackBean.setElectricAerial(electricAerial);
	}


	@Column(name="electric_front_windows", length=1, columnDefinition="CHAR")
	public String getElectricFrontWindows() {
		return this.vrmHandbackBean.getElectricFrontWindows();
	}

	public void setElectricFrontWindows(String electricFrontWindows) {
		this.vrmHandbackBean.setElectricFrontWindows(electricFrontWindows);
	}


	@Column(name="electric_mirrors", length=1, columnDefinition="CHAR")
	public String getElectricMirrors() {
		return this.vrmHandbackBean.getElectricMirrors();
	}

	public void setElectricMirrors(String electricMirrors) {
		this.vrmHandbackBean.setElectricMirrors(electricMirrors);
	}


	@Column(name="electric_rear_windows", length=1, columnDefinition="CHAR")
	public String getElectricRearWindows() {
		return this.vrmHandbackBean.getElectricRearWindows();
	}

	public void setElectricRearWindows(String electricRearWindows) {
		this.vrmHandbackBean.setElectricRearWindows(electricRearWindows);
	}


	@Column(name="excess_amount", columnDefinition="MONEY")
	public BigDecimal getExcessAmount() {
		return this.vrmHandbackBean.getExcessAmount();
	}

	public void setExcessAmount(BigDecimal excessAmount) {
		this.vrmHandbackBean.setExcessAmount(excessAmount);
	}


	@Column(name="front_panel")
	public Integer getFrontPanel() {
		return this.vrmHandbackBean.getFrontPanel();
	}

	public void setFrontPanel(Integer frontPanel) {
		this.vrmHandbackBean.setFrontPanel(frontPanel);
	}


	@Column(name="front_seats")
	public Integer getFrontSeats() {
		return this.vrmHandbackBean.getFrontSeats();
	}

	public void setFrontSeats(Integer frontSeats) {
		this.vrmHandbackBean.setFrontSeats(frontSeats);
	}


	@Column(name="handback_organisation_id", insertable=false, updatable=false)
	public Integer getHandbackOrganisationId() {
		return this.vrmHandbackBean.getHandbackOrganisationId();
	}

	public void setHandbackOrganisationId(Integer handbackOrganisationId) {
		this.vrmHandbackBean.setHandbackOrganisationId(handbackOrganisationId);
	}


	@Column(name="headlining_carpet")
	public Integer getHeadliningCarpet() {
		return this.vrmHandbackBean.getHeadliningCarpet();
	}

	public void setHeadliningCarpet(Integer headliningCarpet) {
		this.vrmHandbackBean.setHeadliningCarpet(headliningCarpet);
	}


	@Column(name="insurance_claim_no", length=15)
	public String getInsuranceClaimNo() {
		return this.vrmHandbackBean.getInsuranceClaimNo();
	}

	public void setInsuranceClaimNo(String insuranceClaimNo) {
		this.vrmHandbackBean.setInsuranceClaimNo(insuranceClaimNo);
	}


	@Column(name="interior_door_trims")
	public Integer getInteriorDoorTrims() {
		return this.vrmHandbackBean.getInteriorDoorTrims();
	}

	public void setInteriorDoorTrims(Integer interiorDoorTrims) {
		this.vrmHandbackBean.setInteriorDoorTrims(interiorDoorTrims);
	}


	@Column(name="lamp_lenses")
	public Integer getLampLenses() {
		return this.vrmHandbackBean.getLampLenses();
	}

	public void setLampLenses(Integer lampLenses) {
		this.vrmHandbackBean.setLampLenses(lampLenses);
	}


	@Column(name="luggage_area")
	public Integer getLuggageArea() {
		return this.vrmHandbackBean.getLuggageArea();
	}

	public void setLuggageArea(Integer luggageArea) {
		this.vrmHandbackBean.setLuggageArea(luggageArea);
	}


	@Column(name="master_key", length=1, columnDefinition="CHAR")
	public String getMasterKey() {
		return this.vrmHandbackBean.getMasterKey();
	}

	public void setMasterKey(String masterKey) {
		this.vrmHandbackBean.setMasterKey(masterKey);
	}


	@Column(nullable=false)
	public Integer getMileage() {
		return this.vrmHandbackBean.getMileage();
	}

	public void setMileage(Integer mileage) {
		this.vrmHandbackBean.setMileage(mileage);
	}


	@Column(length=1, columnDefinition="CHAR")
	public String getMot() {
		return this.vrmHandbackBean.getMot();
	}

	public void setMot(String mot) {
		this.vrmHandbackBean.setMot(mot);
	}


	@Column(name="nearside_body_sill")
	public Integer getNearsideBodySill() {
		return this.vrmHandbackBean.getNearsideBodySill();
	}

	public void setNearsideBodySill(Integer nearsideBodySill) {
		this.vrmHandbackBean.setNearsideBodySill(nearsideBodySill);
	}


	@Column(name="nearside_front_door")
	public Integer getNearsideFrontDoor() {
		return this.vrmHandbackBean.getNearsideFrontDoor();
	}

	public void setNearsideFrontDoor(Integer nearsideFrontDoor) {
		this.vrmHandbackBean.setNearsideFrontDoor(nearsideFrontDoor);
	}


	@Column(name="nearside_front_wing")
	public Integer getNearsideFrontWing() {
		return this.vrmHandbackBean.getNearsideFrontWing();
	}

	public void setNearsideFrontWing(Integer nearsideFrontWing) {
		this.vrmHandbackBean.setNearsideFrontWing(nearsideFrontWing);
	}


	@Column(name="nearside_rear_door")
	public Integer getNearsideRearDoor() {
		return this.vrmHandbackBean.getNearsideRearDoor();
	}

	public void setNearsideRearDoor(Integer nearsideRearDoor) {
		this.vrmHandbackBean.setNearsideRearDoor(nearsideRearDoor);
	}


	@Column(name="nearside_rear_wing")
	public Integer getNearsideRearWing() {
		return this.vrmHandbackBean.getNearsideRearWing();
	}

	public void setNearsideRearWing(Integer nearsideRearWing) {
		this.vrmHandbackBean.setNearsideRearWing(nearsideRearWing);
	}


	@Column(name="offside_body_sill")
	public Integer getOffsideBodySill() {
		return this.vrmHandbackBean.getOffsideBodySill();
	}

	public void setOffsideBodySill(Integer offsideBodySill) {
		this.vrmHandbackBean.setOffsideBodySill(offsideBodySill);
	}


	@Column(name="offside_front_door")
	public Integer getOffsideFrontDoor() {
		return this.vrmHandbackBean.getOffsideFrontDoor();
	}

	public void setOffsideFrontDoor(Integer offsideFrontDoor) {
		this.vrmHandbackBean.setOffsideFrontDoor(offsideFrontDoor);
	}


	@Column(name="offside_front_wing")
	public Integer getOffsideFrontWing() {
		return this.vrmHandbackBean.getOffsideFrontWing();
	}

	public void setOffsideFrontWing(Integer offsideFrontWing) {
		this.vrmHandbackBean.setOffsideFrontWing(offsideFrontWing);
	}


	@Column(name="offside_rear_door")
	public Integer getOffsideRearDoor() {
		return this.vrmHandbackBean.getOffsideRearDoor();
	}

	public void setOffsideRearDoor(Integer offsideRearDoor) {
		this.vrmHandbackBean.setOffsideRearDoor(offsideRearDoor);
	}


	@Column(name="offside_rear_wing")
	public Integer getOffsideRearWing() {
		return this.vrmHandbackBean.getOffsideRearWing();
	}

	public void setOffsideRearWing(Integer offsideRearWing) {
		this.vrmHandbackBean.setOffsideRearWing(offsideRearWing);
	}


	@Column(length=1, columnDefinition="CHAR")
	public String getPas() {
		return this.vrmHandbackBean.getPas();
	}

	public void setPas(String pas) {
		this.vrmHandbackBean.setPas(pas);
	}


	@Column(name="passenger_airbag", length=1, columnDefinition="CHAR")
	public String getPassengerAirbag() {
		return this.vrmHandbackBean.getPassengerAirbag();
	}

	public void setPassengerAirbag(String passengerAirbag) {
		this.vrmHandbackBean.setPassengerAirbag(passengerAirbag);
	}


	@Column(name="rear_panel")
	public Integer getRearPanel() {
		return this.vrmHandbackBean.getRearPanel();
	}

	public void setRearPanel(Integer rearPanel) {
		this.vrmHandbackBean.setRearPanel(rearPanel);
	}


	@Column(name="rear_seats")
	public Integer getRearSeats() {
		return this.vrmHandbackBean.getRearSeats();
	}

	public void setRearSeats(Integer rearSeats) {
		this.vrmHandbackBean.setRearSeats(rearSeats);
	}


	@Column(name="receipt_date", nullable=false)
	public Date getReceiptDate() {
		return this.vrmHandbackBean.getReceiptDate();
	}

	public void setReceiptDate(Date receiptDate) {
		this.vrmHandbackBean.setReceiptDate(receiptDate);
	}


	public Integer getRoof() {
		return this.vrmHandbackBean.getRoof();
	}

	public void setRoof(Integer roof) {
		this.vrmHandbackBean.setRoof(roof);
	}


	@Column(name="row_insert_date")
	public Date getRowInsertDate() {
		return this.vrmHandbackBean.getRowInsertDate();
	}

	public void setRowInsertDate(Date rowInsertDate) {
		this.vrmHandbackBean.setRowInsertDate(rowInsertDate);
	}


	@Column(length=1, columnDefinition="CHAR")
	public String getSeatbelts() {
		return this.vrmHandbackBean.getSeatbelts();
	}

	public void setSeatbelts(String seatbelts) {
		this.vrmHandbackBean.setSeatbelts(seatbelts);
	}


	@Column(name="service_book", length=1, columnDefinition="CHAR")
	public String getServiceBook() {
		return this.vrmHandbackBean.getServiceBook();
	}

	public void setServiceBook(String serviceBook) {
		this.vrmHandbackBean.setServiceBook(serviceBook);
	}


	@Column(name="seven_seats", length=1, columnDefinition="CHAR")
	public String getSevenSeats() {
		return this.vrmHandbackBean.getSevenSeats();
	}

	public void setSevenSeats(String sevenSeats) {
		this.vrmHandbackBean.setSevenSeats(sevenSeats);
	}


	@Column(name="spare_key", length=1, columnDefinition="CHAR")
	public String getSpareKey() {
		return this.vrmHandbackBean.getSpareKey();
	}

	public void setSpareKey(String spareKey) {
		this.vrmHandbackBean.setSpareKey(spareKey);
	}


	@Column(name="spare_wheel", length=1, columnDefinition="CHAR")
	public String getSpareWheel() {
		return this.vrmHandbackBean.getSpareWheel();
	}

	public void setSpareWheel(String spareWheel) {
		this.vrmHandbackBean.setSpareWheel(spareWheel);
	}


	@Column(name="stock_id", nullable=false)
	public Integer getStockId() {
		return this.vrmHandbackBean.getStockId();
	}

	public void setStockId(Integer stockId) {
		this.vrmHandbackBean.setStockId(stockId);
	}


	@Column(name="sunroof_electric", length=1, columnDefinition="CHAR")
	public String getSunroofElectric() {
		return this.vrmHandbackBean.getSunroofElectric();
	}

	public void setSunroofElectric(String sunroofElectric) {
		this.vrmHandbackBean.setSunroofElectric(sunroofElectric);
	}


	@Column(name="sunroof_popup", length=1, columnDefinition="CHAR")
	public String getSunroofPopup() {
		return this.vrmHandbackBean.getSunroofPopup();
	}

	public void setSunroofPopup(String sunroofPopup) {
		this.vrmHandbackBean.setSunroofPopup(sunroofPopup);
	}


	@Column(length=1, columnDefinition="CHAR")
	public String getTelephone() {
		return this.vrmHandbackBean.getTelephone();
	}

	public void setTelephone(String telephone) {
		this.vrmHandbackBean.setTelephone(telephone);
	}


	@Column(name="tools_equipment", length=1, columnDefinition="CHAR")
	public String getToolsEquipment() {
		return this.vrmHandbackBean.getToolsEquipment();
	}

	public void setToolsEquipment(String toolsEquipment) {
		this.vrmHandbackBean.setToolsEquipment(toolsEquipment);
	}


	public Integer getTyres() {
		return this.vrmHandbackBean.getTyres();
	}

	public void setTyres(Integer tyres) {
		this.vrmHandbackBean.setTyres(tyres);
	}


	@Column(length=1, columnDefinition="CHAR")
	public String getV5() {
		return this.vrmHandbackBean.getV5();
	}

	public void setV5(String v5) {
		this.vrmHandbackBean.setV5(v5);
	}


	@Column(name="vehicle_handbook", length=1, columnDefinition="CHAR")
	public String getVehicleHandbook() {
		return this.vrmHandbackBean.getVehicleHandbook();
	}

	public void setVehicleHandbook(String vehicleHandbook) {
		this.vrmHandbackBean.setVehicleHandbook(vehicleHandbook);
	}


	@Column(name="wheels_and_trim")
	public Integer getWheelsAndTrim() {
		return this.vrmHandbackBean.getWheelsAndTrim();
	}

	public void setWheelsAndTrim(Integer wheelsAndTrim) {
		this.vrmHandbackBean.setWheelsAndTrim(wheelsAndTrim);
	}


	@Column(name="windows_mirrors")
	public Integer getWindowsMirrors() {
		return this.vrmHandbackBean.getWindowsMirrors();
	}

	public void setWindowsMirrors(Integer windowsMirrors) {
		this.vrmHandbackBean.setWindowsMirrors(windowsMirrors);
	}

/*	@ManyToOne(cascade= CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="handback_organisation_id", referencedColumnName="organisation_id")
	public VrmOrganisationLinkAgentEntity getVrmOrganisationLinkAgentEntity() {
		return vrmOrganisationLinkAgentEntity;
	}

	public void setVrmOrganisationLinkAgentEntity(
			VrmOrganisationLinkAgentEntity vrmOrganisationLinkAgentEntity) {
		this.vrmOrganisationLinkAgentEntity = vrmOrganisationLinkAgentEntity;
	}
*/	
	@OneToOne(cascade= CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="handback_organisation_id", referencedColumnName="organisation_id")
	public VrmOrganisationEntity getVrmOrganisationEntity() {
		return vrmOrganisationEntity;
	}

	public void setVrmOrganisationEntity(VrmOrganisationEntity vrmOrganisationEntity) {
		this.vrmOrganisationEntity = vrmOrganisationEntity;
	}

}