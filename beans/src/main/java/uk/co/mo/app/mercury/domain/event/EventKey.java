package uk.co.mo.app.mercury.domain.event;

import java.io.Serializable;
import java.util.Date;

/**
 * <p/>
 * User: prabat
 * Date: 10/06/11
 * Time: 14:47
 * <p/>
 * Change Log - Who : When : Comment
 */
public class EventKey implements Serializable {

	private static final long serialVersionUID = 5838515915513783405L;

	private Integer beId;
    private Integer beDataId;
    private Short eventTypeId;
    private Date eventDate;
    private Integer eventSeqNo;

    public Integer getBeId() {
        return beId;
    }

    public void setBeId(Integer beId) {
        this.beId = beId;
    }

    public Integer getBeDataId() {
        return beDataId;
    }

    public void setBeDataId(Integer beDataId) {
        this.beDataId = beDataId;
    }

    public Short getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(Short eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Integer getEventSeqNo() {
        return eventSeqNo;
    }

    public void setEventSeqNo(Integer eventSeqNo) {
        this.eventSeqNo = eventSeqNo;
    }

    public String getEventId() {
        return beId.toString()+"-"+eventSeqNo.toString();
    }
    
    public String toString(){
		return "BE_ID: "+this.beId+", BE_DATA_ID: "+this.beDataId+", EVENT_TYPE_ID: "+this.eventTypeId+", EVENT_DATE: "+this.eventDate;
    	
    }
}
