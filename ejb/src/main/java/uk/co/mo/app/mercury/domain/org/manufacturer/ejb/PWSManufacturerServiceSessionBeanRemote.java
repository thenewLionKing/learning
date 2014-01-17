package uk.co.mo.app.mercury.domain.org.manufacturer.ejb;


import javax.ejb.Remote;

import uk.co.mo.app.mercury.domain.org.manufacturer.service.PWSManufacturerService;

@Remote
public interface PWSManufacturerServiceSessionBeanRemote extends PWSManufacturerService{

}
