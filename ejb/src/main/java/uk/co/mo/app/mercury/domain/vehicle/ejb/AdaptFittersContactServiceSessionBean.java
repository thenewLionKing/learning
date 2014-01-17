package uk.co.mo.app.mercury.domain.vehicle.ejb;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptFittersContactBean;
import uk.co.mo.app.mercury.domain.vehicle.service.AdaptFittersContactService;

/**
 * <p/>
 * User: amitm
 * Date: 19-May-2011
 * Time: 12:45:25
 * <p/>
 * Change Log - Who : When : Comment
 */
@Stateless(mappedName="mercury/ejb", name = "AdaptationInstallerContactServiceEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class AdaptFittersContactServiceSessionBean implements AdaptFittersContactServiceSessionBeanRemote, AdaptFittersContactServiceSessionBeanLocal {

    private static final Log LOG = LogFactory.getLog(AdaptFittersContactServiceSessionBean.class);

    @Autowired
    @Qualifier("AdaptationInstallerContactService")
    private AdaptFittersContactService afcs;

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void addAdaptFittersContact(AdaptFittersContactBean adaptFittersContactBean){
		LOG.debug("AdaptFittersContactServiceSessionBean :: addAdaptFittersContact");
		afcs.addAdaptFittersContact(adaptFittersContactBean);
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateAdaptFittersContact( AdaptFittersContactBean adaptFittersContactBean) {
		LOG.debug("AdaptFittersContactServiceSessionBean :: updateAdaptFittersContact");
		afcs.updateAdaptFittersContact(adaptFittersContactBean);		
	}
}
