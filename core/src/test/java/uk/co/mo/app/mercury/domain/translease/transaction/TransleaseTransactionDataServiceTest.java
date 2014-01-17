package uk.co.mo.app.mercury.domain.translease.transaction;

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
import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlItemLineBean;
import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlPartsDetailBean;
import uk.co.mo.app.mercury.domain.translease.transaction.beans.TlTransactionBean;
import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;
import uk.co.mo.app.mercury.domain.translease.transaction.service.TransleaseTransactionDataService;

public class TransleaseTransactionDataServiceTest extends AbstractJunit4Test{

	private static final Log LOG = LogFactory.getLog(TransleaseTransactionDataServiceTest.class);

    @Autowired
    @Qualifier("transleaseTransactionDataService")
    private TransleaseTransactionDataService ttds;

    private static final String TL_TRANSACTION_NO = "49328116";
    //private static final Integer TL_LEASE_CO_REF = 9000068;	//don't change always this, refers to MO
	private String[][] tlTransactionSampleData = {
			{TL_TRANSACTION_NO,"4","9000068","LV54NFU","887922","1002479","33333","JOHN NELSO","2336","2004-12-18 00:00:00","I","Kwik-Fit (GB) Ltd.","87 Verulam Road","ST. ALBANS","Hertfordshire","NULL","AL3 4DJ","380094850","5.09","29.10",".00","29.10","34.19",".00","34.19","0x00000000267B231E","N",".00","2004-12-20 01:00:00","NULL","NULL","NULL","2011484","2004-12-16 00:00:00","ZFA18800004847310","NULL","NULL","NULL","2004-12-20 05:29:38.453","Y","1"} };
    private	String[][] tlItemLineSampleData = {
    	    {TL_TRANSACTION_NO,"1","M",null,"1.00","stabbed/vandalised","29179",null,null,"RTN","004",".00",".00",".0000","0",".6400","17.50",".00",".64","0x000000002525D97D",null,null,null,null},
	    	{TL_TRANSACTION_NO,"2","M",null,"1.00","stabbed/vandalised","29130",null,null,"RTN","004",".00",".00",".0000","0","3.2000","17.50",".00","3.20","0x000000002525D97F",null,null,null,null},
	    	{TL_TRANSACTION_NO,"3","M",null,"1.00","stabbed/vandalised","29131",null,null,"RTN","004",".00",".00",".0000","0","1.9000","17.50",".00","1.90","0x000000002525D981",null,null,null,null},
    		{TL_TRANSACTION_NO,"4","M",null,"1.00","stabbed/vandalised","00683",null,null,"R&R","004",".00",".00",".0000","0","23.3600","17.50",".00","23.36","0x000000002525D983",null,null,null,null} };
    private	String[][] tlPartsDetailsSampleData = {
    		{"1","1","1520870j00","oil filter","1.00","7.5000","12.50",".00","6.5600","6.5600","17.50","Y",null,"0x0000000006FA9624",null},
    		{"1","2","1654641b00","air filter","1.00","10.9000","12.50",".00","9.5400","9.5400","17.50","Y",null,"0x0000000006FA9625",null},
    		{"1","3","020 oil","oil","3.20","2.8000","12.50",".00","7.8400","7.8400","17.50","Y",null,"0x0000000006FA9626",null},
    		{"1","4","a/fre","a/freeze","2.00","3.5000","12.50",".00","6.1300","6.1300","17.50","Y",null,"0x0000000006FA9627",null},
    		{"1","5","b/f","brake fluidj","1.00","5.8000","12.50",".00","5.0800","5.0800","17.50","Y",null,"0x0000000006FA9628",null},
    		{"1","6","2240199b19","plugs","4.00","2.2000","12.50",".00","7.7000","7.7000","17.50","Y",null,"0x0000000006FA9629",null},
    		{"1","7","p/f","pollen filter","1.00","1.4000","12.50",".00","1.2200","1.2200","17.50","Y",null,"0x0000000006FA962A",null} };

//    @Test
    public void testFindTransactionNotFound() {
    	try {
			ttds.findTransaction( new Integer ( 40044230 ) );
			assertTrue(false);
		} catch (TransactionNotFoundException tnfe) {
			assertTrue(true);
			LOG.error("Error class: " + tnfe.getClass().getName());
            LOG.error("Caught error. Message: " + tnfe.getMessage());
		}
    }

//    @Test
    public void testAddTransaction() {

    	TlTransactionBean tlTransactionBean = new TlTransactionBean();
    	tlTransactionBean.setTransleaseTransactionNumber( new Integer( TL_TRANSACTION_NO ) );
    	tlTransactionBean.setTransactionVersionNumber( new Long( 6 ) );
    	tlTransactionBean.setTransleaseLeasecoRef( new Integer ( 9000068 ) );
    	tlTransactionBean.setCarRegistrationNumber( "FD09XUA");
    	tlTransactionBean.setAssetNumber( new Integer ( 1790212) );
    	tlTransactionBean.setTransleaseRepairerNumber( new Integer ( 11590 ) );
    	tlTransactionBean.setLeasecoRepairerRef("73778");
    	//tlTransactionBean.setLeasecoControllerId( );
    	tlTransactionBean.setOdometerReading( new Integer ( 28515 ) );

    	//tlTransactionBean.setTransactionDate( 20110725 );
    	tlTransactionBean.setTransactionDate( new Date() );

    	tlTransactionBean.setTransactionType( "I" );
    	tlTransactionBean.setRepairerName( "Sandicliffe Motor Group Ltd" );
    	tlTransactionBean.setRepairerAddress1( "Purchase Ledger Department");
    	tlTransactionBean.setRepairerAddress2( "Derby Road" );
    	tlTransactionBean.setRepairerAddress3( "Loughborough" );
    	//tlTransactionBean.setRepairerAddress4( );
    	tlTransactionBean.setRepairerPostcode( "LE11 5HN" );
    	tlTransactionBean.setRepairerVatNumber( "116365579" );
    	tlTransactionBean.setVatAmount( new BigDecimal ( "1.60" ) );
    	tlTransactionBean.setTotalNettLabourCost( new BigDecimal ( "0.00" ) );
    	tlTransactionBean.setTotalNettPartsCost( new BigDecimal ( "8.02" ) );
    	tlTransactionBean.setTotalNettTransactionCost( new BigDecimal ( "8.02" ) );
    	tlTransactionBean.setTotalGrossLabourCost( new BigDecimal ( "0.00") );
    	tlTransactionBean.setTotalGrossPartsCost(  new BigDecimal ( "9.62") );
    	tlTransactionBean.setTotalGrossTransactionCost( new BigDecimal ( "9.62" ) );
    	//tlTransactionBean.setSpareUtilisedFlag( tlTransactionSampleData[0][26] == null ? null : tlTransactionSampleData[0][26] );
    	//tlTransactionBean.setTotalDriverContribution( tlTransactionSampleData[0][27] == null ? null : new BigDecimal ( tlTransactionSampleData[0][27] ) );
    	//tlTransactionBean.setRowInsertDate( new Date( ) );//tlItemLineSampleData[0][28] == null ? null : tlItemLineSampleData[0][28]
    	tlTransactionBean.setRepairerJobNoOrDepotNo( "49314322" );
    	//tlTransactionBean.setDriverName( tlTransactionSampleData[0][30] == null ? null : tlTransactionSampleData[0][30] );
    	tlTransactionBean.setOrderNumberOrAuthCode( "1298121" );
    	tlTransactionBean.setTransactionSerialNumber( new BigDecimal ( "1" ) );
//    	tlTransactionBean.setRepairDate( new Date("20110725") );
    	tlTransactionBean.setVinNumber( "WFOPXXWPDP9R81897" );
    	//tlTransactionBean.setRepairerAddress5( tlTransactionSampleData[0][35] == null ? null : tlTransactionSampleData[0][35] );
    	tlTransactionBean.setRepairerContactNumber( "0116 2332332" );
    	//tlTransactionBean.setAuthorisationCode( tlTransactionSampleData[0][37] == null ? null : tlTransactionSampleData[0][37] );
    	//tlTransactionBean.setVrmProcessedDate( new Date() );//tlItemLineSampleData[0][38] == null ? null : tlItemLineSampleData[0][38] );

    	ttds.addTransaction( tlTransactionBean );
		assertTrue(true);
    }

//    @Test
    public void testAddTransactionWithItemLines() {
    	TlTransactionBean tlTransactionBean = new TlTransactionBean();
    	tlTransactionBean.setTransleaseTransactionNumber( new Integer( TL_TRANSACTION_NO  ) );
    	tlTransactionBean.setTransactionVersionNumber( new Long( 6 ) );
    	tlTransactionBean.setTransleaseLeasecoRef( new Integer ( 9000068 ) );
    	tlTransactionBean.setCarRegistrationNumber( "FD09XUA");
    	tlTransactionBean.setAssetNumber( new Integer ( 1790212) );
    	tlTransactionBean.setTransleaseRepairerNumber( new Integer ( 11590 ) );
    	tlTransactionBean.setLeasecoRepairerRef("73778");
    	tlTransactionBean.setOdometerReading( new Integer ( 28515 ) );
    	tlTransactionBean.setTransactionDate( new Date() );
    	tlTransactionBean.setTransactionType( "I" );
    	tlTransactionBean.setRepairerName( "Sandicliffe Motor Group Ltd" );
    	tlTransactionBean.setRepairerAddress1( "Purchase Ledger Department");
    	tlTransactionBean.setRepairerAddress2( "Derby Road" );
    	tlTransactionBean.setRepairerAddress3( "Loughborough" );
    	tlTransactionBean.setRepairerPostcode( "LE11 5HN" );
    	tlTransactionBean.setRepairerVatNumber( "116365579" );
    	tlTransactionBean.setVatAmount( new BigDecimal ( "1.60" ) );
    	tlTransactionBean.setTotalNettLabourCost( new BigDecimal ( "0.00" ) );
    	tlTransactionBean.setTotalNettPartsCost( new BigDecimal ( "8.02" ) );
    	tlTransactionBean.setTotalNettTransactionCost( new BigDecimal ( "8.02" ) );
    	tlTransactionBean.setTotalGrossLabourCost( new BigDecimal ( "0.00") );
    	tlTransactionBean.setTotalGrossPartsCost(  new BigDecimal ( "9.62") );
    	tlTransactionBean.setTotalGrossTransactionCost( new BigDecimal ( "9.62" ) );
    	tlTransactionBean.setRepairerJobNoOrDepotNo( "49314322" );
    	tlTransactionBean.setOrderNumberOrAuthCode( "1298121" );
    	tlTransactionBean.setTransactionSerialNumber( new BigDecimal ( "1" ) );
    	tlTransactionBean.setVinNumber( "WFOPXXWPDP9R81897" );
    	tlTransactionBean.setRepairerContactNumber( "0116 2332332" );

    	List <TlItemLineBean> tlItemLineBeans = new ArrayList <TlItemLineBean> ();
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
    	tlTransactionBean.setTlItemLineBeans(tlItemLineBeans);

    	ttds.addTransaction( tlTransactionBean );
		assertTrue(true);
    }

//    @Test
    public void testAddTransactionWithPartDetails() {
    	TlTransactionBean tlTransactionBean = new TlTransactionBean();
    	tlTransactionBean.setTransleaseTransactionNumber( new Integer( TL_TRANSACTION_NO ) );
    	tlTransactionBean.setTransactionVersionNumber( new Long( 6 ) );
    	tlTransactionBean.setTransleaseLeasecoRef( new Integer ( 9000068 ) );
    	tlTransactionBean.setCarRegistrationNumber( "FD09XUA");
    	tlTransactionBean.setAssetNumber( new Integer ( 1790212) );
    	tlTransactionBean.setTransleaseRepairerNumber( new Integer ( 11590 ) );
    	tlTransactionBean.setLeasecoRepairerRef("73778");
    	tlTransactionBean.setOdometerReading( new Integer ( 28515 ) );
    	tlTransactionBean.setTransactionDate( new Date() );
    	tlTransactionBean.setTransactionType( "I" );
    	tlTransactionBean.setRepairerName( "Sandicliffe Motor Group Ltd" );
    	tlTransactionBean.setRepairerAddress1( "Purchase Ledger Department");
    	tlTransactionBean.setRepairerAddress2( "Derby Road" );
    	tlTransactionBean.setRepairerAddress3( "Loughborough" );
    	tlTransactionBean.setRepairerPostcode( "LE11 5HN" );
    	tlTransactionBean.setRepairerVatNumber( "116365579" );
    	tlTransactionBean.setVatAmount( new BigDecimal ( "1.60" ) );
    	tlTransactionBean.setTotalNettLabourCost( new BigDecimal ( "0.00" ) );
    	tlTransactionBean.setTotalNettPartsCost( new BigDecimal ( "8.02" ) );
    	tlTransactionBean.setTotalNettTransactionCost( new BigDecimal ( "8.02" ) );
    	tlTransactionBean.setTotalGrossLabourCost( new BigDecimal ( "0.00") );
    	tlTransactionBean.setTotalGrossPartsCost(  new BigDecimal ( "9.62") );
    	tlTransactionBean.setTotalGrossTransactionCost( new BigDecimal ( "9.62" ) );
    	tlTransactionBean.setRepairerJobNoOrDepotNo( "49314322" );
    	tlTransactionBean.setOrderNumberOrAuthCode( "1298121" );
    	tlTransactionBean.setTransactionSerialNumber( new BigDecimal ( "1" ) );
    	tlTransactionBean.setVinNumber( "WFOPXXWPDP9R81897" );
    	tlTransactionBean.setRepairerContactNumber( "0116 2332332" );

		List <TlPartsDetailBean> tlPartsDetailBeans = new ArrayList <TlPartsDetailBean> ();
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
    	tlTransactionBean.setTlPartsDetailBeans(tlPartsDetailBeans);

    	ttds.addTransaction( tlTransactionBean );
		assertTrue(true);
    }

//    @Test
    public void testAddTransactionWithItemLinesAndPartDetails() {

    	TlTransactionBean tlTransactionBean = setTransactonBeanWithEverything();
    	
    	ttds.addTransaction( tlTransactionBean );
		assertTrue(true);
    }

