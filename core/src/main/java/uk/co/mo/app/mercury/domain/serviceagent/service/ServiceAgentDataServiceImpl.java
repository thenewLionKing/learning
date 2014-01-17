package uk.co.mo.app.mercury.domain.serviceagent.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerBean;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerDataService;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerNotFoundException;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerValidationException;
import uk.co.mo.app.mercury.domain.serviceagent.beans.AgentBandRatingBean;
import uk.co.mo.app.mercury.domain.serviceagent.beans.ServiceAgentBean;
import uk.co.mo.app.mercury.domain.serviceagent.beans.TlSpecialPartBean;
import uk.co.mo.app.mercury.domain.serviceagent.entity.AgentBandRatingEntity;
import uk.co.mo.app.mercury.domain.serviceagent.entity.AgentBandRatingPKEntity;
import uk.co.mo.app.mercury.domain.serviceagent.entity.ServiceAgentEntity;
import uk.co.mo.app.mercury.domain.serviceagent.entity.TlSpecialPartEntity;
import uk.co.mo.app.mercury.domain.serviceagent.entity.TlSpecialPartPKEntity;
import uk.co.mo.app.mercury.domain.serviceagent.exception.ServiceAgentNotFoundException;

@Service("serviceAgentDataService")
public class ServiceAgentDataServiceImpl implements ServiceAgentDataService {

	private static final Log LOG = LogFactory.getLog(ServiceAgentDataService.class);

	private final static String TRANSMISSION_ACTION_DELETE_STR = "D";

	@Autowired
    @Qualifier("dealerDataService")
    private DealerDataService dealerDataService;

	@Override
	@Transactional
	public void addServiceAgent(ServiceAgentBean serviceAgentBean) throws ServiceAgentNotFoundException, ServiceAgentValidationException {
        performDealerUpdate(serviceAgentBean);
		ServiceAgentEntity serviceAgentEntity = createServiceAgentEntityFromBean( serviceAgentBean );

        List<TlSpecialPartEntity> spEntities = new ArrayList<TlSpecialPartEntity>(0);
		TlSpecialPartPKEntity tlSpecialPartPKEntity;
		List < TlSpecialPartBean > tlSpecialPartBeans = serviceAgentBean.getTlSpecialPartBeans();
		if( tlSpecialPartBeans != null && !tlSpecialPartBeans.isEmpty() ) {
			for (TlSpecialPartBean tlSpecialPartBean : tlSpecialPartBeans ) {
				tlSpecialPartPKEntity = new TlSpecialPartPKEntity();
				tlSpecialPartPKEntity.setAgentNumber( tlSpecialPartBean.getAgentNumber() );
				tlSpecialPartPKEntity.setRuleSet( tlSpecialPartBean.getRuleSet() );
				tlSpecialPartPKEntity.setSpecialPartCode( tlSpecialPartBean.getSpecialPartCode() );
				tlSpecialPartPKEntity.setTransleaseRepairerNumber( tlSpecialPartBean.getTransleaseRepairerNumber() );

				TlSpecialPartEntity tlSpecialPartEntity = new TlSpecialPartEntity();
				tlSpecialPartEntity.setTlSpecialPartBean( tlSpecialPartBean );
				tlSpecialPartEntity.setId( tlSpecialPartPKEntity );
                spEntities.add(tlSpecialPartEntity);
			}
		}
        serviceAgentEntity.setTlSpecialParts(spEntities);
        serviceAgentEntity.persist();
    }

    private void performDealerUpdate(ServiceAgentBean serviceAgentBean) throws ServiceAgentNotFoundException, ServiceAgentValidationException {
        DealerBean dealerBean;
        try {
            dealerBean = dealerDataService.getDealer(serviceAgentBean.getLeasecoRepairerRef());
        } catch (DealerNotFoundException e) {
            throw new ServiceAgentNotFoundException(serviceAgentBean.getLeasecoRepairerRef());
        }

        dealerBean.setDealerFcsDateBean(null); // by doing this, we are keeping fcs dates in database, no change to it.
        dealerBean.setFleetComment(serviceAgentBean.getFleetComment());

        try {
            dealerDataService.updateDealer(dealerBean);
        } catch (DealerValidationException e) {
            throw new ServiceAgentValidationException(e);
        }
    }

