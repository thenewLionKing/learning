package uk.co.mo.app.mercury.domain.serviceagent;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.serviceagent.beans.AgentBandRatingBean;
import uk.co.mo.app.mercury.domain.serviceagent.beans.ServiceAgentBean;
import uk.co.mo.app.mercury.domain.serviceagent.beans.TlSpecialPartBean;
import uk.co.mo.app.mercury.domain.serviceagent.exception.ServiceAgentNotFoundException;
import uk.co.mo.app.mercury.domain.serviceagent.service.ServiceAgentDataService;
import uk.co.mo.app.mercury.domain.serviceagent.service.ServiceAgentValidationException;

public class ServiceAgentDataServiceTest extends AbstractJunit4Test{

	private static final Log LOG = LogFactory.getLog(ServiceAgentDataServiceTest.class);

    @Autowired
    @Qualifier("serviceAgentDataService")
    private ServiceAgentDataService sads;

	@Override
	protected void setup() {	}

	@Override
	protected void destroy() {	}

	private static final String MO_TL_REPAIRER_NO_STR = "2013059";
	private static final String MO_TL_LEASCO_REF_STR = "9000068";
	private static final String AGENT_NUMBER_STR = "30766";

	private static final String TRANSMISSION_ACTION_M_STR = "A";

	private String[] serviceAgentSampleData = {MO_TL_REPAIRER_NO_STR,MO_TL_LEASCO_REF_STR,AGENT_NUMBER_STR,"150","0",null,"N","FleetManagement","0870 6000 161","1","1","1","1","1 Link set up 9/63/04 mw/fm",TRANSMISSION_ACTION_M_STR,"0x000000002301A20D"};
	private String[] agentBandRatingSampleData = {MO_TL_REPAIRER_NO_STR,MO_TL_LEASCO_REF_STR,"1","1.00","1.50",TRANSMISSION_ACTION_M_STR,"0x000000002A43E1EE",AGENT_NUMBER_STR,"Y","Live"};
	private String[][] specialPartsSampleData = {
			{MO_TL_REPAIRER_NO_STR,MO_TL_LEASCO_REF_STR,"SEMISYNOIL","5.10","R",TRANSMISSION_ACTION_M_STR,"0x000000002A43E367",AGENT_NUMBER_STR,"Y","Live"}
			,
			{MO_TL_REPAIRER_NO_STR,MO_TL_LEASCO_REF_STR,"SYNOIL","7.50","R",TRANSMISSION_ACTION_M_STR,"0x000000002A43E362",AGENT_NUMBER_STR,"Y","Live"}
	};

    private String[] serviceAgentSampleUpdateData = {MO_TL_REPAIRER_NO_STR,MO_TL_LEASCO_REF_STR,AGENT_NUMBER_STR,"1150","0",null,"N","Test Management","0870 6000 161","1","1","1","1","update 1 Link set up 9/63/04 mw/fm",TRANSMISSION_ACTION_M_STR,"0x000000002301A20D"};
	private String[] agentBandRatingSampleUpdateData = {MO_TL_REPAIRER_NO_STR,MO_TL_LEASCO_REF_STR,"1","1.50","1.50",TRANSMISSION_ACTION_M_STR,"0x000000002A43E1EE",AGENT_NUMBER_STR,"Y","Live"};
	private String[][] specialPartsSampleUpdateData = {
			{MO_TL_REPAIRER_NO_STR,MO_TL_LEASCO_REF_STR,"SEMISYNOIL","15.10","R",TRANSMISSION_ACTION_M_STR,"0x000000002A43E367",AGENT_NUMBER_STR,"Y","Live"},
			{MO_TL_REPAIRER_NO_STR,MO_TL_LEASCO_REF_STR,"SYNOIL","17.50","R",TRANSMISSION_ACTION_M_STR,"0x000000002A43E362",AGENT_NUMBER_STR,"Y","Live"},
			{MO_TL_REPAIRER_NO_STR,MO_TL_LEASCO_REF_STR,"MINOIL","17.50","R",TRANSMISSION_ACTION_M_STR,"0x000000002A43E362",AGENT_NUMBER_STR,"Y","Live"}
	};

//    @Test
    public void testMissingFindServiceAgent() {
    	try {
        	sads.findServiceAgent( new Integer ( MO_TL_REPAIRER_NO_STR ) );
        	assertTrue(false);
		} catch (ServiceAgentNotFoundException sanfe) {
            LOG.error("Error class: " + sanfe.getClass().getName());
            LOG.error("Caught error. Message: " + sanfe.getMessage());
    		assertTrue(true);
		}
    }

//    @Test
    public void testAddServiceAgent() {

    	ServiceAgentBean serviceAgentBean = createServiceAgentBean();

    	try {
			sads.addServiceAgent(serviceAgentBean);
        	assertTrue(true);
		} catch (Exception sanfe) {
            LOG.error("Error class: " + sanfe.getClass().getName());
            LOG.error("Caught error. Message: " + sanfe.getMessage());
    		assertTrue(false);
		}
    }

