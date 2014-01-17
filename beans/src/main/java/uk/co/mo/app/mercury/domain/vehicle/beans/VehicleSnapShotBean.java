package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class VehicleSnapShotBean implements Serializable {

	private static final long serialVersionUID = -1647735389318925267L;

	private String record_state;
	private Integer record_id;
	private Date record_date;
	private Integer asset_number;
	private Integer translease_leaseco_ref;
	private String car_registration_number;
	private Integer stock_id;
	private String fleetnet_edi_code;
	private Integer icme_model_code;
	private Byte badged_company;
	private Byte vehicle_band_rating;
	private String customer_number;
	private String vin_number;
	private String vehicle_colour;
	private String initial_service_free;
	private Byte initial_service_period;
	private Short initial_service_distance;
	private Byte standard_service_period;
	private Short standard_service_distance;
	private Date replacement_date;
	private Integer replacement_mileage;
	private String ref_all_indicator;
	private Byte warranty_distance;
	private Byte free_service_period;
	private Byte free_service_distance;
	private Integer odometer_repl_reading;
	private Date contract_start_date;
	private Date first_reg_date;
	private BigDecimal referral_value;
	private String special_information;
	private String high_mileage_indicator;
	private String contract_type;
	private String controller_id;
	private BigDecimal maintenance_budget;
	private BigDecimal maintenance_cost_total;
	private String transmission_action;
	private Integer agreement_status;
	private Integer suspended;
	private Boolean ineligible;
	private Integer ineligible_reason_id;
	private Date repurchase_date;
	private Boolean heavy_accident_damage;
	private String adapted;
	private Date warranty_expiry_date;
	
	
	public String getRecord_state() {
		return record_state;
	}
	public void setRecord_state(String record_state) {
		this.record_state = record_state;
	}
	public Integer getRecord_id() {
		return record_id;
	}
	public void setRecord_id(Integer record_id) {
		this.record_id = record_id;
	}
	public Date getRecord_date() {
		return record_date;
	}
	public void setRecord_date(Date record_date) {
		this.record_date = record_date;
	}
	public Integer getAsset_number() {
		return asset_number;
	}
	public void setAsset_number(Integer asset_number) {
		this.asset_number = asset_number;
	}
	public Integer getTranslease_leaseco_ref() {
		return translease_leaseco_ref;
	}
	public void setTranslease_leaseco_ref(Integer translease_leaseco_ref) {
		this.translease_leaseco_ref = translease_leaseco_ref;
	}
	public String getCar_registration_number() {
		return car_registration_number;
	}
	public void setCar_registration_number(String car_registration_number) {
		this.car_registration_number = car_registration_number;
	}
	public Integer getStock_id() {
		return stock_id;
	}
	public void setStock_id(Integer stock_id) {
		this.stock_id = stock_id;
	}
	public String getFleetnet_edi_code() {
		return fleetnet_edi_code;
	}
	public void setFleetnet_edi_code(String fleetnet_edi_code) {
		this.fleetnet_edi_code = fleetnet_edi_code;
	}
	public Integer getIcme_model_code() {
		return icme_model_code;
	}
	public void setIcme_model_code(Integer icme_model_code) {
		this.icme_model_code = icme_model_code;
	}
	public Byte getBadged_company() {
		return badged_company;
	}
	public void setBadged_company(Byte badged_company) {
		this.badged_company = badged_company;
	}
	public Byte getVehicle_band_rating() {
		return vehicle_band_rating;
	}
	public void setVehicle_band_rating(Byte vehicle_band_rating) {
		this.vehicle_band_rating = vehicle_band_rating;
	}
	public String getCustomer_number() {
		return customer_number;
	}
	public void setCustomer_number(String customer_number) {
		this.customer_number = customer_number;
	}
	public String getVin_number() {
		return vin_number;
	}
	public void setVin_number(String vin_number) {
		this.vin_number = vin_number;
	}
	public String getVehicle_colour() {
		return vehicle_colour;
	}
	public void setVehicle_colour(String vehicle_colour) {
		this.vehicle_colour = vehicle_colour;
	}
	public String getInitial_service_free() {
		return initial_service_free;
	}
	public void setInitial_service_free(String initial_service_free) {
		this.initial_service_free = initial_service_free;
	}
	public Byte getInitial_service_period() {
		return initial_service_period;
	}
	public void setInitial_service_period(Byte initial_service_period) {
		this.initial_service_period = initial_service_period;
	}
	public Short getInitial_service_distance() {
		return initial_service_distance;
	}
	public void setInitial_service_distance(Short initial_service_distance) {
		this.initial_service_distance = initial_service_distance;
	}
	public Byte getStandard_service_period() {
		return standard_service_period;
	}
	public void setStandard_service_period(Byte standard_service_period) {
		this.standard_service_period = standard_service_period;
	}
	public Short getStandard_service_distance() {
		return standard_service_distance;
	}
	public void setStandard_service_distance(Short standard_service_distance) {
		this.standard_service_distance = standard_service_distance;
	}
	public Date getReplacement_date() {
		return replacement_date;
	}
	public void setReplacement_date(Date replacement_date) {
		this.replacement_date = replacement_date;
	}
	public Integer getReplacement_mileage() {
		return replacement_mileage;
	}
	public void setReplacement_mileage(Integer replacement_mileage) {
		this.replacement_mileage = replacement_mileage;
	}
	public String getRef_all_indicator() {
		return ref_all_indicator;
	}
	public void setRef_all_indicator(String ref_all_indicator) {
		this.ref_all_indicator = ref_all_indicator;
	}
	public Byte getWarranty_distance() {
		return warranty_distance;
	}
	public void setWarranty_distance(Byte warranty_distance) {
		this.warranty_distance = warranty_distance;
	}
	public Byte getFree_service_period() {
		return free_service_period;
	}
	public void setFree_service_period(Byte free_service_period) {
		this.free_service_period = free_service_period;
	}
	public Byte getFree_service_distance() {
		return free_service_distance;
	}
	public void setFree_service_distance(Byte free_service_distance) {
		this.free_service_distance = free_service_distance;
	}
	public Integer getOdometer_repl_reading() {
		return odometer_repl_reading;
	}
	public void setOdometer_repl_reading(Integer odometer_repl_reading) {
		this.odometer_repl_reading = odometer_repl_reading;
	}
	public Date getContract_start_date() {
		return contract_start_date;
	}
	public void setContract_start_date(Date contract_start_date) {
		this.contract_start_date = contract_start_date;
	}
	public Date getFirst_reg_date() {
		return first_reg_date;
	}
	public void setFirst_reg_date(Date first_reg_date) {
		this.first_reg_date = first_reg_date;
	}
	public BigDecimal getReferral_value() {
		return referral_value;
	}
	public void setReferral_value(BigDecimal referral_value) {
		this.referral_value = referral_value;
	}
	public String getSpecial_information() {
		return special_information;
	}
	public void setSpecial_information(String special_information) {
		this.special_information = special_information;
	}
	public String getHigh_mileage_indicator() {
		return high_mileage_indicator;
	}
	public void setHigh_mileage_indicator(String high_mileage_indicator) {
		this.high_mileage_indicator = high_mileage_indicator;
	}
	public String getContract_type() {
		return contract_type;
	}
	public void setContract_type(String contract_type) {
		this.contract_type = contract_type;
	}
	public String getController_id() {
		return controller_id;
	}
	public void setController_id(String controller_id) {
		this.controller_id = controller_id;
	}
	public BigDecimal getMaintenance_budget() {
		return maintenance_budget;
	}
	public void setMaintenance_budget(BigDecimal maintenance_budget) {
		this.maintenance_budget = maintenance_budget;
	}
	public BigDecimal getMaintenance_cost_total() {
		return maintenance_cost_total;
	}
	public void setMaintenance_cost_total(BigDecimal maintenance_cost_total) {
		this.maintenance_cost_total = maintenance_cost_total;
	}
	public String getTransmission_action() {
		return transmission_action;
	}
	public void setTransmission_action(String transmission_action) {
		this.transmission_action = transmission_action;
	}
	public Integer getAgreement_status() {
		return agreement_status;
	}
	public void setAgreement_status(Integer agreement_status) {
		this.agreement_status = agreement_status;
	}
	public Integer getSuspended() {
		return suspended;
	}
	public void setSuspended(Integer suspended) {
		this.suspended = suspended;
	}
	public Boolean getIneligible() {
		return ineligible;
	}
	public void setIneligible(Boolean ineligible) {
		this.ineligible = ineligible;
	}
	public Integer getIneligible_reason_id() {
		return ineligible_reason_id;
	}
	public void setIneligible_reason_id(Integer ineligible_reason_id) {
		this.ineligible_reason_id = ineligible_reason_id;
	}
	public Date getRepurchase_date() {
		return repurchase_date;
	}
	public void setRepurchase_date(Date repurchase_date) {
		this.repurchase_date = repurchase_date;
	}
	public Boolean getHeavy_accident_damage() {
		return heavy_accident_damage;
	}
	public void setHeavy_accident_damage(Boolean heavy_accident_damage) {
		this.heavy_accident_damage = heavy_accident_damage;
	}
	public String getAdapted() {
		return adapted;
	}
	public void setAdapted(String adapted) {
		this.adapted = adapted;
	}
	public Date getWarranty_expiry_date() {
		return warranty_expiry_date;
	}
	public void setWarranty_expiry_date(Date warranty_expiry_date) {
		this.warranty_expiry_date = warranty_expiry_date;
	}
	
	@Override
	public String toString() {
		return "VehicleSnapShotBean [record_state=" + record_state
				+ ", record_id=" + record_id + ", record_date=" + record_date
				+ ", asset_number=" + asset_number
				+ ", translease_leaseco_ref=" + translease_leaseco_ref
				+ ", car_registration_number=" + car_registration_number
				+ ", stock_id=" + stock_id + ", fleetnet_edi_code="
				+ fleetnet_edi_code + ", icme_model_code=" + icme_model_code
				+ ", badged_company=" + badged_company
				+ ", vehicle_band_rating=" + vehicle_band_rating
				+ ", customer_number=" + customer_number + ", vin_number="
				+ vin_number + ", vehicle_colour=" + vehicle_colour
				+ ", initial_service_free=" + initial_service_free
				+ ", initial_service_period=" + initial_service_period
				+ ", initial_service_distance=" + initial_service_distance
				+ ", standard_service_period=" + standard_service_period
				+ ", standard_service_distance=" + standard_service_distance
				+ ", replacement_date=" + replacement_date
				+ ", replacement_mileage=" + replacement_mileage
				+ ", ref_all_indicator=" + ref_all_indicator
				+ ", warranty_distance=" + warranty_distance
				+ ", free_service_period=" + free_service_period
				+ ", free_service_distance=" + free_service_distance
				+ ", odometer_repl_reading=" + odometer_repl_reading
				+ ", contract_start_date=" + contract_start_date
				+ ", first_reg_date=" + first_reg_date + ", referral_value="
				+ referral_value + ", special_information="
				+ special_information + ", high_mileage_indicator="
				+ high_mileage_indicator + ", contract_type=" + contract_type
				+ ", controller_id=" + controller_id + ", maintenance_budget="
				+ maintenance_budget + ", maintenance_cost_total="
				+ maintenance_cost_total + ", transmission_action="
				+ transmission_action + ", agreement_status="
				+ agreement_status + ", suspended=" + suspended
				+ ", ineligible=" + ineligible + ", ineligible_reason_id="
				+ ineligible_reason_id + ", repurchase_date=" + repurchase_date
				+ ", heavy_accident_damage=" + heavy_accident_damage
				+ ", adapted=" + adapted + ", warranty_expiry_date="
				+ warranty_expiry_date + "]";
	}
	
}