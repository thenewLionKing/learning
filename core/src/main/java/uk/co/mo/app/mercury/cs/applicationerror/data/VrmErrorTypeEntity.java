/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */

package uk.co.mo.app.mercury.cs.applicationerror.data;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Table(name = "vrm_error_type", schema = "dbo", catalog = "Enterprise")
@Entity
@org.hibernate.annotations.Entity(mutable = false)
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)



public class VrmErrorTypeEntity {
    private int errorTypeId;

    @javax.persistence.Column(name = "error_type_id")
    @Id
    public int getErrorTypeId() {
        return errorTypeId;
    }

    public void setErrorTypeId(int errorTypeId) {
        this.errorTypeId = errorTypeId;
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

    private String errorTypeDesc;

    @javax.persistence.Column(name = "error_type_desc")
    @Basic
    public String getErrorTypeDesc() {
        return errorTypeDesc;
    }

    public void setErrorTypeDesc(String errorTypeDesc) {
        this.errorTypeDesc = errorTypeDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VrmErrorTypeEntity that = (VrmErrorTypeEntity) o;

        if (applicationId != that.applicationId) return false;
        if (errorTypeId != that.errorTypeId) return false;
        if (errorTypeDesc != null ? !errorTypeDesc.equals(that.errorTypeDesc) : that.errorTypeDesc != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = errorTypeId;
        result = 31 * result + applicationId;
        result = 31 * result + (errorTypeDesc != null ? errorTypeDesc.hashCode() : 0);
        return result;
    }

}
