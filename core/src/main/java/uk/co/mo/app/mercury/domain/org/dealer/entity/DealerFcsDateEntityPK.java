package uk.co.mo.app.mercury.domain.org.dealer.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * <p/>
 * User: prabat
 * Date: 02-Jun-2011
 * Time: 13:47:52
 * <p/>
 * Change Log - Who : When : Comment
 */
@Embeddable
public class DealerFcsDateEntityPK implements Serializable {

	private static final long serialVersionUID = -283112846179439142L;

	@Column(name = "date_type", nullable = false, insertable = true, updatable = true, length = 1, columnDefinition = "CHAR 1 NOT NULL")
    private String dateType;

    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    @ManyToOne
	@JoinColumn(name="agent_number")
    private MaintenanceAgentMaagEntity parent;


    public MaintenanceAgentMaagEntity getParent() {
        return parent;
    }

    public void setParent(MaintenanceAgentMaagEntity parent) {
        this.parent = parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DealerFcsDateEntityPK that = (DealerFcsDateEntityPK) o;
        
        return dateType.equals(that.dateType) && parent.getAgentNumber().equals(that.parent.getAgentNumber());    
    }

    @Override
    public int hashCode() {
        int result = 31 * (dateType != null ? dateType.hashCode() : 0);
        return result;
    }
}
