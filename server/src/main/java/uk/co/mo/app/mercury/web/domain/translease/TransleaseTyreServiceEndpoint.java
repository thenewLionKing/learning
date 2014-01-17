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

import uk.co.mo.app.mercury.domain.translease.invoice.exception.InvoiceCreditEntryNotFoundException;
import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;
import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlNonTyreItemBean;
import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlTyreBean;
import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlTyreItemBean;
import uk.co.mo.app.mercury.domain.translease.tyre.entity.TlFastFitProductEntity;
import uk.co.mo.app.mercury.domain.translease.tyre.exception.FastFitProductCodeNotFoundException;
import uk.co.mo.app.mercury.domain.translease.tyre.service.TransleaseTyreDataService;

@WebService(serviceName="TransleaseTyreService", targetNamespace = "http://xmlns.mo.co.uk/legacy/domain/translease")
public class TransleaseTyreServiceEndpoint extends SpringBeanAutowiringSupport {

    private static final Log LOG = LogFactory.getLog(TransleaseTyreServiceEndpoint.class);

    @Autowired
    @Qualifier("transleaseTyreDataServiceEJB")
    private TransleaseTyreDataService tlTyreDataService;

    @WebMethod(operationName = "AddTyres")
	public void addTyres(@WebParam(name="tyreBeans")List <TlTyreBean> tlTyreBeans, @WebParam(name="tyreItemBeans")List <TlTyreItemBean> tlTyreItemBeans, @WebParam(name="nonTyreItemBeans")List <TlNonTyreItemBean> tlNonTyreItemBeans ) throws TransactionNotFoundException, InvoiceCreditEntryNotFoundException, FastFitProductCodeNotFoundException {
    	LOG.debug( "addTyres" );
    	tlTyreDataService.addTyres( tlTyreBeans, tlTyreItemBeans, tlNonTyreItemBeans );
    }
}
