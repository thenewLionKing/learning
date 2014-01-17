package uk.co.mo.app.mercury.domain.customer.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import uk.co.mo.app.mercury.domain.customer.beans.CustomerBean;
import uk.co.mo.app.mercury.domain.customer.beans.VrmCustomerSuspensionBean;
import uk.co.mo.app.mercury.domain.customer.entity.CustomerDlaAwardEntity;
import uk.co.mo.app.mercury.domain.customer.entity.CustomerEntity;
import uk.co.mo.app.mercury.domain.customer.entity.VrmCustomerSuspensionEntity;

@Service("customerDataService")
public class CustomerDataServiceImpl implements CustomerDataService {

    private static final Log LOG = LogFactory.getLog(CustomerDataServiceImpl.class);
	
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public CustomerBean getCustomerData(String customerId) {
		LOG.debug("Got call on CustomerDataServiceImpl by Customer ID");
		CustomerEntity customerEntity = CustomerEntity.findCustomerEntity(Integer.valueOf(customerId));
		CustomerBean custBean = customerEntity.getCustomerBean();

        CustomerDlaAwardEntity custDlaEntity = customerEntity.getCustomerDlaAwardEntity();
		if(custDlaEntity!=null)
			custBean.setCustomerDlaAwardBean(custDlaEntity.getCustomerDlaAwardBean());

		List<VrmCustomerSuspensionEntity> vrmCustSusEntity = customerEntity.getVrmCustomerSuspensionEntity();
		List<VrmCustomerSuspensionBean> custSusBeanList = new ArrayList<VrmCustomerSuspensionBean>(0);

		if(vrmCustSusEntity !=null){
			for(VrmCustomerSuspensionEntity vrmCustEntity : vrmCustSusEntity){
				VrmCustomerSuspensionBean vrmCustomerSuspensionBean = vrmCustEntity.getVrmCustomerSuspensionBean();
				vrmCustomerSuspensionBean.setVrmCustomerSuspensionReasonBean(
						vrmCustEntity.getVrmCustomerSuspensionReasonEntity().getVrmCustomerSuspensionReasonBean());
				custSusBeanList.add(vrmCustomerSuspensionBean);
			}
		}
		custBean.setVrmCustomerSuspensionBean(custSusBeanList);
		
	return custBean; 
	}

	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public CustomerBean getCustomerDataByCRN(String crnNumber) {
		LOG.debug("Got call on CustomerDataServiceImpl by Customer CRN");
		CustomerEntity customerEntity = (CustomerEntity)CustomerEntity.findCustomerByCRNNumber(crnNumber).getSingleResult();
		CustomerBean custBean = customerEntity.getCustomerBean();
        CustomerDlaAwardEntity custDlaEntity = customerEntity.getCustomerDlaAwardEntity();

        // PIP -139 Added null Check similar to customer id..
        if(custDlaEntity!=null)
	        	custBean.setCustomerDlaAwardBean(custDlaEntity.getCustomerDlaAwardBean());


		List<VrmCustomerSuspensionEntity> vrmCustSusEntity = customerEntity.getVrmCustomerSuspensionEntity();
		List<VrmCustomerSuspensionBean> custSusBeanList = new ArrayList<VrmCustomerSuspensionBean>(0);
		
		if(vrmCustSusEntity !=null){
			for(VrmCustomerSuspensionEntity vrmCustEntity : vrmCustSusEntity){
				VrmCustomerSuspensionBean vrmCustomerSuspensionBean = vrmCustEntity.getVrmCustomerSuspensionBean();
				vrmCustomerSuspensionBean.setVrmCustomerSuspensionReasonBean(
						vrmCustEntity.getVrmCustomerSuspensionReasonEntity().getVrmCustomerSuspensionReasonBean());
				custSusBeanList.add(vrmCustomerSuspensionBean);
			}
		}
		custBean.setVrmCustomerSuspensionBean(custSusBeanList);
		
	return custBean; 
	}

    @Transactional(propagation=Propagation.NOT_SUPPORTED)
    public long countAllRecords() {
        return (Long)CustomerEntity.countLiveCustomers().getSingleResult();
    }
}
