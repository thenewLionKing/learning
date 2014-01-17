package uk.co.mo.app.mercury.domain.vehicle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptManufacturerBean;
import uk.co.mo.app.mercury.domain.vehicle.service.AdaptationManufacturerService;


public class AdaptationManufacturerServiceTest extends AbstractJunit4Test{

    private static final Log LOG = LogFactory.getLog(AdaptationManufacturerServiceTest.class);

    @Autowired
    @Qualifier("AdaptationManufacturerService")
    private AdaptationManufacturerService ams;

    @Test
    public void testAddAdaptationManufacturer() {
        try {
            AdaptManufacturerBean adaptManufacturerBean = new AdaptManufacturerBean();
            adaptManufacturerBean.setActiveInd(true);
            adaptManufacturerBean.setManufacturerName("Adaptation-New-1");
            adaptManufacturerBean.setAdaptationPrefix("laks");
            adaptManufacturerBean.setManufacturerId(9320);
            adaptManufacturerBean.setWebsite("http://www.pwss.co.uk");

            ams.addAdaptationManufacturer(adaptManufacturerBean);
        } catch (Exception e) {
            LOG.debug("Caught exception ", e);
        }
    }

    @Test
    public void testUpdateAdaptationManufacturer(){
    	try{
            AdaptManufacturerBean adaptManufacturerBean = new AdaptManufacturerBean();
            adaptManufacturerBean.setActiveInd(true);
            adaptManufacturerBean.setManufacturerName("Adaptation-New-3");
            adaptManufacturerBean.setAdaptationPrefix("laks");
            adaptManufacturerBean.setManufacturerId(9320);
            adaptManufacturerBean.setWebsite("http://www.pwss.co.uk");
    		
			ams.updateAdaptationManufacturer(adaptManufacturerBean);
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
