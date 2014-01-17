package uk.co.mo.app.mercury.web.cs.job;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import uk.co.mo.app.mercury.domain.event.EventSchedulerSessionBeanLocal;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p/>
 * User: prabat
 * Date: 09/06/11
 * Time: 09:27
 * <p/>
 * Change Log - Who : When : Comment
 */
public class MercuryTimerCreateServlet extends HttpServlet {

    private static final Log LOG = LogFactory.getLog(MercuryTimerCreateServlet.class);

    @EJB
    EventSchedulerSessionBeanLocal ejbEventTimer;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ejbEventTimer.createTimer();
    }
}
