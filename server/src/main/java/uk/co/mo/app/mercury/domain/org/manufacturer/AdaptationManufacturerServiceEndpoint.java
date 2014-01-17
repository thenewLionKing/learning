package uk.co.mo.app.mercury.domain.org.manufacturer;

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

import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptManufacturerBean;
import uk.co.mo.app.mercury.domain.vehicle.service.AdaptationManufacturerService;

@WebService(serviceName="AdaptationManufacturerService", targetNamespace = "http://xmlns.mo.co.uk/legacy/domain/vehicle")
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL)
public class AdaptationManufacturerServiceEndpoint extends SpringBeanAutowiringSupport {
    private static final Log LOG = LogFactory.getLog(AdaptationManufacturerServiceEndpoint.class);

    @Autowired
    @Qualifier("adaptationManufacturerServiceEJB")
    private AdaptationManufacturerService ams;

    @WebMethod(operationName = "AddAdaptationManufacturer")
    public void addAdaptationManufacturer(@WebParam (name="adaptationManufacturerBean") AdaptManufacturerBean adaptManufacturerBean) {
        LOG.debug("AdaptationManufacturerServiceEndpoint :: addAdaptationManufacturer");
        ams.addAdaptationManufacturer(adaptManufacturerBean);
    }
    
    @WebMethod(operationName= "UpdateAdaptationManufacturer")
    public void updateAdaptationManufacturer(@WebParam (name="adaptationManufacturerBean") AdaptManufacturerBean adaptManufacturerBean) {
    	LOG.debug("AdaptationManufacturerServiceEndpoint :: updateAdaptationManufacturer");
    	ams.updateAdaptationManufacturer(adaptManufacturerBean);
    }
}
