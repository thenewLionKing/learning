package uk.co.mo.app.mercury.domain.agreement.event;

import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import uk.co.mo.app.mercury.cs.dao.LegacyDAO;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementBean;
import uk.co.mo.app.mercury.domain.agreement.service.AgreementDataService;
import uk.co.mo.app.mercury.domain.common.AgreementEventSubType;
import uk.co.mo.app.mercury.domain.event.AgreementEvent;
import uk.co.mo.app.mercury.domain.event.AgreementEventType;
import uk.co.mo.app.mercury.domain.event.Event;
import uk.co.mo.app.mercury.domain.event.EventBuilder;
import uk.co.mo.app.mercury.domain.event.EventKey;

/**
 * <p/>
 * User: prabat
 * Date: 13/06/11
 * Time: 12:27
 * <p/>
 * Change Log - Who : When : Comment
 */
@Configurable
public class AgreementEventBuilder extends EventBuilder {

    @Autowired
    private AgreementDataService agrDataService;

    @Autowired
    private LegacyDAO dao;

    @Override
    public Event buildEvent(EventKey key) {
        AgreementEventType agrEvent = createAgreementEvent(key);
        AgreementBean bean = agrDataService.getAgreementByPK(agrEvent.getAgreementId());
        agrEvent.setType(AgreementEventSubType.getAgreementEventType(key.getEventTypeId().toString()));
        agrEvent.setArn(bean.getArn());
        AgreementEvent event = new AgreementEvent();
        event.setKey(key);
        event.setType(agrEvent);
        return event;
    }

    private AgreementEventType createAgreementEvent(EventKey key) {
        return (AgreementEventType) dao.getSoaInterfaceSessionFactory().getCurrentSession()
                .getNamedQuery("domain.businessEvent.agreementKey").setParameter(0, key.getBeDataId())
                .setResultTransformer(Transformers.aliasToBean((AgreementEventType.class))).list().get(0);
    }
}
