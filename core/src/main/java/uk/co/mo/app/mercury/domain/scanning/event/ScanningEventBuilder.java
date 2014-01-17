package uk.co.mo.app.mercury.domain.scanning.event;

import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import uk.co.mo.app.mercury.cs.dao.LegacyDAO;
import uk.co.mo.app.mercury.domain.common.ScanningEventSubType;
import uk.co.mo.app.mercury.domain.event.Event;
import uk.co.mo.app.mercury.domain.event.EventBuilder;
import uk.co.mo.app.mercury.domain.event.EventKey;
import uk.co.mo.app.mercury.domain.event.ScanningEvent;
import uk.co.mo.app.mercury.domain.event.ScanningEventType;

@Configurable
public class ScanningEventBuilder extends EventBuilder {
	
    @Autowired
    private LegacyDAO dao;

	@Override
	public Event buildEvent(EventKey key) {
		ScanningEventType scanningEventType = createScanningEvent(key);
		scanningEventType.setType(ScanningEventSubType.getScanningEventType((key.getEventTypeId().toString())));
        ScanningEvent event = new ScanningEvent();
        event.setKey(key);
        event.setType(scanningEventType);
        return event;
		
	}

	private ScanningEventType createScanningEvent(EventKey key) {
        return (ScanningEventType) dao.getSoaInterfaceSessionFactory().getCurrentSession()
        .getNamedQuery("domain.businessEvent.scanningKey").setParameter(0, key.getBeDataId())
        .setResultTransformer(Transformers.aliasToBean((ScanningEventType.class))).list().get(0);

	}
	
}
