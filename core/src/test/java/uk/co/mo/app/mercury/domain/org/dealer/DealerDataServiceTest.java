package uk.co.mo.app.mercury.domain.org.dealer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.mo.app.mercury.cs.dao.LegacyDAO;
import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerBean;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerCategory;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerCoverage;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerExtraBean;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerFcsDateBean;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerFcsDateType;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerGroupDealerLinkBean;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerPartner;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerProductType;
import uk.co.mo.app.mercury.domain.org.dealer.entity.MaintenanceAgentMaagEntity;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerDataService;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerNotFoundException;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerValidationException;

/**
 * <p/>
 * User: prabat
 * Date: 03-Jun-2011
 * Time: 10:29:59
 * <p/>
 * Change Log - Who : When : Comment
 */
public class DealerDataServiceTest extends AbstractJunit4Test{

    private static final Log LOG = LogFactory.getLog(DealerDataServiceTest.class);

    @Autowired
    @Qualifier("dealerDataService")
    private DealerDataService dds;
    
    @Autowired
    private LegacyDAO dao;

    @Test
    public void testAddDealer() {

        try {
        	DealerBean dealer = (DealerBean)getTestData(1);
            dds.addDealer(dealer);
            
        } catch (Exception e) {
            LOG.debug("Caught exception ", e);
        }
    }