    @Override
	@Transactional
	public void updateServiceAgent(ServiceAgentBean serviceAgentBean) throws ServiceAgentValidationException, ServiceAgentNotFoundException {

        if(serviceAgentBean.getTransleaseRepairerNumber() == null) {
            throw new ServiceAgentValidationException("Translease repairer number cannot be null");
        }

        ServiceAgentEntity existingSAEntity = getServiceAgentEntity(serviceAgentBean.getTransleaseRepairerNumber());

        performDealerUpdate(serviceAgentBean);

    	AgentBandRatingBean agentBandRatingBean = serviceAgentBean.getAgentBandRatingBean();
    	if ( agentBandRatingBean != null) {
	        AgentBandRatingEntity aBREntity;
	        List <AgentBandRatingEntity> existingABREntities = existingSAEntity.getAgentBandRating();
	        if( existingABREntities != null && !existingABREntities.isEmpty() ) {
	        	aBREntity = existingABREntities.get(0);
	        }
	        else {
	        	existingABREntities = new ArrayList<AgentBandRatingEntity>(); 
	        	aBREntity = new AgentBandRatingEntity();
	            AgentBandRatingPKEntity pk = new AgentBandRatingPKEntity();
	            pk.setAgentNumber(agentBandRatingBean.getAgentNumber());
	            pk.setBandRating(agentBandRatingBean.getBandRating());
	            pk.setRuleSet(agentBandRatingBean.getRuleSet());
	            pk.setTransleaseRepairerNumber(agentBandRatingBean.getTransleaseRepairerNumber());
	            aBREntity.setId(pk);
	        }
    		aBREntity.setBean( agentBandRatingBean );

    		existingABREntities.add(aBREntity);

            existingSAEntity.setAgentBandRating(existingABREntities);
		}

        List<TlSpecialPartEntity> existingSPEntities = existingSAEntity.getTlSpecialParts();
        List<TlSpecialPartEntity> newSPEntities = new ArrayList<TlSpecialPartEntity>(0);

        List < TlSpecialPartBean > tlSpecialPartBeans = serviceAgentBean.getTlSpecialPartBeans();
		if( tlSpecialPartBeans != null && !tlSpecialPartBeans.isEmpty() ) {
			for (TlSpecialPartBean tlSpecialPartBean : tlSpecialPartBeans ) {
                TlSpecialPartPKEntity tlSpecialPartPKEntity = new TlSpecialPartPKEntity();
				tlSpecialPartPKEntity.setAgentNumber( tlSpecialPartBean.getAgentNumber() );
				tlSpecialPartPKEntity.setRuleSet( tlSpecialPartBean.getRuleSet() );
				tlSpecialPartPKEntity.setSpecialPartCode( tlSpecialPartBean.getSpecialPartCode() );
				tlSpecialPartPKEntity.setTransleaseRepairerNumber( tlSpecialPartBean.getTransleaseRepairerNumber() );

				TlSpecialPartEntity spEntity = new TlSpecialPartEntity();
                spEntity.setId(tlSpecialPartPKEntity);

                int ind = existingSPEntities.indexOf(spEntity);

                if(ind != -1) {
                    TlSpecialPartEntity existingSPEntity = existingSPEntities.get(ind);
                    existingSPEntity.setTlSpecialPartBean(tlSpecialPartBean);
                } else {
                    spEntity.setTlSpecialPartBean(tlSpecialPartBean);
                    newSPEntities.add(spEntity);
                }
			}

            existingSPEntities.addAll(newSPEntities);
		}

        existingSAEntity.setBean(serviceAgentBean);
        existingSAEntity.merge();
	}

	@Override
	@Transactional
	public void inactivateServiceAgent(Integer transleaseRepairerNumber)
			throws ServiceAgentNotFoundException {


        ServiceAgentEntity serviceAgentEntity = getServiceAgentEntity(transleaseRepairerNumber);
        serviceAgentEntity.setTransmissionAction(TRANSMISSION_ACTION_DELETE_STR);
        serviceAgentEntity.getAgentBandRating().get(0).setTransmissionAction(TRANSMISSION_ACTION_DELETE_STR);

        List<TlSpecialPartEntity> specialPartEntities = serviceAgentEntity.getTlSpecialParts();
        for (TlSpecialPartEntity spEntity : specialPartEntities) {
            spEntity.setTransmissionAction(TRANSMISSION_ACTION_DELETE_STR);
        }

        serviceAgentEntity.merge();
	}

