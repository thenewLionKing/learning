package uk.co.mo.app.mercury.domain.agreement.ejb;


import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import uk.co.mo.app.mercury.domain.agreement.beans.AgreementBean;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementExtensionAuditBean;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementExtensionBean;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementPreviousPartiesBean;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementProcBean;
import uk.co.mo.app.mercury.domain.agreement.service.AgreementDataService;

/**
 * <p/>
 * User: amitm
 * Date: 19-May-2011
 * Time: 12:45:25
 * <p/>
 * Change Log - Who : When : Comment
 */
@Stateless(mappedName="mercury/ejb", name = "AgreementDataServiceEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class AgreementDataServiceSessionBean implements AgreementDataServiceSessionBeanRemote, AgreementDataServiceSessionBeanLocal {

    private static final Log LOG = LogFactory.getLog(AgreementDataServiceSessionBean.class);

    @Autowired
    @Qualifier("agreementDataService")
    private AgreementDataService ads;

    @TransactionAttribute(TransactionAttributeType.NEVER)
    public AgreementBean getAgreementByArn(String arnNumber){
    	LOG.debug("Got ejb call on AgreementDataServiceSessionBean :: getAgreementByArn");
		return ads.getAgreementByArn(arnNumber);
    }

	@TransactionAttribute(TransactionAttributeType.NEVER)
	public AgreementProcBean getAgreementInfo(Integer recordId, String eventId) {
		LOG.debug("Got ejb call on AgreementDataServiceSessionBean :: getAgreementInfo");
		return ads.getAgreementInfo(recordId, eventId);
	}

    @TransactionAttribute(TransactionAttributeType.NEVER)
    public AgreementPreviousPartiesBean getAgreementPreviousParties(String eventId) {
        return ads.getAgreementPreviousParties(eventId);
    }

    @TransactionAttribute(TransactionAttributeType.NEVER)
	public AgreementBean getAgreementByPK(Integer id) {
    	LOG.debug("Got ejb call on AgreementDataServiceSessionBean :: getAgreementByPK");
		return ads.getAgreementByPK(id);
	}

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public long countAllRecords() {
        return ads.countAllRecords();
    }

    @TransactionAttribute(TransactionAttributeType.NEVER)
	public AgreementExtensionBean getAgreementExtensions(Integer id) {
    	LOG.debug("Got ejb call on AgreementDataServiceSessionBean :: getAgreementExtensions");
		return ads.getAgreementExtensions(id);
	}

    @TransactionAttribute(TransactionAttributeType.NEVER)
	public AgreementExtensionAuditBean getAgreementExtensionsAudit(Integer id) {
    	LOG.debug("Got ejb call on AgreementDataServiceSessionBean :: getAgreementExtensionsAudit");
		return ads.getAgreementExtensionsAudit(id);	
	}
}
