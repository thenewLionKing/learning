package uk.co.mo.app.mercury.domain.event;

import java.io.IOException;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.common.AgreementEventSubType;
import uk.co.mo.app.mercury.domain.common.ScanningEventSubType;

/**
 * <p/>
 * User: prabat
 * Date: 14/06/11
 * Time: 08:06
 * <p/>
 * Change Log - Who : When : Comment
 */
public class XMLEventMarshallerTest extends AbstractJunit4Test {

    private static final Log LOG = LogFactory.getLog(XMLEventMarshallerTest.class);

    @Autowired
    private MarshallEvent marshaller;

    @Test
    public void testAgreementEvent() throws IOException {
        EventKey key = getEventKey();
        AgreementEventType agrEvent = new AgreementEventType();
        agrEvent.setAgreementId(3412321);
        agrEvent.setArn("3434234234");
        agrEvent.setRecordId(334545345);
        agrEvent.setType(AgreementEventSubType.AGREEMENT_TERMINATED);
        AgreementEvent event = new AgreementEvent();
        event.setKey(key);
        event.setType(agrEvent);
        LOG.debug(marshaller.serialiseEvent(event));
    }

    private EventKey getEventKey() {
        EventKey key = new EventKey();
        key.setBeId(1232);
        key.setBeDataId(12344);
        key.setEventDate(new Date());
        key.setEventSeqNo(1);
        key.setEventTypeId((short)1);
        return key;
    }

    @Test
    public void testCustomerEvent() throws IOException {
        EventKey key = getEventKey();
        CustomerEvent event = new CustomerEvent();
        event.setKey(key);
        CustomerEventType cusEvent = new CustomerEventType();
        cusEvent.setCrn("1234");
        event.setType(cusEvent);
        LOG.debug(marshaller.serialiseEvent(event));
    }

    
    @Test
    public void testScanningEvent() throws IOException {
        EventKey key = getEventKey();
        ScanningEvent event = new ScanningEvent();
        event.setKey(key);
        ScanningEventType scaEvent = new ScanningEventType();
        scaEvent.setDocNumber("1234");
        scaEvent.setType(ScanningEventSubType.SCANNING);
        event.setType(scaEvent);
        LOG.debug(marshaller.serialiseEvent(event));
    }

    @Test
    public void testVehicleEvent() throws IOException {
        EventKey key = getEventKey();
        VehicleEvent event = new VehicleEvent();
        event.setKey(key);
        VehicleEventType vehEvent = new VehicleEventType();
        vehEvent.setAssetNumber(1234);
        vehEvent.setAgreementId(5544545);
        vehEvent.setVehicleRecordId(254545);
        vehEvent.setAgreementRecordId(454545);
        vehEvent.setRegistrationNumber("VFG 6575");
        event.setType(vehEvent);
        LOG.debug(marshaller.serialiseEvent(event));
    }
    
    @Override
    protected void setup() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected void destroy() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
