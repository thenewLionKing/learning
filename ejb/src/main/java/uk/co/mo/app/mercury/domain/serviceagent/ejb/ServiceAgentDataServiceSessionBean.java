package uk.co.mo.app.mercury.domain.serviceagent.ejb;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import uk.co.mo.app.mercury.domain.serviceagent.beans.ServiceAgentBean;
import uk.co.mo.app.mercury.domain.serviceagent.exception.ServiceAgentNotFoundException;
import uk.co.mo.app.mercury.domain.serviceagent.service.ServiceAgentDataService;
import uk.co.mo.app.mercury.domain.serviceagent.service.ServiceAgentValidationException;

@Stateless(mappedName="mercury/ejb", name="ServiceAgentDataServiceEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class ServiceAgentDataServiceSessionBean implements ServiceAgentDataServiceSessionBeanRemote, ServiceAgentDataServiceSessionBeanLocal {

	@SuppressWarnings("unused")
	private static final Log LOG = LogFactory.getLog(ServiceAgentDataServiceSessionBean.class);

    @Autowired
    @Qualifier("serviceAgentDataService")
    private ServiceAgentDataService serviceAgentDataService;
	
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void addServiceAgent(ServiceAgentBean serviceAgentBean)
            throws ServiceAgentNotFoundException, ServiceAgentValidationException {
		serviceAgentDataService.addServiceAgent( serviceAgentBean );
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateServiceAgent(ServiceAgentBean serviceAgentBean)
            throws ServiceAgentValidationException, ServiceAgentNotFoundException {
		serviceAgentDataService.updateServiceAgent( serviceAgentBean );
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void inactivateServiceAgent(Integer transleaseRepairerNumber)
			throws ServiceAgentNotFoundException {
		serviceAgentDataService.inactivateServiceAgent( transleaseRepairerNumber );
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public ServiceAgentBean findServiceAgent(Integer transleaseRepairerNumber)
			throws ServiceAgentNotFoundException {
		return serviceAgentDataService.findServiceAgent( transleaseRepairerNumber );
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public ServiceAgentBean findActiveServiceAgentByAgentNumber(
			String agentNumber) throws ServiceAgentNotFoundException {
		return serviceAgentDataService.findActiveServiceAgentByAgentNumber( agentNumber );
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void upsertServiceAgent(ServiceAgentBean serviceAgentBean)
			throws ServiceAgentValidationException,
			ServiceAgentNotFoundException {
		serviceAgentDataService.upsertServiceAgent(serviceAgentBean);
	}
}