	@Override
	@Transactional
	public ServiceAgentBean findServiceAgent(Integer transleaseRepairerNumber)
			throws ServiceAgentNotFoundException {
		
       ServiceAgentEntity serviceAgentEntity = getServiceAgentEntity(transleaseRepairerNumber);
       ServiceAgentBean serviceAgentBean = serviceAgentEntity.getBean();
		

		AgentBandRatingBean agentBandRatingBean = serviceAgentBean.getAgentBandRatingBean();
    	if ( agentBandRatingBean != null) {
	        AgentBandRatingEntity agentBandRatingEntity;
	        List <AgentBandRatingEntity> agentBandRatingEntities = serviceAgentEntity.getAgentBandRating();
	        if( agentBandRatingEntities != null && !agentBandRatingEntities.isEmpty() ) {
	        	agentBandRatingEntity = agentBandRatingEntities.get(0);
	        }
	        else {
	        	agentBandRatingEntities = new ArrayList<AgentBandRatingEntity>(); 
	        	agentBandRatingEntity = new AgentBandRatingEntity();
	            AgentBandRatingPKEntity pk = new AgentBandRatingPKEntity();
	            pk.setAgentNumber(agentBandRatingBean.getAgentNumber());
	            pk.setBandRating(agentBandRatingBean.getBandRating());
	            pk.setRuleSet(agentBandRatingBean.getRuleSet());
	            pk.setTransleaseRepairerNumber(agentBandRatingBean.getTransleaseRepairerNumber());
	            agentBandRatingEntity.setId(pk);
	        }
	        agentBandRatingEntity.setBean( agentBandRatingBean );
	        agentBandRatingEntities.add(agentBandRatingEntity);
	        serviceAgentEntity.setAgentBandRating(agentBandRatingEntities);
		}
    	
    	TlSpecialPartEntity.findTlSpecialPartsByTLRepairerNumber( transleaseRepairerNumber );

		Query query = TlSpecialPartEntity.findTlSpecialPartsByTLRepairerNumber( transleaseRepairerNumber );
		@SuppressWarnings("unchecked")
		List <TlSpecialPartEntity> tlSpecialPartEntities = query.getResultList();
		List <TlSpecialPartBean> tlSpecialPartBeans = new ArrayList<TlSpecialPartBean>();
		TlSpecialPartBean tlSpecialPartBean = null;
		TlSpecialPartPKEntity id = null;
		if ( tlSpecialPartEntities != null && !tlSpecialPartEntities.isEmpty( ) ) {
			for( TlSpecialPartEntity entity : tlSpecialPartEntities ) {
				id = entity.getId();
				tlSpecialPartBean = entity.getTlSpecialPartBean();
				tlSpecialPartBean.setTransleaseRepairerNumber( id.getTransleaseRepairerNumber() );
				tlSpecialPartBean.setAgentNumber( id.getAgentNumber() );
				tlSpecialPartBean.setSpecialPartCode( id.getSpecialPartCode() );
				tlSpecialPartBean.setRuleSet( id.getRuleSet() );

				tlSpecialPartBeans.add( tlSpecialPartBean );
			}
			serviceAgentBean.setTlSpecialPartBeans( tlSpecialPartBeans );
		}

		return serviceAgentEntity.getBean();
	}

    private ServiceAgentEntity getServiceAgentEntity(Integer transleaseRepairerNumber) throws ServiceAgentNotFoundException {
        ServiceAgentEntity serviceAgentEntity = null;
        serviceAgentEntity = ServiceAgentEntity.findServiceAgentEntity( transleaseRepairerNumber );
        if (serviceAgentEntity == null) {
            throw new ServiceAgentNotFoundException( transleaseRepairerNumber==null?null:transleaseRepairerNumber.toString() );
        }
        return serviceAgentEntity;
    }

    @Override
	@Transactional
	public ServiceAgentBean findActiveServiceAgentByAgentNumber(
			String agentNumber) throws ServiceAgentNotFoundException {
		if (agentNumber == null)
			throw new IllegalArgumentException("The agent number argument is required");
		ServiceAgentEntity serviceAgentEntity = null;
		try {
			Query serviceAgentQuery = ServiceAgentEntity.findActiveServiceAgentByAgentNumber( agentNumber );
			@SuppressWarnings("unchecked")
			List <ServiceAgentEntity> serviceAgentEntities = serviceAgentQuery.getResultList();
			if( serviceAgentEntities.isEmpty() ) {
				throw new ServiceAgentNotFoundException( agentNumber == null ? null : ", with agent no:"+agentNumber); 
			}
			serviceAgentEntity = serviceAgentEntities.get(0);
		}
		catch (EmptyResultDataAccessException erdae) {
			throw new ServiceAgentNotFoundException( agentNumber == null ? null : ", with agent no:"+agentNumber);
		}

		return serviceAgentEntity.getBean();
	}
    
