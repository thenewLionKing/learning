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

import uk.co.mo.app.mercury.domain.org.manufacturer.beans.ManufacturerBean;
import uk.co.mo.app.mercury.domain.org.manufacturer.service.ManufacturerService;



@Stateless(mappedName="mercury/ejb", name = "ManufacturerServiceEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class ManufacturerServiceSessionBean implements ManufacturerServiceSessionBeanLocal , ManufacturerServiceSessionBeanRemote{

    private static final Log LOG = LogFactory.getLog(ManufacturerServiceSessionBean.class);

    @Autowired
    @Qualifier("manufacturerService")
    private ManufacturerService ms;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void addManufacturer(@WebParam(name="ManufacturerBean") ManufacturerBean agent) {
        LOG.debug("Got ejb call on ManufacturerService ::addManufacturer ");
        ms.addManufacturer(agent);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateManufacturer(@WebParam(name="ManufacturerBean") ManufacturerBean agent){
    	LOG.debug("Got ejb call on ManufacturerService ::updateManufacturer ");
        ms.updateManufacturer(agent);
	}

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public long countAllRecords() {
        LOG.debug("Got ejb call on ManufacturerService ::countAllRecords ");
        return ms.countAllRecords();
    }
}
