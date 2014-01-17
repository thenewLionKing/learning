package uk.co.mo.app.mercury.domain.org.dealer.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerBean;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerCategory;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerCoverage;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerExtraBean;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerFcsDateBean;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerFcsDateType;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerGroupDealerLinkBean;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerProductType;
import uk.co.mo.app.mercury.domain.org.dealer.entity.DealerCoverageEntity;
import uk.co.mo.app.mercury.domain.org.dealer.entity.DealerFcsDateEntity;
import uk.co.mo.app.mercury.domain.org.dealer.entity.DealerFcsDateEntityPK;
import uk.co.mo.app.mercury.domain.org.dealer.entity.DealerGroupDealersLinkEntity;
import uk.co.mo.app.mercury.domain.org.dealer.entity.DealerGroupDealersLinkEntityPK;
import uk.co.mo.app.mercury.domain.org.dealer.entity.DealerProductTypeEntity;
import uk.co.mo.app.mercury.domain.org.dealer.entity.MaintenanceAgentExtraEntity;
import uk.co.mo.app.mercury.domain.org.dealer.entity.MaintenanceAgentMaagEntity;
import uk.co.mo.app.mercury.domain.org.manufacturer.entity.ManufacturersEntity;

/**
 * <p/>
 * User: prabat
 * Date: 13-May-2011
 * Time: 13:32:23
 * <p/>
 * Change Log - Who : When : Comment
 */

@Service("dealerDataService")
public class DealerDataServiceImpl implements DealerDataService {

    private static final Log LOG = LogFactory.getLog(DealerDataServiceImpl.class);

    @Transactional
    public void addDealer(DealerBean agent) throws DealerValidationException {
        LOG.debug("Got call on DealerDataServiceImpl");
        if(agent.getDealerCategory() == DealerCategory.Car) {
	        // set main dealer entity
	        if(agent.getVehicleManufacturerCode() == null)
	            throw new DealerValidationException("VehicleManufacturerCode must be set, cannot be null");
	
	        ManufacturersEntity manufacturersEntity = null;
	        Throwable t = null;
	
	        try {
	            manufacturersEntity = (ManufacturersEntity)ManufacturersEntity.findManufacturerByCode(agent.getVehicleManufacturerCode()).getSingleResult();
	        }catch (Exception e) {
	            t = e;
	        }
	        finally {
	            if(manufacturersEntity == null) {
	                throw new DealerValidationException("Vehicle manufacturer not found for code: " + agent.getVehicleManufacturerCode(), t);
	            }
	        }
        }

        MaintenanceAgentMaagEntity newEntity = new MaintenanceAgentMaagEntity();
        newEntity.setDealerBean(agent);

        // set extra entity
        MaintenanceAgentExtraEntity extra = new MaintenanceAgentExtraEntity();
        extra.setDealerExtraBean(agent.getExtra());
        newEntity.setExtra(extra);

        // set dealer fcs date
        if(agent.getDealerCategory() == DealerCategory.Car) {
        	
        	List<DealerFcsDateBean> fcsDates = agent.getDealerFcsDateBean();
        	List<DealerFcsDateEntity> fcsDateEntities = new ArrayList<DealerFcsDateEntity>(0);
        	
        	if(fcsDates != null) {
        		for (DealerFcsDateBean dealerFcsDateBean : fcsDates) {
        			DealerFcsDateEntity entity = new DealerFcsDateEntity();
        			DealerFcsDateEntityPK pk = new DealerFcsDateEntityPK();
        			pk.setDateType(dealerFcsDateBean.getDateType().getCode());
        			pk.setParent(newEntity);
        			entity.setId(pk);
        			entity.setActionDate(dealerFcsDateBean.getActionDate());
        			fcsDateEntities.add(entity);
        		}
        		
        		newEntity.setFcsDates(fcsDateEntities);
        	}
        	
        	// set dealer group link
        	
        	List<DealerGroupDealerLinkBean> dealerGroupDealerLinkList = agent.getDealerGroupDealerlink();
        	List<DealerGroupDealersLinkEntity> groupDealersLinkEntities = new ArrayList<DealerGroupDealersLinkEntity>(0);
        	
        	if(dealerGroupDealerLinkList !=null){
        		for(DealerGroupDealerLinkBean dealerGroupDealerLinkBean : dealerGroupDealerLinkList) {
        			DealerGroupDealersLinkEntity dealersLinkEntity = new DealerGroupDealersLinkEntity();
        			DealerGroupDealersLinkEntityPK pk = new DealerGroupDealersLinkEntityPK();
        			pk.setGroupNumber(dealerGroupDealerLinkBean.getGroupNumber());
        			pk.setParent(newEntity);
        			dealersLinkEntity.setId(pk);
        			groupDealersLinkEntities.add(dealersLinkEntity);
        		}
        		newEntity.setDealerGroupLinks(groupDealersLinkEntities);
        	}
        }

        // set dealer coverage if PWS dealer

        if(agent.getDealerCategory() == DealerCategory.PWS) {

            List<DealerCoverage> coverages = agent.getDealerCoverage();
            List<DealerCoverageEntity> entities = new ArrayList<DealerCoverageEntity>(0);

            if(coverages != null) {
                for(DealerCoverage coverage : coverages) {
                    DealerCoverageEntity entity = new DealerCoverageEntity();
                    entity.setAgentNumber(agent.getAgentNumber());
                    entity.setDealerCoverageRegionId(coverage.getCode());
                    entities.add(entity);
                }

                newEntity.setCoverageEntities(entities);
            }

            List<DealerProductType> productTypes = agent.getProductType();
            List<DealerProductTypeEntity> productTypeEntities = new ArrayList<DealerProductTypeEntity>(0);

            if(productTypes != null) {
                for(DealerProductType productType : productTypes) {
                    DealerProductTypeEntity entity =new DealerProductTypeEntity();
                    entity.setAgentNumber(agent.getAgentNumber());
                    entity.setProductTypeId((int) productType.getCode());
                    if(productType == DealerProductType.CustomBuiltPoweredWheelchair) {
                        entity.setProductTypeId((int)DealerProductType.PoweredWheelchair.getCode());
                        entity.setCustomiser(true);
                    }

                    productTypeEntities.add(entity);
                }
                newEntity.setProductTypes(productTypeEntities);
            }
        }

        newEntity.persist();

    }

