package uk.co.mo.app.mercury.domain.org.manufacturer.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.mo.app.mercury.domain.org.manufacturer.beans.ProductMakeBean;
import uk.co.mo.app.mercury.domain.product.entity.ProductMakeEntity;

@Service("PWSManufacturerService")
public class PWSManufacturerServiceImpl implements PWSManufacturerService {

	private static final Log LOG = LogFactory.getLog(PWSManufacturerServiceImpl.class);
    
	@Transactional
	public void addPWSManufacturer(ProductMakeBean productMakeBean) {
		LOG.debug("Call at PWSManufacturerServiceImpl :: addPWSManufacturer");
		ProductMakeEntity entity = new ProductMakeEntity();
		entity.setProductMakeBean(productMakeBean);
		entity.persist();
	}

	@Transactional
	public void updatePWSManufacturer(ProductMakeBean productMakeBean) {
		LOG.debug("Call at PWSManufacturerServiceImpl :: updatePWSManufacturer");
		ProductMakeEntity entity = (ProductMakeEntity) ProductMakeEntity.findProductMakeEntitysByOraclePartyNumberEquals
									(productMakeBean.getOraclePartyNumber()).getSingleResult();
		
		productMakeBean.setId(entity.getProductMakeBean().getId());		
		entity.setProductMakeBean(productMakeBean);
		entity.merge();		
	}
}
