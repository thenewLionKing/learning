package uk.co.mo.app.mercury.domain.vehicle.ejb;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import uk.co.mo.app.mercury.domain.vehicle.beans.VehicleBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VehicleSnapShotBean;
import uk.co.mo.app.mercury.domain.vehicle.service.VehicleDataService;

/**
 * <p/>
 * User: amitm
 * Date: 19-May-2011
 * Time: 12:45:25
 * <p/>
 * Change Log - Who : When : Comment
 */
@Stateless(mappedName="mercury/ejb", name = "VehicleDataServiceEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class VehicleDataServiceSessionBean implements VehicleDataServiceSessionBeanRemote, VehicleDataServiceSessionBeanLocal {

    private static final Log LOG = LogFactory.getLog(VehicleDataServiceSessionBean.class);

    @Autowired
    @Qualifier("vehicleDataService")
    private VehicleDataService vds;

	@Override
	@TransactionAttribute(TransactionAttributeType.NEVER)
	public VehicleBean getVehicleData(String assetNumber){
		LOG.debug("VehicleDataServiceSessionBean :: getVehicleData");
		return vds.getVehicleData(assetNumber);
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.NEVER)
	public VehicleBean getVehicleByRegistrationNumber(String registrationNumber) {
		LOG.debug("VehicleDataServiceSessionBean :: getVehicleByRegistrationNumber");
		return vds.getVehicleByRegistrationNumber(registrationNumber);
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.NEVER)
	public VehicleSnapShotBean getVehicleByRecordId(Integer recordId) {
		LOG.debug("VehicleDataServiceSessionBean :: getVehicleByRecordId");
		return vds.getVehicleByRecordId(recordId);
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.NEVER)
	public VehicleBean getVehicleSalesInfo(Integer stockId) {
		LOG.debug("VehicleDataServiceSessionBean :: getVehicleSalesInfo");
		return vds.getVehicleSalesInfo(stockId);
	}

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public long countAllRecords() {
        return vds.countAllRecords();
    }
}
