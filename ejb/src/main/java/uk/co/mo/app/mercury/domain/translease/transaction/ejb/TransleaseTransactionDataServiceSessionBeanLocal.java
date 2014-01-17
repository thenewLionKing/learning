package uk.co.mo.app.mercury.domain.translease.transaction.ejb;

import javax.ejb.Local;

import uk.co.mo.app.mercury.domain.translease.transaction.service.TransleaseTransactionDataService;

@Local
public interface TransleaseTransactionDataServiceSessionBeanLocal extends TransleaseTransactionDataService {

}
