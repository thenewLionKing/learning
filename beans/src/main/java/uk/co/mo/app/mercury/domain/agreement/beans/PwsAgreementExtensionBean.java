package uk.co.mo.app.mercury.domain.agreement.beans;

import java.io.Serializable;
import java.util.Date;

public class PwsAgreementExtensionBean implements Serializable {
    private Integer id;
    private String originalArn;
    private String newArn;
    private Date newEndDate;
    private Date maxEndDate;
    private Date originalEndDate;
    private Integer reasonId;
    private Boolean active;

    public PwsAgreementExtensionBean() {
        super();
    }

    public PwsAgreementExtensionBean(Integer id, String originalArn, String newArn, Date newEndDate, Date maxEndDate, Date originalEndDate, Integer reasonId, Boolean active) {
        this.id = id;
        this.originalArn = originalArn;
        this.newArn = newArn;
        this.newEndDate = newEndDate;
        this.maxEndDate = maxEndDate;
        this.originalEndDate = originalEndDate;
        this.reasonId = reasonId;
        this.active = active;
    }

    public String getOriginalArn() {
        return originalArn;
    }

    public void setOriginalArn(String originalArn) {
        this.originalArn = originalArn;
    }

    public String getNewArn() {
        return newArn;
    }

    public void setNewArn(String newArn) {
        this.newArn = newArn;
    }

    public Date getOriginalEndDate() {
        return originalEndDate;
    }

    public void setOriginalEndDate(Date originalEndDate) {
        this.originalEndDate = originalEndDate;
    }

    public Date getNewEndDate() {
        return newEndDate;
    }

    public void setNewEndDate(Date newEndDate) {
        this.newEndDate = newEndDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMaxEndDate() {
        return maxEndDate;
    }

    public void setMaxEndDate(Date maxEndDate) {
        this.maxEndDate = maxEndDate;
    }

    public Integer getReasonId() {
        return reasonId;
    }

    public void setReasonId(Integer reasonId) {
        this.reasonId = reasonId;
    }

    @Override
    public String toString() {
        return "PwsAgreementExtensionBean{" +
                "id=" + id +
                ", originalArn='" + originalArn + '\'' +
                ", newArn='" + newArn + '\'' +
                ", originalEndDate=" + originalEndDate +
                ", newEndDate=" + newEndDate +
                ", maxEndDate=" + maxEndDate +
                ", reasonId=" + reasonId +
                ", active=" + active +
                '}';
    }
}
