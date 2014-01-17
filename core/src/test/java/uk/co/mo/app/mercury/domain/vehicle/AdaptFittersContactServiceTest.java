package uk.co.mo.app.mercury.domain.vehicle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptFittersContactBean;
import uk.co.mo.app.mercury.domain.vehicle.service.AdaptFittersContactService;


public class AdaptFittersContactServiceTest extends AbstractJunit4Test{

    private static final Log LOG = LogFactory.getLog(AdaptFittersContactServiceTest.class);

    @Autowired
    @Qualifier("AdaptationInstallerContactService")
    private AdaptFittersContactService afcs;

    @Test
    public void testAddAdaptFittersContact() {

        try {
        	AdaptFittersContactBean adaptFittersContactBean = new AdaptFittersContactBean();
        	adaptFittersContactBean.setFitterId(100165);
    		adaptFittersContactBean.setContactId(1457642);
    		adaptFittersContactBean.setDepartment("Employee of");
    		adaptFittersContactBean.setForename("Amit");
    		adaptFittersContactBean.setSurname("Apollo-test");
    		adaptFittersContactBean.setTitle("Mr");
    		adaptFittersContactBean.setTelephone(null);
    		adaptFittersContactBean.setMobile(null);
    		adaptFittersContactBean.setEmail(null);
    		adaptFittersContactBean.setPrime(null);

        	afcs.addAdaptFittersContact(adaptFittersContactBean);
        } catch (Exception e) {
            LOG.debug("Caught exception ", e);
        }
    }

    @Test
    public void testUpdateAdaptFittersContact(){
    	try{
        	AdaptFittersContactBean adaptFittersContactBean = new AdaptFittersContactBean();
        	adaptFittersContactBean.setFitterId(100165);
    		adaptFittersContactBean.setContactId(1457642);
    		adaptFittersContactBean.setDepartment("Employee of Motability");
    		adaptFittersContactBean.setForename("Amit");
    		adaptFittersContactBean.setSurname("Apollo-testing");
    		adaptFittersContactBean.setTitle("Mr");
    		adaptFittersContactBean.setTelephone(null);
    		adaptFittersContactBean.setMobile(null);
    		adaptFittersContactBean.setEmail(null);
    		adaptFittersContactBean.setPrime(null);
    		adaptFittersContactBean.setActiveFlag(true);
    		
    		afcs.updateAdaptFittersContact(adaptFittersContactBean);
    		
    	}catch (Exception e){
    		LOG.debug("Caught Exception ", e);
    	}
    }
    
    @Override
    protected void setup() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected void destroy() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
