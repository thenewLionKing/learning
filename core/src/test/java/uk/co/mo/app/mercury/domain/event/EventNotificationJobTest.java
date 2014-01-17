package uk.co.mo.app.mercury.domain.event;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;

/**
 * <p/>
 * User: prabat
 * Date: 14/06/11
 * Time: 13:22
 * <p/>
 * Change Log - Who : When : Comment
 */
public class EventNotificationJobTest extends AbstractJunit4Test {

    @Autowired
    private EventNotificationJob job;


    @Test
    @Transactional
    public void testJob() {
        job.doEventNotificationWork();
    }


    @Override
    protected void setup() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected void destroy() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
