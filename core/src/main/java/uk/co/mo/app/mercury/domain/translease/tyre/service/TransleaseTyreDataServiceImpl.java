package uk.co.mo.app.mercury.domain.translease.tyre.service;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.mo.app.mercury.domain.translease.invoice.entity.TlInvoiceCreditEntity;
import uk.co.mo.app.mercury.domain.translease.invoice.entity.TlVatSummaryEntity;
import uk.co.mo.app.mercury.domain.translease.invoice.exception.InvoiceCreditEntryNotFoundException;
import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;
import uk.co.mo.app.mercury.domain.translease.transaction.service.TransleaseTransactionDataService;
import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlNonTyreItemBean;
import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlTyreBean;
import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlTyreItemBean;
import uk.co.mo.app.mercury.domain.translease.tyre.entity.TlFastFitProductEntity;
import uk.co.mo.app.mercury.domain.translease.tyre.entity.TlNonTyreItemEntity;
import uk.co.mo.app.mercury.domain.translease.tyre.entity.TlNonTyreItemPKEntity;
import uk.co.mo.app.mercury.domain.translease.tyre.entity.TlTyreEntity;
import uk.co.mo.app.mercury.domain.translease.tyre.entity.TlTyreItemEntity;
import uk.co.mo.app.mercury.domain.translease.tyre.entity.TlTyreItemPKEntity;
import uk.co.mo.app.mercury.domain.translease.tyre.entity.TlTyrePKEntity;
import uk.co.mo.app.mercury.domain.translease.tyre.exception.FastFitProductCodeNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;

@Service("transleaseTyreDataService")
public class TransleaseTyreDataServiceImpl implements TransleaseTyreDataService {

	private static final Log LOG = LogFactory.getLog(TransleaseTyreDataServiceImpl.class);

	@Autowired
    @Qualifier("transleaseTransactionDataService")
    private TransleaseTransactionDataService transactionService;

