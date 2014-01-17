package uk.co.mo.app.mercury.domain.translease.transaction.service;

import uk.co.mo.app.mercury.domain.translease.transaction.beans.TlTransactionBean;
import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;

public interface TransleaseTransactionDataService {

	/**
	 * @param tlTransactionBean
	 */
	public void addTransaction( TlTransactionBean tlTransactionBean );

	/**
	 * @param transactionNumber
	 * @return TlTransactionBean
	 * @throws TransactionNotFoundException
	 */
	public TlTransactionBean findTransaction( Integer transactionNumber ) throws TransactionNotFoundException;

	/**
	 * @param transactionNumber
	 * @throws TransactionNotFoundException
	 */
	public void cancelTransaction( Integer transactionNumber ) throws TransactionNotFoundException;

	/**
	 * @param tlTransactionBean
	 * @throws TransactionNotFoundException
	 */
	public void updateTransaction( TlTransactionBean tlTransactionBean ) throws TransactionNotFoundException;

    /**
     * Basic delete operations. The delete will cascade to child entities as well
     *
     * @param transactionNumber
     * @throws TransactionNotFoundException
     */
    public void deleteTransaction(Integer transactionNumber) throws TransactionNotFoundException;
    
    /**
     * Basic upsert operation (1. Delete the record 2. Add the record). 
     * Its amalgamation of delete & add functionality into this.
     * 
     * @param transactionNumber
     * @throws TransactionNotFoundException
     */
	void upsertTransaction(TlTransactionBean tlTransactionBean) throws TransactionNotFoundException;
}
