package uk.co.mo.app.mercury.domain.org.manufacturer.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import uk.co.mo.app.mercury.cs.dao.LegacyDAO;
import uk.co.mo.app.mercury.domain.DomainEntityCountService;
import uk.co.mo.app.mercury.domain.org.manufacturer.beans.ManufacturerBean;
import uk.co.mo.app.mercury.domain.org.manufacturer.entity.ManufacturersEntity;

@Service("manufacturerService")
public class ManufacturerServiceImpl implements ManufacturerService {

	private static final Log LOG = LogFactory.getLog(ManufacturerServiceImpl.class);
	
    @Autowired
    private LegacyDAO dao;
	
	@Override
	@Transactional
	public void addManufacturer(ManufacturerBean manufacturerBean) {
		LOG.debug("Call at ManufacturerServiceImpl :: addManufacturer");
		ManufacturersEntity entity = new ManufacturersEntity();
		
		Integer manufacturerId =  (Integer) dao.getEnterpriseSessionFactory().getCurrentSession()
								.getNamedQuery("domain.entity.generate.key").setParameter(0, "manufacturer_id")
								.list().get(0);
		manufacturerBean.setManufacturerId(manufacturerId.shortValue());
		entity.setManufacturerBean(manufacturerBean);
		entity.persist();
	}

	@Override
	@Transactional
	public void updateManufacturer(ManufacturerBean manufacturerBean) {
		LOG.debug("Call at ManufacturerServiceImpl :: updateManufacturer");
		ManufacturersEntity entity = (ManufacturersEntity) ManufacturersEntity.findManufacturerByOracleKey(manufacturerBean.getOracleKey())
									.getSingleResult();
		manufacturerBean.setManufacturerId(entity.getManufacturerBean().getManufacturerId());
		entity.setManufacturerBean(manufacturerBean);
		entity.merge();
									
	}

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long countAllRecords() {
        LOG.debug("Call at ManufacturerServiceImpl :: countAllRecords");
        return (Long)ManufacturersEntity.countManufacturers().getSingleResult();
    }
}
