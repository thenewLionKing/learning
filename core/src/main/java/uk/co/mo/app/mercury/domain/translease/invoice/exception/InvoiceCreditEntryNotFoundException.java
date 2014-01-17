package uk.co.mo.app.mercury.domain.translease.invoice.exception;

import javax.xml.ws.WebFault;

@WebFault()
public class InvoiceCreditEntryNotFoundException extends Exception {

	private static final long serialVersionUID = -3852894211704602689L;

	private static final String NOT_FOUND_STR = "Invoice Credit entry not found, with transaction number:";

    public InvoiceCreditEntryNotFoundException(String transactionNumber) {
        super( NOT_FOUND_STR+" "+transactionNumber );
    }
}
