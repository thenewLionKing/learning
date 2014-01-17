package uk.co.mo.app.mercury.web.domain.translease;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlInvoiceCreditBean;
import uk.co.mo.app.mercury.domain.translease.invoice.exception.InvoiceCreditEntryAlreadyExistsException;
import uk.co.mo.app.mercury.domain.translease.invoice.service.TransleaseInvoiceDataService;
import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;

@WebService(serviceName="TransleaseInvoiceService", targetNamespace = "http://xmlns.mo.co.uk/legacy/domain/translease")
public class TransleaseInvoiceServiceEndpoint extends SpringBeanAutowiringSupport {

    private static final Log LOG = LogFactory.getLog(TransleaseInvoiceServiceEndpoint.class);

    @Autowired
    @Qualifier("transleaseInvoiceDataServiceEJB")
    private TransleaseInvoiceDataService invoiceDataService;

    @WebMethod(operationName = "AddInvoice")
	public void addInvoice(@WebParam(name="invoiceBean") TlInvoiceCreditBean tlInvoiceCreditBean) throws TransactionNotFoundException, InvoiceCreditEntryAlreadyExistsException {
    	LOG.debug("addInvoice");
    	invoiceDataService.addInvoice( tlInvoiceCreditBean );
    }
}
