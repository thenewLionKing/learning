package uk.co.mo.app.mercury.domain.event;

/**
 * <p/>
 * User: prabat
 * Date: 13/06/11
 * Time: 12:14
 * <p/>
 * Change Log - Who : When : Comment
 */
public abstract class EventBuilder {


    protected abstract Event buildEvent(EventKey key);
    
    public Event getEvent(EventKey key) throws EventNotGeneratedException{
    	try{
    		return buildEvent(key);
    	}catch(Exception e){
    		throw new EventNotGeneratedException("Event Not Generated for Event Key ::"+key.getEventId(), e);
    	}
    }
}
