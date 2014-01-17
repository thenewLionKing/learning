package uk.co.mo.app.mercury.domain.vehicle.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import uk.co.mo.app.mercury.cs.dao.LegacyDAO;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementDealerBean;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementDeliveryDateHistoryBean;
import uk.co.mo.app.mercury.domain.agreement.entity.AgreementDealerEntity;
import uk.co.mo.app.mercury.domain.agreement.entity.AgreementDealerEntityPK;
import uk.co.mo.app.mercury.domain.agreement.entity.AgreementDeliveryDateHistoryEntity;
import uk.co.mo.app.mercury.domain.agreement.entity.AgreementEntity;
import uk.co.mo.app.mercury.domain.org.manufacturer.beans.ManufacturerBean;
import uk.co.mo.app.mercury.domain.org.manufacturer.entity.ManufacturersEntity;
import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptAdaptationBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.AgreementAdaptationBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.GlassPaintColourBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.LeaseVehicleModelBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.ModelCodeBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.ProfilesBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.TransTypeCodeBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.TransmissionCodeBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VehicleBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VehicleColourBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VehicleSnapShotBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VrmBvReturnBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VrmDeliveryTypeBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VrmHandbackDetailsHistoryBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VrmLocationBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VrmMoveBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VrmOrganisationBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VrmOrganisationLinkAgentBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VrmSoldBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VrmStockBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VrmStockDescriptionBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.VrmVcrGradeIdBean;
import uk.co.mo.app.mercury.domain.vehicle.entity.AdaptAdaptationEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.AgreementAdaptationEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.GlassPaintColourEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.LeaseVehicleModelEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.ModelCodeEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.ModelDescriptionEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.ProfilesEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.TransTypeCodeEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.TransmissionCodeEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.VehicleColourEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.VehicleEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.VrmBvReturnEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.VrmHandbackDetailsHistoryEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.VrmLocationEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.VrmMoveEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.VrmOrganisationEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.VrmOrganisationLinkAgentEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.VrmSoldEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.VrmStockEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.VrmVcrGradeIdEntity;

@Service("vehicleDataService")
public class VehicleDataServiceImpl implements VehicleDataService {

    private static final Log LOG = LogFactory.getLog(VehicleDataServiceImpl.class);
    
