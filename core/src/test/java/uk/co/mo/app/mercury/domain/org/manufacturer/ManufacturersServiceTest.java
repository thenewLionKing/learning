package uk.co.mo.app.mercury.domain.org.manufacturer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.org.manufacturer.beans.ManufacturerBean;
import uk.co.mo.app.mercury.domain.org.manufacturer.entity.ManufacturersEntity;
import uk.co.mo.app.mercury.domain.org.manufacturer.service.ManufacturerService;


public class ManufacturersServiceTest extends AbstractJunit4Test{

	private static final Log LOG= LogFactory.getLog(ManufacturersServiceTest.class);

    @Autowired
    @Qualifier("manufacturerService")
    private ManufacturerService mfs;

    @Test
    public void testAddManufacturer() {
    	ManufacturerBean bean = new ManufacturerBean();
    	bean.setOracleKey(6666);
    	bean.setManufacturerCode("ZM");
    	bean.setActive(Boolean.TRUE);
    	bean.setManufacturerDesc("Testing Add service");
    	mfs.addManufacturer(bean);
    	
    }

    @Test
    public void testUpdateManufacturer() {
    	ManufacturerBean bean = new ManufacturerBean();
    	bean.setOracleKey(6666);
    	bean.setManufacturerDesc("testing -1");
    	bean.setManufacturerCode("AE");
    	mfs.updateManufacturer(bean);

    }
	
	@Override
	protected void setup() {
	}

	@Override
	protected void destroy() {
	}

}
