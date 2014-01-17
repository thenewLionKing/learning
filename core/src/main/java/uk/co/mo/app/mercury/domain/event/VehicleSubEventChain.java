package uk.co.mo.app.mercury.domain.event;

import uk.co.mo.app.mercury.domain.common.VehicleEventSubType;
import uk.co.mo.app.mercury.domain.vehicle.event.VehicleEventBuilder;

public class VehicleSubEventChain extends AbstractSubEventChain {

	private static VehicleEventBuilder vehicleEventBuilder = new VehicleEventBuilder();
	
	@Override
	public EventBuilder getEventBuilder(EventKey key) {
		    
	       VehicleEventSubType eventType = VehicleEventSubType.getVehicleEventType(key.getEventTypeId().toString());
	        
	        if(eventType != null)
	            return vehicleEventBuilder;
	        else
	       		 return null;
		}
}
