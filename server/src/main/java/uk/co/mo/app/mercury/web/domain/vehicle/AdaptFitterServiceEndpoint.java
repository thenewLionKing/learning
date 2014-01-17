package uk.co.mo.app.mercury.web.domain.vehicle;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptFitterBean;
import uk.co.mo.app.mercury.domain.vehicle.service.AdaptFitterService;

@WebService(serviceName="AdaptationInstallerService", targetNamespace = "http://xmlns.mo.co.uk/legacy/domain/vehicle")
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL)
public class AdaptFitterServiceEndpoint extends SpringBeanAutowiringSupport {
    private static final Log LOG = LogFactory.getLog(AdaptFitterServiceEndpoint.class);

    @Autowired
    @Qualifier("adaptationInstallerServiceEJB")
    private AdaptFitterService afcs;

    @WebMethod(operationName = "AddAdaptFitters")
    public void addAdaptFitters(@WebParam (name="adaptFitterBean") AdaptFitterBean adaptFitterBean) {
        LOG.debug("AdaptFittersServiceEndpoint :: addAdaptFitters");
        afcs.addAdaptFitters(adaptFitterBean);
    }
    
    @WebMethod(operationName= "UpdateAdaptFitters")
    public void updateAdaptFitters(@WebParam (name="adaptFitterBean") AdaptFitterBean adaptFitterBean) {
    	LOG.debug("AdaptFittersServiceEndpoint :: updateAdaptFitters");
    	afcs.updateAdaptFitters(adaptFitterBean);
    }
    
    // JDC 
    @WebMethod(operationName= "GetAdaptFitter")
    public AdaptFitterBean getAdaptFitter(@WebParam (name="fitterId") Integer fitterId) {
    	LOG.debug("AdaptFittersServiceEndpoint :: getAdaptFitter");
    	return afcs.getAdaptFitter(fitterId); 
    }
    
    
}
