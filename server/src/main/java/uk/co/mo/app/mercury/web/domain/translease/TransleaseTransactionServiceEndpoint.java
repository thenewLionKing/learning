package uk.co.mo.app.mercury.web.domain.translease;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import uk.co.mo.app.mercury.domain.translease.transaction.beans.TlTransactionBean;
import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;
import uk.co.mo.app.mercury.domain.translease.transaction.service.TransleaseTransactionDataService;

@WebService(serviceName="TransleaseTransactionService", targetNamespace = "http://xmlns.mo.co.uk/legacy/domain/translease")
public class TransleaseTransactionServiceEndpoint extends SpringBeanAutowiringSupport {

    private static final Log LOG = LogFactory.getLog(TransleaseTransactionServiceEndpoint.class);

    @Autowired
    @Qualifier("transleaseTransactionDataServiceEJB")
    private TransleaseTransactionDataService transactionDataService;

    @WebMethod(operationName = "AddTransaction")
	public void addTransaction(@WebParam(name="transactionBean")TlTransactionBean tlTransactionBean){
    	LOG.debug("addTransaction: service"+transactionDataService);
    	LOG.debug("TlTransactionBean: bean"+tlTransactionBean.toString());
    	transactionDataService.addTransaction( tlTransactionBean );
    }

    @WebMethod(operationName = "FindTransaction")
    @XmlElement(required=true)
	public TlTransactionBean findTransaction(@WebParam(name="transactionNumber") Integer transactionNumber) throws TransactionNotFoundException {
    	LOG.debug("Find Transaction no: "+transactionNumber);
    	return transactionDataService.findTransaction( transactionNumber );
    }

    @WebMethod(operationName = "CancelTransaction")
    @XmlElement(required=true)
	public void cancelTransaction(@WebParam(name="transactionNumber") Integer transactionNumber) throws TransactionNotFoundException {
    	LOG.debug("Cancel Transaction no: "+transactionNumber);
    	transactionDataService.cancelTransaction( transactionNumber );
    }

    @WebMethod(operationName = "UpdateTransaction")
    @XmlElement(required=true)
	public void updateTransaction(@WebParam(name="transactionBean")TlTransactionBean tlTransactionBean) throws TransactionNotFoundException {
    	LOG.debug("Update Transaction no: "+tlTransactionBean.getTransleaseTransactionNumber());
    	transactionDataService.updateTransaction( tlTransactionBean );
    }

    @WebMethod(operationName = "DeleteTransaction")
    @XmlElement(required=true)
	public void deleteTransaction(@WebParam(name="transactionNumber") Integer transactionNumber) throws TransactionNotFoundException {
    	LOG.debug("Delete Transaction no: "+transactionNumber);
    	transactionDataService.deleteTransaction( transactionNumber );
    }
    @WebMethod(operationName = "UpsertTransaction")
    @XmlElement(required=true)
	public void upsertTransaction(@WebParam(name="transactionBean") TlTransactionBean tlTransactionBean) throws TransactionNotFoundException {
    	LOG.debug("Upserting Transaction no: "+tlTransactionBean.getTransleaseTransactionNumber());
    	transactionDataService.upsertTransaction( tlTransactionBean );
    }
    
}
