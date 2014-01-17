package uk.co.mo.app.mercury.domain.vehicle.service;

import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptFitterBean;

public interface AdaptFitterService {

	void addAdaptFitters(AdaptFitterBean adaptFitterBean);

	void updateAdaptFitters(AdaptFitterBean adaptFitterBean);
	
	public AdaptFitterBean getAdaptFitter(Integer fitterId) ; 

}
