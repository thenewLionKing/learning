package uk.co.mo.app.mercury.web.domain.vehicle;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptFittersContactBean;
import uk.co.mo.app.mercury.domain.vehicle.service.AdaptFittersContactService;

@WebService(serviceName="AdaptationInstallerContactService", targetNamespace = "http://xmlns.mo.co.uk/legacy/domain/vehicle")
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL)
public class AdaptFittersContactServiceEndpoint extends SpringBeanAutowiringSupport {
    private static final Log LOG = LogFactory.getLog(AdaptFittersContactServiceEndpoint.class);

    @Autowired
    @Qualifier("adaptationInstallerContactServiceEJB")
    private AdaptFittersContactService afcs;

    @WebMethod(operationName = "AddAdaptFittersContact")
    public void addAdaptFittersContact(@WebParam (name="adaptFittersContactBean") AdaptFittersContactBean adaptFittersContactBean) {
        LOG.debug("AdaptFittersContactServiceEndpoint :: addAdaptFittersContact");
        afcs.addAdaptFittersContact(adaptFittersContactBean);
    }
    
    @WebMethod(operationName= "UpdateAdaptFittersContact")
    public void updateAdaptFittersContact(@WebParam (name="adaptFittersContactBean") AdaptFittersContactBean adaptFittersContactBean) {
    	LOG.debug("AdaptFittersContactServiceEndpoint :: updateAdaptFittersContact");
    	afcs.updateAdaptFittersContact(adaptFittersContactBean);
    }
    
}
