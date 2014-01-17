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

import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerGroupBean;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerGroupService;
import uk.co.mo.app.mercury.domain.vehicle.beans.VehicleBean;

/**
 * <p/>
 * User: amitm
 * Date: 19-May-2011
 * Time: 12:45:25
 * <p/>
 * Change Log - Who : When : Comment
 */
@Stateless(mappedName="mercury/ejb", name = "DealerGroupServiceEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class DealerGroupServiceSessionBean implements DealerGroupServiceSessionBeanRemote, DealerGroupServiceSessionBeanLocal {

    private static final Log LOG = LogFactory.getLog(DealerGroupServiceSessionBean.class);

    @Autowired
    @Qualifier("dealerGroupService")
    private DealerGroupService dgs;

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void addDealerGroup(DealerGroupBean dealerGroupBean){
		LOG.debug("DealerGroupServiceSessionBean :: addDealerGroup");
		dgs.addDealerGroup(dealerGroupBean);
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateDealerGroup(DealerGroupBean dealerGroupBean) {
		LOG.debug("DealerGroupServiceSessionBean :: updateDealerGroup");
		dgs.updateDealerGroup(dealerGroupBean);
	}
}
