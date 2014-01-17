package uk.co.mo.app.mercury.web.domain.serviceagent;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import uk.co.mo.app.mercury.domain.serviceagent.beans.ServiceAgentBean;
import uk.co.mo.app.mercury.domain.serviceagent.exception.ServiceAgentNotFoundException;
import uk.co.mo.app.mercury.domain.serviceagent.service.ServiceAgentDataService;
import uk.co.mo.app.mercury.domain.serviceagent.service.ServiceAgentValidationException;

@WebService(serviceName="ServiceAgentDataService", targetNamespace = "http://xmlns.mo.co.uk/legacy/domain/translease")
public class ServiceAgentServiceEndpoint extends SpringBeanAutowiringSupport {

    @SuppressWarnings("unused")
	private static final Log LOG = LogFactory.getLog(ServiceAgentServiceEndpoint.class);

    @Autowired
    @Qualifier("serviceAgentDataServiceEJB")
    private ServiceAgentDataService serviceAgentDataService;

	/**
	 * @param serviceAgentBean
	 * @throws ServiceAgentNotFoundException
	 */
    @WebMethod(operationName = "AddServiceAgent")
	public void addServiceAgent( @WebParam(name="serviceAgentBean") ServiceAgentBean serviceAgentBean ) throws ServiceAgentNotFoundException, ServiceAgentValidationException {
    	serviceAgentDataService.addServiceAgent( serviceAgentBean );
    }

	/**
	 * @param serviceAgentBean
	 * @throws ServiceAgentNotFoundException
	 */
    @WebMethod(operationName = "UpdateServiceAgent")
	public void updateServiceAgent( @WebParam(name="serviceAgentBean") ServiceAgentBean serviceAgentBean) throws ServiceAgentValidationException, ServiceAgentNotFoundException {
    	serviceAgentDataService.updateServiceAgent( serviceAgentBean );    	
    }

	/**
	 * @param transleaseRepairerNumber
	 * @throws ServiceAgentNotFoundException
	 */
    @WebMethod(operationName = "InactivateServiceAgent")
	public void deleteServiceAgent( @WebParam(name="transleaseRepairerNumber") Integer transleaseRepairerNumber) throws ServiceAgentNotFoundException {
    	serviceAgentDataService.inactivateServiceAgent( transleaseRepairerNumber );
    }

	/**
	 * @param transleaseRepairerNumber
	 * @return ServiceAgentBean
	 * @throws ServiceAgentNotFoundException
	 */
    @WebMethod(operationName = "FindServiceAgent")
	public ServiceAgentBean findServiceAgent( @WebParam(name="transleaseRepairerNumber") Integer transleaseRepairerNumber) throws ServiceAgentNotFoundException {
    	return serviceAgentDataService.findServiceAgent( transleaseRepairerNumber );    	
    }

	/**
	 * @param agentNumber
	 * @return ServiceAgentBean
	 * @throws ServiceAgentNotFoundException
	 */
    @WebMethod(operationName = "FindActiveServiceAgent")
	public ServiceAgentBean findActiveServiceAgentByAgentNumber( @WebParam(name="agentNumber") String agentNumber) throws ServiceAgentNotFoundException {
    	return serviceAgentDataService.findActiveServiceAgentByAgentNumber( agentNumber );    	
    }

	/**
	 * @param serviceAgentBean
	 * @throws ServiceAgentNotFoundException
	 */
    @WebMethod(operationName = "UpsertServiceAgent")
	public void upsertServiceAgent( @WebParam(name="serviceAgentBean") ServiceAgentBean serviceAgentBean) throws ServiceAgentValidationException, ServiceAgentNotFoundException {
    	serviceAgentDataService.upsertServiceAgent( serviceAgentBean );    	
    }    
}
