package uk.co.mo.app.mercury.web.cs.ws;

import com.sun.xml.ws.transport.http.servlet.WSServletDelegate;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * <p/>
 * User: prabat
 * Date: 17-May-2011
 * Time: 16:10:30
 * <p/>
 * Change Log - Who : When : Comment
 */
public class WSServlet extends com.sun.xml.ws.transport.http.servlet.WSServlet {

    public WSServlet() {
    }

    @Override
    protected WSServletDelegate getDelegate(ServletConfig servletConfig) {
        WSServletDelegate def =  super.getDelegate(servletConfig);
        return new uk.co.mo.app.mercury.web.cs.ws.WSServletDelegate(def.adapters, servletConfig.getServletContext());
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
