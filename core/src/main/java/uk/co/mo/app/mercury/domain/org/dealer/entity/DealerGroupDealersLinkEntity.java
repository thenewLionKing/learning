package uk.co.mo.app.mercury.domain.org.dealer.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * <p/>
 * User: prabat
 * Date: 02-Jun-2011
 * Time: 16:35:45
 * <p/>
 * Change Log - Who : When : Comment
 */
@javax.persistence.Table(name = "dealer_group_dealers_link", schema = "dbo", catalog = "Enterprise")
@Entity
public class DealerGroupDealersLinkEntity {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private DealerGroupDealersLinkEntityPK id;

    public DealerGroupDealersLinkEntityPK getId() {
        return id;
    }

    public void setId(DealerGroupDealersLinkEntityPK id) {
        this.id = id;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DealerGroupDealersLinkEntity that = (DealerGroupDealersLinkEntity) o;

        return this.id.equals(that.id);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        return result;
   }
}
