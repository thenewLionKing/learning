// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.lang.String;

privileged aspect VehicleEntity_Roo_ToString {
    
    public String VehicleEntity.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Adapted: ").append(getAdapted()).append(", ");
        sb.append("AgreementStatus: ").append(getAgreementStatus()).append(", ");
        sb.append("AssetNumber: ").append(getAssetNumber()).append(", ");
        sb.append("BadgedCompany: ").append(getBadgedCompany()).append(", ");
        sb.append("CarRegistrationNumber: ").append(getCarRegistrationNumber()).append(", ");
        sb.append("Comments: ").append(getComments()).append(", ");
        sb.append("ContractStartDate: ").append(getContractStartDate()).append(", ");
        sb.append("ContractType: ").append(getContractType()).append(", ");
        sb.append("ControllerId: ").append(getControllerId()).append(", ");
        sb.append("CustomerNumber: ").append(getCustomerNumber()).append(", ");
        sb.append("FirstRegDate: ").append(getFirstRegDate()).append(", ");
        sb.append("FleetnetEdiCode: ").append(getFleetnetEdiCode()).append(", ");
        sb.append("FreeServiceDistance: ").append(getFreeServiceDistance()).append(", ");
        sb.append("FreeServicePeriod: ").append(getFreeServicePeriod()).append(", ");
        sb.append("HeavyAccidentDamage: ").append(getHeavyAccidentDamage()).append(", ");
        sb.append("HighMileageIndicator: ").append(getHighMileageIndicator()).append(", ");
        sb.append("IcmeModelCode: ").append(getIcmeModelCode()).append(", ");
        sb.append("Ineligible: ").append(getIneligible()).append(", ");
        sb.append("IneligibleReasonId: ").append(getIneligibleReasonId()).append(", ");
        sb.append("InitialServiceDistance: ").append(getInitialServiceDistance()).append(", ");
        sb.append("InitialServiceFree: ").append(getInitialServiceFree()).append(", ");
        sb.append("InitialServicePeriod: ").append(getInitialServicePeriod()).append(", ");
        sb.append("MaintenanceBudget: ").append(getMaintenanceBudget()).append(", ");
        sb.append("MaintenanceCostTotal: ").append(getMaintenanceCostTotal()).append(", ");
        sb.append("OdometerReplReading: ").append(getOdometerReplReading()).append(", ");
        sb.append("RefAllIndicator: ").append(getRefAllIndicator()).append(", ");
        sb.append("ReferralValue: ").append(getReferralValue()).append(", ");
        sb.append("ReplacementDate: ").append(getReplacementDate()).append(", ");
        sb.append("ReplacementMileage: ").append(getReplacementMileage()).append(", ");
        sb.append("RepurchaseDate: ").append(getRepurchaseDate()).append(", ");
        sb.append("SpecialInformation: ").append(getSpecialInformation()).append(", ");
        sb.append("StandardServiceDistance: ").append(getStandardServiceDistance()).append(", ");
        sb.append("StandardServicePeriod: ").append(getStandardServicePeriod()).append(", ");
        sb.append("StockId: ").append(getStockId()).append(", ");
        sb.append("Suspended: ").append(getSuspended()).append(", ");
        sb.append("TransleaseLeasecoRef: ").append(getTransleaseLeasecoRef()).append(", ");
        sb.append("TransmissionAction: ").append(getTransmissionAction()).append(", ");
        sb.append("VehicleBandRating: ").append(getVehicleBandRating()).append(", ");
        sb.append("VehicleBean: ").append(getVehicleBean()).append(", ");
        sb.append("VehicleColour: ").append(getVehicleColour()).append(", ");
        sb.append("VinNumber: ").append(getVinNumber()).append(", ");
        sb.append("WarrantyDistance: ").append(getWarrantyDistance()).append(", ");
        sb.append("WarrantyExpiryDate: ").append(getWarrantyExpiryDate());
        return sb.toString();
    }
    
}
