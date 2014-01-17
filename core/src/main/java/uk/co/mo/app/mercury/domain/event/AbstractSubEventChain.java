package uk.co.mo.app.mercury.domain.event;


public abstract class AbstractSubEventChain {
	public AbstractSubEventChain successorLink;
	
	public void setSuccessor(AbstractSubEventChain successorLink ){
		this.successorLink = successorLink;
	}
	
	public EventBuilder processRequest(EventKey key) throws UnknownEventException{
		EventBuilder builder = getEventBuilder(key);
		if(builder == null) {
			if(this.successorLink != null)
				return this.successorLink.processRequest(key);
			else
				throw new UnknownEventException("Unknown Event: " + key.toString() + ". This event need to be configured in mercury");
		}
		return builder;
	}
	
	protected abstract EventBuilder getEventBuilder(EventKey key);
}
