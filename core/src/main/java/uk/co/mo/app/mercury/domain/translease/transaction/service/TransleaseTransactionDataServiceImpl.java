package uk.co.mo.app.mercury.domain.translease.transaction.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlItemLineBean;
import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlPartsDetailBean;
import uk.co.mo.app.mercury.domain.translease.invoice.entity.TlItemLineEntity;
import uk.co.mo.app.mercury.domain.translease.invoice.entity.TlItemLinePKEntity;
import uk.co.mo.app.mercury.domain.translease.invoice.entity.TlPartsDetailEntity;
import uk.co.mo.app.mercury.domain.translease.invoice.entity.TlPartsDetailPKEntity;
import uk.co.mo.app.mercury.domain.translease.transaction.beans.TlTransactionBean;
import uk.co.mo.app.mercury.domain.translease.transaction.entity.TlTransactionEntity;
import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;

@Service("transleaseTransactionDataService")
public class TransleaseTransactionDataServiceImpl implements TransleaseTransactionDataService {

	@SuppressWarnings("unused")
	private static final Log LOG = LogFactory.getLog(TransleaseTransactionDataServiceImpl.class);

	private static final String VRM_OK_TO_PROCESS_YES = "Y";
	private static final String CANCEL_TRANSACTION_STR = "C";

	@Override
	@Transactional
	public void addTransaction(TlTransactionBean tlTransactionBean) {
        List <TlItemLineEntity> tlItemLineEntitys = new ArrayList <TlItemLineEntity> ();
        List <TlPartsDetailEntity> tlPartsDetailEntitys = new ArrayList <TlPartsDetailEntity> ();

		TlTransactionEntity tlTransactionEntity = new TlTransactionEntity();
		tlTransactionEntity.setTlTransactionBean( tlTransactionBean );
		tlTransactionEntity.setVrmOkToProcess( VRM_OK_TO_PROCESS_YES );

		int transleaseTransactionNumber = tlTransactionEntity.getTransleaseTransactionNumber();

		//TlItemLineBeans
		List <TlItemLineBean> tlItemLineBeans = tlTransactionBean.getTlItemLineBeans();
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
			tlTransactionEntity.setTlItemLineEntity( tlItemLineEntitys );
		}

