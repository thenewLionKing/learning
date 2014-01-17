package uk.co.mo.app.mercury.domain.event;

import uk.co.mo.app.mercury.domain.common.ScanningEventSubType;
import uk.co.mo.app.mercury.domain.scanning.event.ScanningEventBuilder;

public class ScanningSubEventChain extends AbstractSubEventChain {

    private static ScanningEventBuilder scanningEventBuilder = new ScanningEventBuilder();
    
	@Override
	public EventBuilder getEventBuilder(EventKey key) {
	       ScanningEventSubType eventType = ScanningEventSubType.getScanningEventType(key.getEventTypeId().toString());
	        
	        if(eventType != null)
	            return scanningEventBuilder;
	        else
	       		 return null;
		}
}
