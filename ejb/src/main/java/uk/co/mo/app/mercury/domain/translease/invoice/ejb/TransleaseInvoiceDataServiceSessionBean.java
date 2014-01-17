package uk.co.mo.app.mercury.domain.translease.invoice.ejb;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlInvoiceCreditBean;
import uk.co.mo.app.mercury.domain.translease.invoice.exception.InvoiceCreditEntryAlreadyExistsException;
import uk.co.mo.app.mercury.domain.translease.invoice.service.TransleaseInvoiceDataService;
import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;

@Stateless(mappedName="mercury/ejb", name="TransleaseInvoiceDataServiceEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class TransleaseInvoiceDataServiceSessionBean implements TransleaseInvoiceDataServiceSessionBeanRemote, TransleaseInvoiceDataServiceSessionBeanLocal {

	private static final Log LOG = LogFactory.getLog(TransleaseInvoiceDataServiceSessionBean.class);

    @Autowired
    @Qualifier("transleaseInvoiceDataService")
    private TransleaseInvoiceDataService invoiceDataService;

    @Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void addInvoice(TlInvoiceCreditBean tlInvoiceCreditBean)
			throws TransactionNotFoundException, InvoiceCreditEntryAlreadyExistsException {
    	LOG.debug("invoiceDataService.addInvoice( tlInvoiceCreditBean );");
    	invoiceDataService.addInvoice( tlInvoiceCreditBean );
	}
}
