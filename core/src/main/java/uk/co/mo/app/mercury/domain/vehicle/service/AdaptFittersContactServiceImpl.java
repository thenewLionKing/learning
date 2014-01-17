package uk.co.mo.app.mercury.domain.vehicle.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptFittersContactBean;
import uk.co.mo.app.mercury.domain.vehicle.entity.AdaptFittersContactEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.AdaptFittersContactEntityPK;

@Service("AdaptationInstallerContactService")
public class AdaptFittersContactServiceImpl implements AdaptFittersContactService {
    
	private static final Log LOG = LogFactory.getLog(AdaptFittersContactServiceImpl.class);

	@Transactional
	@Override
	public void addAdaptFittersContact(AdaptFittersContactBean adaptFittersContactBean) {
		LOG.debug("AdaptFittersContactServiceImpl :: addAdaptFittersContact ");
		
		
		AdaptFittersContactEntity entity = new AdaptFittersContactEntity();
		AdaptFittersContactEntityPK pk = new AdaptFittersContactEntityPK();
		pk.setContactId(adaptFittersContactBean.getContactId());
		pk.setFitterId(adaptFittersContactBean.getFitterId());
		entity.setId(pk);
		entity.setAdaptFittersContactBean(adaptFittersContactBean);		
		entity.persist();

	}

	@Transactional
	@Override
	public void updateAdaptFittersContact(AdaptFittersContactBean adaptFittersContactBean) {
		LOG.debug("AdaptFittersContactServiceImpl :: updateAdaptFittersContact ");

		AdaptFittersContactEntity entity = new AdaptFittersContactEntity();
		AdaptFittersContactEntityPK pk = new AdaptFittersContactEntityPK();
		pk.setContactId(adaptFittersContactBean.getContactId());
		pk.setFitterId(adaptFittersContactBean.getFitterId());
		entity.setId(pk);
		entity.setAdaptFittersContactBean(adaptFittersContactBean);
		
		if(!adaptFittersContactBean.getActiveFlag()){
			AdaptFittersContactEntity.deleteAdaptFittersContact(pk);
		}else{
			entity.merge();
		}
	}

}
