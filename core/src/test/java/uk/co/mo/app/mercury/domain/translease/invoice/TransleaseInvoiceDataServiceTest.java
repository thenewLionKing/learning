package uk.co.mo.app.mercury.domain.translease.invoice;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlInvoiceCreditBean;
import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlItemLineBean;
import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlPartsDetailBean;
import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlVatSummaryBean;
import uk.co.mo.app.mercury.domain.translease.invoice.exception.InvoiceCreditEntryAlreadyExistsException;
import uk.co.mo.app.mercury.domain.translease.invoice.service.TransleaseInvoiceDataService;
import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;

public class TransleaseInvoiceDataServiceTest extends AbstractJunit4Test{

    @SuppressWarnings("unused")
	private static final Log LOG = LogFactory.getLog(TransleaseInvoiceDataServiceTest.class);

    @Autowired
    @Qualifier("transleaseInvoiceDataService")
    private TransleaseInvoiceDataService tids;

    private static final String TL_TRANSACTION_NO = "49328116";
    private	String[][] tlInvoiceCreditSampleData = {
    		{TL_TRANSACTION_NO,"I","ZG197255","2004-12-16 00:00:00",null,null,null,null,null,null,"0x000000002525D97B","2004-12-18 00:00:00",null} };
    private	String[][] tlItemLineSampleData = {
    	    {TL_TRANSACTION_NO,"1","M",null,"1.00","stabbed/vandalised","29179",null,null,"RTN","004",".00",".00",".0000","1",".6400","17.50",".00",".64","0x000000002525D97D",null,null,null,null},
	    	{TL_TRANSACTION_NO,"2","M",null,"1.00","stabbed/vandalised","29130",null,null,"RTN","004",".00",".00",".0000","0","3.2000","17.50",".00","3.20","0x000000002525D97F",null,null,null,null},
	    	{TL_TRANSACTION_NO,"3","M",null,"1.00","stabbed/vandalised","29131",null,null,"RTN","004",".00",".00",".0000","0","1.9000","17.50",".00","1.90","0x000000002525D981",null,null,null,null},
    		{TL_TRANSACTION_NO,"4","M",null,"1.00","stabbed/vandalised","00683",null,null,"R&R","004",".00",".00",".0000","0","23.3600","17.50",".00","23.36","0x000000002525D983",null,null,null,null} };
    private	String[][] tlPartsDetailsSampleData = {};
    private	String[][] tlVatSummarySampleData = {
    		{TL_TRANSACTION_NO,"17.50","29.10","5.09","0x000000002525D986",null}};

