package uk.co.mo.app.mercury.domain.org.dealer.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerPersonnelBean;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerPersonnelDealerLinkBean;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerPersonnelTrainingBean;
import uk.co.mo.app.mercury.domain.org.dealer.entity.DealerPersonnelDealerLinkEntity;
import uk.co.mo.app.mercury.domain.org.dealer.entity.DealerPersonnelDealerLinkEntityPK;
import uk.co.mo.app.mercury.domain.org.dealer.entity.DealerPersonnelEntity;
import uk.co.mo.app.mercury.domain.org.dealer.entity.DealerPersonnelTrainingEntity;

@Service("dealerContactService")
public class DealerContactServiceImpl implements DealerContactService{

	
    private static final Log LOG = LogFactory.getLog(DealerContactServiceImpl.class);
	
	
	@Override
	@Transactional
	public void addDealerContact(DealerPersonnelBean personnelBean) throws DealerValidationException {
        LOG.debug("Got call on DealerContactServiceImpl :: addDealerContact");
        
        // set main dealer personnel entity
        DealerPersonnelEntity personnelEntity = new DealerPersonnelEntity();
        personnelEntity.setDealerPersonnelBean(personnelBean);

        List <DealerPersonnelDealerLinkEntity> dealerPersonnelDealerLinks = new ArrayList<DealerPersonnelDealerLinkEntity>(0);
        List<DealerPersonnelDealerLinkBean> dealerLinksBean = personnelBean.getDealerPersonnelDealerLinksBean();
      
        if(dealerLinksBean !=null){
        	for(DealerPersonnelDealerLinkBean linksBean : dealerLinksBean){
        		DealerPersonnelDealerLinkEntity linkEntity = new DealerPersonnelDealerLinkEntity();
        		DealerPersonnelDealerLinkEntityPK linkEntityPK = new DealerPersonnelDealerLinkEntityPK();
        		linkEntityPK.setAgentNumber(linksBean.getAgentNumber());
        		linkEntityPK.setDealerPersonnelId(linksBean.getDealerPersonnelId());
        		linkEntity.setActive(linksBean.getActive());
        		linkEntity.setId(linkEntityPK);
        		linkEntity.setDealerPersonnel(personnelEntity);
        		dealerPersonnelDealerLinks.add(linkEntity);
        	}
        }

        
        List <DealerPersonnelTrainingEntity> dealerPersonnelTrainings = new ArrayList<DealerPersonnelTrainingEntity>(0);
        List<DealerPersonnelTrainingBean> dealerTrainingBean = personnelBean.getDealerPersonnelTrainingsBean();
        
        if(dealerTrainingBean !=null){
        	for(DealerPersonnelTrainingBean trainingBean: dealerTrainingBean){
        		DealerPersonnelTrainingEntity trainingEntity = new DealerPersonnelTrainingEntity();
        		trainingEntity.setAccreditationDate(trainingBean.getAccreditationDate());
        		trainingEntity.setCourseDate(trainingBean.getCourseDate());
        		trainingEntity.setCourseId(trainingBean.getCourseId());
        		trainingEntity.setCourseStatusId(trainingBean.getCourseStatusId());
        		trainingEntity.setExpiryDate(trainingBean.getExpiryDate());
        		trainingEntity.setId(trainingBean.getId());
        		trainingEntity.setDealerPersonnel(personnelEntity);
        		dealerPersonnelTrainings.add(trainingEntity);
        	}
        }
        
        personnelEntity.setDealerPersonnelDealerLinks(dealerPersonnelDealerLinks);
        personnelEntity.setDealerPersonnelTrainings(dealerPersonnelTrainings);
       
        personnelEntity.persist();

	}

	@Override
	@Transactional
	public void updateDealerContact(DealerPersonnelBean personnelBean) throws DealerValidationException {
        LOG.debug("Got call on DealerContactServiceImpl :: updateDealerContact");
        
        // set main dealer personnel entity
        DealerPersonnelEntity personnelEntity = DealerPersonnelEntity.findDealerPersonnelEntity(personnelBean.getDealerPersonnelId());
        if(personnelEntity != null){
        	
        	personnelEntity.setDealerPersonnelBean(personnelBean);
        	
        	List <DealerPersonnelDealerLinkEntity> dealerPersonnelDealerLinksList = new ArrayList<DealerPersonnelDealerLinkEntity>(0);
        	List<DealerPersonnelDealerLinkBean> dealerLinksBean = personnelBean.getDealerPersonnelDealerLinksBean();
        	
        	if(dealerLinksBean !=null){
        		for(DealerPersonnelDealerLinkBean linksBean : dealerLinksBean){
        			DealerPersonnelDealerLinkEntity linkEntity = new DealerPersonnelDealerLinkEntity();
        			DealerPersonnelDealerLinkEntityPK linkEntityPK = new DealerPersonnelDealerLinkEntityPK();
        			linkEntityPK.setAgentNumber(linksBean.getAgentNumber());
        			linkEntityPK.setDealerPersonnelId(linksBean.getDealerPersonnelId());
        			linkEntity.setActive(linksBean.getActive());
        			linkEntity.setId(linkEntityPK);
        			linkEntity.setDealerPersonnel(personnelEntity);
        			dealerPersonnelDealerLinksList.add(linkEntity);
        		}
        	}
        	
        	List <DealerPersonnelTrainingEntity> dealerPersonnelTrainings = new ArrayList<DealerPersonnelTrainingEntity>(0);
        	List<DealerPersonnelTrainingBean> dealerTrainingBean = personnelBean.getDealerPersonnelTrainingsBean();
        	
        	if(dealerTrainingBean !=null){
        		
        		for(DealerPersonnelTrainingBean trainingBean: dealerTrainingBean){
        			DealerPersonnelTrainingEntity trainingEntity = new DealerPersonnelTrainingEntity();
        			trainingEntity.setAccreditationDate(trainingBean.getAccreditationDate());
        			trainingEntity.setCourseDate(trainingBean.getCourseDate());
        			trainingEntity.setCourseId(trainingBean.getCourseId());
        			trainingEntity.setCourseStatusId(trainingBean.getCourseStatusId());
        			trainingEntity.setExpiryDate(trainingBean.getExpiryDate());
        			trainingEntity.setId(trainingBean.getId());
        			trainingEntity.setDealerPersonnel(personnelEntity);
        			/*        	for(DealerPersonnelTrainingEntity existingDealerTrngEntity : dealerPersonnelTrainings){
        		if(existingDealerTrngEntity.getId().compareTo(trainingEntity.getId()) == 0){
        			dealerPersonnelTrainings.remove(existingDealerTrngEntity);
        		}
        	}
        			 */        	dealerPersonnelTrainings.add(trainingEntity);
        		}
        	}
        	
        	
        	personnelEntity.setDealerPersonnelDealerLinks(dealerPersonnelDealerLinksList);
        	personnelEntity.setDealerPersonnelTrainings(dealerPersonnelTrainings);
        	
        	personnelEntity.merge();
        }else {
        	throw new DealerValidationException("Dealer Personnel not found !!");
        }
     
	}
}
