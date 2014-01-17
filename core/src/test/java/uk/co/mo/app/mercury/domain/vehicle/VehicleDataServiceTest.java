package uk.co.mo.app.mercury.domain.vehicle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.vehicle.beans.VehicleBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VehicleSnapShotBean;
import uk.co.mo.app.mercury.domain.vehicle.service.VehicleDataService;


public class VehicleDataServiceTest extends AbstractJunit4Test{

    private static final Log LOG = LogFactory.getLog(VehicleDataServiceTest.class);

    @Autowired
    @Qualifier("vehicleDataService")
    private VehicleDataService vds;
    

    @Test
    public void testGetVehicleData() {

        try {
            VehicleBean vehicle = new VehicleBean();
            vehicle = vds.getVehicleData("1805257");
            System.out.println("Vehicle info :::  "+vehicle.getCarRegistrationNumber());
            
        } catch (Exception e) {
            LOG.debug("Caught exception ", e);
        }
    }
    
    @Test
    public void testGetVehicleByRegistrationNumber() {

        try {
            VehicleBean vehicle = new VehicleBean();
            vehicle = vds.getVehicleByRegistrationNumber("KN11LVD");
            System.out.println("Vehicle info :::  "+vehicle.getFirstRegDate());
            
        } catch (Exception e) {
            LOG.debug("Caught exception ", e);
        }
    }
    
    @Test
    public void testGetVehicleSalesInfo(){
    	try{
    		VehicleBean vehicle = new VehicleBean();
    		
    		Integer stockId = 2186892;
			vehicle = vds.getVehicleSalesInfo(stockId);
			System.out.println("Vehicle Bean :: "+vehicle.getFirstRegDate());
			System.out.println("VRM BV Return Bean :: "+vehicle.getVrmBvReturn().get(0).getPurchaserSurname());
			System.out.println("Model Description :: "+vehicle.getModelDescriptionBean().getManufacturerDesc());
			System.out.println("Vehicle colour bean :: "+vehicle.getVehicleColourBean().toString());
			System.out.println("Vehicle Grade :: "+vehicle.getVrmStockBean().getVrmVcrGradeIdBean().toString());
			System.out.println("Vehicle Delivery Type :: "+vehicle.getVrmBvReturn().get(0).getVrmDeliveryTypeBean().toString());
			
    	}catch (Exception e) {
            LOG.info("Caught exception ", e);
        }
    }
    
    @Test
    public void testGetVehicleByRecordId(){
    	try{
    		VehicleSnapShotBean vehicle = new VehicleSnapShotBean();
    		Integer recordId = 1940108;
    		vehicle = vds.getVehicleByRecordId(recordId);
    		System.out.println("VehicleSnapShot Bean :: Record State ::"+vehicle.toString());
    	}catch (Exception e) {
            LOG.debug("Caught exception ", e);
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
