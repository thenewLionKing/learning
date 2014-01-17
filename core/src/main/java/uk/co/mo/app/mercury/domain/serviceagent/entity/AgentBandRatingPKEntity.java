package uk.co.mo.app.mercury.domain.serviceagent.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <p/>
 * User: prabat
 * Date: 12/01/12
 * Time: 12:20
 * <p/>
 * Change Log - Who : When : Comment
 */
@Embeddable
public class AgentBandRatingPKEntity implements Serializable{

    private Integer transleaseRepairerNumber;
    private String agentNumber;
    private Short bandRating;
    private String ruleSet;



    public AgentBandRatingPKEntity() {
    }

    @Column(name="translease_repairer_number", unique=true, nullable=false, insertable=false, updatable=false)
    public Integer getTransleaseRepairerNumber() {
        return transleaseRepairerNumber;
    }

    public void setTransleaseRepairerNumber(Integer transleaseRepairerNumber) {
        this.transleaseRepairerNumber = transleaseRepairerNumber;
    }

    @Column(name="agent_number", unique=true, nullable=false, length=5, columnDefinition = "CHAR 8 NOT NULL")
    public String getAgentNumber() {
        return agentNumber;
    }

    public void setAgentNumber(String agentNumber) {
        this.agentNumber = agentNumber;
    }

    @Column(name="band_rating", unique=true, nullable=false, columnDefinition="TINYINT")
    public Short getBandRating() {
        return bandRating;
    }

    public void setBandRating(Short bandRating) {
        this.bandRating = bandRating;
    }

    @Column(name="rule_set", unique=true, nullable=false, length=50)
    public String getRuleSet() {
        return ruleSet;
    }

    public void setRuleSet(String ruleSet) {
        this.ruleSet = ruleSet;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgentBandRatingPKEntity that = (AgentBandRatingPKEntity) o;

        if (agentNumber != null ? !agentNumber.equals(that.agentNumber) : that.agentNumber != null) return false;
        if (bandRating != null ? !bandRating.equals(that.bandRating) : that.bandRating != null) return false;
        if (ruleSet != null ? !ruleSet.equals(that.ruleSet) : that.ruleSet != null) return false;
        if (transleaseRepairerNumber != null ? !transleaseRepairerNumber.equals(that.transleaseRepairerNumber) : that.transleaseRepairerNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = transleaseRepairerNumber != null ? transleaseRepairerNumber.hashCode() : 0;
        result = 31 * result + (agentNumber != null ? agentNumber.hashCode() : 0);
        result = 31 * result + (bandRating != null ? bandRating.hashCode() : 0);
        result = 31 * result + (ruleSet != null ? ruleSet.hashCode() : 0);
        return result;
    }
}
