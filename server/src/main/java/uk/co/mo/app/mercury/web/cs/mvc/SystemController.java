package uk.co.mo.app.mercury.web.cs.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.co.mo.app.mercury.cs.system.SystemStatus;
import uk.co.mo.app.mercury.cs.util.Collections;
import uk.co.mo.app.mercury.web.domain.DomainServiceMonitorWebHelper;

import java.util.Date;

/**
 * <p/>
 * User: prabat
 * Date: 22-Feb-2011
 * Time: 14:08:21
 * <p/>
 * Change Log - Who : When : Comment
 */
@Controller
public class SystemController {

    @Autowired
    private DomainServiceMonitorWebHelper monitor;

    @RequestMapping(value = "/status")
    public String status(Model model) {
        model.addAttribute("requestTime", "SystemController: eds status enquired at " + new Date());
        model.addAttribute("requestInfo", RequestMonitorFilter.getRequestMonitor());
        model.addAttribute("jmsStatus", SystemStatus.getJmsConnectionStatus());
        model.addAttribute("soaInterfaceDbStatus", SystemStatus.getSoaInterfaceDBStatus());
        model.addAttribute("lastSuccessfulJobRunTime", SystemStatus.getLastSuccessfulJobRunTime());
        //model.addAttribute("enterpriseServiceStatus", Collections.emptyMap());
        return "status";
    }

    @RequestMapping(value = "/status/service/{serviceId}")
    public String statusQuery(@PathVariable String serviceId, Model model) {
        model.addAttribute("enterpriseServiceStatus", monitor.getServiceStatuses(serviceId));
        return status(model);
    }

}
