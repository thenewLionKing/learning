package uk.co.mo.app.mercury.domain.translease.invoice.service;

import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlInvoiceCreditBean;
import uk.co.mo.app.mercury.domain.translease.invoice.exception.InvoiceCreditEntryAlreadyExistsException;
import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;

public interface TransleaseInvoiceDataService {

	/**
	 * @param tlInvoiceBean
	 * @throws TransactionNotFoundException 
	 */
	public void addInvoice(TlInvoiceCreditBean tlInvoiceCreditBean) throws TransactionNotFoundException, InvoiceCreditEntryAlreadyExistsException;
}
