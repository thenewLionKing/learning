package uk.co.mo.app.mercury.domain.org.manufacturer.service;

import uk.co.mo.app.mercury.domain.DomainEntityCountService;
import uk.co.mo.app.mercury.domain.org.manufacturer.beans.ManufacturerBean;

public interface ManufacturerService extends DomainEntityCountService {
	
	void addManufacturer(ManufacturerBean manufacturerBean);

	void updateManufacturer(ManufacturerBean manufacturerBean);
}
