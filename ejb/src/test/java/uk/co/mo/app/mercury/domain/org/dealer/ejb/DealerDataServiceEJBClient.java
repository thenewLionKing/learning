package uk.co.mo.app.mercury.domain.org.dealer.ejb;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;
import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerBean;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerDataService;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

/**
 * <p/>
 * User: prabat
 * Date: 24-May-2011
 * Time: 14:12:30
 * <p/>
 * Change Log - Who : When : Comment
 */
public class DealerDataServiceEJBClient extends AbstractJunit4Test {

    private static final Log LOG = LogFactory.getLog(DealerDataServiceEJBClient.class);

    @Test
    @Transactional
    public void testEjb() throws Exception {
        InitialContext ctx = new InitialContext();
        Object o = ctx.lookup("DealerDataServiceSessionBean/remote");
        LOG.debug(o);
        DealerDataService br = (DealerDataService) o;
        br.addDealer(new DealerBean());
    }

    @Override
    protected void setup() {
        Properties properties = System.getProperties();
        properties.setProperty( Context.INITIAL_CONTEXT_FACTORY,"org.jnp.interfaces.NamingContextFactory" );
        properties.setProperty(Context.PROVIDER_URL, "jnp://127.0.0.1:1099" );
        properties.setProperty( Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces" );
        System.setProperties(properties);
    }

    @Override
    protected void destroy() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
