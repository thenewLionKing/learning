package uk.co.mo.app.mercury.domain.org.dealer.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <p/>
 * User: prabat
 * Date: 02-Jun-2011
 * Time: 16:35:49
 * <p/>
 * Change Log - Who : When : Comment
 */

@Embeddable
public class DealerGroupDealersLinkEntityPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 76820968793016104L;
	
	@Column(name = "group_number", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    private Integer groupNumber;


    public Integer getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
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

        DealerGroupDealersLinkEntityPK that = (DealerGroupDealersLinkEntityPK) o;

        //if (groupNumber != that.groupNumber || parent.getAgentNumber() != that.parent.getAgentNumber()) return false;

        return groupNumber.equals(that.groupNumber) && parent.getAgentNumber().equals(that.parent.getAgentNumber());
    }

    @Override
    public int hashCode() {
        int result = groupNumber;
        return result;
    }
}
