package uk.co.mo.app.mercury.domain.org.dealer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerPersonnelBean;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerPersonnelDealerLinkBean;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerPersonnelTrainingBean;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerContactService;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerValidationException;


public class DealerContactServiceTest extends AbstractJunit4Test{

	private static final Log LOG= LogFactory.getLog(DealerContactServiceTest.class);

    @Autowired
    @Qualifier("dealerContactService")
    private DealerContactService dcs;
	private int dealerPersonnelId;
	private Date accreditationDate;
	private Date courseDate;
	private Date expiryDate;
	private int id;

    @Test
    public void testAddDealerContact() throws DealerValidationException {
    	
    	DealerPersonnelBean dealerPersonnelBean = new DealerPersonnelBean();
    	
    	dealerPersonnelBean.setActive(true);
    	dealerPersonnelBean.setDealerPersonnelId(dealerPersonnelId);
    	dealerPersonnelBean.setFirstName("Amit");
    	dealerPersonnelBean.setLastName("Dealer");
    	DealerPersonnelDealerLinkBean linkBean = new DealerPersonnelDealerLinkBean();
    	DealerPersonnelTrainingBean trainingBean = new DealerPersonnelTrainingBean();
    	
    	linkBean.setActive(true);
    	linkBean.setAgentNumber("12345");
    	linkBean.setDealerPersonnelId(dealerPersonnelId);
    	
    	trainingBean.setAccreditationDate(accreditationDate);
    	trainingBean.setCourseDate(courseDate);
    	trainingBean.setCourseId("MO_SALES_MBT_TRAINED");
    	trainingBean.setCourseStatusId("Booked");
    	trainingBean.setExpiryDate(expiryDate);
    	trainingBean.setId(id);
    	
    	List<DealerPersonnelDealerLinkBean> dealerPersonnelDealerLinksBean = new ArrayList<DealerPersonnelDealerLinkBean>(0);
    	dealerPersonnelDealerLinksBean.add(linkBean);
    	
    	List<DealerPersonnelTrainingBean> dealerPersonnelTrainingsBean = new ArrayList<DealerPersonnelTrainingBean>(0);
    	dealerPersonnelTrainingsBean.add(trainingBean);
    	
    	dealerPersonnelBean.setDealerPersonnelDealerLinksBean(dealerPersonnelDealerLinksBean);
    	dealerPersonnelBean.setDealerPersonnelTrainingsBean(dealerPersonnelTrainingsBean);
    	
    	dcs.addDealerContact(dealerPersonnelBean);
    	
    }

    @Test
    public void testUpdateDealerContact() throws DealerValidationException{
    	dealerPersonnelId=64;
    	id=106;
    	DealerPersonnelBean dealerPersonnelBean = new DealerPersonnelBean();
    	List<DealerPersonnelDealerLinkBean> dealerPersonnelDealerLinksBean = new ArrayList<DealerPersonnelDealerLinkBean>(0);
    	
    	List<DealerPersonnelTrainingBean> dealerPersonnelTrainingsBean = new ArrayList<DealerPersonnelTrainingBean>(0);
    	
    	dealerPersonnelBean.setActive(true);
    	dealerPersonnelBean.setDealerPersonnelId(dealerPersonnelId);
    	dealerPersonnelBean.setFirstName("Dealer");
    	dealerPersonnelBean.setLastName("DealerUpdate1");
    	DealerPersonnelDealerLinkBean linkBean = new DealerPersonnelDealerLinkBean();
    	DealerPersonnelTrainingBean trainingBean = new DealerPersonnelTrainingBean();
    	
    	linkBean.setActive(true);
    	linkBean.setAgentNumber("12345");
    	linkBean.setDealerPersonnelId(dealerPersonnelId);

    	dealerPersonnelDealerLinksBean.add(linkBean);
    	linkBean= new DealerPersonnelDealerLinkBean();
    	
    	linkBean.setActive(true);
    	linkBean.setAgentNumber("13499");
    	linkBean.setDealerPersonnelId(dealerPersonnelId);
    	dealerPersonnelDealerLinksBean.add(linkBean);
    	
    	trainingBean.setId(id);
    	trainingBean.setAccreditationDate(accreditationDate);
    	trainingBean.setCourseDate(courseDate);
    	trainingBean.setCourseId("MO_SALES_MBT_TRAINED");
    	trainingBean.setCourseStatusId("Pass");
    	trainingBean.setExpiryDate(expiryDate);
    	dealerPersonnelTrainingsBean.add(trainingBean);
   	
    	dealerPersonnelBean.setDealerPersonnelDealerLinksBean(dealerPersonnelDealerLinksBean);
    	dealerPersonnelBean.setDealerPersonnelTrainingsBean(dealerPersonnelTrainingsBean);
    	
    	dcs.updateDealerContact(dealerPersonnelBean);
    }
	
	@Override
	protected void setup() {
	    this.dealerPersonnelId = (int) (Math.random()*100 + 35);
	    this.accreditationDate = new Date(System.currentTimeMillis());
	    this.courseDate = new Date(System.currentTimeMillis());
	    this.expiryDate= new Date(System.currentTimeMillis());
	    this.id = (int) (Math.random()*100 +31);
	    
	}

	@Override
	protected void destroy() {
	}

}
