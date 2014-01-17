package uk.co.mo.app.mercury.domain.serviceagent.ejb;

import javax.ejb.Remote;

import uk.co.mo.app.mercury.domain.serviceagent.service.ServiceAgentDataService;

@Remote
public interface ServiceAgentDataServiceSessionBeanRemote extends ServiceAgentDataService {
}
