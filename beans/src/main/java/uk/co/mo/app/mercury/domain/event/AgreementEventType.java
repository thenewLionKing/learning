package uk.co.mo.app.mercury.domain.event;

import uk.co.mo.app.mercury.domain.common.*;

import java.io.Serializable;

/**
 * <p/>
 * User: prabat
 * Date: 13/06/11
 * Time: 08:49
 * <p/>
 * Change Log - Who : When : Comment
 */
public class AgreementEventType implements EventType, Serializable {
    private static final long serialVersionUID = 1L;

    private String arn;
    private Integer recordId;
    private Integer agreementId;
    private AgreementEventSubType type;


    public AgreementEventType() {
    }

    public String getArn() {
        return arn;
    }

    public void setArn(String arn) {
        this.arn = arn;
    }


    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(Integer agreementId) {
        this.agreementId = agreementId;
    }


    public AgreementEventSubType getType() {
        return type;
    }

    public void setType(AgreementEventSubType type) {
        this.type = type;
    }

    public void setEventType(String name) {
        this.type = AgreementEventSubType.valueOf(name);
    }

    @Override
    public String getEventType() {
        return type.name();
    }
}
