package uk.co.mo.app.mercury.web.cs.ws;

import com.sun.xml.ws.resources.WsservletMessages;
import com.sun.xml.ws.transport.http.servlet.ServletAdapter;
import com.sun.xml.ws.util.localization.Localizer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * <p/>
 * User: prabat
 * Date: 18-May-2011
 * Time: 09:14:17
 * <p/>
 * Change Log - Who : When : Comment
 */
public class WSServletDelegate extends com.sun.xml.ws.transport.http.servlet.WSServletDelegate {

    private static final Log logger = LogFactory.getLog(WSServletDelegate.class);

    public WSServletDelegate(List<ServletAdapter> adapters, ServletContext context) {
        super(adapters, context);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response, ServletContext context)
            throws ServletException {
        try {
            ServletAdapter target = getTarget(request);
            if (target != null) {
                if (logger.isTraceEnabled()) {
                    logger.trace(WsservletMessages.SERVLET_TRACE_GOT_REQUEST_FOR_ENDPOINT(target.getName()));
                }
            target.handle(context, request, response);
            } else {
                Localizer localizer = getLocalizerFor(request);
                writeNotFoundErrorPage(localizer, response,"Invalid Request");
            }
        } catch (Throwable e) {
            throw new CustomServletException("Fatal error caught", e);
        }
    }

    private void writeNotFoundErrorPage(Localizer localizer,
        HttpServletResponse response, String message)
        throws IOException {
        response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>");
        out.println(WsservletMessages.SERVLET_HTML_TITLE());
        out.println("</title></head>");
        out.println("<body>");
        out.println(WsservletMessages.SERVLET_HTML_NOT_FOUND(message));
        out.println("</body>");
        out.println("</html>");
    }
}
