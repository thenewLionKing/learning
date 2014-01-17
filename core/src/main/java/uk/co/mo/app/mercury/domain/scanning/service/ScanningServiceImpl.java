package uk.co.mo.app.mercury.domain.scanning.service;

import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import uk.co.mo.app.mercury.cs.dao.LegacyDAO;
import uk.co.mo.app.mercury.domain.scanning.beans.ProfileBean;

@Service("ScanningService")
public class ScanningServiceImpl implements ScanningService {

	@Autowired
	private LegacyDAO legacyDao; 
	
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public ProfileBean getDocumentInformationByDocNumber(Integer docNumber) {
		ProfileBean bean = (ProfileBean)legacyDao.getDrsLondonSessionFactory().getCurrentSession()
		.getNamedQuery("get_profile").setParameter(0, docNumber)
		.setResultTransformer(Transformers.aliasToBean((ProfileBean.class))).list().get(0);
		
		ProfileBean fullPathInfoBean = getDocumentPathByDocNumber(docNumber);
		
		bean.setFullPath(fullPathInfoBean.getFullPath());
		bean.setVersionId(fullPathInfoBean.getVersionId());
		
		return bean;
	}	

	@SuppressWarnings("unused")
	private ProfileBean getDocumentPathByDocNumber(Integer docNumber) {
		ProfileBean bean = (ProfileBean)legacyDao.getDrsLondonSessionFactory().getCurrentSession()
							.getNamedQuery("domain.scanning.documentPath").setParameter(0, docNumber)
							.setResultTransformer(Transformers.aliasToBean((ProfileBean.class))).list().get(0);
		return bean;
	}


}
