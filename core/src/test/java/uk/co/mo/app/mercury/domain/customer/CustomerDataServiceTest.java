package uk.co.mo.app.mercury.domain.customer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.customer.beans.CustomerBean;
import uk.co.mo.app.mercury.domain.customer.service.CustomerDataService;


public class CustomerDataServiceTest extends AbstractJunit4Test{

    private static final Log LOG = LogFactory.getLog(CustomerDataServiceTest.class);

    @Autowired
    @Qualifier("customerDataService")
    private CustomerDataService cds;

    @Test
    public void testGetCustomerData() {

        try {
            CustomerBean customer = new CustomerBean();
            customer = cds.getCustomerData("117");
        } catch (Exception e) {
            LOG.debug("Caught exception ", e);
        }
    }
    
    @Test
    public void testGetCustomerDataByCRN() {

        try {
            CustomerBean customer = new CustomerBean();
            customer = cds.getCustomerDataByCRN("05480321");
        } catch (Exception e) {
            LOG.debug("Caught exception ", e);
        }
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
