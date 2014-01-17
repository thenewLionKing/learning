package uk.co.mo.app.mercury.domain.org.dealer.service;

import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerPersonnelBean;

public interface DealerContactService {
	
    public void addDealerContact(DealerPersonnelBean agent) throws DealerValidationException;

    public void updateDealerContact(DealerPersonnelBean agent) throws DealerValidationException;


}