    //@Test
    public void testFindServiceAgent() {
    	try {
    		ServiceAgentBean agentBean = sads.findServiceAgent( 914 );
//    		ServiceAgentBean agentBean = sads.findServiceAgent( new Integer ( MO_TL_REPAIRER_NO_STR ) );

    		LOG.debug(agentBean);
		} catch (ServiceAgentNotFoundException sanfe) {
            LOG.error("Error class: " + sanfe.getClass().getName());
            LOG.error("Caught error. Message: " + sanfe.getMessage());
    		assertTrue(false);
		}
    }

//    @Test
    public void testActiveFindServiceAgent() {
    	try {
    		ServiceAgentBean agentBean = sads.findActiveServiceAgentByAgentNumber( "06033" );
    		LOG.debug(agentBean.toString());
    		System.out.println("SERVICE AGENNNNNNNNTTTTT @@@@@@ "+agentBean.toString());
    		assertTrue(true);
		} catch (ServiceAgentNotFoundException sanfe) {
            LOG.error("Error class: " + sanfe.getClass().getName());
            LOG.error("Caught error. Message: " + sanfe.getMessage());
    		assertTrue(false);
		}
    }

    //@Test
    public void testActiveFindServiceAgent1() {
    	try {
    		ServiceAgentBean agentBean = sads.findActiveServiceAgentByAgentNumber(AGENT_NUMBER_STR);
    		LOG.debug(agentBean);
    		assertTrue(false);
		} catch (ServiceAgentNotFoundException sanfe) {
            LOG.error("Error class: " + sanfe.getClass().getName());
            LOG.error("Caught error. Message: " + sanfe.getMessage());
    		assertTrue(true);
		}
    }

    //@Test
    public void testInactivateServiceAgent() {
    	try {
			sads.inactivateServiceAgent( new Integer ( MO_TL_REPAIRER_NO_STR ) );
			assertTrue(true);
		} catch (ServiceAgentNotFoundException sanfe) {
            LOG.error("Error class: " + sanfe.getClass().getName());
            LOG.error("Caught error. Message: " + sanfe.getMessage());
    		assertTrue(false);
		}
    }

    @Test
    public void testUpdateServiceAgent() {
    	ServiceAgentBean serviceAgentBean = createUpdateServiceAgentBean();
    	try {
    		sads.updateServiceAgent( serviceAgentBean );
			assertTrue(true);
		} catch (Exception sanfe) {
            LOG.error("Error class: " + sanfe.getClass().getName());
            LOG.error("Caught error. Message: " + sanfe.getMessage());
    		assertTrue(false);
		}
    }

    
//    @Test
    public void testUpsertServiceAgent() {
    	ServiceAgentBean serviceAgentBean = createUpdateServiceAgentBean();
    	try {
    		sads.upsertServiceAgent(serviceAgentBean );
			assertTrue(true);
		} catch (Exception sanfe) {
            LOG.error("Error class: " + sanfe.getClass().getName());
            LOG.error("Caught error. Message: " + sanfe.getMessage());
    		assertTrue(false);
		}
    }    
    
