package uk.co.mo.app.mercury.domain.translease.invoice.ejb;


import javax.ejb.Local;

import uk.co.mo.app.mercury.domain.translease.invoice.service.TransleaseInvoiceDataService;

@Local
public interface TransleaseInvoiceDataServiceSessionBeanLocal extends TransleaseInvoiceDataService {	}
