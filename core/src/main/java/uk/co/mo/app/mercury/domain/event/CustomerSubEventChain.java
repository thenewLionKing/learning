package uk.co.mo.app.mercury.domain.event;

import uk.co.mo.app.mercury.domain.common.CustomerEventSubType;
import uk.co.mo.app.mercury.domain.customer.event.CustomerEventBuilder;

public class CustomerSubEventChain extends AbstractSubEventChain {

    private static CustomerEventBuilder customerEventBuilder = new CustomerEventBuilder();
    
	@Override
	public EventBuilder getEventBuilder(EventKey key) {
	       CustomerEventSubType eventType = CustomerEventSubType.getCustomerEventType(key.getEventTypeId().toString());
	        
	        if(eventType != null)
	            return customerEventBuilder;
	        else
	       		 return null;
		}
}
