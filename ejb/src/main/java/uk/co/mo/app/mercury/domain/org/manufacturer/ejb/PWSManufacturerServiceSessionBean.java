package uk.co.mo.app.mercury.domain.org.manufacturer.ejb;


import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;
import javax.jws.WebParam;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import uk.co.mo.app.mercury.domain.org.manufacturer.beans.ProductMakeBean;
import uk.co.mo.app.mercury.domain.org.manufacturer.service.PWSManufacturerService;



@Stateless(mappedName="mercury/ejb", name = "PWSManufacturerServiceEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class PWSManufacturerServiceSessionBean implements PWSManufacturerServiceSessionBeanLocal , PWSManufacturerServiceSessionBeanRemote{

    private static final Log LOG = LogFactory.getLog(PWSManufacturerServiceSessionBean.class);

    @Autowired
    @Qualifier("PWSManufacturerService")
    private PWSManufacturerService pwsms;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void addPWSManufacturer(@WebParam(name="ManufacturerBean") ProductMakeBean productMakeBean) {
        LOG.debug("Got ejb call on PWSManufacturerServiceSessionBean ::addManufacturer ");
        pwsms.addPWSManufacturer(productMakeBean);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updatePWSManufacturer(@WebParam(name="ManufacturerBean") ProductMakeBean productMakeBean){
    	LOG.debug("Got ejb call on PWSManufacturerServiceSessionBean ::updateManufacturer ");
    	pwsms.updatePWSManufacturer(productMakeBean);
	}
}
