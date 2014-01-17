package uk.co.mo.app.mercury.domain.vehicle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerBean;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerNotFoundException;
import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptFitterBean;
import uk.co.mo.app.mercury.domain.vehicle.entity.AdaptFitterEntity;
import uk.co.mo.app.mercury.domain.vehicle.service.AdaptFitterService;


public class AdaptFitterServiceTest extends AbstractJunit4Test{

    private static final Log LOG = LogFactory.getLog(AdaptFitterServiceTest.class);

    @Autowired
    @Qualifier("AdaptationInstallerService")
    private AdaptFitterService afs;

    @Test
    public void testAddAdaptFitters() {

        try {
            AdaptFitterBean adaptFitterBean = new AdaptFitterBean();
            
            //Being lazy in setting each property, I am using an id to populate my bean
            // and then inserting the same with another id to confirm my test :-)
            AdaptFitterEntity entity = AdaptFitterEntity.findAdaptFitterEntity(100001);
            adaptFitterBean = entity.getAdaptFitterBean();
            adaptFitterBean.setFitterId(100999);

            afs.addAdaptFitters(adaptFitterBean);
        } catch (Exception e) {
            LOG.debug("Caught exception ", e);
        }
    }

    @Test
    public void testUpdateAdaptFitters(){
    	try{
            AdaptFitterBean adaptFitterBean = new AdaptFitterBean();

            //Being lazy in setting each property, I am using an id to populate my bean
            // and then updating the same with another id to confirm my test :-)
            AdaptFitterEntity entity = AdaptFitterEntity.findAdaptFitterEntity(100001);
            adaptFitterBean = entity.getAdaptFitterBean();
            adaptFitterBean.setFitterId(100999);
            adaptFitterBean.setFitterName("Amit Fitters Service");
    		
			afs.updateAdaptFitters(adaptFitterBean);
    	}catch (Exception e){
    		LOG.debug("Caught Exception ", e);
    	}
    }
    
    @Test
    public void testGetAdaptFitter(){
       try {
    	   AdaptFitterBean adaptFitterBean = afs.getAdaptFitter(100001);
    	   String afb = adaptFitterBean.getFitterName();
        } catch (Exception e) {
            e.printStackTrace();  
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
