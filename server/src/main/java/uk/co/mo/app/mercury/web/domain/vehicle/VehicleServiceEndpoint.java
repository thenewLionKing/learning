package uk.co.mo.app.mercury.web.domain.vehicle;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import uk.co.mo.app.mercury.domain.vehicle.beans.VehicleBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VehicleSnapShotBean;
import uk.co.mo.app.mercury.domain.vehicle.service.VehicleDataService;

/**
 * <p/>
 * User: amitm
 * Date: 13-May-2011
 * Time: 13:34:59
 * <p/>
 * Change Log - Who : When : Comment
 */

@WebService(serviceName="VehicleService", targetNamespace = "http://xmlns.mo.co.uk/legacy/domain/vehicle")
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL)
public class VehicleServiceEndpoint extends SpringBeanAutowiringSupport {

    private static final Log LOG = LogFactory.getLog(VehicleServiceEndpoint.class);

    @Autowired
    @Qualifier("vehicleDataServiceEJB")
    private VehicleDataService vds;

    @WebMethod(operationName = "GetVehicleByAssetNumber")
    public VehicleBean getVehicle(@WebParam (name="assetNumber") String assetNumber) {
        LOG.debug(vds);
        return vds.getVehicleData(assetNumber);
    }
    
    @WebMethod(operationName= "GetVehicleByRegistrationNumber")
    public VehicleBean getVehicleByRegistrationNumber(@WebParam(name="registrationNumber") String registrationNumber){
    	LOG.debug("In VehicleServiceEndpoing :: getVehicleByRegistrationNumber ");
    	return vds.getVehicleByRegistrationNumber(registrationNumber);
    }
    
    @WebMethod(operationName= "GetVehicleByRecordId")
    public VehicleSnapShotBean getVehicleByRecordId(@WebParam(name="recordId") Integer recordId){
    	LOG.debug("In VehicleServiceEndpoing :: getVehicleByRecordId ");
    	return vds.getVehicleByRecordId(recordId);
    }
    
    @WebMethod(operationName="GetVehicleSalesInfo")
    public VehicleBean getVehicleSaleInfo(@WebParam(name="stockId") Integer stockId){
    	LOG.debug("In VehicleServiceEndpoing :: getVehicleSaleInfo ");
    	return vds.getVehicleSalesInfo(stockId);    	
    }
}
