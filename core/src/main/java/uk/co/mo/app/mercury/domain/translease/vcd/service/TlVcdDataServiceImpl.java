package uk.co.mo.app.mercury.domain.translease.vcd.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;
import uk.co.mo.app.mercury.domain.translease.transaction.service.TransleaseTransactionDataService;
import uk.co.mo.app.mercury.domain.translease.vcd.beans.TlVcdBean;
import uk.co.mo.app.mercury.domain.translease.vcd.beans.TlVcdConditionLineBean;
import uk.co.mo.app.mercury.domain.translease.vcd.entity.TlVcdConditionLineEntity;
import uk.co.mo.app.mercury.domain.translease.vcd.entity.TlVcdConditionLinePKEntity;
import uk.co.mo.app.mercury.domain.translease.vcd.entity.TlVcdEntity;

@Service("tlVcdDataService")
public class TlVcdDataServiceImpl implements TlVcdDataService {

	private static final Log LOG = LogFactory.getLog(TlVcdDataServiceImpl.class);

	@Autowired
    @Qualifier("transleaseTransactionDataService")
    private TransleaseTransactionDataService transactionService;

	@Override
	@Transactional
	public void addVcd(TlVcdBean vcdBean) throws TransactionNotFoundException {

		transactionService.findTransaction( vcdBean.getTransleaseTransactionNumber() ); //if not found exception thrown and won't continue

		List<TlVcdConditionLineBean> tlVcdConditionLineBeans = vcdBean.getTlVcdConditionLineBeans();
		List<TlVcdConditionLineEntity> tlVcdConditionLineEntities = new ArrayList<TlVcdConditionLineEntity>();
		TlVcdConditionLinePKEntity tlVcdConditionLinePKEntity;
		TlVcdConditionLineEntity tlVcdConditionLineEntity;
		for( TlVcdConditionLineBean tlVcdConditionLineBean: tlVcdConditionLineBeans ) {
			tlVcdConditionLinePKEntity = new TlVcdConditionLinePKEntity();
			tlVcdConditionLinePKEntity.setAttributeCode(tlVcdConditionLineBean.getAttributeCode());
			tlVcdConditionLinePKEntity.setTransleaseTransactionNumber( vcdBean.getTransleaseTransactionNumber() );

			tlVcdConditionLineEntity = new TlVcdConditionLineEntity();
			tlVcdConditionLineEntity.setTlVcdConditionLineBean( tlVcdConditionLineBean );
			tlVcdConditionLineEntity.setId( tlVcdConditionLinePKEntity );

			tlVcdConditionLineEntities.add( tlVcdConditionLineEntity );
		}

		TlVcdEntity tlVcdEntity = new TlVcdEntity();
		tlVcdEntity.setTlVcdBean( vcdBean );
		tlVcdEntity.setTlVcdConditionLines( tlVcdConditionLineEntities );

		tlVcdEntity.persist();
	}

	@Override
	@Transactional
	public void addVcds( List < TlVcdBean > vcdBeans)
			throws TransactionNotFoundException {
    	for (TlVcdBean vcdBean : vcdBeans) {
    		LOG.debug( "Adding vcd Bean, tlTransactionNumber: " + vcdBean.getTransleaseTransactionNumber());
    		addVcd( vcdBean );
    	}
	}
}
