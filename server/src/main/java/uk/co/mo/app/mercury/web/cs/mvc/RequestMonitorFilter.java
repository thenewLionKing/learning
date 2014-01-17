package uk.co.mo.app.mercury.web.cs.mvc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import uk.co.mo.app.mercury.cs.applicationerror.MoRuntimeException;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/**
 * A web request filter that adds incoming requests to RequestMonitor. If number of long running requests hits the
 * threshold, subsequent requests will be aborted untill the long running request count comes below the threshold.
 * <p/>
 * <p/>
 * User: prabat
 * Date: 24-Feb-2011
 * Time: 11:31:38
 * <p/>
 * Change Log - Who : When : Comment
 */
public class RequestMonitorFilter implements Filter {

    private static Log LOG = LogFactory.getLog(RequestMonitorFilter.class);

    private static AtomicReference<RequestMonitor> requestMonitor;

    public RequestMonitorFilter(RequestMonitor monitor) {
        requestMonitor = new AtomicReference<RequestMonitor>(monitor);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOG.debug("Inside Request Monitor Filter");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        int threshold = requestMonitor.get().getLongRunningRequestThreshold();

        RequestMonitor.RequestInfo info = requestMonitor.get().addRequest((HttpServletRequest) servletRequest);
        String message = info.toString();

        if (!info.getRequestURL().contains("status")) {
            if (requestMonitor.get().getLongRequestCount() >= threshold) {
                requestMonitor.get().removeRequest(info);
                requestMonitor.get().killHangingRequests();
                throw new MoRuntimeException("Too many long running requests (" + threshold + ") on the server. This request is aborted! Try again later.");
            }
        }


        try {
            // Call the next in the chain
            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            // remove request from active requests
            requestMonitor.get().removeRequest(info);
        }
    }

    public static RequestMonitor getRequestMonitor() {
        return requestMonitor.get();
    }

    public void destroy() {
    }
}
