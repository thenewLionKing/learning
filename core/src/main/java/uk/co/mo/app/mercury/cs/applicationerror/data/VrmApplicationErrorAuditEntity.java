/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */

package uk.co.mo.app.mercury.cs.applicationerror.data;

import javax.persistence.*;
import java.util.Date;

@Entity
@javax.persistence.Table(name = "vrm_application_error_audit", schema = "dbo", catalog = "Enterprise")



public class VrmApplicationErrorAuditEntity {
        private int errorAuditId;

    @javax.persistence.Column(name = "error_audit_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getErrorAuditId() {
        return errorAuditId;
    }

    public void setErrorAuditId(int errorAuditId) {
        this.errorAuditId = errorAuditId;
    }

    private int errorStatusId;

    @javax.persistence.Column(name = "error_status_id")
    @Basic
    public int getErrorStatusId() {
        return errorStatusId;
    }

    public void setErrorStatusId(int errorStatusId) {
        this.errorStatusId = errorStatusId;
    }

    private int errorSeverityId;

    @javax.persistence.Column(name = "error_severity_id")
    @Basic
    public int getErrorSeverityId() {
        return errorSeverityId;
    }

    public void setErrorSeverityId(int errorSeverityId) {
        this.errorSeverityId = errorSeverityId;
    }

    private String acknowledgedBy;

    @javax.persistence.Column(name = "acknowledged_by")
    @Basic
    public String getAcknowledgedBy() {
        return acknowledgedBy;
    }

    public void setAcknowledgedBy(String acknowledgedBy) {
        this.acknowledgedBy = acknowledgedBy;
    }

    private Date acknowledgedDate;

    @javax.persistence.Column(name = "acknowledged_date")
    @Basic
    public Date getAcknowledgedDate() {
        return acknowledgedDate;
    }

    public void setAcknowledgedDate(Date acknowledgedDate) {
        this.acknowledgedDate = acknowledgedDate;
    }

    private String comment;

    @javax.persistence.Column(name = "comment")
    @Basic
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VrmApplicationErrorAuditEntity that = (VrmApplicationErrorAuditEntity) o;

        if (errorAuditId != that.errorAuditId) return false;
        if (errorSeverityId != that.errorSeverityId) return false;
        if (errorStatusId != that.errorStatusId) return false;
        if (acknowledgedBy != null ? !acknowledgedBy.equals(that.acknowledgedBy) : that.acknowledgedBy != null)
            return false;
        if (acknowledgedDate != null ? !acknowledgedDate.equals(that.acknowledgedDate) : that.acknowledgedDate != null)
            return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = errorAuditId;
        result = 31 * result + errorStatusId;
        result = 31 * result + errorSeverityId;
        result = 31 * result + (acknowledgedBy != null ? acknowledgedBy.hashCode() : 0);
        result = 31 * result + (acknowledgedDate != null ? acknowledgedDate.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }

    private VrmApplicationErrorEntity error;

    @ManyToOne
    @javax.persistence.JoinColumn(name = "error_id")
    public VrmApplicationErrorEntity getError() {
        return error;
    }

    public void setError(VrmApplicationErrorEntity error) {
        this.error = error;
    }
}
