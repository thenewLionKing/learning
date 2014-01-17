package uk.co.mo.app.mercury.domain.translease.vcd.service;

import java.util.List;

import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;
import uk.co.mo.app.mercury.domain.translease.vcd.beans.TlVcdBean;

public interface TlVcdDataService {

	/**
	 * @param vcdBean
	 * @throws TransactionNotFoundException
	 */
	public void addVcd( TlVcdBean vcdBean ) throws TransactionNotFoundException; 

	/**
	 * @param vcdBeans
	 * @throws TransactionNotFoundException
	 */
	public void addVcds( List < TlVcdBean > vcdBeans ) throws TransactionNotFoundException; 
}
