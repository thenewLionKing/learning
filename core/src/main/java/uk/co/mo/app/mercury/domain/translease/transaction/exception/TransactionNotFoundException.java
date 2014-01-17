package uk.co.mo.app.mercury.domain.translease.transaction.exception;

import javax.xml.ws.WebFault;

@WebFault()
public class TransactionNotFoundException extends Exception {

	private static final long serialVersionUID = -3852894211704602689L;

	private static final String NOT_FOUND_STR = "Transaction not found:";
	
    public TransactionNotFoundException(String transactionNumber) {
        super( NOT_FOUND_STR+" "+transactionNumber );
    }
}
