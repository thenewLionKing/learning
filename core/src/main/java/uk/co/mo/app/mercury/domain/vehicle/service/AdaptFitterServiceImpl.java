package uk.co.mo.app.mercury.domain.vehicle.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptFitterBean;
import uk.co.mo.app.mercury.domain.vehicle.entity.AdaptFitterEntity;

@Service("AdaptationInstallerService")
public class AdaptFitterServiceImpl implements AdaptFitterService {
    
	private static final Log LOG = LogFactory.getLog(AdaptFitterServiceImpl.class);

	@Override
	@Transactional
	public void addAdaptFitters(AdaptFitterBean adaptFitterBean) {
		
		AdaptFitterEntity entity = new AdaptFitterEntity();
		
		entity.setAdaptFitterBean(adaptFitterBean);
		entity.persist();
		
	}

	@Override
	@Transactional
	public void updateAdaptFitters(AdaptFitterBean adaptFitterBean) {
		AdaptFitterEntity entity = new AdaptFitterEntity();
		
		entity.setAdaptFitterBean(adaptFitterBean);
		entity.merge();
	}
	
	@Override
	@Transactional (propagation=Propagation.NOT_SUPPORTED)
	public AdaptFitterBean getAdaptFitter(Integer fitterId) {
		LOG.debug("Entering getAdaptFitter");
		AdaptFitterBean adaptFitterBean = null;
		
		try {	
		AdaptFitterEntity adaptFitterEntity = AdaptFitterEntity.findAdaptFitterEntity(fitterId);
        
        if(adaptFitterEntity == null) {
        	LOG.debug("No adaptFitter for fitterId: " + fitterId);
        }
        else {
        	adaptFitterBean = adaptFitterEntity.getAdaptFitterBean();
        }
        
		} catch(Exception e){
			LOG.debug("No adaptFitter for fitterId: " + fitterId);
		}	
     	
        return adaptFitterBean;
	}
}
