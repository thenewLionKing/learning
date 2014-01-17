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

import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptManufacturerBean;
import uk.co.mo.app.mercury.domain.vehicle.service.AdaptationManufacturerService;

/**
 * <p/>
 * User: amitm
 * Date: 19-May-2011
 * Time: 12:45:25
 * <p/>
 * Change Log - Who : When : Comment
 */
@Stateless(mappedName="mercury/ejb", name = "AdaptationManufacturerServiceEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class AdaptationManufacturerServiceSessionBean implements AdaptationManufacturerServiceSessionBeanRemote, AdaptationManufacturerServiceSessionBeanLocal {

    private static final Log LOG = LogFactory.getLog(AdaptationManufacturerServiceSessionBean.class);

    @Autowired
    @Qualifier("AdaptationManufacturerService")
    private AdaptationManufacturerService ams;

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void addAdaptationManufacturer(AdaptManufacturerBean adaptManufacturerBean){
		LOG.debug("AdaptFittersContactServiceSessionBean :: addAdaptFittersContact");
		ams.addAdaptationManufacturer(adaptManufacturerBean);
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateAdaptationManufacturer(AdaptManufacturerBean adaptManufacturerBean) {
		LOG.debug("AdaptFittersContactServiceSessionBean :: updateAdaptFittersContact");
		ams.updateAdaptationManufacturer(adaptManufacturerBean);		
	}
}