    @Test
    public void testAddInvoice() {

    	List <TlItemLineBean> tlItemLineBeans = new ArrayList <TlItemLineBean> ();
		List <TlVatSummaryBean> tlVatSummaryBeans = new ArrayList <TlVatSummaryBean> ();
		List <TlPartsDetailBean> tlPartsDetailBeans = new ArrayList <TlPartsDetailBean> ();

    	TlInvoiceCreditBean tlInvoiceCreditBean = new TlInvoiceCreditBean();
		tlInvoiceCreditBean.setTransleaseTransactionNumber( tlInvoiceCreditSampleData[0][0]==null?null: new Integer( tlInvoiceCreditSampleData[0][0] ) );
    	tlInvoiceCreditBean.setIcTransactionType( tlInvoiceCreditSampleData[0][1]==null?null:tlInvoiceCreditSampleData[0][1] );
    	tlInvoiceCreditBean.setInvoiceCreditNumber( tlInvoiceCreditSampleData[0][2]==null?null:tlInvoiceCreditSampleData[0][2] );
    	tlInvoiceCreditBean.setTaxPointDate( new Date() );// tlInvoiceCreditSampleData[0][3]
    	tlInvoiceCreditBean.setRepairerInvoiceText( tlInvoiceCreditSampleData[0][4]==null?null:tlInvoiceCreditSampleData[0][4] );
    	tlInvoiceCreditBean.setOriginalInvoiceNumber( tlInvoiceCreditSampleData[0][5]==null?null:tlInvoiceCreditSampleData[0][5] );
    	tlInvoiceCreditBean.setOriginalTransleaseTranNo( tlInvoiceCreditSampleData[0][6]==null?null: new Integer( tlInvoiceCreditSampleData[0][6]) );
    	tlInvoiceCreditBean.setReasonForCredit( tlInvoiceCreditSampleData[0][7]==null?null:tlInvoiceCreditSampleData[0][7] );
    	tlInvoiceCreditBean.setLeasecoMessage( tlInvoiceCreditSampleData[0][8]==null?null:tlInvoiceCreditSampleData[0][8] );
    	tlInvoiceCreditBean.setLeasecoAuthorisationCode( tlInvoiceCreditSampleData[0][9]==null?null:tlInvoiceCreditSampleData[0][9] );
//    	tlInvoiceCreditBean.setTimestamp(new Date());//tlInvoiceCreditSampleData[0][10]
    	tlInvoiceCreditBean.setInvoiceDate( new Date() ); //tlInvoiceCreditSampleData[0][11]
    	tlInvoiceCreditBean.setTermsStatus( tlInvoiceCreditSampleData[0][11]==null?null:tlInvoiceCreditSampleData[0][12] );

    	TlItemLineBean tlItemLineBean;
    	for(int i = 0; i < tlItemLineSampleData.length; i++) { // For each element of that array,
        	tlItemLineBean = new TlItemLineBean();
        	tlItemLineBean.setTransleaseTransactionNumber( tlItemLineSampleData[i][0] == null ? null : new Integer(tlItemLineSampleData[i][0]) );
        	tlItemLineBean.setItemNumber( tlItemLineSampleData[i][1] == null ? null : new Short( tlItemLineSampleData[i][1] ) );
        	tlItemLineBean.setCostTypeCode( tlItemLineSampleData[i][2] == null ? null : tlItemLineSampleData[i][2] );
        	tlItemLineBean.setChargeCode( tlItemLineSampleData[i][3] == null ? null : tlItemLineSampleData[i][3] );
        	tlItemLineBean.setQuantity( tlItemLineSampleData[i][4] == null ? null : new BigDecimal( tlItemLineSampleData[i][4] ) );
        	tlItemLineBean.setRepairerAuthText( tlItemLineSampleData[i][5] == null ? null :  tlItemLineSampleData[i][5] );
        	tlItemLineBean.setIcmeTransleaseJobCode( tlItemLineSampleData[i][6] == null ? null :  tlItemLineSampleData[i][6] );
        	tlItemLineBean.setManufacturerRepairCode( tlItemLineSampleData[i][7] == null ? null :  tlItemLineSampleData[i][7] );
        	tlItemLineBean.setManufacturerRepairDesc( tlItemLineSampleData[i][8] == null ? null :  tlItemLineSampleData[i][8] );
        	tlItemLineBean.setIcmeActionCode( tlItemLineSampleData[i][9] == null ? null :  tlItemLineSampleData[i][9] );
        	tlItemLineBean.setWorkReasonCode( tlItemLineSampleData[i][10] == null ? null :  tlItemLineSampleData[i][10] );
        	tlItemLineBean.setGoodwillPercentage( tlItemLineSampleData[i][11] == null ? null : new BigDecimal( tlItemLineSampleData[i][11] ) );
        	tlItemLineBean.setLabourTime( tlItemLineSampleData[i][12] == null ? null : new BigDecimal( tlItemLineSampleData[i][12] ) );
        	tlItemLineBean.setLabourRate( tlItemLineSampleData[i][13] == null ? null :  new BigDecimal( tlItemLineSampleData[i][13] ) );
        	tlItemLineBean.setNumberOfParts( tlItemLineSampleData[i][14] == null ? null :  new Integer( tlItemLineSampleData[i][14] ) );
        	tlItemLineBean.setNettLabourCost( tlItemLineSampleData[i][15] == null ? null :  new BigDecimal( tlItemLineSampleData[i][15] ) );
        	tlItemLineBean.setVatRateLabour( tlItemLineSampleData[i][16] == null ? null :  new BigDecimal( tlItemLineSampleData[i][16] ) );
        	tlItemLineBean.setTotalNettPartsCost( tlItemLineSampleData[i][17] == null ? null :  new BigDecimal( tlItemLineSampleData[i][17] ) );
        	tlItemLineBean.setTotalNettLineCost( tlItemLineSampleData[i][18] == null ? null :  new BigDecimal( tlItemLineSampleData[i][18] ) );
        	//TOD timestamp
//        	tlItemLineBean.setTimestamp( new Date() ); //tlItemLineSampleData[i][19]
        	tlItemLineBean.setRechargeAmount( tlItemLineSampleData[i][20] == null ? null : new BigDecimal( tlItemLineSampleData[i][20] ) );
        	tlItemLineBean.setRechargePercentage( tlItemLineSampleData[i][21] == null ? null : new BigDecimal( tlItemLineSampleData[i][21] ) );
        	tlItemLineBean.setRechargeText( tlItemLineSampleData[i][22] == null ? null :  tlItemLineSampleData[i][22] );
        	tlItemLineBean.setVatCode( tlItemLineSampleData[i][23] == null ? null :  tlItemLineSampleData[i][23] );

        	tlItemLineBeans.add( tlItemLineBean );
    	}
    	tlInvoiceCreditBean.setTlItemLineBeans( tlItemLineBeans );

    	TlPartsDetailBean tlPartsDetailBean;
    	for(int j = 0; j < tlPartsDetailsSampleData.length; j++) { // For each element of that array,
        	tlPartsDetailBean = new TlPartsDetailBean();
        	tlPartsDetailBean.setItemNumber( tlPartsDetailsSampleData[j][0] == null ? null: new Integer (tlPartsDetailsSampleData[j][0] ) );
        	tlPartsDetailBean.setPartsNumber( tlPartsDetailsSampleData[j][1] == null ? null: new Integer (tlPartsDetailsSampleData[j][1] ) );
        	tlPartsDetailBean.setPartsCode( tlPartsDetailsSampleData[j][2] == null ? null:tlPartsDetailsSampleData[j][2] );
        	tlPartsDetailBean.setPartsDescription( tlPartsDetailsSampleData[j][3] == null ? null:tlPartsDetailsSampleData[j][3] );
        	tlPartsDetailBean.setQuantity( tlPartsDetailsSampleData[j][4] == null ? null: new BigDecimal ( tlPartsDetailsSampleData[j][4] ) );
        	tlPartsDetailBean.setUnitPrice( tlPartsDetailsSampleData[j][5] == null ? null: new BigDecimal ( tlPartsDetailsSampleData[j][5] ) );
        	tlPartsDetailBean.setPartsDiscountRate( tlPartsDetailsSampleData[j][6] == null ? null: new BigDecimal ( tlPartsDetailsSampleData[j][6] ) );
        	tlPartsDetailBean.setGoodwillPercentage( tlPartsDetailsSampleData[j][7] == null ? null: new BigDecimal ( tlPartsDetailsSampleData[j][7] ) );
        	tlPartsDetailBean.setDiscountedUnitPrice( tlPartsDetailsSampleData[j][8] == null ? null: new BigDecimal (tlPartsDetailsSampleData[j][8] ) );
        	tlPartsDetailBean.setNettPartsPrice( tlPartsDetailsSampleData[j][9] == null ? null: new BigDecimal ( tlPartsDetailsSampleData[j][9] ) );
        	tlPartsDetailBean.setVatRate( tlPartsDetailsSampleData[j][10] == null ? null: new BigDecimal ( tlPartsDetailsSampleData[j][10] ) );
        	tlPartsDetailBean.setNormalPart( tlPartsDetailsSampleData[j][11] == null ? null:tlPartsDetailsSampleData[j][11] );
        	tlPartsDetailBean.setManufacturerOfPart( tlPartsDetailsSampleData[j][12] == null ? null:tlPartsDetailsSampleData[j][12] );
//        	tlPartsDetailBean.setTimestamp( new Date() ); //13
        	tlPartsDetailBean.setVatCode( tlPartsDetailsSampleData[j][14] == null ? null:tlPartsDetailsSampleData[j][14] );

        	tlPartsDetailBeans.add( tlPartsDetailBean );
    	}
    	tlInvoiceCreditBean.setTlPartsDetailBeans( tlPartsDetailBeans );

    	TlVatSummaryBean tlVatSummaryBean;
    	for(int k = 0; k < tlVatSummarySampleData.length; k++) { // For each element of that array,
        	tlVatSummaryBean = new TlVatSummaryBean();
        	tlVatSummaryBean.setVatRate( tlVatSummarySampleData[k][1] == null ? null : new BigDecimal( tlVatSummarySampleData[k][1] ) );
        	tlVatSummaryBean.setVatApplicableAmount( tlVatSummarySampleData[k][2] == null ? null : new BigDecimal( tlVatSummarySampleData[k][2] ) );
        	tlVatSummaryBean.setVatAmount( tlVatSummarySampleData[k][3] == null ? null : new BigDecimal( tlVatSummarySampleData[k][3] ) );
//        	tlVatSummaryBean.setTimestamp( new Date( ) ); //tlVatSummarySampleData[k][4]
        	tlVatSummaryBean.setVatCode( tlVatSummarySampleData[k][5] == null ? null : tlVatSummarySampleData[k][5] );

        	tlVatSummaryBeans.add( tlVatSummaryBean );
    	}
    	tlInvoiceCreditBean.setTlVatSummaryBeans( tlVatSummaryBeans );

    	try {
        	tids.addInvoice( tlInvoiceCreditBean );
			assertTrue(true);
		} catch (TransactionNotFoundException tnfe) {
            LOG.error("Error class: " + tnfe.getClass().getName());
            LOG.error("Caught error. Message: " + tnfe.getMessage());
    		assertTrue(false);
		} catch (InvoiceCreditEntryAlreadyExistsException iceaee) {
            LOG.error("Error class: " + iceaee.getClass().getName());
            LOG.error("Caught error. Message: " + iceaee.getMessage());
    		assertTrue(false);
		}
    }

    
    @Test
    public void testAddTyresInvoice() {

    	List <TlItemLineBean> tlItemLineBeans = new ArrayList <TlItemLineBean> ();
		List <TlVatSummaryBean> tlVatSummaryBeans = new ArrayList <TlVatSummaryBean> ();
		List <TlPartsDetailBean> tlPartsDetailBeans = new ArrayList <TlPartsDetailBean> ();

    	TlInvoiceCreditBean tlInvoiceCreditBean = new TlInvoiceCreditBean();
		tlInvoiceCreditBean.setTransleaseTransactionNumber( tlInvoiceCreditSampleData[0][0]==null?null: new Integer( tlInvoiceCreditSampleData[0][0] ) );
    	tlInvoiceCreditBean.setIcTransactionType( tlInvoiceCreditSampleData[0][1]==null?null:tlInvoiceCreditSampleData[0][1] );
    	tlInvoiceCreditBean.setInvoiceCreditNumber( tlInvoiceCreditSampleData[0][2]==null?null:tlInvoiceCreditSampleData[0][2] );
    	tlInvoiceCreditBean.setTaxPointDate( new Date() );// tlInvoiceCreditSampleData[0][3]
    	tlInvoiceCreditBean.setRepairerInvoiceText( tlInvoiceCreditSampleData[0][4]==null?null:tlInvoiceCreditSampleData[0][4] );
    	tlInvoiceCreditBean.setOriginalInvoiceNumber( tlInvoiceCreditSampleData[0][5]==null?null:tlInvoiceCreditSampleData[0][5] );
    	tlInvoiceCreditBean.setOriginalTransleaseTranNo( tlInvoiceCreditSampleData[0][6]==null?null: new Integer( tlInvoiceCreditSampleData[0][6]) );
    	tlInvoiceCreditBean.setReasonForCredit( tlInvoiceCreditSampleData[0][7]==null?null:tlInvoiceCreditSampleData[0][7] );
    	tlInvoiceCreditBean.setLeasecoMessage( tlInvoiceCreditSampleData[0][8]==null?null:tlInvoiceCreditSampleData[0][8] );
    	tlInvoiceCreditBean.setLeasecoAuthorisationCode( tlInvoiceCreditSampleData[0][9]==null?null:tlInvoiceCreditSampleData[0][9] );
//    	tlInvoiceCreditBean.setTimestamp(new Date());//tlInvoiceCreditSampleData[0][10]
    	tlInvoiceCreditBean.setInvoiceDate( new Date() ); //tlInvoiceCreditSampleData[0][11]
    	tlInvoiceCreditBean.setTermsStatus( tlInvoiceCreditSampleData[0][11]==null?null:tlInvoiceCreditSampleData[0][12] );

    	TlItemLineBean tlItemLineBean;
    	for(int i = 0; i < tlItemLineSampleData.length; i++) { // For each element of that array,
        	tlItemLineBean = new TlItemLineBean();
        	tlItemLineBean.setTransleaseTransactionNumber( tlItemLineSampleData[i][0] == null ? null : new Integer(tlItemLineSampleData[i][0]) );
        	tlItemLineBean.setItemNumber( tlItemLineSampleData[i][1] == null ? null : new Short( tlItemLineSampleData[i][1] ) );
        	tlItemLineBean.setCostTypeCode( tlItemLineSampleData[i][2] == null ? null : tlItemLineSampleData[i][2] );
        	tlItemLineBean.setChargeCode( tlItemLineSampleData[i][3] == null ? null : tlItemLineSampleData[i][3] );
        	tlItemLineBean.setQuantity( tlItemLineSampleData[i][4] == null ? null : new BigDecimal( tlItemLineSampleData[i][4] ) );
        	tlItemLineBean.setRepairerAuthText( tlItemLineSampleData[i][5] == null ? null :  tlItemLineSampleData[i][5] );
        	tlItemLineBean.setIcmeTransleaseJobCode( tlItemLineSampleData[i][6] == null ? null :  tlItemLineSampleData[i][6] );
        	tlItemLineBean.setManufacturerRepairCode( tlItemLineSampleData[i][7] == null ? null :  tlItemLineSampleData[i][7] );
        	tlItemLineBean.setManufacturerRepairDesc( tlItemLineSampleData[i][8] == null ? null :  tlItemLineSampleData[i][8] );
        	tlItemLineBean.setIcmeActionCode( tlItemLineSampleData[i][9] == null ? null :  tlItemLineSampleData[i][9] );
        	tlItemLineBean.setWorkReasonCode( tlItemLineSampleData[i][10] == null ? null :  tlItemLineSampleData[i][10] );
        	tlItemLineBean.setGoodwillPercentage( tlItemLineSampleData[i][11] == null ? null : new BigDecimal( tlItemLineSampleData[i][11] ) );
        	tlItemLineBean.setLabourTime( tlItemLineSampleData[i][12] == null ? null : new BigDecimal( tlItemLineSampleData[i][12] ) );
        	tlItemLineBean.setLabourRate( tlItemLineSampleData[i][13] == null ? null :  new BigDecimal( tlItemLineSampleData[i][13] ) );
        	tlItemLineBean.setNumberOfParts( tlItemLineSampleData[i][14] == null ? null :  new Integer( tlItemLineSampleData[i][14] ) );
        	tlItemLineBean.setNettLabourCost( tlItemLineSampleData[i][15] == null ? null :  new BigDecimal( tlItemLineSampleData[i][15] ) );
        	tlItemLineBean.setVatRateLabour( tlItemLineSampleData[i][16] == null ? null :  new BigDecimal( tlItemLineSampleData[i][16] ) );
        	tlItemLineBean.setTotalNettPartsCost( tlItemLineSampleData[i][17] == null ? null :  new BigDecimal( tlItemLineSampleData[i][17] ) );
        	tlItemLineBean.setTotalNettLineCost( tlItemLineSampleData[i][18] == null ? null :  new BigDecimal( tlItemLineSampleData[i][18] ) );
        	//TOD timestamp
//        	tlItemLineBean.setTimestamp( new Date() ); //tlItemLineSampleData[i][19]
        	tlItemLineBean.setRechargeAmount( tlItemLineSampleData[i][20] == null ? null : new BigDecimal( tlItemLineSampleData[i][20] ) );
        	tlItemLineBean.setRechargePercentage( tlItemLineSampleData[i][21] == null ? null : new BigDecimal( tlItemLineSampleData[i][21] ) );
        	tlItemLineBean.setRechargeText( tlItemLineSampleData[i][22] == null ? null :  tlItemLineSampleData[i][22] );
        	tlItemLineBean.setVatCode( tlItemLineSampleData[i][23] == null ? null :  tlItemLineSampleData[i][23] );

        	tlItemLineBeans.add( tlItemLineBean );
    	}
    	tlInvoiceCreditBean.setTlItemLineBeans( tlItemLineBeans );

    	TlPartsDetailBean tlPartsDetailBean;
    	for(int j = 0; j < tlPartsDetailsSampleData.length; j++) { // For each element of that array,
        	tlPartsDetailBean = new TlPartsDetailBean();
        	tlPartsDetailBean.setItemNumber( tlPartsDetailsSampleData[j][0] == null ? null: new Integer (tlPartsDetailsSampleData[j][0] ) );
        	tlPartsDetailBean.setPartsNumber( tlPartsDetailsSampleData[j][1] == null ? null: new Integer (tlPartsDetailsSampleData[j][1] ) );
        	tlPartsDetailBean.setPartsCode( tlPartsDetailsSampleData[j][2] == null ? null:tlPartsDetailsSampleData[j][2] );
        	tlPartsDetailBean.setPartsDescription( tlPartsDetailsSampleData[j][3] == null ? null:tlPartsDetailsSampleData[j][3] );
        	tlPartsDetailBean.setQuantity( tlPartsDetailsSampleData[j][4] == null ? null: new BigDecimal ( tlPartsDetailsSampleData[j][4] ) );
        	tlPartsDetailBean.setUnitPrice( tlPartsDetailsSampleData[j][5] == null ? null: new BigDecimal ( tlPartsDetailsSampleData[j][5] ) );
        	tlPartsDetailBean.setPartsDiscountRate( tlPartsDetailsSampleData[j][6] == null ? null: new BigDecimal ( tlPartsDetailsSampleData[j][6] ) );
        	tlPartsDetailBean.setGoodwillPercentage( tlPartsDetailsSampleData[j][7] == null ? null: new BigDecimal ( tlPartsDetailsSampleData[j][7] ) );
        	tlPartsDetailBean.setDiscountedUnitPrice( tlPartsDetailsSampleData[j][8] == null ? null: new BigDecimal (tlPartsDetailsSampleData[j][8] ) );
        	tlPartsDetailBean.setNettPartsPrice( tlPartsDetailsSampleData[j][9] == null ? null: new BigDecimal ( tlPartsDetailsSampleData[j][9] ) );
        	tlPartsDetailBean.setVatRate( tlPartsDetailsSampleData[j][10] == null ? null: new BigDecimal ( tlPartsDetailsSampleData[j][10] ) );
        	tlPartsDetailBean.setNormalPart( tlPartsDetailsSampleData[j][11] == null ? null:tlPartsDetailsSampleData[j][11] );
        	tlPartsDetailBean.setManufacturerOfPart( tlPartsDetailsSampleData[j][12] == null ? null:tlPartsDetailsSampleData[j][12] );
//        	tlPartsDetailBean.setTimestamp( new Date() ); //13
        	tlPartsDetailBean.setVatCode( tlPartsDetailsSampleData[j][14] == null ? null:tlPartsDetailsSampleData[j][14] );

        	tlPartsDetailBeans.add( tlPartsDetailBean );
    	}
    	tlInvoiceCreditBean.setTlPartsDetailBeans( tlPartsDetailBeans );

    	TlVatSummaryBean tlVatSummaryBean;
    	for(int k = 0; k < tlVatSummarySampleData.length; k++) { // For each element of that array,
        	tlVatSummaryBean = new TlVatSummaryBean();
        	tlVatSummaryBean.setVatRate( tlVatSummarySampleData[k][1] == null ? null : new BigDecimal( tlVatSummarySampleData[k][1] ) );
        	tlVatSummaryBean.setVatApplicableAmount( tlVatSummarySampleData[k][2] == null ? null : new BigDecimal( tlVatSummarySampleData[k][2] ) );
        	tlVatSummaryBean.setVatAmount( tlVatSummarySampleData[k][3] == null ? null : new BigDecimal( tlVatSummarySampleData[k][3] ) );
//        	tlVatSummaryBean.setTimestamp( new Date( ) ); //tlVatSummarySampleData[k][4]
        	tlVatSummaryBean.setVatCode( tlVatSummarySampleData[k][5] == null ? null : tlVatSummarySampleData[k][5] );

        	tlVatSummaryBeans.add( tlVatSummaryBean );
    	}
    	tlInvoiceCreditBean.setTlVatSummaryBeans( tlVatSummaryBeans );

    	try {
        	tids.addInvoice( tlInvoiceCreditBean );
			assertTrue(true);
		} catch (TransactionNotFoundException tnfe) {
            LOG.error("Error class: " + tnfe.getClass().getName());
            LOG.error("Caught error. Message: " + tnfe.getMessage());
    		assertTrue(false);
		} catch (InvoiceCreditEntryAlreadyExistsException iceaee) {
            LOG.error("Error class: " + iceaee.getClass().getName());
            LOG.error("Caught error. Message: " + iceaee.getMessage());
    		assertTrue(false);
		}
		catch (Exception e) {
            LOG.error("Error class: " + e.getClass().getName());
            LOG.error("Caught error. Message: " + e.getMessage());
    		assertTrue(false);
		}
    }

