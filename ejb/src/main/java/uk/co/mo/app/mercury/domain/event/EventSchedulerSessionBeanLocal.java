package uk.co.mo.app.mercury.domain.event;

import javax.ejb.Local;

/**
 * <p/>
 * User: prabat
 * Date: 09/06/11
 * Time: 13:51
 * <p/>
 * Change Log - Who : When : Comment
 */
@Local
public interface EventSchedulerSessionBeanLocal {

    void createTimer();
}
