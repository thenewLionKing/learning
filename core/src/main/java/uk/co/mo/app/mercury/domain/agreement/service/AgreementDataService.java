package uk.co.mo.app.mercury.domain.agreement.service;

import uk.co.mo.app.mercury.domain.DomainEntityCountService;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementBean;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementExtensionAuditBean;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementExtensionBean;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementPreviousPartiesBean;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementProcBean;

/**
 * <p/>
 * User: prabat
 * Date: 13/06/11
 * Time: 12:30
 * <p/>
 * Change Log - Who : When : Comment
 */
public interface AgreementDataService extends DomainEntityCountService {

    public AgreementBean getAgreementByArn(String arn);
    public AgreementBean getAgreementByPK(Integer id);
    public AgreementProcBean getAgreementInfo(Integer recordId, String eventId);
    public AgreementPreviousPartiesBean getAgreementPreviousParties(String eventId);
	public AgreementExtensionBean getAgreementExtensions(Integer id);
	public AgreementExtensionAuditBean getAgreementExtensionsAudit(Integer id);
}
