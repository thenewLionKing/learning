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

import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerGroupBean;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerGroupService;


@WebService(serviceName="DealerGroupService", targetNamespace = "http://xmlns.mo.co.uk/ApplicationServices/mercury/org/dealer")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL)
public class DealerGroupServiceEndpoint extends SpringBeanAutowiringSupport {

	
    private static final Log LOG = LogFactory.getLog(DealerGroupServiceEndpoint.class);

    @Autowired
    @Qualifier("dealerGroupServiceEJB")
    private DealerGroupService dgs;

    @WebMethod(operationName = "AddDealerGroup")
    public void addDealerGroup(@WebParam (name="dealerGroupBean")  DealerGroupBean dealerGroupBean){
        LOG.debug("DealerGroupServiceEndpoint :: addDealerGroup");
        dgs.addDealerGroup(dealerGroupBean);
    }
    
    @WebMethod(operationName = "UpdateDealerGroup")
    public void updateDealerGroup(@WebParam (name="dealerGroupBean")  DealerGroupBean dealerGroupBean){
    	LOG.debug("DealerGroupServiceEndpoint :: udpateDealerGroup");
        dgs.updateDealerGroup(dealerGroupBean);
    }
    
}
