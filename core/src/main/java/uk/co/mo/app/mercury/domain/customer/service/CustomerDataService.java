package uk.co.mo.app.mercury.domain.customer.service;

import uk.co.mo.app.mercury.domain.DomainEntityCountService;
import uk.co.mo.app.mercury.domain.customer.beans.CustomerBean;



public interface CustomerDataService extends DomainEntityCountService {
	
	public CustomerBean getCustomerData(String customerId);
	public CustomerBean getCustomerDataByCRN(String crnNumber);

}
