package uk.co.mo.app.mercury.domain.agreement.entity;

import org.springframework.beans.factory.annotation.Configurable;
import uk.co.mo.app.mercury.cs.entity.AbstractAuditableEntity;
import uk.co.mo.app.mercury.cs.entity.MoEntity;
import uk.co.mo.app.mercury.domain.agreement.beans.PwsAgreementExtensionBean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Configurable
@Table(name = "short_term_lease_extension_pws", schema = "dbo", catalog = "Enterprise")
public class ShortTermLeaseExtensionPwsEntity extends AbstractAuditableEntity implements MoEntity, Serializable {

	private transient  final PwsAgreementExtensionBean pwsAgreementExtensionBean = new PwsAgreementExtensionBean();

    @Transient
    public PwsAgreementExtensionBean getPwsAgreementExtensionBean() {
        return pwsAgreementExtensionBean;
    }

	@Id
    @Column(name = "id")
    public Integer getId() {
        return pwsAgreementExtensionBean.getId();
    }

    public void setId(Integer id) {
        this.pwsAgreementExtensionBean.setId(id);
    }

    @Column(columnDefinition = "CHAR 8 NULL", name = "original_arn")
    public String getOriginalArn () {
        return pwsAgreementExtensionBean.getOriginalArn();
    }

    public void setOriginalArn(String originalArn) {
        this.pwsAgreementExtensionBean.setOriginalArn(originalArn);
    }

    @Column(columnDefinition = "CHAR 8 NULL", name = "new_arn")
    public String getNewArn () {
        return pwsAgreementExtensionBean.getNewArn();
    }

    public void setNewArn(String newArn) {
        this.pwsAgreementExtensionBean.setNewArn(newArn);
    }

    @Column( name = "new_end_date")
    public Date getNewEndDate () {
        return pwsAgreementExtensionBean.getNewEndDate();
    }

    public void setNewEndDate(Date newEndDate) {
        this.pwsAgreementExtensionBean.setNewEndDate(newEndDate);
    }

    @Column( name = "active", columnDefinition="bit")
    public Boolean getActive () {
        return pwsAgreementExtensionBean.getActive();
    }

    public void setActive(Boolean active) {
        this.pwsAgreementExtensionBean.setActive(active);
    }

    @Column( name = "original_end_date")
    public Date getOriginalEndDate() {
        return this.pwsAgreementExtensionBean.getOriginalEndDate();
    }

    public void setOriginalEndDate(Date originalEndDate) {
        this.pwsAgreementExtensionBean.setOriginalEndDate(originalEndDate);
    }

    @Column( name = "max_extended_end_date")
    public Date getMaxEndDate() {
        return this.pwsAgreementExtensionBean.getMaxEndDate();
    }

    public void setMaxEndDate(Date maxEndDate) {
        this.pwsAgreementExtensionBean.setMaxEndDate(maxEndDate);
    }

    @Column(name = "extension_reason_id")
    public Integer getReasonId() {
        return this.pwsAgreementExtensionBean.getReasonId();
    }

    public void setReasonId(Integer reasonId) {
        this.pwsAgreementExtensionBean.setReasonId(reasonId);
    }
}
