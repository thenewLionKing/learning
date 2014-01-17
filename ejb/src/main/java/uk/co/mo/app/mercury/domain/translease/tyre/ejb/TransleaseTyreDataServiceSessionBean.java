package uk.co.mo.app.mercury.domain.translease.tyre.ejb;

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

import uk.co.mo.app.mercury.domain.translease.invoice.exception.InvoiceCreditEntryNotFoundException;
import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;
import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlNonTyreItemBean;
import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlTyreBean;
import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlTyreItemBean;
import uk.co.mo.app.mercury.domain.translease.tyre.entity.TlFastFitProductEntity;
import uk.co.mo.app.mercury.domain.translease.tyre.exception.FastFitProductCodeNotFoundException;
import uk.co.mo.app.mercury.domain.translease.tyre.service.TransleaseTyreDataService;

@Stateless(mappedName="mercury/ejb", name="TransleaseTyreDataServiceEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class TransleaseTyreDataServiceSessionBean implements TransleaseTyreDataServiceSessionBeanRemote, TransleaseTyreDataServiceSessionBeanLocal {

	@SuppressWarnings("unused")
	private static final Log LOG = LogFactory.getLog(TransleaseTyreDataServiceSessionBean.class);

	@Autowired
	@Qualifier("transleaseTyreDataService")
	private TransleaseTyreDataService transleaseTyreService;

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void addTyres(List<TlTyreBean> tlTyreBeans,
			List<TlTyreItemBean> tlTyreItemBeans,
			List<TlNonTyreItemBean> tlNonTyreItemBeans)
			throws TransactionNotFoundException, InvoiceCreditEntryNotFoundException, FastFitProductCodeNotFoundException {

		transleaseTyreService.addTyres( tlTyreBeans, tlTyreItemBeans, tlNonTyreItemBeans );
	}
}
