package uk.co.mo.app.mercury.web.domain.agreement;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import uk.co.mo.app.mercury.domain.agreement.beans.AgreementBean;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementExtensionAuditBean;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementExtensionBean;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementPreviousPartiesBean;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementProcBean;
import uk.co.mo.app.mercury.domain.agreement.service.AgreementDataService;

@WebService(serviceName="AgreementService", targetNamespace="http://xmlns.mo.co.uk/ApplicationServices/mercury/agreement")
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL)
public class AgreementServiceEndpoint extends SpringBeanAutowiringSupport {
	
    private static final Log LOG = LogFactory.getLog(AgreementServiceEndpoint.class);
    
    @Autowired
    @Qualifier("agreementDataServiceEJB")
    private AgreementDataService ads;

    @WebMethod(operationName = "GetAgreementByArn")
    public AgreementBean getAgreementByArn(@WebParam (name="ARN")String arnNumber){
    	return ads.getAgreementByArn(arnNumber);
    }

    @WebMethod(operationName = "GetAgreementByPK")
    public AgreementBean getAgreementByPK(@WebParam (name="AgreementId") Integer id){
    	return ads.getAgreementByPK(id);
    }
    
    @WebMethod(operationName = "GetAgreementInfo" )
    @XmlElement(required=true)
    public AgreementProcBean getAgreementInfo(@WebParam (name="recordId")Integer recordId, @WebParam (name="eventId") String eventId){
    	return ads.getAgreementInfo(recordId, eventId);
    }

    @WebMethod(operationName = "GetAgreementPreviousParties" )
    @XmlElement(required=true)
    public AgreementPreviousPartiesBean getAgreementPreviousParties(@WebParam (name="eventId") String eventId){
    	return ads.getAgreementPreviousParties(eventId);
    }
    
    @WebMethod(operationName = "GetAgreementExtensions")
    public AgreementExtensionBean getAgreementExtensions(@WebParam (name="AgreementId") Integer id){
    	return ads.getAgreementExtensions(id);
    }
    
    @WebMethod(operationName = "GetAgreementExtensionsAudit")
    public AgreementExtensionAuditBean getAgreementExtensionsAudit(@WebParam (name="AuditId") Integer id){
    	return ads.getAgreementExtensionsAudit(id);
    }
    
}
