package uk.co.mo.app.mercury.domain.serviceagent.exception;

import javax.xml.ws.WebFault;

@WebFault
public class ServiceAgentNotFoundException extends Exception {

	private static final long serialVersionUID = -3852894211704602689L;

	private static final String NOT_FOUND_STR = "Service Agent not found ";

    public ServiceAgentNotFoundException(String number) {
        super( NOT_FOUND_STR+" "+number );
    }
}