	@Transactional
	public void updateDealer(DealerBean agent) throws DealerValidationException {
        LOG.debug("Got call on DealerDataServiceImpl - updateDealer");

       // set main dealer entity
        if(agent.getDealerCategory() == DealerCategory.Car) {
	        if(agent.getVehicleManufacturerCode() == null)
	            throw new DealerValidationException("VehicleManufacturerCode must be set, cannot be null");
	
	        ManufacturersEntity manufacturersEntity = null;
	        Throwable t = null;
	
	        try {
	            manufacturersEntity = (ManufacturersEntity)ManufacturersEntity.findManufacturerByCode(agent.getVehicleManufacturerCode()).getSingleResult();
	        }catch (Exception e) {
	            t = e;
	        }
	        finally {
	            if(manufacturersEntity == null) {
	                throw new DealerValidationException("Vehicle manufacturer not found for code: " + agent.getVehicleManufacturerCode(), t);
	            }
	        }
        }
        MaintenanceAgentMaagEntity existingEntity = MaintenanceAgentMaagEntity.findMaintenanceAgentMaagEntity(agent.getAgentNumber());
        existingEntity.setDealerBean(agent);
        MaintenanceAgentExtraEntity existingExtraEntity = existingEntity.getExtra();
        existingExtraEntity.setDealerExtraBean(agent.getExtra());
        existingEntity.setExtra(existingExtraEntity);
        

        if(agent.getDealerCategory() == DealerCategory.Car) {
      	
        	List<DealerFcsDateBean> newfcsDateBeanList = agent.getDealerFcsDateBean();
//        	List<DealerFcsDateEntity> existingfcsDateEntitiesList = existingEntity.getFcsDates();
        	List<DealerFcsDateEntity> newfcsDateEntitiesList = new ArrayList<DealerFcsDateEntity>(0);
        	
        	
/*        	if(fcsDates != null) {
        		for (DealerFcsDateBean dealerFcsDateBean : fcsDates) {
        			DealerFcsDateEntity entity = new DealerFcsDateEntity();
        			DealerFcsDateEntityPK pk = new DealerFcsDateEntityPK();
        			pk.setDateType(dealerFcsDateBean.getDateType().getCode());
        			pk.setParent(existingEntity);
        			entity.setId(pk);
        			entity.setActionDate(dealerFcsDateBean.getActionDate());
       				DealerFcsDateEntity.deleteDealerFCSDateEntities(pk);// delete the old entity as we have an updated entity ready.
        			fcsDateEntities.add(entity);
        		}
        		
        		existingEntity.setFcsDates(fcsDateEntities);
        	}*/
        	
        	if(newfcsDateBeanList!=null){
        		for(DealerFcsDateBean newdealerfcsDateBean : newfcsDateBeanList){
        			DealerFcsDateEntity entity = new DealerFcsDateEntity();
        			DealerFcsDateEntityPK pk = new DealerFcsDateEntityPK();
        			pk.setDateType(newdealerfcsDateBean.getDateType().getCode());
        			pk.setParent(existingEntity);
        			entity.setId(pk);
        			entity.setActionDate(newdealerfcsDateBean.getActionDate());
        			DealerFcsDateEntity.deleteDealerFCSDateEntities(pk);
        			newfcsDateEntitiesList.add(entity);        			
        		}
        		
        		existingEntity.setFcsDates(newfcsDateEntitiesList);
        	}
        	
        	
        	
        	// set dealer group link
        	
        	List<DealerGroupDealerLinkBean> dealerGroupLinkBeanList = agent.getDealerGroupDealerlink();
        	List<DealerGroupDealersLinkEntity> newGroupDealersLinkEntities = new ArrayList<DealerGroupDealersLinkEntity>(0);
        	
        	if(dealerGroupLinkBeanList!=null){
        		for(DealerGroupDealerLinkBean dealerLinkBean : dealerGroupLinkBeanList) {
        			DealerGroupDealersLinkEntity dealersLinkEntity = new DealerGroupDealersLinkEntity();
        			DealerGroupDealersLinkEntityPK pk = new DealerGroupDealersLinkEntityPK();
        			pk.setGroupNumber(dealerLinkBean.getGroupNumber());
        			pk.setParent(existingEntity);
        			
        			if(!dealerLinkBean.getFlag().booleanValue())
        				DealerGroupDealersLinkEntity.deleteDealerGroupDealersLinkEntities(pk);
        			else{
        				dealersLinkEntity.setId(pk);
        				newGroupDealersLinkEntities.add(dealersLinkEntity);
        			}
        		}
        		existingEntity.setDealerGroupLinks(newGroupDealersLinkEntities);
        	}
        }

        // set dealer coverage if PWS dealer

        if(agent.getDealerCategory() == DealerCategory.PWS) {

            List<DealerCoverageEntity> newDealerCoverageList = existingEntity.getCoverageEntities();
            DealerCoverageEntity.deleteDealerCoverageEntities(agent.getAgentNumber());
            
            List<DealerCoverage> dealerCoverage = agent.getDealerCoverage();
            if(dealerCoverage != null) {
            	for(DealerCoverage coverage : dealerCoverage){
            		DealerCoverageEntity newCoverageEntity = new DealerCoverageEntity();
	            	newCoverageEntity.setAgentNumber(agent.getAgentNumber());
	            	newCoverageEntity.setDealerCoverageRegionId(coverage.getCode());
	            	newDealerCoverageList.add(newCoverageEntity);
            	}
            }
            existingEntity.setCoverageEntities(newDealerCoverageList);
            

            List<DealerProductType> productTypes = agent.getProductType();
            List<DealerProductTypeEntity> existingProductTypeEntities = existingEntity.getProductTypes();
            DealerProductTypeEntity.deleteDealerProductEntities(agent.getAgentNumber());

            if(productTypes != null) {
                for(DealerProductType productType : productTypes) {
                    DealerProductTypeEntity entity =new DealerProductTypeEntity();
                    entity.setAgentNumber(agent.getAgentNumber());
                    entity.setProductTypeId((int) productType.getCode());
                    if(productType == DealerProductType.CustomBuiltPoweredWheelchair) {
                        entity.setProductTypeId((int)DealerProductType.PoweredWheelchair.getCode());
                        entity.setCustomiser(true);
                    }
                    existingProductTypeEntities.add(entity);
                }
                
                existingEntity.setProductTypes(existingProductTypeEntities);
            }
        }
        existingEntity.merge();
	}

	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public DealerBean getDealer(String agentId) throws DealerNotFoundException {
        LOG.debug("Got call on DealerDataServiceImpl - getDealer");

        MaintenanceAgentMaagEntity maintenanceMaagEntity = MaintenanceAgentMaagEntity.findMaintenanceAgentMaagEntity(agentId);

        if(maintenanceMaagEntity == null) {
            throw new DealerNotFoundException("No dealer found for number: " + agentId);
        }



        DealerBean dealerBean = maintenanceMaagEntity.getDealerBean();

        MaintenanceAgentExtraEntity dealerExtra = maintenanceMaagEntity.getExtra();
        dealerBean.setExtra(dealerExtra.getDealerExtraBean());
        
        List<DealerFcsDateEntity> fcsDates = maintenanceMaagEntity.getFcsDates();
        List <DealerFcsDateBean> dealerFcsDateBeanList = new ArrayList<DealerFcsDateBean>(0);
        if(fcsDates != null){
        	for(DealerFcsDateEntity dfdEntity : fcsDates){
        		DealerFcsDateBean fcsBean = new DealerFcsDateBean();
        		fcsBean.setActionDate(dfdEntity.getActionDate());
        		fcsBean.setDateType(DealerFcsDateType.getDealerFcsDateType(dfdEntity.getId().getDateType()));
        		dealerFcsDateBeanList.add(fcsBean);
        	}
        }
        dealerBean.setDealerFcsDateBean(dealerFcsDateBeanList);
        
        List<DealerCoverageEntity> coverageEntity = maintenanceMaagEntity.getCoverageEntities();
        List <DealerCoverage> dealerCoverageList = new ArrayList<DealerCoverage>(0);
        if(coverageEntity != null){
        	for(DealerCoverageEntity dcEntity : coverageEntity){
        		dealerCoverageList.add(DealerCoverage.getDealerCoverage((short)dcEntity.getDealerCoverageRegionId()));
        	}
        }
        dealerBean.setDealerCoverage(dealerCoverageList);

        List<DealerProductTypeEntity> dealerProductTypeEntities = maintenanceMaagEntity.getProductTypes();
        List<DealerProductType> dealerProductTypeList = new ArrayList<DealerProductType>();
        if(dealerProductTypeEntities !=null){
        	for(DealerProductTypeEntity dptEntity : dealerProductTypeEntities){
        		dealerProductTypeList.add(DealerProductType.getDealerProductType(dptEntity.getProductTypeId().shortValue()));
        	}
        }
        dealerBean.setProductType(dealerProductTypeList);

        List<DealerGroupDealersLinkEntity> dealerGroupLinkList = maintenanceMaagEntity.getDealerGroupLinks();
        ArrayList<DealerGroupDealerLinkBean> dealerGroupLinkBeanList = new ArrayList<DealerGroupDealerLinkBean>(0);
        
        if(dealerGroupLinkList != null){
        	for(DealerGroupDealersLinkEntity entity : dealerGroupLinkList){
        		DealerGroupDealerLinkBean bean = new DealerGroupDealerLinkBean();
        		bean.setGroupNumber(entity.getId().getGroupNumber());
        		bean.setFlag(true); // because anything which is in the database is active. Inactive are always deleted by updateDealer method.
        		bean.setAgentNumber(agentId);
        		dealerGroupLinkBeanList.add(bean);
        	}
        }
        dealerBean.setDealerGroupDealerlink(dealerGroupLinkBeanList);
        return dealerBean; 
		
	}

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long countAllRecords() {
        return (Long)MaintenanceAgentMaagEntity.countActiveDealers().getSingleResult();
    }
}