	private TlTransactionBean setTransactonBeanWithEverything() {
		TlTransactionBean tlTransactionBean = new TlTransactionBean();
    	tlTransactionBean.setTransleaseTransactionNumber( new Integer( 99998888  ) );
    	tlTransactionBean.setTransactionVersionNumber( new Long( 6 ) );
    	tlTransactionBean.setTransleaseLeasecoRef( new Integer ( 9000068 ) );
    	tlTransactionBean.setCarRegistrationNumber( "FD09XUA");
    	tlTransactionBean.setAssetNumber( new Integer ( 1790212) );
    	tlTransactionBean.setTransleaseRepairerNumber( new Integer ( 11590 ) );
    	tlTransactionBean.setLeasecoRepairerRef("73778");
    	tlTransactionBean.setOdometerReading( new Integer ( 28515 ) );
    	tlTransactionBean.setTransactionDate( new Date() );
    	tlTransactionBean.setTransactionType( "A" );
    	tlTransactionBean.setRepairerName( "Sandicliffe Motor Group Ltd" );
    	tlTransactionBean.setRepairerAddress1( "Purchase Ledger Department");
    	tlTransactionBean.setRepairerAddress2( "Derby Road" );
    	tlTransactionBean.setRepairerAddress3( "Loughborough" );
    	tlTransactionBean.setRepairerPostcode( "LE11 5HN" );
    	tlTransactionBean.setRepairerVatNumber( "116365579" );
    	tlTransactionBean.setVatAmount( new BigDecimal ( "1.60" ) );
    	tlTransactionBean.setTotalNettLabourCost( new BigDecimal ( "0.00" ) );
    	tlTransactionBean.setTotalNettPartsCost( new BigDecimal ( "8.02" ) );
    	tlTransactionBean.setTotalNettTransactionCost( new BigDecimal ( "8.02" ) );
    	tlTransactionBean.setTotalGrossLabourCost( new BigDecimal ( "0.00") );
    	tlTransactionBean.setTotalGrossPartsCost(  new BigDecimal ( "9.62") );
    	tlTransactionBean.setTotalGrossTransactionCost( new BigDecimal ( "9.62" ) );
    	tlTransactionBean.setRepairerJobNoOrDepotNo( "49314322" );
    	tlTransactionBean.setOrderNumberOrAuthCode( "1298121" );
    	tlTransactionBean.setTransactionSerialNumber( new BigDecimal ( "1" ) );
    	tlTransactionBean.setVinNumber( "WFOPXXWPDP9R81897" );
    	tlTransactionBean.setRepairerContactNumber( "0116 2332332" );

    	List <TlItemLineBean> tlItemLineBeans = new ArrayList <TlItemLineBean> ();
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
    	tlTransactionBean.setTlItemLineBeans( tlItemLineBeans );

		List <TlPartsDetailBean> tlPartsDetailBeans = new ArrayList <TlPartsDetailBean> ();
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
    	tlTransactionBean.setTlPartsDetailBeans( tlPartsDetailBeans );
		return tlTransactionBean;
	}

//    @Test
    public void testFindTransaction() {
    	try {
			ttds.findTransaction( new Integer ( TL_TRANSACTION_NO ) );
			assertTrue(true);
		} catch (TransactionNotFoundException tnfe) {
            LOG.error("Error class: " + tnfe.getClass().getName());
            LOG.error("Caught error. Message: " + tnfe.getMessage());
    		assertTrue(false);
		}
    }

//    @Test
    public void testCancelTransaction() {
    	try {
			ttds.cancelTransaction( new Integer ( TL_TRANSACTION_NO ) );
			assertTrue(true);
		} catch (TransactionNotFoundException tnfe) {
            LOG.error("Error class: " + tnfe.getClass().getName());
            LOG.error("Caught error. Message: " + tnfe.getMessage());
    		assertTrue(false);
		}
    }

//    @Test
    public void testUpdateTransaction() {
    	try {
        	TlTransactionBean tlTransactionBean = new TlTransactionBean();
        	tlTransactionBean.setTransleaseTransactionNumber( new Integer( 99998888  ) );
        	tlTransactionBean.setTransactionVersionNumber( new Long( 6 ) );
        	tlTransactionBean.setTransleaseLeasecoRef( new Integer ( 9000068 ) );
        	tlTransactionBean.setCarRegistrationNumber( "FD09XUA");
        	tlTransactionBean.setAssetNumber( new Integer ( 1790212) );
        	tlTransactionBean.setTransleaseRepairerNumber( new Integer ( 11590 ) );
        	tlTransactionBean.setLeasecoRepairerRef("73778");
        	tlTransactionBean.setOdometerReading( new Integer ( 28515 ) );
        	tlTransactionBean.setTransactionDate( new Date() );
        	tlTransactionBean.setTransactionType( "I" );
        	tlTransactionBean.setRepairerName( "Sandicliffe Motor Group Ltd" );
        	tlTransactionBean.setRepairerAddress1( "Purchase Ledger Department");
        	tlTransactionBean.setRepairerAddress2( "Derby Road" );
        	tlTransactionBean.setRepairerAddress3( "Loughborough" );
        	tlTransactionBean.setRepairerPostcode( "LE11 5HN" );
        	tlTransactionBean.setRepairerVatNumber( "116365579" );
        	tlTransactionBean.setVatAmount( new BigDecimal ( "1.60" ) );
        	tlTransactionBean.setTotalNettLabourCost( new BigDecimal ( "0.00" ) );
        	tlTransactionBean.setTotalNettPartsCost( new BigDecimal ( "8.02" ) );
        	tlTransactionBean.setTotalNettTransactionCost( new BigDecimal ( "8.02" ) );
        	tlTransactionBean.setTotalGrossLabourCost( new BigDecimal ( "0.00") );
        	tlTransactionBean.setTotalGrossPartsCost(  new BigDecimal ( "9.62") );
        	tlTransactionBean.setTotalGrossTransactionCost( new BigDecimal ( "9.62" ) );
        	tlTransactionBean.setRepairerJobNoOrDepotNo( "49314322" );
        	tlTransactionBean.setOrderNumberOrAuthCode( "1298121" );
        	tlTransactionBean.setTransactionSerialNumber( new BigDecimal ( "1" ) );
        	tlTransactionBean.setVinNumber( "WFOPXXWPDP9R81897" );
        	tlTransactionBean.setRepairerContactNumber( "0116 2332332" );

        	List <TlItemLineBean> tlItemLineBeans = new ArrayList <TlItemLineBean> ();
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
//            	tlItemLineBean.setTimestamp( new Date() ); //tlItemLineSampleData[i][19]
            	tlItemLineBean.setRechargeAmount( tlItemLineSampleData[i][20] == null ? null : new BigDecimal( tlItemLineSampleData[i][20] ) );
            	tlItemLineBean.setRechargePercentage( tlItemLineSampleData[i][21] == null ? null : new BigDecimal( tlItemLineSampleData[i][21] ) );
            	tlItemLineBean.setRechargeText( tlItemLineSampleData[i][22] == null ? null :  tlItemLineSampleData[i][22] );
            	tlItemLineBean.setVatCode( tlItemLineSampleData[i][23] == null ? null :  tlItemLineSampleData[i][23] );

            	tlItemLineBeans.add( tlItemLineBean );
        	}
        	tlTransactionBean.setTlItemLineBeans( tlItemLineBeans );

    		List <TlPartsDetailBean> tlPartsDetailBeans = new ArrayList <TlPartsDetailBean> ();
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
//            	tlPartsDetailBean.setTimestamp( new Date() ); //13
            	tlPartsDetailBean.setVatCode( tlPartsDetailsSampleData[j][14] == null ? null:tlPartsDetailsSampleData[j][14] );

            	tlPartsDetailBeans.add( tlPartsDetailBean );
        	}
        	tlTransactionBean.setTlPartsDetailBeans( tlPartsDetailBeans );

			ttds.updateTransaction( tlTransactionBean );

			assertTrue(true);
		} catch (TransactionNotFoundException tnfe) {
            LOG.error("Error class: " + tnfe.getClass().getName());
            LOG.error("Caught error. Message: " + tnfe.getMessage());
    		assertTrue(false);
		}
    }

//    @Test
    public void testDeleteTransaction() {
        try {
            ttds.deleteTransaction(99998888);
            assertTrue(true);
        } catch (TransactionNotFoundException e) {
            LOG.error("Error class: " + e.getClass().getName());
            LOG.error("Caught error. Message: " + e.getMessage());
    		assertTrue(false);
        }
    }

    @Test
    public void testUpsertTransaction() {
        try {
        	TlTransactionBean tlTransactionBean = setTransactonBeanWithEverything();
            ttds.upsertTransaction(tlTransactionBean);
            assertTrue(true);
        } catch (TransactionNotFoundException e) {
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
