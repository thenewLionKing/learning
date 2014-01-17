package uk.co.mo.app.mercury.domain.translease.transaction.ejb;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import uk.co.mo.app.mercury.domain.translease.transaction.beans.TlTransactionBean;
import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;
import uk.co.mo.app.mercury.domain.translease.transaction.service.TransleaseTransactionDataService;

@Stateless(mappedName="mercury/ejb", name="TransleaseTransactionDataServiceEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class TransleaseTransactionDataServiceSessionBean implements TransleaseTransactionDataServiceSessionBeanRemote, TransleaseTransactionDataServiceSessionBeanLocal {

	private static final Log LOG = LogFactory.getLog(TransleaseTransactionDataServiceSessionBean.class);

	@Autowired
    @Qualifier("transleaseTransactionDataService")
    private TransleaseTransactionDataService transleaseTransactionService;

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void addTransaction(TlTransactionBean tlTransactionBean) {
        LOG.debug("Got ejb call on TransleaseTransactionDataService.addTransaction()");
        transleaseTransactionService.addTransaction( tlTransactionBean );
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public TlTransactionBean findTransaction(Integer transactionNumber)
			throws TransactionNotFoundException {
		return transleaseTransactionService.findTransaction( transactionNumber );
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void cancelTransaction(Integer transactionNumber)
			throws TransactionNotFoundException {
		transleaseTransactionService.cancelTransaction( transactionNumber );		
	}

	@Override
	public void updateTransaction(TlTransactionBean tlTransactionBean)
			throws TransactionNotFoundException {
		transleaseTransactionService.updateTransaction( tlTransactionBean );
	}

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void deleteTransaction(Integer transactionNumber) throws TransactionNotFoundException {
        transleaseTransactionService.deleteTransaction(transactionNumber);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void upsertTransaction(TlTransactionBean tlTransactionBean)
			throws TransactionNotFoundException {
        LOG.debug("Got ejb call on TransleaseTransactionDataService.upsertTransaction()");
        transleaseTransactionService.addTransaction( tlTransactionBean );
	}
}