    /**
     * @return ServiceAgentBean
     */
    private ServiceAgentBean createServiceAgentBean() {
    	ServiceAgentBean serviceAgentBean = new ServiceAgentBean();
    	serviceAgentBean.setTransleaseRepairerNumber( serviceAgentSampleData[0] == null ? null : new Integer( serviceAgentSampleData[0] ) );
    	serviceAgentBean.setTransleaseLeasecoRef( serviceAgentSampleData[1] == null ? null : new Integer( serviceAgentSampleData[1] ) );
    	serviceAgentBean.setLeasecoRepairerRef( serviceAgentSampleData[2] == null ? null : serviceAgentSampleData[2] );
    	serviceAgentBean.setTransmissionAction( serviceAgentSampleData[14] == null ? null : serviceAgentSampleData[14] );
    	serviceAgentBean.setFleetComment( serviceAgentSampleData[13] == null ? null : serviceAgentSampleData[13] );

    	AgentBandRatingBean agentBandRatingBean = new AgentBandRatingBean();
    	agentBandRatingBean.setTransleaseRepairerNumber( agentBandRatingSampleData[0] == null ? null : new Integer ( agentBandRatingSampleData[0] ) );
    	agentBandRatingBean.setTransleaseLeasecoRef( agentBandRatingSampleData[1] == null ? null : new Integer ( agentBandRatingSampleData[1] ) );
    	agentBandRatingBean.setBandRating( agentBandRatingSampleData[2] == null ? null : new Short ( agentBandRatingSampleData[2] ) );
    	agentBandRatingBean.setLabourRate( agentBandRatingSampleData[3] == null ? null : new BigDecimal ( agentBandRatingSampleData[3] ) );
    	agentBandRatingBean.setPartsDiscount( agentBandRatingSampleData[4] == null ? null : new BigDecimal ( agentBandRatingSampleData[4] ) );
    	agentBandRatingBean.setTransmissionAction( agentBandRatingSampleData[5] == null ? null : agentBandRatingSampleData[5] );
    	agentBandRatingBean.setAgentNumber( agentBandRatingSampleData[7] == null ? null : agentBandRatingSampleData[7] );
    	agentBandRatingBean.setSendToTranslease( agentBandRatingSampleData[8] == null ? null : agentBandRatingSampleData[8] );
    	agentBandRatingBean.setRuleSet( agentBandRatingSampleData[9] == null ? null : agentBandRatingSampleData[9] );

    	serviceAgentBean.setAgentBandRatingBean( agentBandRatingBean );

    	List < TlSpecialPartBean > tlSpecialPartBeans = new ArrayList < TlSpecialPartBean >();
    	TlSpecialPartBean tlSpecialPartBean = null;

    	for(int i = 0; i < specialPartsSampleData.length; i++) { // For each element of that array,
    		tlSpecialPartBean = new TlSpecialPartBean();
    		tlSpecialPartBean.setTransleaseRepairerNumber( specialPartsSampleData[i][0] == null ? null : new Integer ( specialPartsSampleData[i][0] ) );
    		tlSpecialPartBean.setTransleaseLeasecoRef( specialPartsSampleData[i][1] == null ? null : new Integer ( specialPartsSampleData[i][1] ) );
    		tlSpecialPartBean.setSpecialPartCode( specialPartsSampleData[i][2] == null ? null : specialPartsSampleData[i][2] );
    		tlSpecialPartBean.setRateApplicable( specialPartsSampleData[i][3] == null ? null : new BigDecimal ( specialPartsSampleData[i][3] ) );
    		tlSpecialPartBean.setAppliedLevel( specialPartsSampleData[i][4] == null ? null : specialPartsSampleData[i][4] );
    		tlSpecialPartBean.setTransmissionAction( specialPartsSampleData[i][5] == null ? null : specialPartsSampleData[i][5] );
    		tlSpecialPartBean.setAgentNumber( specialPartsSampleData[i][7] == null ? null : specialPartsSampleData[i][7] );
    		tlSpecialPartBean.setSendToTranslease( specialPartsSampleData[i][8] == null ? null : specialPartsSampleData[i][8] );
    		tlSpecialPartBean.setRuleSet( specialPartsSampleData[i][9] == null ? null : specialPartsSampleData[i][9] );

    		tlSpecialPartBeans.add( tlSpecialPartBean );
    	}
    	serviceAgentBean.setTlSpecialPartBeans( tlSpecialPartBeans );

    	return serviceAgentBean;
    }