    @Autowired
    private LegacyDAO dao;
	
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public VehicleBean getVehicleData(String assetNumber) {
		LOG.debug("Got call on VehicleDataServiceImpl");
		
		AgreementEntity agreementEntity = (AgreementEntity) AgreementEntity.findAgreementByAssetNumber(Integer.valueOf(assetNumber)).getSingleResult();
		VehicleEntity vehicleEntity = null;
		ProfilesEntity profilesEntity = null;
		LeaseVehicleModelEntity leaseVehicleModelEntity = null;
		VrmStockEntity stockEntity = null;
		ModelDescriptionEntity modelDescription = null;
		ModelCodeEntity modelCodeEntity = null;
		TransmissionCodeEntity transmissionCodeEntity =null;
		TransTypeCodeEntity transTypeCodeEntity = null;
		GlassPaintColourEntity glassPaintEntity = null;
		
		VehicleBean vb = new VehicleBean();
		ProfilesBean profilesBean = new ProfilesBean();
		ModelCodeBean modelCodebean = new ModelCodeBean();
		TransmissionCodeBean transmissionCodeBean = new TransmissionCodeBean();
		TransTypeCodeBean transTypeCodeBean = new TransTypeCodeBean();
		GlassPaintColourBean glassPaintColourBean = new GlassPaintColourBean();
		VehicleColourBean vehicleColourBean = new VehicleColourBean();
		LeaseVehicleModelBean vehicleModelBean = new LeaseVehicleModelBean();
		
		try{
			
		if(agreementEntity !=null){
			
			List<AgreementAdaptationEntity> agreementAdaptationEntityList = agreementEntity.getAgreementAdaptationEntity();
			List<AgreementAdaptationBean> agrAdaptBeanList = new ArrayList<AgreementAdaptationBean>(0);
			
			if(agreementAdaptationEntityList != null && agreementAdaptationEntityList.size()>0){
				for(AgreementAdaptationEntity aae : agreementAdaptationEntityList){
					AgreementAdaptationBean aaBean = aae.getAgreementAdaptationBean();
					if(aaBean.getAdaptationId()!=null){// MO managed only
						
						aaBean.setAdaptFitterBean(aae.getAdaptFitterEntity().getAdaptFitterBean());
						
						AdaptAdaptationEntity adaptAdaptationEntity = aae.getAdaptAdaptationEntity();
						AdaptAdaptationBean adaptAdaptationBean = adaptAdaptationEntity.getAdaptAdaptationBean();
						
						adaptAdaptationBean.setAdaptAdaptationGroupBean(adaptAdaptationEntity.getAdaptAdaptationGroupEntity().getAdaptAdaptationGroupBean());
						adaptAdaptationBean.setAdaptManufacturerBean(adaptAdaptationEntity.getAdaptManufacturerEntity().getAdaptManufacturerBean());
						
						aaBean.setAdaptAdaptationBean(adaptAdaptationBean);
					}
					agrAdaptBeanList.add(aae.getAgreementAdaptationBean());
				}
			}

			vehicleEntity = agreementEntity.getVehicleEntity();
			profilesEntity = agreementEntity.getProfilesEntity();

			if(profilesEntity !=null){
				profilesBean = profilesEntity.getProfilesBean();

				if(profilesBean.getLeaseVehicleId()!=0){// Not a HP vehicle
					leaseVehicleModelEntity = profilesEntity.getLeaseVehicleModelEntity();

					if(leaseVehicleModelEntity !=null){
						vehicleModelBean  = leaseVehicleModelEntity.getLeaseVehicleModelBean();

						modelCodeEntity = leaseVehicleModelEntity.getModelCodeEntity();
						modelCodebean = modelCodeEntity.getModelCodeBean();
						if(modelCodeEntity!= null){
							transmissionCodeEntity = modelCodeEntity.getTransmissionCodeEntity();
							transmissionCodeBean = transmissionCodeEntity.getTransmissionCodeBean();
						}
						if(transmissionCodeEntity !=null){
							transTypeCodeEntity = transmissionCodeEntity.getTransTypeCodeEntity();
							transTypeCodeBean = transTypeCodeEntity.getTransTypeCodeBean();
						}
					}
					
					//set Trans Type Code Bean
					transmissionCodeBean.setTransTypeCodeBean(transTypeCodeBean);
					
					// set Transmission Code bean
					modelCodebean.setTransmissionCodeBean(transmissionCodeBean);
					
					// set Model Code Bean
					vehicleModelBean.setModelCodeBean(modelCodebean);
					
					// set Lease Vehicle Model bean
					profilesBean.setLeaseVehicleModelBean(vehicleModelBean);
				}
				
			}

			if(vehicleEntity !=null){
				vb = vehicleEntity.getVehicleBean();
				try{
					stockEntity = VrmStockEntity.findVrmStockEntity(vb.getStockId());
				}catch(Exception e){
					LOG.info("No VRM Stock entity found for stock id :: "+vb.getStockId());
				}
				modelDescription = vehicleEntity.getModelDescriptionEntity();
				//Get Vehicle Colour
				VehicleColourEntity vehicleColourEntity = vehicleEntity.getVehicleColourEntity();
				if(vehicleColourEntity!=null){
					vehicleColourBean = vehicleColourEntity.getVehicleColourBean();
					// Get Glass paint colour
					glassPaintEntity = vehicleColourEntity.getGlassPaintColourEntity();
					if(glassPaintEntity!= null)
						glassPaintColourBean = glassPaintEntity.getGlassPaintColourBean();
					
					// set Glass colour
					vehicleColourBean.setGlassPaintColourBean(glassPaintColourBean);
				}
				
			}

			
			//Set model Description
			if(modelDescription!=null)
				vb.setModelDescription(modelDescription.getModelDescriptionBean());
			
			//set Profiles Bean
			vb.setProfilesBean(profilesBean);			
			
			//set Agreement Adapatation
			vb.setAgreementAdaptationBean(agrAdaptBeanList);
			
			// set Vehicle colour
			vb.setVehicleColourBean(vehicleColourBean);
			// set VRM Stock Bean
			if(stockEntity != null && stockEntity.getVrmStockBean() !=null)
				vb.setVrmStockBean(stockEntity.getVrmStockBean());
			}
		}catch(EntityNotFoundException ef){
			LOG.debug("Can't find VRM stock Bean for stock_id ::");
		}
	return vb; 
	}

	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public VehicleBean getVehicleByRegistrationNumber(String registrationNumber) {
		LOG.debug("Got call on VehicleDataServiceImpl :: getVehicleByRegistrationNumber");
		
		VehicleEntity vehicleEntity = VehicleEntity.findVehicleEntityByRegistrationNumber(registrationNumber);
		ProfilesBean profilesBean = new ProfilesBean();
		VehicleBean vehicleBean = new VehicleBean();
		ProfilesEntity profilesEntity = null;
		LeaseVehicleModelEntity leaseVehicleModelEntity = null;
		VrmStockEntity stockEntity = null;
		ModelDescriptionEntity modelDescription = null;
		ModelCodeEntity modelCodeEntity = null;
		TransmissionCodeEntity transmissionCodeEntity =null;
		TransTypeCodeEntity transTypeCodeEntity = null;
		GlassPaintColourEntity glassPaintEntity = null;
		
		VehicleBean vb = new VehicleBean();
		VrmStockBean vrmStockBean = new VrmStockBean();
		ModelCodeBean modelCodebean = new ModelCodeBean();
		TransmissionCodeBean transmissionCodeBean = new TransmissionCodeBean();
		TransTypeCodeBean transTypeCodeBean = new TransTypeCodeBean();
		GlassPaintColourBean glassPaintColourBean = new GlassPaintColourBean();
		VehicleColourBean vehicleColourBean = new VehicleColourBean();
		LeaseVehicleModelBean vehicleModelBean = new LeaseVehicleModelBean();
		
		
		try{
			if(vehicleEntity!=null){
				vehicleBean = vehicleEntity.getVehicleBean();
				
				AgreementEntity agreementEntity = (AgreementEntity) AgreementEntity.findAgreementByAssetNumber(vehicleBean.getAssetNumber()).getSingleResult();
				
				List<AgreementAdaptationEntity> agreementAdaptationEntityList = agreementEntity.getAgreementAdaptationEntity();
				List<AgreementAdaptationBean> agrAdaptBeanList = new ArrayList<AgreementAdaptationBean>(0);
				
				if(agreementAdaptationEntityList != null && agreementAdaptationEntityList.size()>0){
					for(AgreementAdaptationEntity aae : agreementAdaptationEntityList){
						AgreementAdaptationBean aaBean = aae.getAgreementAdaptationBean();
						if(aaBean.getAdaptationId()!=null){// MO managed only
							
							aaBean.setAdaptFitterBean(aae.getAdaptFitterEntity().getAdaptFitterBean());
							
							AdaptAdaptationEntity adaptAdaptationEntity = aae.getAdaptAdaptationEntity();
							AdaptAdaptationBean adaptAdaptationBean = adaptAdaptationEntity.getAdaptAdaptationBean();
							
							adaptAdaptationBean.setAdaptAdaptationGroupBean(adaptAdaptationEntity.getAdaptAdaptationGroupEntity().getAdaptAdaptationGroupBean());
							adaptAdaptationBean.setAdaptManufacturerBean(adaptAdaptationEntity.getAdaptManufacturerEntity().getAdaptManufacturerBean());
							
							aaBean.setAdaptAdaptationBean(adaptAdaptationBean);
						}
						agrAdaptBeanList.add(aae.getAgreementAdaptationBean());
					}
				}

				//Get Vehicle Colour
				VehicleColourEntity vehicleColourEntity = vehicleEntity.getVehicleColourEntity();
		
				if(vehicleColourEntity!=null){
					vehicleColourBean = vehicleColourEntity.getVehicleColourBean();
					// Get Glass paint colour
					glassPaintEntity = vehicleColourEntity.getGlassPaintColourEntity();
					if(glassPaintEntity!= null)
						glassPaintColourBean = glassPaintEntity.getGlassPaintColourBean();
					
					// set Glass colour
					vehicleColourBean.setGlassPaintColourBean(glassPaintColourBean);
				}
				
				
				if(agreementEntity !=null)
					profilesEntity = agreementEntity.getProfilesEntity();

				if(profilesEntity !=null){
					profilesBean = profilesEntity.getProfilesBean();

					if(profilesBean.getLeaseVehicleId()!=0){// Not a HP vehicle
						leaseVehicleModelEntity = profilesEntity.getLeaseVehicleModelEntity();

						if(leaseVehicleModelEntity !=null){
							vehicleModelBean  = leaseVehicleModelEntity.getLeaseVehicleModelBean();

							modelCodeEntity = leaseVehicleModelEntity.getModelCodeEntity();
							modelCodebean = modelCodeEntity.getModelCodeBean();
							if(modelCodeEntity!= null){
								transmissionCodeEntity = modelCodeEntity.getTransmissionCodeEntity();
								transmissionCodeBean = transmissionCodeEntity.getTransmissionCodeBean();
							}
							if(transmissionCodeEntity !=null){
								transTypeCodeEntity = transmissionCodeEntity.getTransTypeCodeEntity();
								transTypeCodeBean = transTypeCodeEntity.getTransTypeCodeBean();
							}
						}
						
						//set Trans Type Code Bean
						transmissionCodeBean.setTransTypeCodeBean(transTypeCodeBean);
						
						// set Transmission Code bean
						modelCodebean.setTransmissionCodeBean(transmissionCodeBean);
						
						// set Model Code Bean
						vehicleModelBean.setModelCodeBean(modelCodebean);
						
						// set Lease Vehicle Model bean
						profilesBean.setLeaseVehicleModelBean(vehicleModelBean);
					}
					
				}
				
				//Get model Description
				modelDescription = vehicleEntity.getModelDescriptionEntity();
				if(modelDescription!=null)
					vehicleBean.setModelDescription(modelDescription.getModelDescriptionBean());
				
				//Set Agreement Adaptation
				vehicleBean.setAgreementAdaptationBean(agrAdaptBeanList);
				//set Profiles Bean
				vehicleBean.setProfilesBean(profilesBean);
				
				// set Vehicle colour
				vehicleBean.setVehicleColourBean(vehicleColourBean);

				try{
					stockEntity = VrmStockEntity.findVrmStockEntity(vb.getStockId());
				}catch(Exception e){
					LOG.info("No VRM Stock entity found for stock id :: "+vb.getStockId());
				}

				if(stockEntity!=null && stockEntity.getStockId()!=null){
					vrmStockBean = stockEntity.getVrmStockBean();
					vrmStockBean.setVrmStockDescriptionBean(stockEntity.getVrmStockDescriptionEntity().getVrmStockDescriptionBean());
				}
				
				vehicleBean.setVrmStockBean(vrmStockBean);
			}
		}catch(EntityNotFoundException ef){
			LOG.debug("Can't find VRM stock Bean for stock_id ::");
		}
		return vehicleBean;
	}

	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public VehicleSnapShotBean getVehicleByRecordId(Integer recordId) {
		
		VehicleSnapShotBean vehicleSnapShotBean = (VehicleSnapShotBean)dao.getSoaInterfaceSessionFactory().getCurrentSession()
        .getNamedQuery("get_updated_vehicle").setParameter(0, recordId)
        .setResultTransformer(Transformers.aliasToBean((VehicleSnapShotBean.class))).list().get(0);
		
		return vehicleSnapShotBean;
	}

	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public VehicleBean getVehicleSalesInfo(Integer stockId) {
		VehicleEntity vehicleEntity = VehicleEntity.findVehicleEntityByStockId(stockId);
		VrmStockEntity vrmStockEntity = null;
		ModelDescriptionEntity modelDescription = null;
		VehicleColourEntity vehicleColourEntity = null;
		GlassPaintColourEntity glassPaintEntity = null;
		
		VehicleBean vehicleBean = vehicleEntity.getVehicleBean();
		VrmStockBean stockBean = new VrmStockBean();
		VehicleColourBean vehicleColourBean = new VehicleColourBean();
		GlassPaintColourBean glassPaintColourBean = new GlassPaintColourBean();
		
		if(vehicleEntity!=null){
			//Get VRM Stock info
			vrmStockEntity = vehicleEntity.getVrmStockEntity();
			stockBean = vrmStockEntity.getVrmStockBean();
			//Get model Description
			modelDescription = vehicleEntity.getModelDescriptionEntity();
			if(modelDescription!=null)
				vehicleBean.setModelDescription(modelDescription.getModelDescriptionBean());

			//Get Vehicle Colour
			vehicleColourEntity = vehicleEntity.getVehicleColourEntity();
			if(vehicleColourEntity!=null){
				vehicleColourBean = vehicleColourEntity.getVehicleColourBean();
				
				// Get Glass paint colour
				glassPaintEntity = vehicleColourEntity.getGlassPaintColourEntity();
				if(glassPaintEntity!= null)
					glassPaintColourBean = glassPaintEntity.getGlassPaintColourBean();
			}
		}
		
		// Get VRM VCR Grade Info
		VrmVcrGradeIdEntity vrmVcrGradeIdEntity = vrmStockEntity.getVrmVcrGradeIdEntity();
		VrmVcrGradeIdBean vrmVcrGradeIdBean = new VrmVcrGradeIdBean();
		if(vrmVcrGradeIdEntity !=null)
			vrmVcrGradeIdBean = vrmVcrGradeIdEntity.getVrmVcrGradeIdBean();
		
		
		
		
		// set Glass colour
		vehicleColourBean.setGlassPaintColourBean(glassPaintColourBean);
		
		// Get VRM MOVE entity
		List<VrmMoveEntity> vrmMoveEntityList = vrmStockEntity.getVrmMoveEntity();
		List<VrmMoveBean> vrmMoveBeanList = new ArrayList<VrmMoveBean>(0);
		
		if(vrmMoveEntityList.size()>0 && vrmMoveEntityList!=null){
			for (VrmMoveEntity vrmMoveEntity : vrmMoveEntityList) {
				VrmMoveBean moveBean = vrmMoveEntity.getVrmMoveBean();
				if(vrmMoveEntity.getVrmLocationEntity()!=null){
					VrmLocationEntity locationEntity = vrmMoveEntity.getVrmLocationEntity();
					VrmLocationBean locationBean = locationEntity.getVrmLocationBean();
					if(locationEntity.getVrmOrganisationEntity()!=null)
						locationBean.setVrmOrganisationBean(locationEntity.getVrmOrganisationEntity().getVrmOrganisationBean());
					moveBean.setVrmLocationBean(locationBean);
				}
				moveBean.setVrmMoveTypeBean(vrmMoveEntity.getVrmMoveTypeEntity().getVrmMoveTypeBean());
				vrmMoveBeanList.add(moveBean);
			}
		}
		
		//Get VRM Handback Details history
		List<VrmHandbackDetailsHistoryBean> vrmHandbackDetailsHistoryBeanList = getHandbackDetailsHistory(vrmStockEntity);
		
		// Get Agreement Delivery Date history
		AgreementEntity agreementEntity = AgreementEntity.findAgreementEntity(stockBean.getAgreementId());
		
		List<AgreementDeliveryDateHistoryBean> agreementDeliveryDateHistoryBeanList = new ArrayList<AgreementDeliveryDateHistoryBean>(0);
		List<AgreementDeliveryDateHistoryEntity> agreementDeliveryDateHistoryEntityList = agreementEntity.getDeliveryDates();

		if(agreementDeliveryDateHistoryEntityList !=null){
			for(AgreementDeliveryDateHistoryEntity agreementDeliveryDateHistoryEntity : agreementDeliveryDateHistoryEntityList){
				agreementDeliveryDateHistoryBeanList.add(agreementDeliveryDateHistoryEntity.getAgreementDeliveryDateHistoryBean());
			}
		}
		
		//Get Vrm Stock Description
		VrmStockDescriptionBean vrmStockDescriptionBean= new VrmStockDescriptionBean();
		if(vrmStockEntity.getVrmStockDescriptionEntity()!=null){
			vrmStockDescriptionBean = vrmStockEntity.getVrmStockDescriptionEntity().getVrmStockDescriptionBean();	
		}
		

		//Get Agreement Dealer Entity
		List<AgreementDealerEntity> agreementDealerEntityList = agreementEntity.getAgreementDealers();
		List<AgreementDealerBean> agreementDealerBeanList = new ArrayList<AgreementDealerBean>(0);
		if(agreementDealerEntityList !=null){
			for(AgreementDealerEntity agreementDealerEntity : agreementDealerEntityList){
				
				AgreementDealerEntityPK agrDealerPKEntity = agreementDealerEntity.getId();
				AgreementDealerBean agreementDealerBean = agreementDealerEntity.getAgreementDealerBean();
				agreementDealerBean.setAgreementId(agrDealerPKEntity.getAgreement().getAgreementId());
				agreementDealerBean.setDealerTypeId(agrDealerPKEntity.getDealerTypeId());
				agreementDealerBeanList.add(agreementDealerBean);
			}
		}
		
		
		//Get Manufacturers Entity
		ManufacturersEntity manufacturerEntity = ManufacturersEntity.findManufacturersEntity(stockBean.getManufacturerId());
		ManufacturerBean manufacturerBean = manufacturerEntity.getManufacturerBean();
		//Get VRM Sold Entity
		VrmSoldEntity vrmSoldEntity = VrmSoldEntity.findVrmSoldEntityByStockId(stockBean.getStockId());
		VrmOrganisationBean vrmOrganisationBean = new VrmOrganisationBean();
		
		if(vrmSoldEntity!=null){
			VrmSoldBean vrmSoldBean = vrmSoldEntity.getVrmSoldBean();
			List <VrmSoldBean> vrmSoldBeanList = new ArrayList<VrmSoldBean>(0);
			vrmSoldBeanList.add(vrmSoldBean);
			VrmOrganisationEntity vrmOrganisationEntity = vrmSoldEntity.getVrmOrganisation();
			if(vrmOrganisationEntity!=null)
				vrmOrganisationBean = vrmOrganisationEntity.getVrmOrganisationBean();
			
			VrmOrganisationLinkAgentEntity vrmOrgLinkAgents = vrmOrganisationEntity.getVrmOrganisationLinkAgents();
			VrmOrganisationLinkAgentBean vrmOrgLinkAgentBean = new VrmOrganisationLinkAgentBean();
			
			if(vrmOrgLinkAgents !=null){
				vrmOrgLinkAgentBean = vrmOrgLinkAgents.getVrmOrganisationLinkAgentBean();
			}
			
			vrmOrganisationBean.setVrmSoldBean(vrmSoldBeanList);
			vrmOrganisationBean.setVrmOrganisationLinkAgentBean(vrmOrgLinkAgentBean);
		}

		List<VrmBvReturnEntity> vrmBvReturnEntityList = VrmBvReturnEntity.findAllEntitiesByStockId(stockId);
		List<VrmBvReturnBean> vrmBvReturnBeanList = new ArrayList<VrmBvReturnBean>(0);
		for(VrmBvReturnEntity vrmBvReturnEntity : vrmBvReturnEntityList){
			VrmDeliveryTypeBean vrmDeliveryTypeBean = new VrmDeliveryTypeBean();
			VrmBvReturnBean vrmBvReturnBean = new VrmBvReturnBean();
			if(vrmBvReturnEntity.getVrmDeliveryTypeEntity()!=null)
				vrmDeliveryTypeBean = vrmBvReturnEntity.getVrmDeliveryTypeEntity().getVrmDeliveryTypeBean();
			if(vrmBvReturnEntity !=null)
				vrmBvReturnBean = vrmBvReturnEntity.getVrmBvReturnBean();
			vrmBvReturnBean.setVrmDeliveryTypeBean(vrmDeliveryTypeBean);
			vrmBvReturnBeanList.add(vrmBvReturnBean);
		}
		
		
		// set VRM Move info
		stockBean.setVrmMoveBean(vrmMoveBeanList);
		// set VRM Handback Details History
		stockBean.setVrmHandbackDetailsHistoryBean(vrmHandbackDetailsHistoryBeanList);
		//set Agreement Details history
		stockBean.setAgreementDeliveryDateHistoryBean(agreementDeliveryDateHistoryBeanList);
		//set VRM stock description 
		stockBean.setVrmStockDescriptionBean(vrmStockDescriptionBean);
		// set Agreement Dealer
		stockBean.setAgreementDealerBean(agreementDealerBeanList);
		//set Manufacturer
		stockBean.setManufacturerBean(manufacturerBean);
		//set VRM Organisation
		stockBean.setVrmOrganisationBean(vrmOrganisationBean);
		//set Grade informatino
		stockBean.setVrmVcrGradeIdBean(vrmVcrGradeIdBean);
		
		//Set Vehicle Colour
		vehicleBean.setVehicleColourBean(vehicleColourBean);
		//set VRM BV Return List
		vehicleBean.setVrmBvReturn(vrmBvReturnBeanList);
		// set VRM Stock Bean
		vehicleBean.setVrmStockBean(stockBean);
	
		return vehicleBean;
	}

