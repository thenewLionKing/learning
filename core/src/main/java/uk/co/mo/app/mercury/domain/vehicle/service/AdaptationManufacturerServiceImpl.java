package uk.co.mo.app.mercury.domain.vehicle.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptManufacturerBean;
import uk.co.mo.app.mercury.domain.vehicle.entity.AdaptManufacturerEntity;

@Service("AdaptationManufacturerService")
public class AdaptationManufacturerServiceImpl implements  AdaptationManufacturerService{

	private static final Log LOG = LogFactory.getLog(AdaptFittersContactServiceImpl.class);
	
	@Override
	@Transactional
	public void addAdaptationManufacturer(AdaptManufacturerBean adaptManufacturerBean) {
		LOG.debug("AdaptationManufacturerServiceImpl :: addAdaptationManufacturer ");
		
		AdaptManufacturerEntity entity = new AdaptManufacturerEntity();
		entity.setAdaptManufacturerBean(adaptManufacturerBean);
		entity.persist();
	}

	@Override
	@Transactional
	public void updateAdaptationManufacturer(AdaptManufacturerBean adaptManufacturerBean) {
		LOG.debug("AdaptationManufacturerServiceImpl :: updateAdaptationManufacturer ");
		
		AdaptManufacturerEntity entity = AdaptManufacturerEntity.findAdaptManufacturerEntity(adaptManufacturerBean.getManufacturerId());
		entity.setAdaptManufacturerBean(adaptManufacturerBean);
		entity.merge();
	}

}
