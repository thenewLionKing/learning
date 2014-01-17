package uk.co.mo.app.mercury.domain.serviceagent.service;

import uk.co.mo.app.mercury.domain.serviceagent.beans.ServiceAgentBean;
import uk.co.mo.app.mercury.domain.serviceagent.exception.ServiceAgentNotFoundException;

public interface ServiceAgentDataService {

	/**
	 * @param serviceAgentBean
	 * @throws ServiceAgentNotFoundException
	 */
	public void addServiceAgent(ServiceAgentBean serviceAgentBean) throws ServiceAgentNotFoundException, ServiceAgentValidationException;

	/**
	 * @param serviceAgentBean
	 * @throws ServiceAgentNotFoundException
	 */
	public void updateServiceAgent(ServiceAgentBean serviceAgentBean) throws ServiceAgentValidationException, ServiceAgentNotFoundException;

	/**
	 * @param transleaseRepairerNumber
	 * @throws ServiceAgentNotFoundException
	 */
	public void inactivateServiceAgent(Integer transleaseRepairerNumber) throws ServiceAgentNotFoundException;

	/**
	 * @param transleaseRepairerNumber
	 * @return ServiceAgentBean
	 * @throws ServiceAgentNotFoundException
	 */
	public ServiceAgentBean findServiceAgent(Integer transleaseRepairerNumber) throws ServiceAgentNotFoundException;

	/**
	 * @param agentNumber
	 * @return ServiceAgentBean
	 * @throws ServiceAgentNotFoundException
	 */
	public ServiceAgentBean findActiveServiceAgentByAgentNumber(String agentNumber) throws ServiceAgentNotFoundException;

	public void upsertServiceAgent(ServiceAgentBean serviceAgentBean) throws ServiceAgentValidationException, ServiceAgentNotFoundException;
}
