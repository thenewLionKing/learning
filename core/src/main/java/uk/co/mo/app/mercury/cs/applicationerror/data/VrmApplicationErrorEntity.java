package uk.co.mo.app.mercury.cs.applicationerror.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;

@Entity
@javax.persistence.Table(name = "vrm_application_error", schema = "dbo", catalog = "Enterprise")
////(finders = { "findVrmApplicationErrorEntitysByErrorType" })
public class VrmApplicationErrorEntity {

    private int errorId;

    @javax.persistence.Column(name = "error_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getErrorId() {
        return errorId;
    }

    public void setErrorId(int errorId) {
        this.errorId = errorId;
    }

    private int applicationId;

    @javax.persistence.Column(name = "application_id")
    @Basic
    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    private String failureKey;

    @javax.persistence.Column(name = "failure_key")
    @Basic
    public String getFailureKey() {
        return failureKey;
    }

    public void setFailureKey(String failureKey) {
        this.failureKey = failureKey;
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

    private String loggedBy;

    @javax.persistence.Column(name = "logged_by")
    @Basic
    public String getLoggedBy() {
        return loggedBy;
    }

    public void setLoggedBy(String loggedBy) {
        this.loggedBy = loggedBy;
    }

    private Date loggedDate;

    @javax.persistence.Column(name = "logged_date")
    @Basic
    public Date getLoggedDate() {
        return loggedDate;
    }

    public void setLoggedDate(Date loggedDate) {
        this.loggedDate = loggedDate;
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

    private String applicationMessage;

    @javax.persistence.Column(name = "application_message")
    @Basic
    public String getApplicationMessage() {
        return applicationMessage;
    }

    public void setApplicationMessage(String applicationMessage) {
        this.applicationMessage = applicationMessage;
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

    private Timestamp acknowledgedDate;

    @javax.persistence.Column(name = "acknowledged_date")
    @Basic
    public Timestamp getAcknowledgedDate() {
        return acknowledgedDate;
    }

    public void setAcknowledgedDate(Timestamp acknowledgedDate) {
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

    private String exception;

    @javax.persistence.Column(name = "exception", columnDefinition = "TEXT NULL")
    @Basic
    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    private Date lastRepeatedDate;

    @javax.persistence.Column(name = "last_repeated_date")
    @Basic
    public Date getLastRepeatedDate() {
        return lastRepeatedDate;
    }

    public void setLastRepeatedDate(Date lastRepeatedDate) {
        this.lastRepeatedDate = lastRepeatedDate;
    }

    private String hostname;

    @javax.persistence.Column(name = "hostname")
    @Basic
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VrmApplicationErrorEntity that = (VrmApplicationErrorEntity) o;
        if (applicationId != that.applicationId) return false;
        if (errorId != that.errorId) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = errorId;
        result = 31 * result + applicationId;
        return result;
    }

    private Collection<VrmApplicationErrorAuditEntity> errorAudits;

    @OneToMany(mappedBy = "error")
    public Collection<VrmApplicationErrorAuditEntity> getErrorAudits() {
        return errorAudits;
    }

    public void setErrorAudits(Collection<VrmApplicationErrorAuditEntity> errorAudits) {
        this.errorAudits = errorAudits;
    }

    private VrmErrorTypeEntity errorType;

    @ManyToOne
    @JoinColumn(name = "error_type_id", referencedColumnName = "error_type_id", nullable = false)
    public VrmErrorTypeEntity getErrorType() {
        return errorType;
    }

    public void setErrorType(VrmErrorTypeEntity errorType) {
        this.errorType = errorType;
    }

    public void addErrorAudit(VrmApplicationErrorAuditEntity auditEntity) {
        if (errorAudits == null) getErrorAudits();
        errorAudits.add(auditEntity);
    }
}