	private List<VrmHandbackDetailsHistoryBean> getHandbackDetailsHistory(VrmStockEntity vrmStockEntity) {
		
		List<VrmHandbackDetailsHistoryBean> vrmHandbackDetailsHistoryBeanList = new ArrayList<VrmHandbackDetailsHistoryBean>(0);
		List<VrmHandbackDetailsHistoryEntity> handBackHistoryEntityList = vrmStockEntity.getVrmHandbackDetailsHistoryEntity();
		
		if(handBackHistoryEntityList !=null){
			for(VrmHandbackDetailsHistoryEntity handBackHistoryEntity : handBackHistoryEntityList){
				VrmHandbackDetailsHistoryBean historyBean = handBackHistoryEntity.getVrmHandbackDetailsHistoryBean();
				VrmOrganisationEntity vrmOrganisationEntity = handBackHistoryEntity.getVrmOrganisationEntity();
				if(vrmOrganisationEntity !=null){
					VrmOrganisationBean vrmOrganisationBean = vrmOrganisationEntity.getVrmOrganisationBean();
					
					if(vrmOrganisationEntity.getVrmOrganisationLinkAgents()!=null){
						vrmOrganisationBean.setVrmOrganisationLinkAgentBean(vrmOrganisationEntity.getVrmOrganisationLinkAgents().getVrmOrganisationLinkAgentBean());
					}
					historyBean.setVrmOrganisationBean(vrmOrganisationBean);
				}
				vrmHandbackDetailsHistoryBeanList.add(historyBean);
			}
		}
		return vrmHandbackDetailsHistoryBeanList;
	}

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long countAllRecords() {
        return (Long)VehicleEntity.countSchemeVehicles().getSingleResult();
    }
}
