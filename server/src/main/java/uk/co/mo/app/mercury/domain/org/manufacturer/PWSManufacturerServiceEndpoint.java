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

import uk.co.mo.app.mercury.domain.org.manufacturer.beans.ProductMakeBean;
import uk.co.mo.app.mercury.domain.org.manufacturer.service.PWSManufacturerService;


@WebService(serviceName="PWSManufacturerService", targetNamespace = "http://xmlns.mo.co.uk/ApplicationServices/mercury/org/pwsmanufacturer")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL)
public class PWSManufacturerServiceEndpoint extends SpringBeanAutowiringSupport {

	
    private static final Log LOG = LogFactory.getLog(PWSManufacturerServiceEndpoint.class);

    @Autowired
    @Qualifier("pwsmanufacturerServiceEJB")
    private PWSManufacturerService pwsms;

    @WebMethod(operationName = "AddManufacturer")
    public void addPWSManufacturer(@WebParam (name="productMakeBean")  ProductMakeBean productMakeBean){
        LOG.debug("PWSManufacturerServiceEndpoint :: addManufacturer");
        pwsms.addPWSManufacturer(productMakeBean);
    }
    
    @WebMethod(operationName = "UpdateManufacturer")
    public void updatePWSManufacturer(@WebParam (name="productMakeBean")  ProductMakeBean productMakeBean){
    	LOG.debug("PWSManufacturerServiceEndpoint :: updateManufacturer");
    	pwsms.updatePWSManufacturer(productMakeBean);
    }
}
