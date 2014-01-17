package uk.co.mo.app.mercury.domain.translease.tyre.exception;

import javax.xml.ws.WebFault;

@WebFault()
public class FastFitProductCodeNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	private static final String NOT_FOUND_STR = "Transaction not found:";
	
    public FastFitProductCodeNotFoundException(String productCode) {
        super( NOT_FOUND_STR+" " + productCode );
    }
}
