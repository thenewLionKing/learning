// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package uk.co.mo.app.mercury.domain.translease.invoice.entity;

import java.lang.String;

privileged aspect TlInvoiceCreditEntity_Roo_ToString {
    
    public String TlInvoiceCreditEntity.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IcTransactionType: ").append(getIcTransactionType()).append(", ");
        sb.append("InvoiceCreditNumber: ").append(getInvoiceCreditNumber()).append(", ");
        sb.append("InvoiceDate: ").append(getInvoiceDate()).append(", ");
        sb.append("LeasecoAuthorisationCode: ").append(getLeasecoAuthorisationCode()).append(", ");
        sb.append("LeasecoMessage: ").append(getLeasecoMessage()).append(", ");
        sb.append("OriginalInvoiceNumber: ").append(getOriginalInvoiceNumber()).append(", ");
        sb.append("OriginalTransleaseTranNo: ").append(getOriginalTransleaseTranNo()).append(", ");
        sb.append("ReasonForCredit: ").append(getReasonForCredit()).append(", ");
        sb.append("RepairerInvoiceText: ").append(getRepairerInvoiceText()).append(", ");
        sb.append("TaxPointDate: ").append(getTaxPointDate()).append(", ");
        sb.append("TermsStatus: ").append(getTermsStatus()).append(", ");
//        sb.append("Timestamp: ").append(getTimestamp()).append(", ");
        sb.append("TlInvoiceCreditBean: ").append(getTlInvoiceCreditBean()).append(", ");
        sb.append("TransleaseTransactionNumber: ").append(getTransleaseTransactionNumber()).append(", ");

        return sb.toString();
    }
    
}
