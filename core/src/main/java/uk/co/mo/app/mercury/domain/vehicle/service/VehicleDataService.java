package uk.co.mo.app.mercury.domain.vehicle.service;

import uk.co.mo.app.mercury.domain.DomainEntityCountService;
import uk.co.mo.app.mercury.domain.vehicle.beans.VehicleBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VehicleSnapShotBean;

public interface VehicleDataService extends DomainEntityCountService {
	
	public VehicleBean getVehicleData(String assetNumber);

	public VehicleBean getVehicleByRegistrationNumber(String registrationNumber);

	public VehicleSnapShotBean getVehicleByRecordId(Integer recordId);
	
	public VehicleBean getVehicleSalesInfo(Integer stockId);

}