    @Test
    public void testAddTyresInvoiceEpyx57() {

    	List <TlItemLineBean> tlItemLineBeans = new ArrayList <TlItemLineBean> ();
		List <TlVatSummaryBean> tlVatSummaryBeans = new ArrayList <TlVatSummaryBean> ();
		List <TlPartsDetailBean> tlPartsDetailBeans = new ArrayList <TlPartsDetailBean> ();
//INVOICE
    	TlInvoiceCreditBean tlInvoiceCreditBean = new TlInvoiceCreditBean();
    	tlInvoiceCreditBean.setInvoiceDate( new Date ("2012-02-02") );
//    	tlInvoiceCreditBean.setRepairerInvoiceText(repairerInvoiceText);
    	tlInvoiceCreditBean.setInvoiceCreditNumber( "Test credit pk/fm A" );
    	tlInvoiceCreditBean.setReasonForCredit("Test credit pk/fm A");
    	tlInvoiceCreditBean.setOriginalInvoiceNumber("pk002");
//    	tlInvoiceCreditBean.setLeasecoAuthorisationCode(leasecoAuthorisationCode);
//    	tlInvoiceCreditBean.setLeasecoMessage(leasecoMessage);
    	tlInvoiceCreditBean.setOriginalTransleaseTranNo( 40044230 );
    	tlInvoiceCreditBean.setTaxPointDate( new Date( "2012-02-02" ) );
    	tlInvoiceCreditBean.setTermsStatus("I");

//INVOICE ITEM LINE
    	TlItemLineBean tlItemLineBean = null;
    	tlItemLineBean = new TlItemLineBean();
    	tlItemLineBean.setTransleaseTransactionNumber( 40044230 );
    	tlItemLineBean.setItemNumber( new Short( "1" ) );
    	tlItemLineBean.setQuantity( new BigDecimal( 1 ) );
//    	tlItemLineBean.setRepairerAuthText(repairerAuthText)
    	tlItemLineBean.setTotalNettLineCost( new BigDecimal( 90.00 ) );
//totalAmount
    	tlItemLineBean.setVatRateLabour( new BigDecimal( 20 ) );
//
    	tlItemLineBean.setIcmeActionCode("RTN");
    	tlItemLineBean.setChargeCode("P");
    	tlItemLineBean.setCostTypeCode("N");
    	tlItemLineBean.setGoodwillPercentage( new BigDecimal( 0.00 ) );
    	tlItemLineBean.setIcmeTransleaseJobCode( "20250" );
//    	tlItemLineBean.set job desc

    	tlItemLineBean.setLabourRate( new BigDecimal( 60.00 ) );
    	tlItemLineBean.setLabourTime( new BigDecimal( 1.50 ) );
//    	tlItemLineBean.setManufacturerRepairCode(manufacturerRepairCode);
//    	tlItemLineBean.setManufacturerRepairDesc(manufacturerRepairDesc);
    	tlItemLineBean.setNumberOfParts(3);
    	tlItemLineBean.setWorkReasonCode("RTN");
    	tlItemLineBean.setRechargeAmount( new BigDecimal( 0.00 ) );
    	tlItemLineBean.setRechargePercentage( new BigDecimal( 0.00 ) );
//    	tlItemLineBean.setRechargeText("");
    	tlItemLineBean.setTotalNettPartsCost( new BigDecimal( 52.97 ) );
    	tlItemLineBean.setVatCode("S");

    	tlItemLineBeans.add( tlItemLineBean );
    	tlInvoiceCreditBean.setTlItemLineBeans( tlItemLineBeans );

//PART 1
    	TlPartsDetailBean tlPartsDetailBean;
    	tlPartsDetailBean = new TlPartsDetailBean();
    	tlPartsDetailBean.setPartsDescription( "Oil Filter" );
    	tlPartsDetailBean.setItemNumber(1);
    	tlPartsDetailBean.setUnitPrice( new BigDecimal( 12.06 ) );
    	tlPartsDetailBean.setQuantity( new BigDecimal( 1.00 ) );
//    	tlPartsDetailBean.set
    	tlPartsDetailBean.setVatRate( new BigDecimal( 20.00 ) );
    	tlPartsDetailBean.setDiscountedUnitPrice( new BigDecimal( 10.85 ) );
    	tlPartsDetailBean.setGoodwillPercentage( new BigDecimal( 0.00 ) );
//    	tlPartsDetailBean.setManufacturerOfPart(manufacturerOfPart)
    	tlPartsDetailBean.setNormalPart("Y");
    	tlPartsDetailBean.setPartsCode("1109AY");
    	tlPartsDetailBean.setPartsDescription("Oil Filter");
    	tlPartsDetailBean.setPartsDiscountRate( new BigDecimal( 10.00 ) );
    	tlPartsDetailBean.setPartsNumber(1);
    	tlPartsDetailBean.setVatCode("S");
    	tlPartsDetailBeans.add( tlPartsDetailBean );

    	//PART 2
    	tlPartsDetailBean = new TlPartsDetailBean();
    	tlPartsDetailBean.setPartsDescription( "Drain Plug Gasket" );
    	tlPartsDetailBean.setItemNumber(1);
    	tlPartsDetailBean.setUnitPrice( new BigDecimal( 0.33 ) );
    	tlPartsDetailBean.setQuantity( new BigDecimal( 1.00 ) );
//    	tlPartsDetailBean.set
    	tlPartsDetailBean.setVatRate( new BigDecimal( 20.00 ) );
    	tlPartsDetailBean.setDiscountedUnitPrice( new BigDecimal( 0.30 ) );
    	tlPartsDetailBean.setGoodwillPercentage( new BigDecimal( 0.00 ) );
//    	tlPartsDetailBean.setManufacturerOfPart(manufacturerOfPart)
    	tlPartsDetailBean.setNormalPart("Y");
    	tlPartsDetailBean.setPartsCode("31340");
    	tlPartsDetailBean.setPartsDescription("Drain Plug Gasket");
    	tlPartsDetailBean.setPartsDiscountRate( new BigDecimal( 10.00 ) );
    	tlPartsDetailBean.setPartsNumber(2);
    	tlPartsDetailBean.setVatCode("S");
    	tlPartsDetailBeans.add( tlPartsDetailBean );

    	//PART 3
    	tlPartsDetailBean = new TlPartsDetailBean();
    	tlPartsDetailBean.setPartsDescription( "Pollen Filter" );
    	tlPartsDetailBean.setItemNumber(1);
    	tlPartsDetailBean.setUnitPrice( new BigDecimal( 13.13 ) );
    	tlPartsDetailBean.setQuantity( new BigDecimal( 1.00 ) );
//    	tlPartsDetailBean.set
    	tlPartsDetailBean.setVatRate( new BigDecimal( 20.00 ) );
    	tlPartsDetailBean.setDiscountedUnitPrice( new BigDecimal( 11.82 ) );
    	tlPartsDetailBean.setGoodwillPercentage( new BigDecimal( 0.00 ) );
//    	tlPartsDetailBean.setManufacturerOfPart(manufacturerOfPart)
    	tlPartsDetailBean.setNormalPart("Y");
    	tlPartsDetailBean.setPartsCode("6447VY");
    	tlPartsDetailBean.setPartsDescription("Pollen Filter");
    	tlPartsDetailBean.setPartsDiscountRate( new BigDecimal( 10.00 ) );
    	tlPartsDetailBean.setPartsNumber(3);
    	tlPartsDetailBean.setVatCode("S");
    	tlPartsDetailBeans.add( tlPartsDetailBean );

    	//PART 4
    	tlPartsDetailBean = new TlPartsDetailBean();
    	tlPartsDetailBean.setPartsDescription( "castrol" );
    	tlPartsDetailBean.setItemNumber(1);
    	tlPartsDetailBean.setUnitPrice( new BigDecimal( 8.00 ) );
    	tlPartsDetailBean.setQuantity( new BigDecimal( 3.75 ) );
//    	tlPartsDetailBean.set
    	tlPartsDetailBean.setVatRate( new BigDecimal( 20.00 ) );
    	tlPartsDetailBean.setDiscountedUnitPrice( new BigDecimal( 8.00 ) );
    	tlPartsDetailBean.setGoodwillPercentage( new BigDecimal( 0.00 ) );
//    	tlPartsDetailBean.setManufacturerOfPart(manufacturerOfPart)
    	tlPartsDetailBean.setNormalPart("Y");
    	tlPartsDetailBean.setPartsCode("4");
    	tlPartsDetailBean.setPartsDescription("castrol");
    	tlPartsDetailBean.setPartsDiscountRate( new BigDecimal( 10.00 ) );
    	tlPartsDetailBean.setPartsNumber(4);
    	tlPartsDetailBean.setVatCode("S");
    	tlPartsDetailBeans.add( tlPartsDetailBean );

    	tlInvoiceCreditBean.setTlPartsDetailBeans( tlPartsDetailBeans );

    	TlVatSummaryBean tlVatSummaryBean = new TlVatSummaryBean();
    	tlVatSummaryBean.setVatRate( new BigDecimal( 20.00 ) );
    	tlVatSummaryBean.setVatApplicableAmount( new BigDecimal( 142.97 ) );
    	tlVatSummaryBean.setVatAmount( new BigDecimal( 28.59 ) );
    	tlVatSummaryBean.setVatCode( "S" );

    	tlVatSummaryBeans.add( tlVatSummaryBean );

    	tlInvoiceCreditBean.setTlVatSummaryBeans( tlVatSummaryBeans );

    	try {
        	tids.addInvoice( tlInvoiceCreditBean );
			assertTrue(true);
		} catch (TransactionNotFoundException tnfe) {
            LOG.error("Error class: " + tnfe.getClass().getName());
            LOG.error("Caught error. Message: " + tnfe.getMessage());
    		assertTrue(false);
		} catch (InvoiceCreditEntryAlreadyExistsException iceaee) {
            LOG.error("Error class: " + iceaee.getClass().getName());
            LOG.error("Caught error. Message: " + iceaee.getMessage());
    		assertTrue(false);
		}
		catch (Exception e) {
            LOG.error("Error class: " + e.getClass().getName());
            LOG.error("Caught error. Message: " + e.getMessage());
    		assertTrue(false);
		}
    }
    
    @Override
    protected void setup() {	}

    @Override
    protected void destroy() {	}
}
