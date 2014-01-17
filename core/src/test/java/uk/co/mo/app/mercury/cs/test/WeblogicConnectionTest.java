package uk.co.mo.app.mercury.cs.test;

import org.junit.Test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * <p/>
 * User: prabat
 * Date: 26-May-2011
 * Time: 11:01:02
 * <p/>
 * Change Log - Who : When : Comment
 */
public class WeblogicConnectionTest extends AbstractJunit4Test {
    @Override
    protected void setup() {
        Properties properties = System.getProperties();
        properties.setProperty( Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory" );
        properties.setProperty(Context.PROVIDER_URL, "t3://localhost:7011" );
        //properties.setProperty( Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces" );
        System.setProperties(properties);
    }

    @Override
    protected void destroy() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
    
    @Test
    public void testDataSource() throws Exception {
        String sql = "SELECT * FROM agreement_types";
        Context ic = new InitialContext();
        DataSource dataSource =
          (DataSource) ic.lookup("jdbc/EnterpriseDS");
        System.out.println("lookup dataSource returned " + dataSource);
        Connection connection = dataSource.getConnection();
        System.out.println("Got connection: " + connection);

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) {
            System.out.print(rs.getString(1) + " ");
        }
    }
}
