package uk.co.mo.app.mercury.domain.translease.tyre.ejb;

import javax.ejb.Remote;

import uk.co.mo.app.mercury.domain.translease.tyre.service.TransleaseTyreDataService;

@Remote
public interface TransleaseTyreDataServiceSessionBeanRemote extends TransleaseTyreDataService {

}