	private ServiceAgentEntity createServiceAgentEntityFromBean( ServiceAgentBean serviceAgentBean ) {

		ServiceAgentEntity serviceAgentEntity = new ServiceAgentEntity();
		serviceAgentEntity.setBean(serviceAgentBean);

		AgentBandRatingBean agentBandRatingBean = serviceAgentBean.getAgentBandRatingBean();
		if ( agentBandRatingBean != null) {
			AgentBandRatingEntity agentBandRatingEntity = new AgentBandRatingEntity();
            AgentBandRatingPKEntity pk = new AgentBandRatingPKEntity();
            pk.setAgentNumber(serviceAgentBean.getAgentBandRatingBean().getAgentNumber());
            pk.setBandRating(serviceAgentBean.getAgentBandRatingBean().getBandRating());
            pk.setRuleSet(serviceAgentBean.getAgentBandRatingBean().getRuleSet());
            pk.setTransleaseRepairerNumber(serviceAgentBean.getAgentBandRatingBean().getTransleaseRepairerNumber());
            agentBandRatingEntity.setId(pk);
			agentBandRatingEntity.setBean( serviceAgentBean.getAgentBandRatingBean() );
            List <AgentBandRatingEntity> agentBandRatingEntities = new ArrayList<AgentBandRatingEntity>();
            agentBandRatingEntities.add(agentBandRatingEntity);
			serviceAgentEntity.setAgentBandRating(agentBandRatingEntities);
		}

		return serviceAgentEntity;
	}

    @Override
	@Transactional
	public void upsertServiceAgent(ServiceAgentBean serviceAgentBean) throws ServiceAgentValidationException {
        if(serviceAgentBean.getTransleaseRepairerNumber() == null) {
            throw new ServiceAgentValidationException("Translease repairer number cannot be null");
        }

        String operationRequested ="D"; //Delete by default
        ServiceAgentEntity serviceAgentEntity = null;
		try {
			performDealerUpdate(serviceAgentBean);
			serviceAgentEntity = getServiceAgentEntity(serviceAgentBean.getTransleaseRepairerNumber());
		} catch (ServiceAgentNotFoundException e) {
			operationRequested="A"; // Add the new service agent
		}

		if(operationRequested.equals("D")){
//			We have found the entity in the database. Now lets delete it.
			serviceAgentEntity.remove();
		}
//		Once deleted we need to add the incoming request for ServiceAgent.
			serviceAgentEntity = createServiceAgentEntityFromBean( serviceAgentBean );

	        List<TlSpecialPartEntity> spEntities = new ArrayList<TlSpecialPartEntity>(0);
			TlSpecialPartPKEntity tlSpecialPartPKEntity;
			List < TlSpecialPartBean > tlSpecialPartBeans = serviceAgentBean.getTlSpecialPartBeans();
			if( tlSpecialPartBeans != null && !tlSpecialPartBeans.isEmpty() ) {
				for (TlSpecialPartBean tlSpecialPartBean : tlSpecialPartBeans ) {
					tlSpecialPartPKEntity = new TlSpecialPartPKEntity();
					tlSpecialPartPKEntity.setAgentNumber( tlSpecialPartBean.getAgentNumber() );
					tlSpecialPartPKEntity.setRuleSet( tlSpecialPartBean.getRuleSet() );
					tlSpecialPartPKEntity.setSpecialPartCode( tlSpecialPartBean.getSpecialPartCode() );
					tlSpecialPartPKEntity.setTransleaseRepairerNumber( tlSpecialPartBean.getTransleaseRepairerNumber() );

					TlSpecialPartEntity tlSpecialPartEntity = new TlSpecialPartEntity();
					tlSpecialPartEntity.setTlSpecialPartBean( tlSpecialPartBean );
					tlSpecialPartEntity.setId( tlSpecialPartPKEntity );
	                spEntities.add(tlSpecialPartEntity);
				}
			}
	        serviceAgentEntity.setTlSpecialParts(spEntities);
	        serviceAgentEntity.persist();			
		}
}
