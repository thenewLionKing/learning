package uk.co.mo.app.mercury.web.domain;

import com.ibm.icu.util.StringTokenizer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import uk.co.mo.app.mercury.cs.system.ConnectionStatus;
import uk.co.mo.app.mercury.cs.system.StatusDetail;
import uk.co.mo.app.mercury.domain.DomainEntityCountService;
import uk.co.mo.app.mercury.domain.agreement.service.AgreementDataService;
import uk.co.mo.app.mercury.domain.customer.service.CustomerDataService;
import uk.co.mo.app.mercury.domain.org.dealer.service.DealerDataService;
import uk.co.mo.app.mercury.domain.org.manufacturer.service.ManufacturerService;
import uk.co.mo.app.mercury.domain.vehicle.service.VehicleDataService;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * <p/>
 * User: prabat
 * Date: 15/12/11
 * Time: 15:26
 * <p/>
 * Change Log - Who : When : Comment
 */
@Component
public class DomainServiceMonitorWebHelper {

    private static final Log LOG = LogFactory.getLog(DomainServiceMonitorWebHelper.class);

    @Autowired
    @Qualifier("manufacturerServiceEJB")
    private ManufacturerService manufacturerService;

    @Autowired
    @Qualifier("dealerDataServiceEJB")
    private DealerDataService dealerDataService;

    @Autowired
    @Qualifier("vehicleDataServiceEJB")
    private VehicleDataService vehicleDataService;

    @Autowired
    @Qualifier("customerDataServiceEJB")
    private CustomerDataService customerDataService;

    @Autowired
    @Qualifier("agreementDataServiceEJB")
    private AgreementDataService agreementDataService;


    public Map<String, StatusDetail> getServiceStatuses(String serviceId) {

        if (serviceId.equalsIgnoreCase("all")) {
            return getServiceStatuses();
        } else {
            Map<String, StatusDetail> statuses = new HashMap<String, StatusDetail>(0);

            StringTokenizer tokenizer = new StringTokenizer(serviceId, ",");

            while (tokenizer.hasMoreTokens()) {
                String service = tokenizer.nextToken();
                if (service.equalsIgnoreCase("dealer")) {
                    statuses.put("DealerService", getStatus(dealerDataService, "all active dealers"));
                } else if (service.equalsIgnoreCase("customer")) {
                    statuses.put("CustomerService", getStatus(customerDataService, "all live customers"));
                } else if (service.equalsIgnoreCase("vehicle")) {
                    statuses.put("VehicleService", getStatus(vehicleDataService, "current scheme vehicles"));
                } else if (service.equalsIgnoreCase("manufacturer")) {
                    statuses.put("ManufacturerService", getStatus(manufacturerService, "all manufacturers"));
                } else if (service.equalsIgnoreCase("agreement")) {
                    statuses.put("AgreementService", getStatus(agreementDataService, "all live agreements"));
                }
            }
            return statuses;
        }
    }

    public Map<String, StatusDetail> getServiceStatuses() {
        Map<String, StatusDetail> statuses = new HashMap<String, StatusDetail>(0);
        statuses.put("ManufacturerService", getStatus(manufacturerService, "all manufacturers"));
        statuses.put("DealerService", getStatus(dealerDataService, "all active dealers"));
        statuses.put("VehicleService", getStatus(vehicleDataService, "current scheme vehicles"));
        statuses.put("CustomerService", getStatus(customerDataService, "all live customers"));
        statuses.put("AgreementService", getStatus(agreementDataService, "all live agreements"));
        return statuses;
    }

    private StatusDetail getStatus(Object service, String comment) {
        StatusDetail detail = new StatusDetail();
        detail.setComment(comment);

        try {
            if (service instanceof DomainEntityCountService) {
                DomainEntityCountService countService = (DomainEntityCountService) service;
                detail.setCount(countService.countAllRecords());
                detail.setConnectionStatus(ConnectionStatus.UP);
            } else {
                detail.setConnectionStatus(ConnectionStatus.UNKNOWN);
                detail.setCount((long) 0);
            }
        } catch (Exception e) {
            detail.setConnectionStatus(ConnectionStatus.DOWN);
            LOG.error("Service call failure", e);
        }
        return detail;
    }
}
