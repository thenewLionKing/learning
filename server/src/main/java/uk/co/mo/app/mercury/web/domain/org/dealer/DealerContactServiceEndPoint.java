package uk.co.mo.app.mercury.web.domain.org.dealer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerPersonnelBean;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerContactService;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerValidationException;



@WebService(serviceName="DealerContactService", targetNamespace = "http://xmlns.mo.co.uk/ApplicationServices/mercury/org/dealer")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL)
public class DealerContactServiceEndPoint extends SpringBeanAutowiringSupport {
	
    private static final Log LOG = LogFactory.getLog(DealerContactServiceEndPoint.class);

    @Autowired
    @Qualifier("dealerContactServiceEJB")
    private DealerContactService dcs;
    
    @WebMethod(operationName = "AddDealerContact")
    public void addDealerContact(@WebParam (name="personnelBean") DealerPersonnelBean personnelBean) throws DealerValidationException{
    	dcs.addDealerContact(personnelBean);
    }
    
    @WebMethod(operationName = "UpdateDealerContact")
    public void updateDealerContact(@WebParam (name="personnelBean") DealerPersonnelBean personnelBean) throws DealerValidationException{
    	dcs.updateDealerContact(personnelBean);
    }

}
