package uk.co.mo.app.mercury.web.cs.ws;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p/>
 * User: prabat
 * Date: 17-May-2011
 * Time: 15:27:04
 * <p/>
 * Change Log - Who : When : Comment
 */
@Aspect
public class WebServiceAspect {

    private static final Log LOG = LogFactory.getLog(WebServiceAspect.class);

    @Around("execution(* WSServlet.service(..)) && args(request, response)")
    //@Around("com.sun.xml.ws.transport.http.servlet.WSServlet.service(..)")
    public void handleBindingException(ProceedingJoinPoint pj, HttpServletRequest request, HttpServletResponse response) throws Throwable {

        try {
            LOG.debug("inside webservice aspect, before invoke.");
            pj.proceed();
            LOG.debug("inside webservice aspect, after invoke.");
        } catch(CustomServletException e) {
            if(e.getCause() instanceof Error) {
                LOG.debug("Caught binding error");
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                throw new BindingException("Binding Exception", e);
            } else {
                LOG.fatal("Caught throwable", e);
                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            }
        } 
    }
}
