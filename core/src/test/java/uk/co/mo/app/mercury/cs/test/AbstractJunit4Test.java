package uk.co.mo.app.mercury.cs.test;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.TestingAuthenticationProvider;
import org.springframework.security.authentication.TestingAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Put your class comment here
 * <p/>
 * User: PrabaT
 * Date: 08-Jan-2010
 * Time: 10:25:57
 * <p/>
 * Change Log - Who : When : Comment
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:META-INF/spring/testApplicationContext*.xml"})
public abstract class AbstractJunit4Test {
	private static final String USER = "admin";
	private static final String PASSWORD = "m0s3s";
    private Map<String, Object> testData;

    @Autowired
	@Qualifier(value = "authenticationManager")
	private ProviderManager providerManager;
    
    protected AbstractJunit4Test() {
        testData = new HashMap<String, Object>(0);
    }

    protected void addTestData(Object data) {
        testData.put("TestData" + (testData.size() + 1), data);
    }

    protected Object getTestData(int number) {
        Object o = testData.get("TestData" + number);
        if(o == null) throw new IllegalArgumentException("test data not found for number " + number);
        return o;
    }

    @Before
    public void setupTestData() {
        setup();
        setAuthentication();
    }

    @After
    public void destroyTestData() {
        destroy();
    }

    protected abstract void setup();

    protected abstract void destroy();
    
    @SuppressWarnings("unchecked")
	private void setAuthentication(){
		List providerList = new ArrayList();
		providerList.add(new TestingAuthenticationProvider());
		providerManager.setProviders(providerList);			
		addTokenToSecurityContext(new TestingAuthenticationToken(USER,PASSWORD, new GrantedAuthority[]{new GrantedAuthorityImpl()}));
	}
    
    private void addTokenToSecurityContext(TestingAuthenticationToken token) {
    	token.setAuthenticated(true);
		SecurityContextImpl secureContext = new SecurityContextImpl();
		secureContext.setAuthentication(token);
		SecurityContextHolder.setContext(secureContext);
    }
    
    private class GrantedAuthorityImpl implements GrantedAuthority{
		private static final long serialVersionUID = 1L;

		public String getAuthority() {
			return "ROLE_ADMIN";
		}
		
		public String toString() {
			return getAuthority(); 			
		}
	}
}
