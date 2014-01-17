package uk.co.mo.app.mercury.domain.org.dealer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerGroupBean;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerGroupService;


public class DealerGroupServiceTest extends AbstractJunit4Test{

    private static final Log LOG = LogFactory.getLog(DealerGroupServiceTest.class);

    @Autowired
    @Qualifier("dealerGroupService")
    private DealerGroupService dgs;

    @Test
    public void testAddDealerGroup() {

        try {
            	DealerGroupBean dealerGroupBean = new DealerGroupBean();
        		dealerGroupBean.setAddress1("Address 1");
        		dealerGroupBean.setAddress2("Address 2");
        		dealerGroupBean.setAddress3("Address 3");
        		dealerGroupBean.setAddress4("Address 4");
        		dealerGroupBean.setEmail("someemail@email.com");
        		dealerGroupBean.setFaxReception("1234557854");
        		dealerGroupBean.setGroupName("Group Name");
        		dealerGroupBean.setGroupNumber(66666);
        		dealerGroupBean.setGroupType(1);
        		dealerGroupBean.setPostcode("SE1 9HB");
        		dealerGroupBean.setTelReception("1224867677");
        		dealerGroupBean.setWebsite("www.somewebsite.com");
        		
				dgs.addDealerGroup(dealerGroupBean);
        } catch (Exception e) {
            LOG.debug("Caught exception ", e);
        }
    }
    
    @Test
    public void testUpdateDealerGroup(){
    	try{
    		DealerGroupBean dealerGroupBean = new DealerGroupBean();

    		dealerGroupBean.setAddress1("AddressUpdate 1");
    		dealerGroupBean.setAddress2("AddressUpdate 2");
    		dealerGroupBean.setAddress3("AddressUpdate 3");
    		dealerGroupBean.setAddress4("AddressUpdate 4");
    		dealerGroupBean.setEmail("someemail@emailupdate.com");
    		dealerGroupBean.setFaxReception("1234557854");
    		dealerGroupBean.setGroupName("Group Name - Update");
    		dealerGroupBean.setGroupNumber(66666);
    		dealerGroupBean.setGroupType(1);
    		dealerGroupBean.setPostcode("SE1 9HB");
    		dealerGroupBean.setTelReception("1224867677");
    		dealerGroupBean.setWebsite("www.somewebsite-update.com");
    		
			dgs.updateDealerGroup(dealerGroupBean);
    	}catch(Exception e){
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
