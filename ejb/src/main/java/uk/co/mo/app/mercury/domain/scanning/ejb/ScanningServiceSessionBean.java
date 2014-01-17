package uk.co.mo.app.mercury.domain.scanning.ejb;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import uk.co.mo.app.mercury.domain.scanning.beans.ProfileBean;
import uk.co.mo.app.mercury.domain.scanning.service.ScanningService;

/**
 * <p/>
 * User: amitm
 * Date: 19-May-2011
 * Time: 12:45:25
 * <p/>
 * Change Log - Who : When : Comment
 */
@Stateless(mappedName="mercury/ejb", name = "ScanningServiceEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class ScanningServiceSessionBean implements ScanningServiceSessionBeanRemote, ScanningServiceSessionBeanLocal {

    private static final Log LOG = LogFactory.getLog(ScanningServiceSessionBean.class);

    @Autowired
    @Qualifier("ScanningService")
    private ScanningService ss;

	@Override
	@TransactionAttribute(TransactionAttributeType.NEVER)
	public ProfileBean getDocumentInformationByDocNumber(Integer docNumber) {
		LOG.debug("In ScanningServiceSessionBean :: getDocumentInformationByDocNumber");
		return ss.getDocumentInformationByDocNumber(docNumber);
	}
}
