package uk.co.mo.app.mercury.domain.event;

import uk.co.mo.app.mercury.domain.common.VehicleEventSubType;

/**
 * <p/>
 * User: Amit Maheshwari
 * Date: 24/06/11
 * Time: 10:23
 * <p/>
 * Change Log - Who : When : Comment
 */
public class VehicleEventType implements EventType {


	private static final long serialVersionUID = -8935842320546654662L;

	private Integer agreementId;
	private Integer assetNumber;
	private Integer vehicleRecordId;
	private Integer agreementRecordId;
	private String registrationNumber;
	private VehicleEventSubType type;
	
	public Integer getVehicleRecordId() {
		return vehicleRecordId;
	}

	public void setVehicleRecordId(Integer vehicleRecordId) {
		this.vehicleRecordId = vehicleRecordId;
	}

	public Integer getAgreementRecordId() {
		return agreementRecordId;
	}

	public void setAgreementRecordId(Integer agreementRecordId) {
		this.agreementRecordId = agreementRecordId;
	}

	public VehicleEventSubType getType() {
		return type;
	}

	public void setType(VehicleEventSubType type) {
		this.type = type;
	}

	public Integer getAgreementId() {
		return agreementId;
	}

	public void setAgreementId(Integer agreementId) {
		this.agreementId = agreementId;
	}

	public Integer getAssetNumber() {
		return assetNumber;
	}

	public void setAssetNumber(Integer assetNumber) {
		this.assetNumber = assetNumber;
	}

	@Override
	public String getEventType() {
		return "VehicleEventType";
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}
}
