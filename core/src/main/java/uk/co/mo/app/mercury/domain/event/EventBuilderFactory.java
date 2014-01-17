package uk.co.mo.app.mercury.domain.event;

import org.springframework.stereotype.Component;

/**
 * <p/>
 * User: prabat
 * Date: 13/06/11
 * Time: 13:01
 * <p/>
 * Change Log - Who : When : Comment
 */
@Component
public class EventBuilderFactory {

	AgreementSubEventChain agreementChain = new AgreementSubEventChain();
	CustomerSubEventChain customerChain = new CustomerSubEventChain();
	VehicleSubEventChain vehicleChain = new VehicleSubEventChain();
	ScanningSubEventChain scanningChain = new ScanningSubEventChain(); 
	
    private EventBuilderFactory() {
    }
    
    private void setChain(){
    	agreementChain.setSuccessor(customerChain);
    	customerChain.setSuccessor(scanningChain);
    	scanningChain.setSuccessor(vehicleChain);
    }
    
    
    
    public EventBuilder getEventBuilder(EventKey key) throws UnknownEventException {
    	setChain();
    	return agreementChain.processRequest(key);
    }
}
