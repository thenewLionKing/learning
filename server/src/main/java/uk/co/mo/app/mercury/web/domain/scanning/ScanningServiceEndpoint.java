package uk.co.mo.app.mercury.web.domain.scanning;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import uk.co.mo.app.mercury.domain.scanning.beans.ProfileBean;
import uk.co.mo.app.mercury.domain.scanning.service.ScanningService;

/**
 * <p/>
 * User: amitm
 * Date: 13-May-2011
 * Time: 13:34:59
 * <p/>
 * Change Log - Who : When : Comment
 */

@WebService(serviceName="ScanningService", targetNamespace = "http://xmlns.mo.co.uk/legacy/domain/scanning")
public class ScanningServiceEndpoint extends SpringBeanAutowiringSupport {

    private static final Log LOG = LogFactory.getLog(ScanningServiceEndpoint.class);

    @Autowired
    @Qualifier("scanningServiceEJB")
    private ScanningService ss;

    @WebMethod(operationName = "GetDocumentInformationByDocNumber")
    public ProfileBean getDocumentInformationByDocNumber(@WebParam (name="docNumber")Integer docNumber) {
        LOG.debug(ss);
        return ss.getDocumentInformationByDocNumber(docNumber);
    }
}