	@Override
	@Transactional
	public void addTyres( List <TlTyreBean> tlTyreBeans, List <TlTyreItemBean> tlTyreItemBeans, List <TlNonTyreItemBean> tlNonTyreItemBeans ) throws TransactionNotFoundException, InvoiceCreditEntryNotFoundException, FastFitProductCodeNotFoundException {

		Integer transleaseTransactionNumber;
		BigDecimal vatRate = null;

		for (TlTyreBean tlTyreBean : tlTyreBeans) {
			transleaseTransactionNumber = tlTyreBean.getTransleaseTransactionNumber();
    		transactionService.findTransaction( transleaseTransactionNumber ); //if not found exception thrown and won't continue
        	//check no invoice entries exist for this transaction number.
        	TlInvoiceCreditEntity invoiceEntity = TlInvoiceCreditEntity.findTlInvoiceCreditEntity( transleaseTransactionNumber );
        	if( invoiceEntity == null ) {
        		throw new InvoiceCreditEntryNotFoundException( transleaseTransactionNumber.toString() );
        	}
        	List < TlVatSummaryEntity > vatSummaryEntities = invoiceEntity.getTlVatSummaryEntity();
        	if (vatSummaryEntities != null && !vatSummaryEntities.isEmpty() ) {
    			for( TlVatSummaryEntity vatSummaryEntity : vatSummaryEntities ) {
                	vatRate = vatSummaryEntity.getVatAmount();
            	}
        	}

        	LOG.debug( "Adding tyre bean, tlTransactionNumber: " + tlTyreBean.getTransleaseTransactionNumber() + ", tyre position: " + tlTyreBean.getTyrePosition() );

    		TlTyrePKEntity tlTyrePKEntity = new TlTyrePKEntity ();
    		tlTyrePKEntity.setTransleaseTransactionNumber( tlTyreBean.getTransleaseTransactionNumber() );
    		tlTyrePKEntity.setTyrePosition( tlTyreBean.getTyrePosition() );

    		TlTyreEntity tlTyreEntity = new TlTyreEntity();
    		tlTyreEntity.setTlTyreBean( tlTyreBean );
    		tlTyreEntity.setId( tlTyrePKEntity );

    		tlTyreEntity.persist();
    	}

		TlFastFitProductEntity tlFastFitProductEntity = null;

		TlTyreItemPKEntity tlTyreItemPKEntity = null;
		TlTyreItemEntity tlTyreItemEntity = null;
		String productCode = null;
		for( TlTyreItemBean tlTyreItemBean : tlTyreItemBeans ) {
			tlTyreItemEntity = new TlTyreItemEntity();
			tlTyreItemPKEntity = new TlTyreItemPKEntity();

			tlTyreItemPKEntity.setItemNumber( tlTyreItemBean.getItemNumber() );
			tlTyreItemPKEntity.setTransleaseTransactionNumber( tlTyreItemBean.getTransleaseTransactionNumber() );
			tlTyreItemPKEntity.setTyrePosition( tlTyreItemBean.getTyrePosition() );
			if(tlTyreItemBean.getTlFastFitProductBean() != null) {
				tlFastFitProductEntity = new TlFastFitProductEntity();
				tlFastFitProductEntity.setTlFastFitProductBean( tlTyreItemBean.getTlFastFitProductBean() );
				tlTyreItemEntity.setTlFastFitProduct( tlFastFitProductEntity );
			}
			tlTyreItemEntity.setId( tlTyreItemPKEntity );
			tlTyreItemEntity.setTlTyreItemBean( tlTyreItemBean );
			tlTyreItemEntity.setVatRate(vatRate);
			tlTyreItemEntity.setNettItemCost( tlTyreItemBean.getItemCost() );

			tlTyreItemEntity.persist();
		}

		TlNonTyreItemPKEntity tlNonTyreItemPKEntity = null;
		TlNonTyreItemEntity tlNonTyreItemEntity = null;
		for (TlNonTyreItemBean tlNonTyreItemBean : tlNonTyreItemBeans) {
			tlNonTyreItemEntity = new TlNonTyreItemEntity();
			tlNonTyreItemPKEntity = new TlNonTyreItemPKEntity();

			tlNonTyreItemPKEntity.setItemNumber( tlNonTyreItemBean.getItemNumber() );
			tlNonTyreItemPKEntity.setTransleaseTransactionNumber( tlNonTyreItemBean.getTransleaseTransactionNumber() );
			tlNonTyreItemPKEntity.setWheelOrAxlePosition( tlNonTyreItemBean.getWheelOrAxlePosition() );
			tlNonTyreItemPKEntity.setProductDescription( tlNonTyreItemBean.getProductDescription() );

			if(tlNonTyreItemBean.getTlFastFitProductBean() != null) {
				productCode = tlNonTyreItemBean.getTlFastFitProductBean().getProductCode();
				tlFastFitProductEntity = findTlFastFitProductEntityByCode( productCode );
				tlNonTyreItemEntity.setTlFastFitProduct( tlFastFitProductEntity );
			}
			tlNonTyreItemEntity.setId( tlNonTyreItemPKEntity );
			tlNonTyreItemEntity.setTlNonTyreItemBean( tlNonTyreItemBean );
			tlNonTyreItemEntity.setVatRate(vatRate);
			tlNonTyreItemEntity.setNettItemCost( tlNonTyreItemBean.getItemCost() );

			tlNonTyreItemEntity.persist();
		}
	}

	private TlFastFitProductEntity findTlFastFitProductEntityByCode( String productCode ) throws FastFitProductCodeNotFoundException {
		if ( productCode == null || "".equals( productCode ) ) {
			throw new FastFitProductCodeNotFoundException( "No fast fit product code passed" );
		}
		TlFastFitProductEntity tlFastFitProductEntity;
		try {
			Query query = TlFastFitProductEntity.findByProductCode( productCode );
			tlFastFitProductEntity = (TlFastFitProductEntity) query.getSingleResult();
		}
		catch (EmptyResultDataAccessException erdae) {
			throw new FastFitProductCodeNotFoundException( "No fast fit product found with code " + productCode);
		}
		return tlFastFitProductEntity;
	}
}
