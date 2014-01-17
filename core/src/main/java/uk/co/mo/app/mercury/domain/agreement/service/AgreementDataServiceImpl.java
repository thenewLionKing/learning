package uk.co.mo.app.mercury.domain.agreement.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import uk.co.mo.app.mercury.cs.dao.LegacyDAO;
import uk.co.mo.app.mercury.domain.agreement.beans.*;
import uk.co.mo.app.mercury.domain.agreement.entity.*;
import uk.co.mo.app.mercury.domain.customer.beans.CustomerBean;
import uk.co.mo.app.mercury.domain.customer.entity.CustomerEntity;
import uk.co.mo.app.mercury.domain.product.pricing.beans.ProductPriceProfileBean;
import uk.co.mo.app.mercury.domain.product.pricing.entity.ProductPriceProfileEntity;
import uk.co.mo.app.mercury.domain.vehicle.beans.LeaseVehicleModelBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.ProfilesBean;
import uk.co.mo.app.mercury.domain.vehicle.entity.LeaseVehicleModelEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.ProfilesEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * <p/>
 * User: prabat
 * Date: 14/06/11
 * Time: 09:24
 * <p/>
 * Change Log - Who : When : Comment
 */
@Service("agreementDataService")
public class AgreementDataServiceImpl implements AgreementDataService{
	
	private static final Log LOG = LogFactory.getLog(AgreementDataServiceImpl.class);

    @Autowired
    private LegacyDAO dao;
    
