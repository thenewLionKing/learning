package uk.co.mo.app.mercury.domain.translease.invoice.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlInvoiceCreditBean;
import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlItemLineBean;
import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlPartsDetailBean;
import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlVatSummaryBean;
import uk.co.mo.app.mercury.domain.translease.invoice.entity.TlInvoiceCreditEntity;
import uk.co.mo.app.mercury.domain.translease.invoice.entity.TlItemLineEntity;
import uk.co.mo.app.mercury.domain.translease.invoice.entity.TlItemLinePKEntity;
import uk.co.mo.app.mercury.domain.translease.invoice.entity.TlPartsDetailEntity;
import uk.co.mo.app.mercury.domain.translease.invoice.entity.TlPartsDetailPKEntity;
import uk.co.mo.app.mercury.domain.translease.invoice.entity.TlVatSummaryEntity;
import uk.co.mo.app.mercury.domain.translease.invoice.entity.TlVatSummaryPKEntity;
import uk.co.mo.app.mercury.domain.translease.invoice.exception.InvoiceCreditEntryAlreadyExistsException;
import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;
import uk.co.mo.app.mercury.domain.translease.transaction.service.TransleaseTransactionDataService;

@Service("transleaseInvoiceDataService")
public class TransleaseInvoiceDataServiceImpl implements TransleaseInvoiceDataService {

	private static final Log LOG = LogFactory.getLog(TransleaseInvoiceDataServiceImpl.class);

	@Autowired
    @Qualifier("transleaseTransactionDataService")
    private TransleaseTransactionDataService transactionService;

	@Override
	@Transactional
	public void addInvoice(TlInvoiceCreditBean tlInvoiceCreditBean) throws TransactionNotFoundException, InvoiceCreditEntryAlreadyExistsException {
        LOG.debug("Call to TransleaseInvoiceDataService:addInvoice("+tlInvoiceCreditBean+")");
        Integer transleaseTransactionNumber = tlInvoiceCreditBean.getTransleaseTransactionNumber();
    	transactionService.findTransaction( transleaseTransactionNumber ); //if not found exception thrown and won't continue

    	//check no invoice entries exist for this transaction number.
    	TlInvoiceCreditEntity exisitngEntity = TlInvoiceCreditEntity.findTlInvoiceCreditEntity( transleaseTransactionNumber );
    	if( exisitngEntity != null ) {
    		throw new InvoiceCreditEntryAlreadyExistsException( transleaseTransactionNumber.toString() );
    	}

		TlInvoiceCreditEntity tlInvoiceCreditEntity = new TlInvoiceCreditEntity ();
        List <TlItemLineEntity> tlItemLineEntitys = new ArrayList <TlItemLineEntity> ();
        List <TlVatSummaryEntity> tlVatSummaryEntitys = new ArrayList <TlVatSummaryEntity> ();
        List <TlPartsDetailEntity> tlPartsDetailEntitys = new ArrayList <TlPartsDetailEntity> ();

		//TlVatSummaryBeans
		List <TlVatSummaryBean> tlVatSummaryBeans = tlInvoiceCreditBean.getTlVatSummaryBeans();
		//TlPartsDetailBeans
		List <TlPartsDetailBean> tlPartsDetailBeans = tlInvoiceCreditBean.getTlPartsDetailBeans();

		//set beans to entities
		tlInvoiceCreditEntity.setTlInvoiceCreditBean( tlInvoiceCreditBean );

		//TlPartsDetailBeans
		List <TlItemLineBean> tlItemLineBeans = tlInvoiceCreditBean.getTlItemLineBeans();
		TlItemLineEntity tlItemLineEntity;
		TlItemLinePKEntity tlItemLinePKEntity;
		if (tlItemLineBeans != null && !tlItemLineBeans.isEmpty()) {
			for (TlItemLineBean tlItemLineBean : tlItemLineBeans) {
				tlItemLineEntity = new TlItemLineEntity();
				tlItemLineEntity.setTlItemLineBean( tlItemLineBean );

				tlItemLinePKEntity = new TlItemLinePKEntity();
				tlItemLinePKEntity.setItemNumber( tlItemLineBean.getItemNumber() );
				tlItemLinePKEntity.setTransleaseTransactionNumber( transleaseTransactionNumber );

				tlItemLineEntity.setId( tlItemLinePKEntity );

				tlItemLineEntitys.add( tlItemLineEntity );
			}
			tlInvoiceCreditEntity.setTlItemLineEntity( tlItemLineEntitys );
		}

		if (tlVatSummaryBeans != null && !tlVatSummaryBeans.isEmpty()) {
			TlVatSummaryEntity tlVatSummaryEntity;
			TlVatSummaryPKEntity tlVatSummaryPKEntity;
			for (TlVatSummaryBean tlVatSummaryBean : tlVatSummaryBeans) {
				tlVatSummaryEntity = new TlVatSummaryEntity();
				tlVatSummaryEntity.setTlVatSummaryBean( tlVatSummaryBean );

				tlVatSummaryPKEntity = new TlVatSummaryPKEntity();
				tlVatSummaryPKEntity.setTransleaseTransactionNumber( transleaseTransactionNumber );
				tlVatSummaryPKEntity.setVatRate( tlVatSummaryBean.getVatRate() );

				tlVatSummaryEntity.setId( tlVatSummaryPKEntity );

				tlVatSummaryEntitys.add( tlVatSummaryEntity );
			}
			tlInvoiceCreditEntity.setTlVatSummaryEntity( tlVatSummaryEntitys );
		}

		TlPartsDetailEntity tlPartsDetailEntity;
		TlPartsDetailPKEntity tlPartsDetailPKEntity;
		if (tlPartsDetailBeans != null && !tlPartsDetailBeans.isEmpty()) {
			
			for (TlPartsDetailBean tlPartsDetailBean : tlPartsDetailBeans) {
				tlPartsDetailEntity = new TlPartsDetailEntity();
				tlPartsDetailEntity.setTlPartsDetailBean( tlPartsDetailBean );
				
				tlPartsDetailPKEntity = new TlPartsDetailPKEntity();
				tlPartsDetailPKEntity.setItemNumber( tlPartsDetailBean.getItemNumber() );
				tlPartsDetailPKEntity.setPartsNumber( tlPartsDetailBean.getPartsNumber() );
				tlPartsDetailPKEntity.setTransleaseTransactionNumber( transleaseTransactionNumber );

				tlPartsDetailEntity.setId( tlPartsDetailPKEntity );

				tlPartsDetailEntitys.add( tlPartsDetailEntity );
			}
			tlInvoiceCreditEntity.setTlPartsDetailEntity( tlPartsDetailEntitys );
		}

		TlInvoiceCreditEntity lookupCreditEntity = TlInvoiceCreditEntity.findTlInvoiceCreditEntity( transleaseTransactionNumber );
        if( lookupCreditEntity == null) {
    		tlInvoiceCreditEntity.persist();
        }
        else {
    		LOG.debug("PERSISTING START...");
    		tlInvoiceCreditEntity.merge();
    		LOG.debug("...END");
        }
	}
}
