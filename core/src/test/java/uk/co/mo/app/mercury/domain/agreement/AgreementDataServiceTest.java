package uk.co.mo.app.mercury.domain.agreement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.agreement.beans.*;
import uk.co.mo.app.mercury.domain.agreement.service.AgreementDataService;

public class AgreementDataServiceTest extends AbstractJunit4Test {

    private static final Log LOG = LogFactory.getLog(AgreementDataServiceTest.class);

    @Autowired
    @Qualifier("agreementDataService")
    private AgreementDataService ads;

    @Test
    public void testGetAgreementByArn(){
//    	String arn = "54790364"; // PWS Agreement
//    	String arn = "51487591"; // Void Agreement
    	String arn = "61691066"; // Car Agreement
    	AgreementBean bean = ads.getAgreementByArn(arn);
    	System.out.println("AGREEMENT_ID $$$$$$$$$$$ "+bean.getAgreementId());
        System.out.println("STLE NEW ARN $$$$$$$$$$$ "+bean.getNewArn());
//    	System.out.println("$$$$$$$$PROFILE CODE ::: "+bean.getAgreementProductBean().getProductProfileBean().getProfileCode());
//    	System.out.println("$$$$$$$$PROFILE CODE ::: "+bean.getProfilesBean().getProfileCode());
    }
    
    @Test
    public void testGetAgreementInfo(){
    	Integer recordId = 22070476;
    	String eventId="4752403";
    	AgreementProcBean bean =ads.getAgreementInfo(recordId, eventId);
    	System.out.println("$$$$$$$$$$$  Agreement ID :: " +bean.getAgreementId()
    			+"ARN Number :: "+bean.getArn());
    }
    
    
    @Test
    public void TestGetAgreementByPK(){
//    	Integer agreementId = 10473499;
        Integer agreementId = 1640917;
    	AgreementBean bean = ads.getAgreementByPK(agreementId);
    	System.out.println("BEAN $$$$$$$$$$$ "+bean.getArn());
    }

    @Test
    public void testGetAgreementPreviousParties() {
        String eventId="4752403";
        AgreementPreviousPartiesBean bean = ads.getAgreementPreviousParties(eventId);
        Assert.assertNotNull(bean);
        LOG.info(bean.toString());

    }
    
    @Test
    public void testGetAgreementExtensions() {
        Integer id=1003836;
        AgreementExtensionBean bean = ads.getAgreementExtensions(id);
        Assert.assertNotNull(bean);
        LOG.info(bean.toString());
        System.out.println("$$$$$$$$$$$ "+bean.getArn());
    }
	
    @Test
    public void testGetAgreementExtensionsAudit() {
        Integer id=8;
        AgreementExtensionAuditBean bean = ads.getAgreementExtensionsAudit(id);
        Assert.assertNotNull(bean);
        LOG.info(bean.toString());
        System.out.println("$$$ARN$$$$ "+bean.getArn()+ "$$$AGREEMENT ID $$$$"+bean.getAgreementId());
    }
    
	@Override
	protected void setup() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void destroy() {
		// TODO Auto-generated method stub

	}

}
