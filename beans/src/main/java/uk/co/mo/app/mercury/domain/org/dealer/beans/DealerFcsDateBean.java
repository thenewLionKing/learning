package uk.co.mo.app.mercury.domain.org.dealer.beans;

import java.io.Serializable;
import java.util.Date;

public class DealerFcsDateBean implements Serializable {

	private static final long serialVersionUID = 5842488625435694783L;

	private DealerFcsDateType dateType;
    private Date actionDate;

    public DealerFcsDateBean() {
    }

    public DealerFcsDateType getDateType() {
        return dateType;
    }

    public void setDateType(DealerFcsDateType dateType) {
        this.dateType = dateType;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }
}