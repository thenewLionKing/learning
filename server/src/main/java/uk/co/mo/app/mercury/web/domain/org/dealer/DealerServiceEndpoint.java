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

import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerBean;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerDataService;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerNotFoundException;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerValidationException;

/**
 * <p/>
 * User: prabat
 * Date: 13-May-2011
 * Time: 13:34:59
 * <p/>
 * Change Log - Who : When : Comment
 */

@WebService(serviceName="DealerService", targetNamespace = "http://xmlns.mo.co.uk/ApplicationServices/mercury/org/dealer")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL)
public class DealerServiceEndpoint extends SpringBeanAutowiringSupport {

    private static final Log LOG = LogFactory.getLog(DealerServiceEndpoint.class);

    @Autowired
    @Qualifier("dealerDataServiceEJB")
    private DealerDataService dds;

    @WebMethod(operationName = "AddDealer")
    public void addDealer(@WebParam (name="DealerBean") DealerBean agent) throws DealerValidationException {
        LOG.debug(dds);
        dds.addDealer(agent);
    }

    @WebMethod(operationName = "UpdateDealer")
    public void updateDealer(@WebParam (name="DealerBean")  DealerBean agent) throws DealerValidationException {
        LOG.debug(dds);
        dds.updateDealer(agent);
    }
    
    @WebMethod(operationName = "GetDealer")
    public DealerBean getDealer(@WebParam (name="agentId")  String agentId) throws DealerNotFoundException {
        LOG.debug(dds);
        return dds.getDealer(agentId);
    }
    

}
