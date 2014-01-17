package uk.co.mo.app.mercury.domain.agreement.beans;

import java.io.Serializable;

/**
 * <p/>
 * User: prabat
 * Date: 12/10/11
 * Time: 14:16
 * <p/>
 * Change Log - Who : When : Comment
 */
public class AgreementPreviousPartiesBean implements Serializable {

	private static final long serialVersionUID = 1713949325765753305L;

    private Integer previousCustomerId;
    private Integer previousJointCustomerId;
    private Integer previousAppointee1Id;
    private Integer previousAppointee2Id;

    public Integer getPreviousCustomerId() {
        return previousCustomerId;
    }

    public void setPreviousCustomerId(Integer previousCustomerId) {
        this.previousCustomerId = previousCustomerId;
    }

    public Integer getPreviousJointCustomerId() {
        return previousJointCustomerId;
    }

    public void setPreviousJointCustomerId(Integer previousJointCustomerId) {
        this.previousJointCustomerId = previousJointCustomerId;
    }

    public Integer getPreviousAppointee1Id() {
        return previousAppointee1Id;
    }

    public void setPreviousAppointee1Id(Integer previousAppointee1Id) {
        this.previousAppointee1Id = previousAppointee1Id;
    }

    public Integer getPreviousAppointee2Id() {
        return previousAppointee2Id;
    }

    public void setPreviousAppointee2Id(Integer previousAppointee2Id) {
        this.previousAppointee2Id = previousAppointee2Id;
    }

    @Override
    public String toString() {
        return "AgreementPreviousPartiesBean{" +
                "previousCustomerId=" + previousCustomerId +
                ", previousJointCustomerId=" + previousJointCustomerId +
                ", previousAppointee1Id=" + previousAppointee1Id +
                ", previousAppointee2Id=" + previousAppointee2Id +
                '}';
    }
}
