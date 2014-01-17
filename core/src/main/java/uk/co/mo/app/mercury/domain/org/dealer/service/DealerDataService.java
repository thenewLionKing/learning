package uk.co.mo.app.mercury.domain.org.dealer.service;

import uk.co.mo.app.mercury.domain.DomainEntityCountService;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerBean;

/**
 * <p/>
 * User: prabat
 * Date: 13-May-2011
 * Time: 13:25:30
 * <p/>
 * Change Log - Who : When : Comment
 */
//
//


public interface DealerDataService extends DomainEntityCountService {

    public void addDealer(DealerBean agent) throws DealerValidationException;

    public void updateDealer(DealerBean agent) throws DealerValidationException;
    
    public DealerBean getDealer(String agentId) throws DealerNotFoundException;
}