    @Override
    @Transactional(propagation=Propagation.NOT_SUPPORTED)
    public AgreementBean getAgreementByArn(String arn) {
    	AgreementEntity agreementEntity= null;
        try{
        	agreementEntity = (AgreementEntity)AgreementEntity.findAgreementEntitysByArnEquals(arn).getSingleResult();
        }catch(Exception e){
        	LOG.debug("Unable to find agreement Entity for ARN : "+arn);
        }
        AgreementBean agreementBean = new AgreementBean();
        if(agreementEntity != null){
        	
        	agreementBean = agreementEntity.getAgreementBean();
        	
        	List<AgreementDeliveryDateHistoryEntity> agreementDeliveryDateHistoryEntityList = agreementEntity.getDeliveryDates();
        	List<AgreementDeliveryDateHistoryBean> agreementDeliveryDateHistoryBeanList = new ArrayList<AgreementDeliveryDateHistoryBean>(0);
        	
        	if(agreementDeliveryDateHistoryEntityList !=null && agreementDeliveryDateHistoryEntityList.size()>0){
        		for(AgreementDeliveryDateHistoryEntity entity : agreementDeliveryDateHistoryEntityList){
        			AgreementDeliveryDateHistoryBean bean = entity.getAgreementDeliveryDateHistoryBean();
        			agreementDeliveryDateHistoryBeanList.add(bean);
        		}
        	}
        	
        	List<AgreementNominatedDriverEntity> nominatedDriverEntityList = agreementEntity.getNominatedDrivers();
        	List<AgreementNominatedDriverBean> nominatedDriverBeanList = new ArrayList<AgreementNominatedDriverBean>(0);
        	
        	if(nominatedDriverEntityList !=null){
        		for(AgreementNominatedDriverEntity entity : nominatedDriverEntityList){
        			AgreementNominatedDriverBean bean = entity.getAgreementNominatedDriverBean();
        			nominatedDriverBeanList.add(bean);
        		}
        	}
        	
        	AgreementProductEntity agreementProductEntity = null;
        	AgreementProductBean agreementProductBean = new AgreementProductBean();
        	ProductPriceProfileEntity productPriceProfileEntity = null;
        	ProductPriceProfileBean productPriceProfileBean = new ProductPriceProfileBean();
        	ProfilesEntity profilesEntity = null;
        	LeaseVehicleModelEntity leaseVehicleModelEntity = null;
        	LeaseVehicleModelBean leaseVehicleModelBean = new LeaseVehicleModelBean();
        	ProfilesBean profilesBean = new ProfilesBean();
        	
        	if(agreementBean.getSchemeTypeId()!= null && agreementBean.getSchemeTypeId().toString().equals("2")){// PWS agreement
        		agreementProductEntity = agreementEntity.getAgreementProductEntity();
        		productPriceProfileEntity = agreementProductEntity.getPriceProfile();
        		agreementProductBean = agreementProductEntity.getAgreementProductBean();
        		productPriceProfileBean = productPriceProfileEntity.getProductPriceProfileBean();
        		agreementProductBean.setPriceProfile(productPriceProfileBean);
        		agreementBean.setAgreementProductBean(agreementProductBean);
        		
        	}else{// CAR Agreement
        		profilesEntity = agreementEntity.getProfilesEntity();
        		if(profilesEntity!=null){
        			profilesBean= profilesEntity.getProfilesBean();
        			if(profilesBean.getLeaseVehicleId()!=0){// For non-HP vehicles. HP vehicles don't have lease vehicle id.
        				leaseVehicleModelEntity = profilesEntity.getLeaseVehicleModelEntity();
        			}
        			if(leaseVehicleModelEntity!=null)
        				leaseVehicleModelBean = leaseVehicleModelEntity.getLeaseVehicleModelBean();
        			
        			profilesBean.setLeaseVehicleModelBean(leaseVehicleModelBean);
        			agreementBean.setProfilesBean(profilesBean);
        		}
        	}
        	
        	agreementBean.setNominatedDrivers(nominatedDriverBeanList);
        	
        	CustomerEntity customerEntity = agreementEntity.getApplicant();
        	CustomerBean customerBean = customerEntity.getCustomerBean();
        	
        	agreementBean.setCustomer(customerBean);
        	agreementBean.setAgreementDeliveryDateHistoryBean(agreementDeliveryDateHistoryBeanList);

            try {
                ShortTermLeaseExtensionPwsEntity extension = ShortTermLeaseExtensionPwsEntity.findByOldArnEquals(agreementBean.getArn());
                if (extension != null) {
                    agreementBean.setNewArn(extension.getNewArn());
                    agreementBean.setStleActive(extension.getActive());
                    agreementBean.setOriginalEndDate(extension.getOriginalEndDate());
                    agreementBean.setMaxExtensionEndDate(extension.getMaxEndDate());
                    agreementBean.setExtensionReasonId(extension.getReasonId());
                }
            } catch (Exception e) {
            }
        }else{
        		try{
        			VoidAgreementEntity voidAgreementEntity = (VoidAgreementEntity)VoidAgreementEntity.findVoidAgreementEntitysByArnEquals(arn).getSingleResult();
        			agreementBean = voidAgreementEntity.getAgreementBean();
        		}catch(Exception e){
        			LOG.debug("Unable to find agreement or void agreement for ARN"+arn);
        		}
        }
        
        return agreementBean;
    }

	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public AgreementProcBean getAgreementInfo(Integer recordId, String eventId) {

        String actualEventId = filterEventId(eventId);
		
		// domain.businessEvent.agreeement.info
		AgreementProcBean agreementProcBean = new AgreementProcBean();
		agreementProcBean = (AgreementProcBean)dao.getSoaInterfaceSessionFactory().getCurrentSession()
        .getNamedQuery("domain.businessEvent.agreeement.info").setParameter(0, recordId).setParameter(1, Integer.parseInt(actualEventId))
        .setResultTransformer(Transformers.aliasToBean((AgreementProcBean.class))).list().get(0);
		LOG.debug("getAgreementInfo method - AgreementProcBean ::"+agreementProcBean.toString());
		
		String auditId="";
		if(agreementProcBean !=null){
			auditId= agreementProcBean.getAuditId();
		}
		List<GrantItemBean> itemBean = dao.getSoaInterfaceSessionFactory().getCurrentSession()
		.getNamedQuery("domain.businessEvent.agreeement.supplementinfo").setParameter(0, auditId)
		.setResultTransformer(Transformers.aliasToBean((GrantItemBean.class))).list();

		if(itemBean.size()!=0 && itemBean !=null)
			agreementProcBean.setGrantItemBean(itemBean);
		
		return agreementProcBean;
	}

