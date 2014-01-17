package uk.co.mo.app.mercury.domain.translease.transaction.ejb;

import javax.ejb.Remote;

import uk.co.mo.app.mercury.domain.translease.transaction.service.TransleaseTransactionDataService;

@Remote
public interface TransleaseTransactionDataServiceSessionBeanRemote extends TransleaseTransactionDataService {

}
