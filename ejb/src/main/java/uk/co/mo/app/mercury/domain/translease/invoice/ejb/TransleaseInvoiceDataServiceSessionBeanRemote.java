package uk.co.mo.app.mercury.domain.translease.invoice.ejb;

import javax.ejb.Remote;

import uk.co.mo.app.mercury.domain.translease.invoice.service.TransleaseInvoiceDataService;

@Remote
public interface TransleaseInvoiceDataServiceSessionBeanRemote extends TransleaseInvoiceDataService {
}
