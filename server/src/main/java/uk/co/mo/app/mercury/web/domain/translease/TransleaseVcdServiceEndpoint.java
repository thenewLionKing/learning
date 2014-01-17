package uk.co.mo.app.mercury.web.domain.translease;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;
import uk.co.mo.app.mercury.domain.translease.vcd.beans.TlVcdBean;
import uk.co.mo.app.mercury.domain.translease.vcd.service.TlVcdDataService;

@WebService(serviceName="TransleaseVcdService", targetNamespace = "http://xmlns.mo.co.uk/legacy/domain/translease")
public class TransleaseVcdServiceEndpoint extends SpringBeanAutowiringSupport {

    private static final Log LOG = LogFactory.getLog(TransleaseVcdServiceEndpoint.class);

    @Autowired
    @Qualifier("transleaseVcdDataServiceEJB")
    private TlVcdDataService tlVcdDataService;

    @WebMethod(operationName = "AddVcd")
	public void addVcd(@WebParam(name="vcdBean") TlVcdBean tlVcdBean) throws TransactionNotFoundException {
    	LOG.debug( "addVCD" );
    	tlVcdDataService.addVcd( tlVcdBean );
    }
    
    @WebMethod(operationName = "AddVcds")
	public void addVcds(@WebParam(name="vcdBean")List < TlVcdBean > tlVcdBeans) throws TransactionNotFoundException {
    	LOG.debug( "addVCDs" );
    	tlVcdDataService.addVcds( tlVcdBeans );
    }
}
