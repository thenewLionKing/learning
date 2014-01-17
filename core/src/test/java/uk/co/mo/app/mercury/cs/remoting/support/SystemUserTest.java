/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.remoting.support;

import junit.framework.Assert;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.cs.util.Collections;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p/>
 * User: PrabaT
 * Date: 29-Apr-2010
 * Time: 13:48:34
 * <p/>
 * Change Log - Who : When : Comment
 */
public class SystemUserTest extends AbstractJunit4Test {

    private static final Log LOG = LogFactory.getLog(SystemUserTest.class);

    @Test
    public void testUser() {

        ExecutorService service = Executors.newFixedThreadPool(2);
        List jobs = Collections.emptyList();
        jobs.add(createThread(1));
        jobs.add(createThread(2));

        try {
            service.invokeAny(jobs);
        } catch (Exception e) {
            LOG.error("Exception", e);
            Assert.fail();
        }

    }


    private Callable createThread(final int n) {
        return new Callable() {
            public Object call() throws Exception {
                SystemUser.setUserName(((User)getTestData(n)).getUserName());
                sleep();
                LOG.debug("Thread" + n + ": " + SystemUser.getUserName());
                SystemUser.setUserName("modifiedUser"+n);
                sleep();
                LOG.debug("Thread" + n + ": " + SystemUser.getUserName());
                return null;
            }
        };
    }

    private void sleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }


    @Override
    protected void setup() {
        addTestData(new User("testuser1", "role1"));
        addTestData(new User("testuser2", "role2"));
    }

    @Override
    protected void destroy() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
