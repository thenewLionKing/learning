package uk.co.mo.app.mercury.domain.serviceagent.ejb;

import javax.ejb.Local;

import uk.co.mo.app.mercury.domain.serviceagent.service.ServiceAgentDataService;

@Local
public interface ServiceAgentDataServiceSessionBeanLocal extends ServiceAgentDataService {
}
