package uk.co.mo.app.mercury.domain.org.dealer.ejb;

import javax.ejb.Remote;

import uk.co.mo.app.mercury.domain.org.dealer.service.DealerContactService;

@Remote
public interface DealerContactServiceSessionBeanRemote extends DealerContactService{

}
