package uk.co.mo.app.mercury.domain.agreement.ejb;


import javax.ejb.Remote;

import uk.co.mo.app.mercury.domain.agreement.service.AgreementDataService;

/**
 * <p/>
 * User: prabat
 * Date: 24-May-2011
 * Time: 14:14:12
 * <p/>
 * Change Log - Who : When : Comment
 */
@Remote
public interface AgreementDataServiceSessionBeanRemote extends AgreementDataService {
}
