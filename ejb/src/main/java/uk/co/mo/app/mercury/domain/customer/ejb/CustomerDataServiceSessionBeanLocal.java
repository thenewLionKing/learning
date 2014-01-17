package uk.co.mo.app.mercury.domain.customer.ejb;


import javax.ejb.Local;

import uk.co.mo.app.mercury.domain.customer.service.CustomerDataService;

/**
 * <p/>
 * User: prabat
 * Date: 23-May-2011
 * Time: 17:12:02
 * <p/>
 * Change Log - Who : When : Comment
 */
@Local
public interface CustomerDataServiceSessionBeanLocal extends CustomerDataService {
}
