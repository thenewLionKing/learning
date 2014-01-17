package uk.co.mo.app.mercury.domain.vehicle.event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import uk.co.mo.app.mercury.cs.dao.LegacyDAO;
import uk.co.mo.app.mercury.domain.common.VehicleEventSubType;
import uk.co.mo.app.mercury.domain.event.Event;
import uk.co.mo.app.mercury.domain.event.EventBuilder;
import uk.co.mo.app.mercury.domain.event.EventKey;
import uk.co.mo.app.mercury.domain.event.VehicleEvent;
import uk.co.mo.app.mercury.domain.event.VehicleEventType;

@Configurable
public class VehicleEventBuilder extends EventBuilder {
	
    @Autowired
    private LegacyDAO dao;
    
    private static final Log LOG = LogFactory.getLog(VehicleEventBuilder.class);

	@Override
	public Event buildEvent(EventKey key) {
		VehicleEventType custEventType = createVehicleEvent(key);
		custEventType.setType(VehicleEventSubType.getVehicleEventType((key.getEventTypeId().toString())));
        VehicleEvent event = new VehicleEvent();
        event.setKey(key);
        event.setType(custEventType);
        return event;
		
	}

	private VehicleEventType createVehicleEvent(EventKey key) {
		LOG.debug("Vehicle Event::  createVehicleEvent :: be_data_id "+key.getBeDataId());
		
		VehicleEventType eventType = (VehicleEventType) dao.getSoaInterfaceSessionFactory().getCurrentSession()
        .getNamedQuery("domain.businessEvent.vehicleKey").setParameter(0, key.getBeDataId())
        .setResultTransformer(Transformers.aliasToBean((VehicleEventType.class))).list().get(0);
        
        LOG.debug("Vehicle Event Type :: Registration Number "+eventType.getRegistrationNumber()
        		+"Vehicle Record ID "+eventType.getVehicleRecordId());
        
        return eventType;
	}
	
}
