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

import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptFitterBean;
import uk.co.mo.app.mercury.domain.vehicle.service.AdaptFitterService;

/**
 * <p/>
 * User: amitm
 * Date: 19-May-2011
 * Time: 12:45:25
 * <p/>
 * Change Log - Who : When : Comment
 */
@Stateless(mappedName="mercury/ejb", name = "AdaptationInstallerServiceEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class AdaptFitterServiceSessionBean implements AdaptFitterServiceSessionBeanRemote, AdaptFitterServiceSessionBeanLocal {

    private static final Log LOG = LogFactory.getLog(AdaptFitterServiceSessionBean.class);

    @Autowired
    @Qualifier("AdaptationInstallerService")
    private AdaptFitterService afs;

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void addAdaptFitters(AdaptFitterBean adaptFitterBean){
		LOG.debug("AdaptFitterServiceSessionBean :: addAdaptFitters");
		afs.addAdaptFitters(adaptFitterBean);
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateAdaptFitters(AdaptFitterBean adaptFitterBean) {
		LOG.debug("AdaptFitterServiceSessionBean :: updateAdaptFitters");
		afs.updateAdaptFitters(adaptFitterBean);
	}
	
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public AdaptFitterBean getAdaptFitter(Integer fitterId) {
    	LOG.debug("Got ejb call on AdaptFitterService :: getAdaptFitter");
		return afs.getAdaptFitter(fitterId);
    }
}
