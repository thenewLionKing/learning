package uk.co.mo.app.mercury.domain.scanning.service;

import uk.co.mo.app.mercury.domain.scanning.beans.ProfileBean;

public interface ScanningService {

	ProfileBean getDocumentInformationByDocNumber(Integer docNumber);
}
