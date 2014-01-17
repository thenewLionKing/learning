package uk.co.mo.app.mercury.domain.org.dealer.ejb;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerPersonnelBean;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerContactService;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerValidationException;



@Stateless(mappedName="mercury/ejb", name = "DealerContactServiceEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class DealerContactServiceSessionBean implements DealerContactServiceSessionBeanLocal , DealerContactServiceSessionBeanRemote{

    private static final Log LOG = LogFactory.getLog(DealerContactServiceSessionBean.class);

    @Autowired
    @Qualifier("dealerContactService")
    private DealerContactService dcs;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void addDealerContact(DealerPersonnelBean agent) throws DealerValidationException {
        LOG.debug("Got ejb call on DealerContactService ::addDealerContact ");
        dcs.addDealerContact(agent);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateDealerContact(DealerPersonnelBean agent) throws DealerValidationException {
    	LOG.debug("Got ejb call on DealerContactService ::addDealerContact ");
        dcs.updateDealerContact(agent);
	}
}
