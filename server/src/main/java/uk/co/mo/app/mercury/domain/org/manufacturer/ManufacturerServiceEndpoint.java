package uk.co.mo.app.mercury.domain.org.manufacturer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import uk.co.mo.app.mercury.domain.org.manufacturer.beans.ManufacturerBean;
import uk.co.mo.app.mercury.domain.org.manufacturer.service.ManufacturerService;


@WebService(serviceName="ManufacturerService", targetNamespace = "http://xmlns.mo.co.uk/ApplicationServices/mercury/org/manufacturer")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL)
public class ManufacturerServiceEndpoint extends SpringBeanAutowiringSupport {

	
    private static final Log LOG = LogFactory.getLog(ManufacturerServiceEndpoint.class);

    @Autowired
    @Qualifier("manufacturerServiceEJB")
    private ManufacturerService ms;

    @WebMethod(operationName = "AddManufacturer")
    public void addManufacturer(@WebParam (name="ManufacturerBean")  ManufacturerBean manufacturerBean){
        LOG.debug("ManufacturerServiceEndpoint :: addManufacturer");
        ms.addManufacturer(manufacturerBean);
    }
    
    @WebMethod(operationName = "UpdateManufacturer")
    public void updateManufacturer(@WebParam (name="ManufacturerBean")  ManufacturerBean manufacturerBean){
    	LOG.debug("ManufacturerServiceEndpoint :: updateManufacturer");
        ms.updateManufacturer(manufacturerBean);
    }
    
}
