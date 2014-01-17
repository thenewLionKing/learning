package uk.co.mo.app.mercury.domain.org.dealer.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerGroupBean;
import uk.co.mo.app.mercury.domain.org.dealer.entity.DealerGroupEntity;

@Service("dealerGroupService")
public class DealerGroupServiceImpl implements DealerGroupService {

    private static final Log LOG = LogFactory.getLog(DealerGroupServiceImpl.class);
	
    @Transactional
    @Override
	public void addDealerGroup(DealerGroupBean dealerGroupBean) {
		
		DealerGroupEntity entity = new DealerGroupEntity();
		entity.setDealerGroupBean(dealerGroupBean);
		
		entity.persist();

	}

	@Override
	@Transactional
	public void updateDealerGroup(DealerGroupBean dealerGroupBean) {
		
		DealerGroupEntity entity = new DealerGroupEntity();
		entity.setDealerGroupBean(dealerGroupBean);
		entity.merge();
	}

}
