package uk.co.mo.app.mercury.domain.translease.vcd.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;
import uk.co.mo.app.mercury.domain.translease.vcd.beans.TlVcdBean;
import uk.co.mo.app.mercury.domain.translease.vcd.service.TlVcdDataService;

@Stateless(mappedName="mercury/ejb", name="TransleaseVcdDataServiceEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class TransleaseVcdDataServiceSessionBean implements TransleaseVcdDataServiceSessionBeanRemote, TransleaseVcdDataServiceSessionBeanLocal {

	@SuppressWarnings("unused")
	private static final Log LOG = LogFactory.getLog(TransleaseVcdDataServiceSessionBean.class);

	@Autowired
	@Qualifier("tlVcdDataService")
	private TlVcdDataService transleaseVcdService;

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void addVcd(TlVcdBean vcdBean) throws TransactionNotFoundException {
		transleaseVcdService.addVcd( vcdBean );
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void addVcds(List<TlVcdBean> vcdBeans)
			throws TransactionNotFoundException {
		transleaseVcdService.addVcds( vcdBeans );
	}
}
