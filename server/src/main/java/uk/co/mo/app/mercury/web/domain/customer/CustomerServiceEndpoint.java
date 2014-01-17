package uk.co.mo.app.mercury.web.domain.customer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import uk.co.mo.app.mercury.domain.customer.beans.CustomerBean;
import uk.co.mo.app.mercury.domain.customer.service.CustomerDataService;

/**
 * <p/>
 * User: amitm
 * Date: 13-May-2011
 * Time: 13:34:59
 * <p/>
 * Change Log - Who : When : Comment
 */

@WebService(serviceName="CustomerService", targetNamespace = "http://xmlns.mo.co.uk/legacy/domain/customer")
public class CustomerServiceEndpoint extends SpringBeanAutowiringSupport {

    private static final Log LOG = LogFactory.getLog(CustomerServiceEndpoint.class);

    @Autowired
    @Qualifier("customerDataServiceEJB")
    private CustomerDataService cds;

    @WebMethod(operationName = "GetCustomerByCustomerId")
    public CustomerBean getCustomerByCustomerId(@WebParam (name="customerId")String customerId) {
        LOG.debug(cds);
        return cds.getCustomerData(customerId);
    }
    
    @WebMethod(operationName = "GetCustomerByCRN")
    public CustomerBean getCustomerByCRNNumber(@WebParam (name="crnNumber")String crnNumber) {
        LOG.debug(cds);
        return cds.getCustomerDataByCRN(crnNumber);
    }
    
}
