package uk.co.mo.app.mercury.domain.org.dealer.ejb;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerBean;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerDataService;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerNotFoundException;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerValidationException;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

/**
 * <p/>
 * User: prabat
 * Date: 19-May-2011
 * Time: 12:45:25
 * <p/>
 * Change Log - Who : When : Comment
 */
@Stateless(mappedName="mercury/ejb", name = "DealerDataServiceEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class DealerDataServiceSessionBean implements DealerDataServiceSessionBeanRemote, DealerDataServiceSessionBeanLocal {

    private static final Log LOG = LogFactory.getLog(DealerDataServiceSessionBean.class);

    @Autowired
    @Qualifier("dealerDataService")
    private DealerDataService dds;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void addDealer(DealerBean agent) throws DealerValidationException {
        LOG.debug("Got ejb call on DealerDataService ::addDealer ");
        dds.addDealer(agent);
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void updateDealer(DealerBean agent) throws DealerValidationException {
        LOG.debug("Got ejb call on DealerDataService :: updateDealer");
        dds.updateDealer(agent);
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public DealerBean getDealer(String agentId) throws DealerNotFoundException {
    	LOG.debug("Got ejb call on DealerDataService :: getDealer");
		return dds.getDealer(agentId);
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public long countAllRecords() {
        return dds.countAllRecords();
    }
}
