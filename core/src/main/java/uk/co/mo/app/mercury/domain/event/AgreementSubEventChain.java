package uk.co.mo.app.mercury.domain.event;

import uk.co.mo.app.mercury.domain.agreement.event.AgreementEventBuilder;
import uk.co.mo.app.mercury.domain.common.AgreementEventSubType;

public class AgreementSubEventChain extends AbstractSubEventChain {

    private static AgreementEventBuilder agreementEventBuilder = new AgreementEventBuilder();
    
	@Override
	public EventBuilder getEventBuilder(EventKey key) {
        AgreementEventSubType eventType = AgreementEventSubType.getAgreementEventType(key.getEventTypeId().toString());
        
        if(eventType != null)
            return agreementEventBuilder;
        else
       		 return null;
	}

}
