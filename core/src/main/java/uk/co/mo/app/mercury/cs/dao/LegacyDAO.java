package uk.co.mo.app.mercury.cs.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * An abstract class that uses hibernate session factory
 *
 * <p/>
 * User: PrabaT
 * Date: 08-Jan-2010
 * Time: 10:09:23
 * <p/>
 * Change Log - Who : When : Comment
 */
@Component
public class LegacyDAO {
    private SessionFactory enterpriseSessionFactory;
    private SessionFactory soaInterfaceSessionFactory;
    private SessionFactory drsLondonSessionFactory;

    @Autowired
    @Qualifier("enterpriseSessionFactory")
    public void setEnterpriseSessionFactory(SessionFactory enterpriseSessionFactory) {
        this.enterpriseSessionFactory = enterpriseSessionFactory;
    }
    
    public SessionFactory getEnterpriseSessionFactory() {
        return enterpriseSessionFactory;
    }
    
    public SessionFactory getSoaInterfaceSessionFactory() {
        return soaInterfaceSessionFactory;
    }

    @Autowired
    @Qualifier("soaInterfaceSessionFactory")
    public void setSoaInterfaceSessionFactory(SessionFactory soaInterfaceSessionFactory) {
        this.soaInterfaceSessionFactory = soaInterfaceSessionFactory;
    }
    
    @Autowired
    @Qualifier("drsLondonSessionFactory")
	public void setDrsLondonSessionFactory(SessionFactory drsLondonSessionFactory) {
		this.drsLondonSessionFactory = drsLondonSessionFactory;
	}

	public SessionFactory getDrsLondonSessionFactory() {
		return drsLondonSessionFactory;
	}
}
