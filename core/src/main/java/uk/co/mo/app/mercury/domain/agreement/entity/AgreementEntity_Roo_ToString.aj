package uk.co.mo.app.mercury.domain.agreement.entity;

import java.lang.String;

privileged aspect AgreementEntity_Roo_ToString {
    
    public String AgreementEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
       // sb.append("Customer: ").append(getCustomer()).append(", ");        
        sb.append("AgreementId: ").append(getAgreementId()).append(", ");        
        sb.append("Arn: ").append(getArn()).append(", ");        
        sb.append("Version: ").append(getVersion()).append(", ");        
        sb.append("AgreementStatus: ").append(getAgreementStatus()).append(", ");        
        sb.append("ApplicationAcceptedDate: ").append(getApplicationAcceptedDate()).append(", ");        
        sb.append("AssetNumber: ").append(getAssetNumber()).append(", ");        
        sb.append("Authorisecode: ").append(getAuthorisecode()).append(", ");        
        sb.append("CreationSourceId: ").append(getCreationSourceId()).append(", ");        
        sb.append("EndDate: ").append(getEndDate()).append(", ");        
        sb.append("EntryDate: ").append(getEntryDate()).append(", ");        
        sb.append("FinanceAmount: ").append(getFinanceAmount()).append(", ");        
        sb.append("FinanceCharge: ").append(getFinanceCharge()).append(", ");        
        sb.append("GrantFund: ").append(getGrantFund()).append(", ");        
        sb.append("HandbackDate: ").append(getHandbackDate()).append(", ");        
        sb.append("HandbackDealerOrgId: ").append(getHandbackDealerOrgId()).append(", ");        
        sb.append("JointWeeklyRental: ").append(getJointWeeklyRental()).append(", ");        
        sb.append("MaintenanceAgentId: ").append(getMaintenanceAgentId()).append(", ");        
        sb.append("InsertDate: ").append(getInsertDate()).append(", ");        
        sb.append("UpdateDate: ").append(getUpdateDate()).append(", ");        
        sb.append("StartDate: ").append(getStartDate()).append(", ");        
        sb.append("UnadoptedIndicator: ").append(getUnadoptedIndicator()).append(", ");        
        sb.append("UpdateUser: ").append(getUpdateUser()).append(", ");        
        sb.append("AgreementProducts: ").append(getAgreementProducts() == null ? "null" : getAgreementProducts().size()).append(", ");        
        sb.append("Scheme Type: ").append(getSchemeTypeId()).append(", ");        
        return sb.toString();        
    }    
    
}
