package uk.co.mo.app.mercury.domain.customer.ejb;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import uk.co.mo.app.mercury.domain.customer.beans.CustomerBean;
import uk.co.mo.app.mercury.domain.customer.service.CustomerDataService;

/**
 * <p/>
 * User: prabat
 * Date: 19-May-2011
 * Time: 12:45:25
 * <p/>
 * Change Log - Who : When : Comment
 */
@Stateless(mappedName="mercury/ejb", name = "CustomerDataServiceEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class CustomerDataServiceSessionBean implements CustomerDataServiceSessionBeanRemote, CustomerDataServiceSessionBeanLocal {

    private static final Log LOG = LogFactory.getLog(CustomerDataServiceSessionBean.class);

    @Autowired
    @Qualifier("customerDataService")
    private CustomerDataService cds;

	@Override
	@TransactionAttribute(TransactionAttributeType.NEVER)
	public CustomerBean getCustomerData(String customerId){
		return cds.getCustomerData(customerId);
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NEVER)
	public CustomerBean getCustomerDataByCRN(String crnNumber){
		return cds.getCustomerDataByCRN(crnNumber);
	}

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public long countAllRecords() {
        return cds.countAllRecords();
    }
}
