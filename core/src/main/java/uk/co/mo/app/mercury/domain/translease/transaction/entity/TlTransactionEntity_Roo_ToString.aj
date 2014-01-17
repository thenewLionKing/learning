// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package uk.co.mo.app.mercury.domain.translease.transaction.entity;

import java.lang.String;

privileged aspect TlTransactionEntity_Roo_ToString {
    
    public String TlTransactionEntity.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssetNumber: ").append(getAssetNumber()).append(", ");
        sb.append("AuthorisationCode: ").append(getAuthorisationCode()).append(", ");
        sb.append("CarRegistrationNumber: ").append(getCarRegistrationNumber()).append(", ");
        sb.append("DriverName: ").append(getDriverName()).append(", ");
        sb.append("LeasecoControllerId: ").append(getLeasecoControllerId()).append(", ");
        sb.append("LeasecoRepairerRef: ").append(getLeasecoRepairerRef()).append(", ");
        sb.append("OdometerReading: ").append(getOdometerReading()).append(", ");
        sb.append("OrderNumberOrAuthCode: ").append(getOrderNumberOrAuthCode()).append(", ");
        sb.append("RepairDate: ").append(getRepairDate()).append(", ");
        sb.append("RepairerAddress1: ").append(getRepairerAddress1()).append(", ");
        sb.append("RepairerAddress2: ").append(getRepairerAddress2()).append(", ");
        sb.append("RepairerAddress3: ").append(getRepairerAddress3()).append(", ");
        sb.append("RepairerAddress4: ").append(getRepairerAddress4()).append(", ");
        sb.append("RepairerAddress5: ").append(getRepairerAddress5()).append(", ");
        sb.append("RepairerContactNumber: ").append(getRepairerContactNumber()).append(", ");
        sb.append("RepairerJobNoOrDepotNo: ").append(getRepairerJobNoOrDepotNo()).append(", ");
        sb.append("RepairerName: ").append(getRepairerName()).append(", ");
        sb.append("RepairerPostcode: ").append(getRepairerPostcode()).append(", ");
        sb.append("RepairerVatNumber: ").append(getRepairerVatNumber()).append(", ");
//        sb.append("RowInsertDate: ").append(getRowInsertDate()).append(", ");
        sb.append("SpareUtilisedFlag: ").append(getSpareUtilisedFlag()).append(", ");
        sb.append("TlTransactionBean: ").append(getTlTransactionBean()).append(", ");
        sb.append("TotalDriverContribution: ").append(getTotalDriverContribution()).append(", ");
        sb.append("TotalGrossLabourCost: ").append(getTotalGrossLabourCost()).append(", ");
        sb.append("TotalGrossPartsCost: ").append(getTotalGrossPartsCost()).append(", ");
        sb.append("TotalGrossTransactionCost: ").append(getTotalGrossTransactionCost()).append(", ");
        sb.append("TotalNettLabourCost: ").append(getTotalNettLabourCost()).append(", ");
        sb.append("TotalNettPartsCost: ").append(getTotalNettPartsCost()).append(", ");
        sb.append("TotalNettTransactionCost: ").append(getTotalNettTransactionCost()).append(", ");
        sb.append("TransactionDate: ").append(getTransactionDate()).append(", ");
        sb.append("TransactionSerialNumber: ").append(getTransactionSerialNumber()).append(", ");
        sb.append("TransactionType: ").append(getTransactionType()).append(", ");
        sb.append("TransactionVersionNumber: ").append(getTransactionVersionNumber()).append(", ");
        sb.append("TransleaseLeasecoRef: ").append(getTransleaseLeasecoRef()).append(", ");
        sb.append("TransleaseRepairerNumber: ").append(getTransleaseRepairerNumber()).append(", ");
        sb.append("TransleaseTransactionNumber: ").append(getTransleaseTransactionNumber()).append(", ");
        sb.append("VatAmount: ").append(getVatAmount()).append(", ");
        sb.append("VinNumber: ").append(getVinNumber()).append(", ");
        sb.append("VrmOkToProcess: ").append(getVrmOkToProcess()).append(", ");
//        sb.append("VrmProcessCount: ").append(getVrmProcessCount()).append(", ");
//        sb.append("VrmProcessedDate: ").append(getVrmProcessedDate());
        return sb.toString();
    }
    
}
