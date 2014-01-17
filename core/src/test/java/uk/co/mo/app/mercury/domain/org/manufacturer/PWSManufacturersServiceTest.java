package uk.co.mo.app.mercury.domain.org.manufacturer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.org.manufacturer.beans.ProductMakeBean;
import uk.co.mo.app.mercury.domain.org.manufacturer.service.PWSManufacturerService;
import uk.co.mo.app.mercury.domain.product.entity.ProductMakeEntity;


public class PWSManufacturersServiceTest extends AbstractJunit4Test{

	private static final Log LOG= LogFactory.getLog(PWSManufacturersServiceTest.class);

    @Autowired
    @Qualifier("PWSManufacturerService")
    private PWSManufacturerService mfs;

    @Test
    public void testAddPWSManufacturer() {
    	ProductMakeBean bean = new ProductMakeBean();
    	bean.setOraclePartyNumber("89019");
    	bean.setName("Amit PWSS1");
    	mfs.addPWSManufacturer(bean);
    }

    @Test
    public void testUpdatePWSManufacturer() {

    	ProductMakeBean bean = new ProductMakeBean();
    	bean.setOraclePartyNumber("89001");
    	bean.setDescription("Amit testing OPN");
    	
    	mfs.updatePWSManufacturer(bean);

    }
	
	@Override
	protected void setup() {
	}

	@Override
	protected void destroy() {
	}

}