    private ServiceAgentBean createUpdateServiceAgentBean() {
    	ServiceAgentBean serviceAgentBean = new ServiceAgentBean();
    	AgentBandRatingBean agentBandRatingBean = new AgentBandRatingBean();
    	List < TlSpecialPartBean > tlSpecialPartBeans = new ArrayList < TlSpecialPartBean >();
    	TlSpecialPartBean tlSpecialPartBean = null;
    	
    	serviceAgentBean.setTransleaseRepairerNumber( serviceAgentSampleUpdateData[0] == null ? null : new Integer( serviceAgentSampleUpdateData[0] ) );
    	serviceAgentBean.setTransleaseLeasecoRef( serviceAgentSampleUpdateData[1] == null ? null : new Integer( serviceAgentSampleUpdateData[1] ) );
    	serviceAgentBean.setLeasecoRepairerRef( serviceAgentSampleUpdateData[2] == null ? null : serviceAgentSampleUpdateData[2] );
    	serviceAgentBean.setTransmissionAction( serviceAgentSampleUpdateData[14] == null ? null : serviceAgentSampleUpdateData[14] );
        serviceAgentBean.setFleetComment( serviceAgentSampleData[13] == null ? null : serviceAgentSampleData[13] );
        serviceAgentBean.setComments( serviceAgentSampleData[8] == null ? null : serviceAgentSampleData[8] );

    	
    	agentBandRatingBean.setTransleaseRepairerNumber( agentBandRatingSampleUpdateData[0] == null ? null : new Integer ( agentBandRatingSampleUpdateData[0] ) );
    	agentBandRatingBean.setTransleaseLeasecoRef( agentBandRatingSampleUpdateData[1] == null ? null : new Integer ( agentBandRatingSampleUpdateData[1] ) );
    	agentBandRatingBean.setBandRating( agentBandRatingSampleUpdateData[2] == null ? null : new Short ( agentBandRatingSampleUpdateData[2] ) );
    	agentBandRatingBean.setLabourRate( agentBandRatingSampleUpdateData[3] == null ? null : new BigDecimal ( agentBandRatingSampleUpdateData[3] ) );
    	agentBandRatingBean.setPartsDiscount( agentBandRatingSampleUpdateData[4] == null ? null : new BigDecimal ( agentBandRatingSampleUpdateData[4] ) );
    	agentBandRatingBean.setTransmissionAction( agentBandRatingSampleUpdateData[5] == null ? null : agentBandRatingSampleUpdateData[5] );
    	agentBandRatingBean.setAgentNumber( agentBandRatingSampleUpdateData[7] == null ? null : agentBandRatingSampleUpdateData[7] );
    	agentBandRatingBean.setSendToTranslease( agentBandRatingSampleUpdateData[8] == null ? null : agentBandRatingSampleUpdateData[8] );
    	agentBandRatingBean.setRuleSet( agentBandRatingSampleUpdateData[9] == null ? null : agentBandRatingSampleUpdateData[9] );
    	
    	for(int i = 0; i < specialPartsSampleUpdateData.length; i++) { // For each element of that array,
    		tlSpecialPartBean = new TlSpecialPartBean();
    		tlSpecialPartBean.setTransleaseRepairerNumber( specialPartsSampleUpdateData[i][0] == null ? null : new Integer ( specialPartsSampleUpdateData[i][0] ) );
    		tlSpecialPartBean.setTransleaseLeasecoRef( specialPartsSampleUpdateData[i][1] == null ? null : new Integer ( specialPartsSampleUpdateData[i][1] ) );
    		tlSpecialPartBean.setSpecialPartCode( specialPartsSampleUpdateData[i][2] == null ? null : specialPartsSampleUpdateData[i][2] );
    		tlSpecialPartBean.setRateApplicable( specialPartsSampleUpdateData[i][3] == null ? null : new BigDecimal ( specialPartsSampleUpdateData[i][3] ) );
    		tlSpecialPartBean.setAppliedLevel( specialPartsSampleUpdateData[i][4] == null ? null : specialPartsSampleUpdateData[i][4] );
    		tlSpecialPartBean.setTransmissionAction( specialPartsSampleUpdateData[i][5] == null ? null : specialPartsSampleUpdateData[i][5] );
    		tlSpecialPartBean.setAgentNumber( specialPartsSampleUpdateData[i][7] == null ? null : specialPartsSampleUpdateData[i][7] );
    		tlSpecialPartBean.setSendToTranslease( specialPartsSampleUpdateData[i][8] == null ? null : specialPartsSampleUpdateData[i][8] );
    		tlSpecialPartBean.setRuleSet( specialPartsSampleUpdateData[i][9] == null ? null : specialPartsSampleUpdateData[i][9] );

    		tlSpecialPartBeans.add( tlSpecialPartBean );
    	}
    	serviceAgentBean.setAgentBandRatingBean( agentBandRatingBean );
    	serviceAgentBean.setTlSpecialPartBeans( tlSpecialPartBeans );
 
    	return serviceAgentBean;
    }
}
