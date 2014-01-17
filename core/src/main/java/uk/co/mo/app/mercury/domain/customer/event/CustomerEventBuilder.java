package uk.co.mo.app.mercury.domain.customer.event;

import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import uk.co.mo.app.mercury.cs.dao.LegacyDAO;
import uk.co.mo.app.mercury.domain.common.CustomerEventSubType;
import uk.co.mo.app.mercury.domain.event.CustomerEvent;
import uk.co.mo.app.mercury.domain.event.CustomerEventType;
import uk.co.mo.app.mercury.domain.event.Event;
import uk.co.mo.app.mercury.domain.event.EventBuilder;
import uk.co.mo.app.mercury.domain.event.EventKey;

@Configurable
public class CustomerEventBuilder extends EventBuilder {
	
    @Autowired
    private LegacyDAO dao;

	@Override
	public Event buildEvent(EventKey key) {
		CustomerEventType custEventType = createCustomerEvent(key);
		custEventType.setType(CustomerEventSubType.getCustomerEventType((key.getEventTypeId().toString())));
        CustomerEvent event = new CustomerEvent();
        event.setKey(key);
        event.setType(custEventType);
        return event;
		
	}

	private CustomerEventType createCustomerEvent(EventKey key) {
        return (CustomerEventType) dao.getSoaInterfaceSessionFactory().getCurrentSession()
        .getNamedQuery("domain.businessEvent.customerKey").setParameter(0, key.getBeDataId())
        .setParameter(1, key.getEventTypeId())
        .setResultTransformer(Transformers.aliasToBean((CustomerEventType.class))).list().get(0);

	}
	
}