		//TlPartsDetailBeans
		List <TlPartsDetailBean> tlPartsDetailBeans = tlTransactionBean.getTlPartsDetailBeans();
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
			tlTransactionEntity.setTlPartsDetailEntity( tlPartsDetailEntitys );
		}

		tlTransactionEntity.persist();
	}

	@Override
	@Transactional
	public TlTransactionBean findTransaction(Integer transactionNumber) throws TransactionNotFoundException {

        TlTransactionEntity tlTransactionEntity = lookupTransaction(transactionNumber);
		
		TlTransactionBean tlTransactionBean = tlTransactionEntity.getTlTransactionBean();

    	List <TlItemLineEntity> tlItemLineEntities = tlTransactionEntity.getTlItemLineEntity();
    	List <TlItemLineBean> tlItemLineBeans;
    	TlItemLineBean itemLineBean;
    	TlItemLinePKEntity tlItemLineEntityPK;
		if ( tlItemLineEntities != null && !tlItemLineEntities.isEmpty( ) ) {
			tlItemLineBeans = new ArrayList<TlItemLineBean>();
			for( TlItemLineEntity entity : tlItemLineEntities ) {
				itemLineBean = entity.getTlItemLineBean();
				tlItemLineEntityPK = entity.getId();
				itemLineBean.setTransleaseTransactionNumber( tlItemLineEntityPK.getTransleaseTransactionNumber() );
				itemLineBean.setItemNumber( tlItemLineEntityPK.getItemNumber() );

				tlItemLineBeans.add( itemLineBean );
			}

			tlTransactionBean.setTlItemLineBeans( tlItemLineBeans );
		}

    	List <TlPartsDetailEntity> tlPartsDetailEntities = tlTransactionEntity.getTlPartsDetailEntity();
    	List <TlPartsDetailBean> tlPartsDetailBeans;
    	TlPartsDetailBean tlPartsDetailBean;
    	TlPartsDetailPKEntity tlPartsDetailPK;
		if ( tlPartsDetailEntities != null && !tlPartsDetailEntities.isEmpty( ) ) {
			tlPartsDetailBeans = new ArrayList<TlPartsDetailBean>();
			for( TlPartsDetailEntity entity : tlPartsDetailEntities ) {
				tlPartsDetailBean = entity.getTlPartsDetailBean();
				tlPartsDetailPK = entity.getId();
				tlPartsDetailBean.setItemNumber( tlPartsDetailPK.getItemNumber() );
				tlPartsDetailBean.setPartsNumber( tlPartsDetailPK.getPartsNumber() );

				tlPartsDetailBeans.add( tlPartsDetailBean );
			}

			tlTransactionBean.setTlPartsDetailBeans( tlPartsDetailBeans );
		}

    	return tlTransactionBean;
	}

    private TlTransactionEntity lookupTransaction(Integer transactionNumber) throws TransactionNotFoundException {
        TlTransactionEntity tlTransactionEntity = TlTransactionEntity.findTlTransactionEntity( transactionNumber );
        if( tlTransactionEntity == null) {
            throw new TransactionNotFoundException( transactionNumber.toString() );
        }
        return tlTransactionEntity;
    }

    @Override
	@Transactional
	public void cancelTransaction(Integer transactionNumber)
			throws TransactionNotFoundException {
		TlTransactionBean tlTransactionBean = findTransaction( transactionNumber );
		tlTransactionBean.setTransactionType( CANCEL_TRANSACTION_STR );

		TlTransactionEntity tlTransactionEntity = new TlTransactionEntity();
		tlTransactionEntity.setTlTransactionBean( tlTransactionBean );
		
		int transleaseTransactionNumber = tlTransactionEntity.getTransleaseTransactionNumber();
        List <TlItemLineEntity> tlItemLineEntitys = new ArrayList <TlItemLineEntity> ();
        List <TlPartsDetailEntity> tlPartsDetailEntitys = new ArrayList <TlPartsDetailEntity> ();

		//TlItemLineBeans
		List <TlItemLineBean> tlItemLineBeans = tlTransactionBean.getTlItemLineBeans();
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
			tlTransactionEntity.setTlItemLineEntity( tlItemLineEntitys );
		}

		//TlPartsDetailBeans
		List <TlPartsDetailBean> tlPartsDetailBeans = tlTransactionBean.getTlPartsDetailBeans();
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
			tlTransactionEntity.setTlPartsDetailEntity( tlPartsDetailEntitys );
		}

		tlTransactionEntity.merge();    	
	}

	@Override
	@Transactional
	public void updateTransaction(TlTransactionBean tlTransactionBean)
			throws TransactionNotFoundException {
		Integer transactionNumber = tlTransactionBean.getTransleaseTransactionNumber();

		TlTransactionEntity tlTransactionEntity = TlTransactionEntity.findTlTransactionEntity( tlTransactionBean.getTransleaseTransactionNumber() );
    	if( tlTransactionEntity == null) {
    		throw new TransactionNotFoundException( transactionNumber.toString() );
    	}

		tlTransactionEntity.setTlTransactionBean( tlTransactionBean );

		int transleaseTransactionNumber = tlTransactionEntity.getTransleaseTransactionNumber();
        List <TlItemLineEntity> tlItemLineEntitys = new ArrayList <TlItemLineEntity> ();
        List <TlPartsDetailEntity> tlPartsDetailEntitys = new ArrayList <TlPartsDetailEntity> ();

		//TlItemLineBeans
		List <TlItemLineBean> tlItemLineBeans = tlTransactionBean.getTlItemLineBeans();
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
			tlTransactionEntity.setTlItemLineEntity( tlItemLineEntitys );
		}

		//TlPartsDetailBeans
		List <TlPartsDetailBean> tlPartsDetailBeans = tlTransactionBean.getTlPartsDetailBeans();
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
			tlTransactionEntity.setTlPartsDetailEntity( tlPartsDetailEntitys );
		}

		tlTransactionEntity.merge();
	}

    @Override
    @Transactional
    public void deleteTransaction(Integer transactionNumber) throws TransactionNotFoundException {
        TlTransactionEntity tlTransactionEntity = lookupTransaction(transactionNumber);
        tlTransactionEntity.remove();
    }

	/**
	 * The contract for this operation is to delete the entity first,
	 *  if found, and then insert the entity
	*/
    @Override
    @Transactional
    public void upsertTransaction(TlTransactionBean tlTransactionBean) throws TransactionNotFoundException {

    	TlTransactionEntity tlTransactionEntity = lookupTransaction(tlTransactionBean.getTransleaseTransactionNumber());
        tlTransactionEntity.remove();
        addTransaction(tlTransactionBean);
    }
}