    private String filterEventId(String eventId) {
        String actualEventId=eventId.trim();

        //junk logic to separate event sequence number from eventid.
        if(eventId.trim().contains("-")){
            actualEventId = eventId.substring(0, eventId.indexOf("-"));
        }
        return actualEventId;
    }
    
    @Override
    @Transactional(propagation=Propagation.NOT_SUPPORTED)
    public AgreementPreviousPartiesBean getAgreementPreviousParties(String eventId) {
        String actualEventId = filterEventId(eventId);
        AgreementPreviousPartiesBean agreementPreviousPartiesBean = new AgreementPreviousPartiesBean();
		agreementPreviousPartiesBean = (AgreementPreviousPartiesBean)dao.getSoaInterfaceSessionFactory().getCurrentSession()
        .getNamedQuery("domain.businessEvent.agreeement.previousParties").setParameter(0, Integer.parseInt(actualEventId))
        .setResultTransformer(Transformers.aliasToBean((AgreementPreviousPartiesBean.class))).list().get(0);
		LOG.debug("getAgreementPreviousParties method - AgreementPreviousPartiesBean ::"+agreementPreviousPartiesBean.toString());
        return agreementPreviousPartiesBean;
    }

	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public AgreementBean getAgreementByPK(Integer id) {
		
    	AgreementEntity agreementEntity= null;
    	AgreementBean agreementBean = new AgreementBean();

    	try{
        	agreementEntity = (AgreementEntity)AgreementEntity.findAgreementEntity(id);
        }catch(Exception e){
        	LOG.debug("Unable to find agreement Entity for Agreement_id : "+id);
        }
		
        if(agreementEntity != null){
        	
        	agreementBean = agreementEntity.getAgreementBean();
        	
        	List<AgreementDeliveryDateHistoryEntity> agreementDeliveryDateHistoryEntityList = agreementEntity.getDeliveryDates();
        	List<AgreementDeliveryDateHistoryBean> agreementDeliveryDateHistoryBeanList = new ArrayList<AgreementDeliveryDateHistoryBean>(0);
        	
        	if(agreementDeliveryDateHistoryEntityList !=null){
        		for(AgreementDeliveryDateHistoryEntity entity : agreementDeliveryDateHistoryEntityList){
        			AgreementDeliveryDateHistoryBean bean = entity.getAgreementDeliveryDateHistoryBean();
        			agreementDeliveryDateHistoryBeanList.add(bean);
        		}
        	}
        	
        	List<AgreementNominatedDriverEntity> nominatedDriverEntityList = agreementEntity.getNominatedDrivers();
        	List<AgreementNominatedDriverBean> nominatedDriverBeanList = new ArrayList<AgreementNominatedDriverBean>(0);
        	
        	if(nominatedDriverEntityList !=null){
        		for(AgreementNominatedDriverEntity entity : nominatedDriverEntityList){
        			AgreementNominatedDriverBean bean = entity.getAgreementNominatedDriverBean();
        			nominatedDriverBeanList.add(bean);
        		}
        	}
        	AgreementProductEntity agreementProductEntity = null;
        	AgreementProductBean agreementProductBean = new AgreementProductBean();
        	ProductPriceProfileEntity productPriceProfileEntity = null;
        	ProductPriceProfileBean productPriceProfileBean = new ProductPriceProfileBean();
        	ProfilesEntity profilesEntity = null;
        	LeaseVehicleModelEntity leaseVehicleModelEntity = null;
        	LeaseVehicleModelBean leaseVehicleModelBean = new LeaseVehicleModelBean();
        	ProfilesBean profilesBean = new ProfilesBean();

        	if(agreementBean.getSchemeTypeId()!= null && agreementBean.getSchemeTypeId().toString().equals("2")){// PWS agreement
        		agreementProductEntity = agreementEntity.getAgreementProductEntity();
        		agreementProductBean = agreementProductEntity.getAgreementProductBean();
        		
        		productPriceProfileEntity = agreementProductEntity.getPriceProfile();
        		productPriceProfileBean = productPriceProfileEntity.getProductPriceProfileBean();
        		agreementProductBean.setPriceProfile(productPriceProfileBean);
        		
        		agreementBean.setAgreementProductBean(agreementProductBean);
        		
        	}else{// CAR Agreement
        		profilesEntity = agreementEntity.getProfilesEntity();
        		if(profilesEntity!=null){
        			profilesBean= profilesEntity.getProfilesBean();
        			if(profilesBean.getLeaseVehicleId()!=0){// For non-HP vehicles. HP vehicles don't have lease vehicle id.
        				leaseVehicleModelEntity = profilesEntity.getLeaseVehicleModelEntity();
        			}
        			if(leaseVehicleModelEntity!=null)
        				leaseVehicleModelBean = leaseVehicleModelEntity.getLeaseVehicleModelBean();
        			
        			profilesBean.setLeaseVehicleModelBean(leaseVehicleModelBean);
        			agreementBean.setProfilesBean(profilesBean);
        		}
        	}        	
        	
        	agreementBean.setNominatedDrivers(nominatedDriverBeanList);
        	
        	CustomerEntity customerEntity = agreementEntity.getApplicant();
        	CustomerBean customerBean = customerEntity.getCustomerBean();
        	
        	agreementBean.setCustomer(customerBean);
        	agreementBean.setAgreementDeliveryDateHistoryBean(agreementDeliveryDateHistoryBeanList);
            try {
                ShortTermLeaseExtensionPwsEntity extension = ShortTermLeaseExtensionPwsEntity.findByOldArnEquals(agreementBean.getArn());
                if (extension != null) {
                    agreementBean.setNewArn(extension.getNewArn());
                    agreementBean.setStleActive(extension.getActive());
                    agreementBean.setOriginalEndDate(extension.getOriginalEndDate());
                    agreementBean.setMaxExtensionEndDate(extension.getMaxEndDate());
                    agreementBean.setExtensionReasonId(extension.getReasonId());
                }
            } catch (Exception e) {
            }
        }else{
    		VoidAgreementEntity voidAgreementEntity = (VoidAgreementEntity)VoidAgreementEntity.findVoidAgreementEntitysByAgreementIdEquals(id).getSingleResult();
        	agreementBean = voidAgreementEntity.getAgreementBean();
        }
		
        return agreementBean;
    }

	@Override
    @Transactional(propagation=Propagation.NOT_SUPPORTED)
    public long countAllRecords() {
        return (Long)AgreementEntity.countLiveAgreements().getSingleResult();
    }

	@Override
    @Transactional(propagation=Propagation.NOT_SUPPORTED)
	public AgreementExtensionBean getAgreementExtensions(Integer id) {
		
		AgreementExtensionEntity extensionEntity = AgreementExtensionEntity.findAgreementExtensionEntity(id);
		AgreementExtensionBean bean = new AgreementExtensionBean();
		if(extensionEntity != null)
			bean = extensionEntity.getAgreementExtensionBean();
		return bean;
	}

	@Override
    @Transactional(propagation=Propagation.NOT_SUPPORTED)
	public AgreementExtensionAuditBean getAgreementExtensionsAudit(Integer id) {
		AgreementExtensionAuditEntity extensionAuditEntity = (AgreementExtensionAuditEntity)AgreementExtensionAuditEntity.findAgreementExtensionAuditEntity(id);
		AgreementExtensionAuditBean bean = new AgreementExtensionAuditBean();
		if(extensionAuditEntity != null)
			bean = extensionAuditEntity.getAgreementExtensionAuditBean();
		return bean;
	}

}
