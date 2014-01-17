package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class VrmHandbackBean implements Serializable{
	
	private static final long serialVersionUID = 2524207498166530761L;

	private Integer handbackId;
	private String abs;
	private String accidentDamageFlag;
	private String adaptationStatus;
	private Integer agreementId;
	private String airConditioning;
	private String alarm;
	private String alloys;
	private Integer antennaeBadgesDecals;
	private String avrNumber;
	private Integer batchTransId;
	private Integer bonnet;
	private Integer bootLidTailgate;
	private Integer bumperBodyMouldings;
	private String cat;
	private String cdPlayer;
	private String centralLocking;
	private String comments;
	private Integer controlsAudioEqpt;
	private String cruiseControl;
	private String customerSignedFlag;
	private Integer dashboardCentralConsole;
	private String driverAirbag;
	private String electricAerial;
	private String electricFrontWindows;
	private String electricMirrors;
	private String electricRearWindows;
	private BigDecimal excessAmount;
	private Integer frontPanel;
	private Integer frontSeats;
	private Integer handbackOrganisationId;
	private Integer headliningCarpet;
	private String insuranceClaimNo;
	private Integer interiorDoorTrims;
	private Integer lampLenses;
	private Integer luggageArea;
	private String masterKey;
	private Integer mileage;
	private String mot;
	private Integer nearsideBodySill;
	private Integer nearsideFrontDoor;
	private Integer nearsideFrontWing;
	private Integer nearsideRearDoor;
	private Integer nearsideRearWing;
	private Integer offsideBodySill;
	private Integer offsideFrontDoor;
	private Integer offsideFrontWing;
	private Integer offsideRearDoor;
	private Integer offsideRearWing;
	private String pas;
	private String passengerAirbag;
	private Integer rearPanel;
	private Integer rearSeats;
	private Date receiptDate;
	private Integer roof;
	private Date rowInsertDate;
	private String seatbelts;
	private String serviceBook;
	private String sevenSeats;
	private String spareKey;
	private String spareWheel;
	private Integer stockId;
	private String sunroofElectric;
	private String sunroofPopup;
	private String telephone;
	private String toolsEquipment;
	private Integer tyres;
	private String v5;
	private String vehicleHandbook;
	private Integer wheelsAndTrim;
	private Integer windowsMirrors;
	private VrmOrganisationBean vrmOrganisationBean;
	private VrmOrganisationLinkAgentBean vrmOrganisationLinkAgentBean;

	public VrmHandbackBean() {
	}

	public Integer getHandbackId() {
		return handbackId;
	}

	public void setHandbackId(Integer handbackId) {
		this.handbackId = handbackId;
	}

	public String getAbs() {
		return abs;
	}

	public void setAbs(String abs) {
		this.abs = abs;
	}

	public String getAccidentDamageFlag() {
		return accidentDamageFlag;
	}

	public void setAccidentDamageFlag(String accidentDamageFlag) {
		this.accidentDamageFlag = accidentDamageFlag;
	}

	public String getAdaptationStatus() {
		return adaptationStatus;
	}

	public void setAdaptationStatus(String adaptationStatus) {
		this.adaptationStatus = adaptationStatus;
	}

	public Integer getAgreementId() {
		return agreementId;
	}

	public void setAgreementId(Integer agreementId) {
		this.agreementId = agreementId;
	}

	public String getAirConditioning() {
		return airConditioning;
	}

	public void setAirConditioning(String airConditioning) {
		this.airConditioning = airConditioning;
	}

	public String getAlarm() {
		return alarm;
	}

	public void setAlarm(String alarm) {
		this.alarm = alarm;
	}

	public String getAlloys() {
		return alloys;
	}

	public void setAlloys(String alloys) {
		this.alloys = alloys;
	}

	public Integer getAntennaeBadgesDecals() {
		return antennaeBadgesDecals;
	}

	public void setAntennaeBadgesDecals(Integer antennaeBadgesDecals) {
		this.antennaeBadgesDecals = antennaeBadgesDecals;
	}

	public String getAvrNumber() {
		return avrNumber;
	}

	public void setAvrNumber(String avrNumber) {
		this.avrNumber = avrNumber;
	}

	public Integer getBatchTransId() {
		return batchTransId;
	}

	public void setBatchTransId(Integer batchTransId) {
		this.batchTransId = batchTransId;
	}

	public Integer getBonnet() {
		return bonnet;
	}

	public void setBonnet(Integer bonnet) {
		this.bonnet = bonnet;
	}

	public Integer getBootLidTailgate() {
		return bootLidTailgate;
	}

	public void setBootLidTailgate(Integer bootLidTailgate) {
		this.bootLidTailgate = bootLidTailgate;
	}

	public Integer getBumperBodyMouldings() {
		return bumperBodyMouldings;
	}

	public void setBumperBodyMouldings(Integer bumperBodyMouldings) {
		this.bumperBodyMouldings = bumperBodyMouldings;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getCdPlayer() {
		return cdPlayer;
	}

	public void setCdPlayer(String cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

	public String getCentralLocking() {
		return centralLocking;
	}

	public void setCentralLocking(String centralLocking) {
		this.centralLocking = centralLocking;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getControlsAudioEqpt() {
		return controlsAudioEqpt;
	}

	public void setControlsAudioEqpt(Integer controlsAudioEqpt) {
		this.controlsAudioEqpt = controlsAudioEqpt;
	}

	public String getCruiseControl() {
		return cruiseControl;
	}

	public void setCruiseControl(String cruiseControl) {
		this.cruiseControl = cruiseControl;
	}

	public String getCustomerSignedFlag() {
		return customerSignedFlag;
	}

	public void setCustomerSignedFlag(String customerSignedFlag) {
		this.customerSignedFlag = customerSignedFlag;
	}

	public Integer getDashboardCentralConsole() {
		return dashboardCentralConsole;
	}

	public void setDashboardCentralConsole(Integer dashboardCentralConsole) {
		this.dashboardCentralConsole = dashboardCentralConsole;
	}

	public String getDriverAirbag() {
		return driverAirbag;
	}

	public void setDriverAirbag(String driverAirbag) {
		this.driverAirbag = driverAirbag;
	}

	public String getElectricAerial() {
		return electricAerial;
	}

	public void setElectricAerial(String electricAerial) {
		this.electricAerial = electricAerial;
	}

	public String getElectricFrontWindows() {
		return electricFrontWindows;
	}

	public void setElectricFrontWindows(String electricFrontWindows) {
		this.electricFrontWindows = electricFrontWindows;
	}

	public String getElectricMirrors() {
		return electricMirrors;
	}

	public void setElectricMirrors(String electricMirrors) {
		this.electricMirrors = electricMirrors;
	}

	public String getElectricRearWindows() {
		return electricRearWindows;
	}

	public void setElectricRearWindows(String electricRearWindows) {
		this.electricRearWindows = electricRearWindows;
	}

	public BigDecimal getExcessAmount() {
		return excessAmount;
	}

	public void setExcessAmount(BigDecimal excessAmount) {
		this.excessAmount = excessAmount;
	}

	public Integer getFrontPanel() {
		return frontPanel;
	}

	public void setFrontPanel(Integer frontPanel) {
		this.frontPanel = frontPanel;
	}

	public Integer getFrontSeats() {
		return frontSeats;
	}

	public void setFrontSeats(Integer frontSeats) {
		this.frontSeats = frontSeats;
	}

	public Integer getHandbackOrganisationId() {
		return handbackOrganisationId;
	}

	public void setHandbackOrganisationId(Integer handbackOrganisationId) {
		this.handbackOrganisationId = handbackOrganisationId;
	}

	public Integer getHeadliningCarpet() {
		return headliningCarpet;
	}

	public void setHeadliningCarpet(Integer headliningCarpet) {
		this.headliningCarpet = headliningCarpet;
	}

	public String getInsuranceClaimNo() {
		return insuranceClaimNo;
	}

	public void setInsuranceClaimNo(String insuranceClaimNo) {
		this.insuranceClaimNo = insuranceClaimNo;
	}

	public Integer getInteriorDoorTrims() {
		return interiorDoorTrims;
	}

	public void setInteriorDoorTrims(Integer interiorDoorTrims) {
		this.interiorDoorTrims = interiorDoorTrims;
	}

	public Integer getLampLenses() {
		return lampLenses;
	}

	public void setLampLenses(Integer lampLenses) {
		this.lampLenses = lampLenses;
	}

	public Integer getLuggageArea() {
		return luggageArea;
	}

	public void setLuggageArea(Integer luggageArea) {
		this.luggageArea = luggageArea;
	}

	public String getMasterKey() {
		return masterKey;
	}

	public void setMasterKey(String masterKey) {
		this.masterKey = masterKey;
	}

	public Integer getMileage() {
		return mileage;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	public String getMot() {
		return mot;
	}

	public void setMot(String mot) {
		this.mot = mot;
	}

	public Integer getNearsideBodySill() {
		return nearsideBodySill;
	}

	public void setNearsideBodySill(Integer nearsideBodySill) {
		this.nearsideBodySill = nearsideBodySill;
	}

	public Integer getNearsideFrontDoor() {
		return nearsideFrontDoor;
	}

	public void setNearsideFrontDoor(Integer nearsideFrontDoor) {
		this.nearsideFrontDoor = nearsideFrontDoor;
	}

	public Integer getNearsideFrontWing() {
		return nearsideFrontWing;
	}

	public void setNearsideFrontWing(Integer nearsideFrontWing) {
		this.nearsideFrontWing = nearsideFrontWing;
	}

	public Integer getNearsideRearDoor() {
		return nearsideRearDoor;
	}

	public void setNearsideRearDoor(Integer nearsideRearDoor) {
		this.nearsideRearDoor = nearsideRearDoor;
	}

	public Integer getNearsideRearWing() {
		return nearsideRearWing;
	}

	public void setNearsideRearWing(Integer nearsideRearWing) {
		this.nearsideRearWing = nearsideRearWing;
	}

	public Integer getOffsideBodySill() {
		return offsideBodySill;
	}

	public void setOffsideBodySill(Integer offsideBodySill) {
		this.offsideBodySill = offsideBodySill;
	}

	public Integer getOffsideFrontDoor() {
		return offsideFrontDoor;
	}

	public void setOffsideFrontDoor(Integer offsideFrontDoor) {
		this.offsideFrontDoor = offsideFrontDoor;
	}

	public Integer getOffsideFrontWing() {
		return offsideFrontWing;
	}

	public void setOffsideFrontWing(Integer offsideFrontWing) {
		this.offsideFrontWing = offsideFrontWing;
	}

	public Integer getOffsideRearDoor() {
		return offsideRearDoor;
	}

	public void setOffsideRearDoor(Integer offsideRearDoor) {
		this.offsideRearDoor = offsideRearDoor;
	}

	public Integer getOffsideRearWing() {
		return offsideRearWing;
	}

	public void setOffsideRearWing(Integer offsideRearWing) {
		this.offsideRearWing = offsideRearWing;
	}

	public String getPas() {
		return pas;
	}

	public void setPas(String pas) {
		this.pas = pas;
	}

	public String getPassengerAirbag() {
		return passengerAirbag;
	}

	public void setPassengerAirbag(String passengerAirbag) {
		this.passengerAirbag = passengerAirbag;
	}

	public Integer getRearPanel() {
		return rearPanel;
	}

	public void setRearPanel(Integer rearPanel) {
		this.rearPanel = rearPanel;
	}

	public Integer getRearSeats() {
		return rearSeats;
	}

	public void setRearSeats(Integer rearSeats) {
		this.rearSeats = rearSeats;
	}

	public Date getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}

	public Integer getRoof() {
		return roof;
	}

	public void setRoof(Integer roof) {
		this.roof = roof;
	}

	public Date getRowInsertDate() {
		return rowInsertDate;
	}

	public void setRowInsertDate(Date rowInsertDate) {
		this.rowInsertDate = rowInsertDate;
	}

	public String getSeatbelts() {
		return seatbelts;
	}

	public void setSeatbelts(String seatbelts) {
		this.seatbelts = seatbelts;
	}

	public String getServiceBook() {
		return serviceBook;
	}

	public void setServiceBook(String serviceBook) {
		this.serviceBook = serviceBook;
	}

	public String getSevenSeats() {
		return sevenSeats;
	}

	public void setSevenSeats(String sevenSeats) {
		this.sevenSeats = sevenSeats;
	}

	public String getSpareKey() {
		return spareKey;
	}

	public void setSpareKey(String spareKey) {
		this.spareKey = spareKey;
	}

	public String getSpareWheel() {
		return spareWheel;
	}

	public void setSpareWheel(String spareWheel) {
		this.spareWheel = spareWheel;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getSunroofElectric() {
		return sunroofElectric;
	}

	public void setSunroofElectric(String sunroofElectric) {
		this.sunroofElectric = sunroofElectric;
	}

	public String getSunroofPopup() {
		return sunroofPopup;
	}

	public void setSunroofPopup(String sunroofPopup) {
		this.sunroofPopup = sunroofPopup;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getToolsEquipment() {
		return toolsEquipment;
	}

	public void setToolsEquipment(String toolsEquipment) {
		this.toolsEquipment = toolsEquipment;
	}

	public Integer getTyres() {
		return tyres;
	}

	public void setTyres(Integer tyres) {
		this.tyres = tyres;
	}

	public String getV5() {
		return v5;
	}

	public void setV5(String v5) {
		this.v5 = v5;
	}

	public String getVehicleHandbook() {
		return vehicleHandbook;
	}

	public void setVehicleHandbook(String vehicleHandbook) {
		this.vehicleHandbook = vehicleHandbook;
	}

	public Integer getWheelsAndTrim() {
		return wheelsAndTrim;
	}

	public void setWheelsAndTrim(Integer wheelsAndTrim) {
		this.wheelsAndTrim = wheelsAndTrim;
	}

	public Integer getWindowsMirrors() {
		return windowsMirrors;
	}

	public void setWindowsMirrors(Integer windowsMirrors) {
		this.windowsMirrors = windowsMirrors;
	}

	public VrmOrganisationBean getVrmOrganisationBean() {
		return vrmOrganisationBean;
	}

	public void setVrmOrganisationBean(VrmOrganisationBean vrmOrganisationBean) {
		this.vrmOrganisationBean = vrmOrganisationBean;
	}

	public VrmOrganisationLinkAgentBean getVrmOrganisationLinkAgentBean() {
		return vrmOrganisationLinkAgentBean;
	}

	public void setVrmOrganisationLinkAgentBean(
			VrmOrganisationLinkAgentBean vrmOrganisationLinkAgentBean) {
		this.vrmOrganisationLinkAgentBean = vrmOrganisationLinkAgentBean;
	}
}