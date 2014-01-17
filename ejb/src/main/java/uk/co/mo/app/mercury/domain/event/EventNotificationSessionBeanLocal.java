package uk.co.mo.app.mercury.domain.event;

import javax.ejb.Local;

/**
 * <p/>
 * User: prabat
 * Date: 15/06/11
 * Time: 09:28
 * <p/>
 * Change Log - Who : When : Comment
 */
@Local
public interface EventNotificationSessionBeanLocal {
    public void createTimer(long timeout);
    public void doWork();
}