    @Test
    public void testGetDealer(){
//    	DealerBean dealer = dds.getDealer("94696");
        try {
            DealerBean dealer = dds.getDealer("amit2");
        } catch (DealerNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
  
    @Test
    public void testUpdateDealer(){
        DealerBean dealer = new DealerBean();
        dealer.setVehicleManufacturerCode("AF");
        dealer.setAccountManager("DCC- Inbound DCC - London");
        dealer.setActiveStatus("Y");
        dealer.setAgentAddress1("3 Albian House - laks");
        dealer.setAgentAddress2("Albian House - laks");
        dealer.setAgentAddress3("Albian House - laks12");
        dealer.setAgentAddress4("Albian House - laks2");
        dealer.setAgentAgreeDate(new Date());
        dealer.setAgentApproveFlag("Y");
        dealer.setAgentEmail("AGENT-EMAIL");
        dealer.setAgentLegalName("AGENT-LEAGALNAME");
        dealer.setAgentName("AGENT-NAME");
        dealer.setAgentNumber("DEAL1");
        dealer.setAgentPostcode("HU1LAK");
        dealer.setAgentRefCode("ZZZZZZZZZZ");
        dealer.setAgentSortCode("809012");
        dealer.setAgentTypeFlag("Y");
        dealer.setAgentVatNumber("167541058");
        dealer.setAgentWebsite("www.update_dealer.co.uk");
        dealer.setBlockHp("Y");
        dealer.setBlockHpNewOnly("N");
        dealer.setBlockLease("Y");
        dealer.setBlockLeaseNewOnly("N");
        dealer.setBusTypeConverter("Y");
        dealer.setBusTypeHp("Y");
        dealer.setBusTypeLease("Y");
        dealer.setCreditLimit(new BigDecimal(0));
        dealer.setCreditOutstanding(new BigDecimal(0));
        dealer.setDealerCategory(DealerCategory.Car);
        List<DealerCoverage> coverage = new ArrayList<DealerCoverage>(0);
        coverage.add(DealerCoverage.Local);
        coverage.add(DealerCoverage.NI);
        dealer.setDealerCoverage(coverage);

        DealerFcsDateBean fcsDate = new DealerFcsDateBean();
        List<DealerFcsDateBean> fcs = new ArrayList<DealerFcsDateBean>(0);
        fcsDate.setActionDate(new Date());
        fcsDate.setDateType(DealerFcsDateType.Contract_Received_Q);
        fcs.add(fcsDate);

        fcsDate = new DealerFcsDateBean();
        fcsDate.setActionDate(new Date());
        fcsDate.setDateType(DealerFcsDateType.Contract_Received_T);
        fcs.add(fcsDate);

        dealer.setDealerFcsDateBean(fcs);

        dealer.setDealerTypeMflDirect("Y");
        dealer.setDirectDebit("Y");
        dealer.setEsignatureInd("Y");

        DealerExtraBean extra = new DealerExtraBean();
        extra.setAgentNumber(dealer.getAgentNumber());
        extra.setAgentType("C");
        extra.setClosingDown(true);
        extra.setClosingDownDate(new Date());
        dealer.setExtra(extra);

        dealer.setFaxNumber("01212121021212");
        dealer.setFinanceEmail("amit@gmail.com");
        dealer.setHasShowroom("Y");
        dealer.setHomeVisitor("Y");
        dealer.setInsuranceRepairer("Y");
        dealer.setPartnerType(DealerPartner.Premier);
        dealer.setPaymentTermsDays(10);
        dealer.setTelephoneNumber("012120121212");
        dealer.setTradeIn("Y");

        List<DealerGroupDealerLinkBean> dealerLinkBeanList = new ArrayList<DealerGroupDealerLinkBean>(0);
        DealerGroupDealerLinkBean dealerLinkBean = new DealerGroupDealerLinkBean();
        dealerLinkBean.setGroupNumber(5);
        dealerLinkBean.setAgentNumber(dealer.getAgentNumber());
        dealerLinkBean.setFlag(true);
        dealerLinkBeanList.add(dealerLinkBean);
        dealerLinkBean = new DealerGroupDealerLinkBean();
        dealerLinkBean.setGroupNumber(8);
        dealerLinkBean.setAgentNumber(dealer.getAgentNumber());
        dealerLinkBean.setFlag(false);
        dealerLinkBeanList.add(dealerLinkBean);
        dealerLinkBean = new DealerGroupDealerLinkBean();
        dealerLinkBean.setGroupNumber(999);
        dealerLinkBean.setAgentNumber(dealer.getAgentNumber());
        dealerLinkBean.setFlag(true);
        dealerLinkBeanList.add(dealerLinkBean);

        dealer.setDealerGroupDealerlink(dealerLinkBeanList);

        List<DealerProductType> productTypes = new ArrayList<DealerProductType>(0);
        productTypes.add(DealerProductType.CustomBuiltPoweredWheelchair);
        productTypes.add(DealerProductType.Scooter);
        dealer.setProductType(productTypes);

        try {
			dds.updateDealer(dealer);
		} catch (DealerValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
    }
    
    @Override
    protected void setup() {
        //To change body of implemented methods use File | Settings | File Templates.
    	addTestData(setupCreateDealer());
    }

    private DealerBean setupCreateDealer() {
        DealerBean dealer = new DealerBean();
        
        dealer.setVehicleManufacturerCode("AF");
        dealer.setAccountManager("DCC- Inbound DCC - London");
        dealer.setActiveStatus("Y");
        dealer.setAgentAddress1("3 Albian House - laks");
        dealer.setAgentAddress2("Albian House - laks");
        dealer.setAgentAddress3("Albian House - laks12");
        dealer.setAgentAddress4("Albian House - laks2");
        dealer.setAgentAgreeDate(new Date());
        dealer.setAgentApproveFlag("Y");
        dealer.setAgentEmail("AGENT-EMAIL");
        dealer.setAgentLegalName("AGENT-LEAGALNAME");
        dealer.setAgentName("AGENT-NAME");
        dealer.setAgentNumber("DEAL2");
        dealer.setAgentPostcode("HU1LAK");
        dealer.setAgentRefCode("ZZZZZZZZZZ");
        dealer.setAgentSortCode("809012");
        dealer.setAgentTypeFlag("Y");
        dealer.setAgentVatNumber("167541058");
        dealer.setAgentWebsite("www.agent-sample.co.uk");
        dealer.setBlockHp("Y");
        dealer.setBlockHpNewOnly("N");
        dealer.setBlockLease("Y");
        dealer.setBlockLeaseNewOnly("N");
        dealer.setBusTypeConverter("Y");
        dealer.setBusTypeHp("Y");
        dealer.setBusTypeLease("Y");
        dealer.setCreditLimit(new BigDecimal(0));
        dealer.setCreditOutstanding(new BigDecimal(0));
        dealer.setDealerCategory(DealerCategory.Car);
        List<DealerCoverage> coverage = new ArrayList<DealerCoverage>(0);
        coverage.add(DealerCoverage.England);
        coverage.add(DealerCoverage.Wales);
        dealer.setDealerCoverage(coverage);

        DealerFcsDateBean fcsDate = new DealerFcsDateBean();
        fcsDate.setActionDate(new Date());
        fcsDate.setDateType(DealerFcsDateType.Contract_Received_Q);

        List<DealerFcsDateBean> fcs = new ArrayList<DealerFcsDateBean>(0);
        fcs.add(fcsDate);

        fcsDate = new DealerFcsDateBean();
        fcsDate.setActionDate(new Date());
        fcsDate.setDateType(DealerFcsDateType.Contract_Received_T);
        fcs.add(fcsDate);

        dealer.setDealerFcsDateBean(fcs);

        dealer.setDealerTypeMflDirect("Y");
        dealer.setDirectDebit("Y");
        dealer.setEsignatureInd("Y");

        DealerExtraBean extra = new DealerExtraBean();
        extra.setAgentNumber(dealer.getAgentNumber());
        extra.setAgentType("C");
        extra.setClosingDown(true);
        extra.setClosingDownDate(new Date());
        dealer.setExtra(extra);

        dealer.setFaxNumber("01212121021212");
        dealer.setFinanceEmail("laks@gmail.com");
        dealer.setHasShowroom("Y");
        dealer.setHomeVisitor("Y");
        dealer.setInsuranceRepairer("Y");
        dealer.setPartnerType(DealerPartner.Premier);
        dealer.setPaymentTermsDays(10);
        dealer.setTelephoneNumber("012120121212");
        dealer.setTradeIn("Y");

        List<DealerGroupDealerLinkBean> dealerLinkBeanList = new ArrayList<DealerGroupDealerLinkBean>(0);
        DealerGroupDealerLinkBean dealerLinkBean = new DealerGroupDealerLinkBean();
        dealerLinkBean.setGroupNumber(5);
        dealerLinkBean.setAgentNumber(dealer.getAgentNumber());
        dealerLinkBean.setFlag(true);
        dealerLinkBeanList.add(dealerLinkBean);
        dealerLinkBean = new DealerGroupDealerLinkBean();
        dealerLinkBean.setGroupNumber(6);
        dealerLinkBean.setAgentNumber(dealer.getAgentNumber());
        dealerLinkBean.setFlag(true);
        dealerLinkBeanList.add(dealerLinkBean);
        dealer.setDealerGroupDealerlink(dealerLinkBeanList);

        List<DealerProductType> productTypes = new ArrayList<DealerProductType>(0);
        productTypes.add(DealerProductType.CustomBuiltPoweredWheelchair);
        productTypes.add(DealerProductType.Scooter);
        dealer.setProductType(productTypes);
        return dealer;
	}

	@Override
    protected void destroy() {
		DealerBean dealer = (DealerBean) getTestData(1);
    	MaintenanceAgentMaagEntity dealerEntity = MaintenanceAgentMaagEntity.findMaintenanceAgentMaagEntity(dealer.getAgentNumber());
    	
    }
}
