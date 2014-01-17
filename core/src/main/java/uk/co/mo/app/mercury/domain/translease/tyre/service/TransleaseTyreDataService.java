package uk.co.mo.app.mercury.domain.translease.tyre.service;

import java.util.List;

import uk.co.mo.app.mercury.domain.translease.invoice.exception.InvoiceCreditEntryNotFoundException;
import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;
import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlNonTyreItemBean;
import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlTyreBean;
import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlTyreItemBean;
import uk.co.mo.app.mercury.domain.translease.tyre.entity.TlFastFitProductEntity;
import uk.co.mo.app.mercury.domain.translease.tyre.exception.FastFitProductCodeNotFoundException;

public interface TransleaseTyreDataService {

	/**
	 * @param tlTyreBeans
	 * @param tlTyreItemBeans
	 * @param tlNonTyreItemBeans
	 * 
	 * @throws TransactionNotFoundException
	 * @throws FastFitProductCodeNotFoundException 
	 */
	public void addTyres( List <TlTyreBean> tlTyreBeans, List <TlTyreItemBean> tlTyreItemBeans, List <TlNonTyreItemBean> tlNonTyreItemBeans ) throws TransactionNotFoundException, InvoiceCreditEntryNotFoundException, FastFitProductCodeNotFoundException;
}
