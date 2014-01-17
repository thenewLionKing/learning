package uk.co.mo.app.mercury.domain.translease.tyre;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.translease.invoice.exception.InvoiceCreditEntryNotFoundException;
import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;
import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlFastFitProductBean;
import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlNonTyreItemBean;
import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlTyreBean;
import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlTyreItemBean;
import uk.co.mo.app.mercury.domain.translease.tyre.service.TransleaseTyreDataService;

public class TransleaseTyreDataServiceTest extends AbstractJunit4Test{

    @SuppressWarnings("unused")
	private static final Log LOG = LogFactory.getLog(TransleaseTyreDataServiceTest.class);

    @Autowired
    @Qualifier("transleaseTyreDataService")
    private TransleaseTyreDataService ttds;

    private static final String TL_TRANSACTION_NO = "40043219";

	@Override
	protected void setup() {
		// TODO Auto-generated method stub
	}

	@Override
	protected void destroy() {
		// TODO Auto-generated method stub
	}

//    @Test
//    public void testAddTyres() throws TransactionNotFoundException, InvoiceCreditEntryNotFoundException {
//
//    	List < TlTyreBean > tlTyreBeans = new ArrayList < TlTyreBean > ();
//
//    	TlTyreBean tlTyreBean;
//    	tlTyreBean = new TlTyreBean();
//    	tlTyreBean.setTransleaseTransactionNumber( new Integer( TL_TRANSACTION_NO ) );
//    	tlTyreBean.setTyrePosition( "NSF" );
//    	tlTyreBean.setPositionDescription(null);        		
//    	tlTyreBean.setInsideTreadDepth( new BigDecimal ("6.0") );
//    	tlTyreBean.setCentreTreadDepth( new BigDecimal ("6.0"));
//    	tlTyreBean.setOutsideTreadDepth(  new BigDecimal ("6.0"));
//
//    	tlTyreBeans.add( tlTyreBean );
//
//    	tlTyreBean = new TlTyreBean();
//    	tlTyreBean.setTransleaseTransactionNumber( new Integer( TL_TRANSACTION_NO ) );
//    	tlTyreBean.setTyrePosition( "OSRO" );
//    	tlTyreBean.setPositionDescription(null);
//    	tlTyreBean.setInsideTreadDepth( new BigDecimal ("6.0") );
//    	tlTyreBean.setCentreTreadDepth( new BigDecimal ("6.0"));
//    	tlTyreBean.setOutsideTreadDepth(  new BigDecimal ("6.0"));
//
//    	tlTyreBeans.add( tlTyreBean );
//
//    	List < TlTyreItemBean > tlTyreItemBeans = new ArrayList < TlTyreItemBean > ();
//    	TlFastFitProductBean tlFastFitProductBean;
//    	List < TlNonTyreItemBean > tlNonTyreItemBeans = new ArrayList < TlNonTyreItemBean > ();
//    	String[][] tlNonTyreItemSampleData = {
//    	{TL_TRANSACTION_NO, "1", "RTN", "004", ".64", ".00", ".64", "17.50", "5940", "Casing Disposal", "NSF", "null", "0x000000002525DFDB"},
//    	{TL_TRANSACTION_NO, "2", "RTN", "004", "3.20", ".00", "3.20", "17.50", "4609", "Balance", "NSF", "null", "0x000000002525DFDC"},
//    	{TL_TRANSACTION_NO, "3", "RTN", "004", "1.90", ".00", "1.90", "17.50", "4615", "Valve", "NSF", "null", "0x000000002525DFDD"} };
//    	String[][] tlFastFitProductSampleData = {
//    	    	{"4609", "BL", "1", "SSCWB", "WHEEL BALANCED - CAR*", null, null, null, null, null, null, null, null, "A", "0x000000002AAA32DB", "Y"},
//    	    	{"4615", "VL", "1", "SSCTV", "TL VALVE FITTED - CAR", null, null, null, null, null, null, null, null, "A", "0x000000002AAA32E1", "Y"},
//    	    		{"5940", "TR", "1", "TLTDC", "TYRE CASING DISPOSAL", null, null, null, null, null, null, null, null, "A", "0x000000002AAA3807","Y"} };
//    	TlNonTyreItemBean tlNonTyreItemBean;
//    	for(int j = 0; j < tlNonTyreItemSampleData.length; j++) { // For each element of that array, 
//    		tlNonTyreItemBean = new TlNonTyreItemBean();
//    		tlNonTyreItemBean.setTransleaseTransactionNumber( tlNonTyreItemSampleData[j][0] == null?null: new Integer ( tlNonTyreItemSampleData[j][0]) );
//	    	tlNonTyreItemBean.setItemNumber( tlNonTyreItemSampleData[j][1] == null?null: new Short( tlNonTyreItemSampleData[j][1] ) );
//	    	tlNonTyreItemBean.setActionCode( tlNonTyreItemSampleData[j][2] == null?null: tlNonTyreItemSampleData[j][2] );
//	    	tlNonTyreItemBean.setReasonCode( tlNonTyreItemSampleData[j][3] == null?null: tlNonTyreItemSampleData[j][3] );
//	    	tlNonTyreItemBean.setItemCost( tlNonTyreItemSampleData[j][4] == null?null: new BigDecimal (tlNonTyreItemSampleData[j][4]) );
////	    	tlNonTyreItemBean.setDriverContributionPercent( tlNonTyreItemSampleData[j][5] == null?null: new BigDecimal (tlNonTyreItemSampleData[j][5]) );
////TODO derive from nettItemCost
////	    	tlNonTyreItemBean.setNettItemCost( tlNonTyreItemSampleData[j][6] == null?null: new BigDecimal (tlNonTyreItemSampleData[j][6]) );
////TODO derive from nettItemCost
////	    	tlNonTyreItemBean.setVatRate( tlNonTyreItemSampleData[j][7] == null?null: new BigDecimal (tlNonTyreItemSampleData[j][7]) );
//	    	//fastFitId tlNonTyreItemSampleData[j][8]
//	    	tlNonTyreItemBean.setProductDescription( tlNonTyreItemSampleData[j][9] == null?null: tlNonTyreItemSampleData[j][9] );
//	       	tlNonTyreItemBean.setWheelOrAxlePosition( tlNonTyreItemSampleData[j][10] == null?null: tlNonTyreItemSampleData[j][10] );
//	    	tlNonTyreItemBean.setWheelPositionDescription( tlNonTyreItemSampleData[j][11]==null?null:tlNonTyreItemSampleData[j][11] );
//
//	    	tlFastFitProductBean = new TlFastFitProductBean();
//	    	tlFastFitProductBean.setFastFitRecordType( tlFastFitProductSampleData[j][1]==null?null:tlFastFitProductSampleData[j][1] );
//	    	tlFastFitProductBean.setVersionNumber( tlFastFitProductSampleData[j][2]==null?null:new Short( tlFastFitProductSampleData[j][2] ) );
////	    	tlFastFitProductBean.setProductCode( tlFastFitProductSampleData[j][3]==null?null:tlFastFitProductSampleData[j][3] );
////	    	tlFastFitProductBean.setProductDescription( tlFastFitProductSampleData[j][4]==null?null:tlFastFitProductSampleData[j][4] );
//	    	tlFastFitProductBean.setTyreManufacturer( tlFastFitProductSampleData[j][5]==null?null:tlFastFitProductSampleData[j][5] );		    	    			
//	    	tlFastFitProductBean.setTyreWidth( tlFastFitProductSampleData[j][6]==null?null: new Short(tlFastFitProductSampleData[j][6] ) );
//	    	tlFastFitProductBean.setTyreAspectRatio( tlFastFitProductSampleData[j][7]==null?null: new Short( tlFastFitProductSampleData[j][7] ) );
//	    	tlFastFitProductBean.setTyreConstruction( tlFastFitProductSampleData[j][8]==null?null:tlFastFitProductSampleData[j][8] );
//	    	tlFastFitProductBean.setTyreWheelRimSize( tlFastFitProductSampleData[j][9]==null?null:new Short( tlFastFitProductSampleData[j][9] ) );
//	    	tlFastFitProductBean.setTyrePlyRating( tlFastFitProductSampleData[j][10]==null?null: tlFastFitProductSampleData[j][10] );
//	    	tlFastFitProductBean.setTyreSpeedRating(tlFastFitProductSampleData[j][11]==null?null: tlFastFitProductSampleData[j][11]);
////	    	tlFastFitProductBean.setTyreType( tlFastFitProductSampleData[j][12]==null?null: tlFastFitProductSampleData[j][12] );
//	    	tlFastFitProductBean.setTransmissionAction( tlFastFitProductSampleData[j][13]==null?null: tlFastFitProductSampleData[j][13] );
////	    	tlFastFitProductBean.setIncludeInTyrePriceUpdate( tlFastFitProductSampleData[j][15]==null?null: tlFastFitProductSampleData[j][15] );
//
//	    	tlNonTyreItemBean.setTlFastFitProductBean( tlFastFitProductBean );
//
//	    	tlNonTyreItemBeans.add( tlNonTyreItemBean );
//    	}
////    	tlTyreBean.setTlNonTyreItemBeans( tlNonTyreItemBeans );
//
//    	String[][] tlTyreItemSampleData = {
//    			{TL_TRANSACTION_NO, "4", "NSF", "R&R", "004", "23.36", ".00", "23.36", "17.50", null, "2804", "FIR", null, null, null, "6565", "0x000000002525DFDF"}
//    	};
//    	TlTyreItemBean tlTyreItemBean;
//    	for(int m = 0; m < tlTyreItemSampleData.length; m++) { // For each element of that array,
//    		tlTyreItemBean = new TlTyreItemBean();
//
//	    	tlTyreItemBean.setTransleaseTransactionNumber( new Integer ( tlTyreItemSampleData[m][0] ) );
//	    	tlTyreItemBean.setItemNumber( tlTyreItemSampleData[m][1]==null?null: new Short(tlTyreItemSampleData[m][1]));
//	    	tlTyreItemBean.setTyrePosition( (String) tlTyreItemSampleData[m][2]==null?null: tlTyreItemSampleData[m][2]);
//	    	tlTyreItemBean.setActionCode( tlTyreItemSampleData[m][3]==null?null: tlTyreItemSampleData[m][3] );
//	    	tlTyreItemBean.setReasonCode( tlTyreItemSampleData[m][4]==null?null: tlTyreItemSampleData[m][4] );
//	    	tlTyreItemBean.setItemCost( tlTyreItemSampleData[m][5]==null?null: new BigDecimal( tlTyreItemSampleData[m][5] ) );
////	    	tlTyreItemBean.setDriverContributionPercent( tlTyreItemSampleData[m][6]==null?null: new BigDecimal(tlTyreItemSampleData[m][6]) );
////	    	tlTyreItemBean.setNettItemCost( tlTyreItemSampleData[m][7]==null?null: new BigDecimal(tlTyreItemSampleData[m][7]) );
////	    	tlTyreItemBean.setVatRate( tlTyreItemSampleData[m][8]==null?null: new BigDecimal( tlTyreItemSampleData[m][8] ));
//	    	tlTyreItemBean.setPositionDescription( tlTyreItemSampleData[m][9]==null?null: tlTyreItemSampleData[m][9]);
////	    	tlTyreItemBean.setOldTyreBatchSerialNum( tlTyreItemSampleData[m][10]==null?null: tlTyreItemSampleData[m][10] );
////	    	tlTyreItemBean.setOldTyreManufacturer( tlTyreItemSampleData[m][11]==null?null: tlTyreItemSampleData[m][11] );
////	    	tlTyreItemBean.setSwapPosition( tlTyreItemSampleData[m][12]==null?null: tlTyreItemSampleData[m][12] );
////	    	tlTyreItemBean.setSwapPositionDescription( tlTyreItemSampleData[m][13]==null?null: tlTyreItemSampleData[m][13] );
////	    	tlTyreItemBean.setDriverContribution( tlTyreItemSampleData[m][14]==null?null: new BigDecimal(tlTyreItemSampleData[m][14]));
//	    	if(m ==0) {
//    	    	String[][] tlFastFitProductSampleData1 = {
//    	    			{"6565", "TY", "1", null, null, "MIC", "165", "70", "R", "14", "S", "T", "E3A ENERGY", "A", "0x000000002AAA3A72", "N"}
//    	    	};
//            	for(int n = 0; n < tlFastFitProductSampleData1.length; n++) { // For each element of that array,
//
//            		tlFastFitProductBean = new TlFastFitProductBean();
//
//            		tlFastFitProductBean.setFastFitRecordType( tlFastFitProductSampleData1[n][1]==null?null:tlFastFitProductSampleData1[n][1] );
//	    	    	tlFastFitProductBean.setVersionNumber( tlFastFitProductSampleData1[n][2]==null?null:new Short( tlFastFitProductSampleData1[n][2] ) );
////	    	    	tlFastFitProductBean.setProductCode( tlFastFitProductSampleData1[n][3]==null?null:tlFastFitProductSampleData1[n][3] );
////	    	    	tlFastFitProductBean.setProductDescription( tlFastFitProductSampleData1[n][4]==null?null:tlFastFitProductSampleData1[n][4] );
//	    	    	tlFastFitProductBean.setTyreManufacturer( tlFastFitProductSampleData1[n][5]==null?null: tlFastFitProductSampleData1[n][5] );
//	    	    	tlFastFitProductBean.setTyreWidth( tlFastFitProductSampleData1[n][6]==null?null:new Short(tlFastFitProductSampleData1[n][6] ) );
//	    	    	tlFastFitProductBean.setTyreAspectRatio( tlFastFitProductSampleData1[n][7]==null?null:new Short ( tlFastFitProductSampleData1[n][7] ) );
//	    	    	tlFastFitProductBean.setTyreConstruction( tlFastFitProductSampleData1[n][8]==null?null:tlFastFitProductSampleData1[n][8] );
//	    	    	tlFastFitProductBean.setTyreWheelRimSize( tlFastFitProductSampleData1[n][9]==null?null:new Short( tlFastFitProductSampleData1[n][9] ) );
//	    	    	tlFastFitProductBean.setTyrePlyRating( tlFastFitProductSampleData1[n][10]==null?null:tlFastFitProductSampleData1[n][10] );
//	    	    	tlFastFitProductBean.setTyreSpeedRating(tlFastFitProductSampleData1[n][11]==null?null: tlFastFitProductSampleData1[n][11]);
////	    	    	tlFastFitProductBean.setTyreType( tlFastFitProductSampleData1[n][12]==null?null: tlFastFitProductSampleData1[n][12] );
//	    	    	tlFastFitProductBean.setTransmissionAction( tlFastFitProductSampleData1[n][13]==null?null:tlFastFitProductSampleData1[n][13] );
////	    	    	tlFastFitProductBean.setIncludeInTyrePriceUpdate(tlFastFitProductSampleData1[n][15]==null?null: tlFastFitProductSampleData1[n][15] );
//
//	    	    	tlTyreItemBean.setTlFastFitProductBean( tlFastFitProductBean );
//            	}
//	    	}
//	    	tlTyreItemBeans.add( tlTyreItemBean );
//    	}
//
//    	ttds.addTyres( tlTyreBeans, tlTyreItemBeans, tlNonTyreItemBeans);
//		assertTrue(true);
//	}

    @Test
    public void testAddTyres() throws TransactionNotFoundException, InvoiceCreditEntryNotFoundException {
    	//Tyres
    	List < TlTyreBean > tlTyreBeans = new ArrayList < TlTyreBean > ();
    	TlTyreBean tlTyreBean;

    	tlTyreBean = new TlTyreBean();
    	tlTyreBean.setTransleaseTransactionNumber( 40043219 );
    	tlTyreBean.setTyrePosition( "OSF" );
    	tlTyreBean.setPositionDescription("O/S Front");        		
    	tlTyreBean.setInsideTreadDepth( new BigDecimal ("2.0") );
    	tlTyreBean.setCentreTreadDepth( new BigDecimal ("1.0"));
    	tlTyreBean.setOutsideTreadDepth(  new BigDecimal ("3.0"));
    	tlTyreBeans.add( tlTyreBean );

    	tlTyreBean = new TlTyreBean();
    	tlTyreBean.setTransleaseTransactionNumber( 40043219 );
    	tlTyreBean.setTyrePosition( "NSF" );
    	tlTyreBean.setPositionDescription("N/S Front");
    	tlTyreBean.setInsideTreadDepth( new BigDecimal ("2.0") );
    	tlTyreBean.setCentreTreadDepth( new BigDecimal ("1.0") );
    	tlTyreBean.setOutsideTreadDepth( new BigDecimal ("3.0") );
    	tlTyreBeans.add( tlTyreBean );

    	tlTyreBean = new TlTyreBean();
    	tlTyreBean.setTransleaseTransactionNumber( 40043219 );
    	tlTyreBean.setTyrePosition( "OSRO" );
    	tlTyreBean.setPositionDescription("O/S Rear");
    	tlTyreBean.setInsideTreadDepth( new BigDecimal ("2.0") );
    	tlTyreBean.setCentreTreadDepth( new BigDecimal ("1.0") );
    	tlTyreBean.setOutsideTreadDepth( new BigDecimal ("5.0") );
    	tlTyreBeans.add( tlTyreBean );

    	tlTyreBean = new TlTyreBean();
    	tlTyreBean.setTransleaseTransactionNumber( 40043219 );
    	tlTyreBean.setTyrePosition( "NSRO" );
    	tlTyreBean.setPositionDescription("N/S Rear");
    	tlTyreBean.setInsideTreadDepth( new BigDecimal ("4.0") );
    	tlTyreBean.setCentreTreadDepth( new BigDecimal ("1.0") );
    	tlTyreBean.setOutsideTreadDepth( new BigDecimal ("3.0") );
    	tlTyreBeans.add( tlTyreBean );

    	tlTyreBean = new TlTyreBean();
    	tlTyreBean.setTransleaseTransactionNumber( 40043219 );
    	tlTyreBean.setTyrePosition( "SPR" );
    	tlTyreBean.setPositionDescription("Spare");
    	tlTyreBean.setInsideTreadDepth( new BigDecimal ("2.0") );
    	tlTyreBean.setCentreTreadDepth( new BigDecimal ("2.0") );
    	tlTyreBean.setOutsideTreadDepth( new BigDecimal ("2.0") );
    	tlTyreBeans.add( tlTyreBean );

    	tlTyreBean = new TlTyreBean();
    	tlTyreBean.setTransleaseTransactionNumber( 40043219 );
    	tlTyreBean.setTyrePosition( "OSRI" );
    	tlTyreBean.setPositionDescription("O/S/R Inner");
    	tlTyreBean.setInsideTreadDepth( new BigDecimal ("0.0") );
    	tlTyreBean.setCentreTreadDepth( new BigDecimal ("0.0") );
    	tlTyreBean.setOutsideTreadDepth( new BigDecimal ("0.0") );
    	tlTyreBeans.add( tlTyreBean );

    	tlTyreBean = new TlTyreBean();
    	tlTyreBean.setTransleaseTransactionNumber( 40043219 );
    	tlTyreBean.setTyrePosition( "NSRI" );
    	tlTyreBean.setPositionDescription("N/S/R Inner");
    	tlTyreBean.setInsideTreadDepth( new BigDecimal ("0.0") );
    	tlTyreBean.setCentreTreadDepth( new BigDecimal ("0.0") );
    	tlTyreBean.setOutsideTreadDepth( new BigDecimal ("0.0") );
    	tlTyreBeans.add( tlTyreBean );
//Tyre Items
    	List < TlTyreItemBean > tlTyreItemBeans = new ArrayList < TlTyreItemBean > ();
    	TlFastFitProductBean tlFastFitProductBean = null;
    	TlTyreItemBean tlTyreItemBean = null;

    	tlTyreItemBean = new TlTyreItemBean();
    	tlTyreItemBean.setTransleaseTransactionNumber( 40043219 );
    	tlTyreItemBean.setItemNumber( new Short("2") );
    	tlTyreItemBean.setTyrePosition("NSF");
    	tlTyreItemBean.setActionCode("R&R");
    	tlTyreItemBean.setItemCost( new BigDecimal ("35.00") );
    	tlTyreItemBean.setPositionDescription("N/S Front");
    	tlTyreItemBean.setReasonCode("DEF");
    	tlFastFitProductBean = new TlFastFitProductBean();
		tlFastFitProductBean.setFastFitRecordType("TY");
		tlFastFitProductBean.setTransmissionAction("A");
		tlFastFitProductBean.setTyreAspectRatio( new Short ("0") );
//		tlFastFitProductBean.setTyreConstruction("R");
		tlFastFitProductBean.setTyreManufacturer("OTH");
//		tlFastFitProductBean.setTyrePlyRating("S");
//		tlFastFitProductBean.setTyreSpeedRating("V");
		tlFastFitProductBean.setTyreWheelRimSize(new Short("0") );
		tlFastFitProductBean.setTyreWidth( new Short("0") );
		tlFastFitProductBean.setVersionNumber( new Short("1") );
    	tlTyreItemBean.setTlFastFitProductBean( tlFastFitProductBean );

    	tlTyreItemBeans.add( tlTyreItemBean );

    	tlTyreItemBean = new TlTyreItemBean();
    	tlTyreItemBean.setTransleaseTransactionNumber( 40043219 );
    	tlTyreItemBean.setItemNumber( new Short("3") );
    	tlTyreItemBean.setTyrePosition("OSF");
    	tlTyreItemBean.setActionCode("R&R");
    	tlTyreItemBean.setItemCost( new BigDecimal ("30.00") );
    	tlTyreItemBean.setPositionDescription("O/S Front");
    	tlTyreItemBean.setReasonCode("DEF");
    	tlFastFitProductBean = new TlFastFitProductBean();
		tlFastFitProductBean.setFastFitRecordType("TY");
		tlFastFitProductBean.setTransmissionAction("A");
		tlFastFitProductBean.setTyreAspectRatio( new Short ("0") );
//		tlFastFitProductBean.setTyreConstruction("R");
		tlFastFitProductBean.setTyreManufacturer("OTH");
//		tlFastFitProductBean.setTyrePlyRating("S");
//		tlFastFitProductBean.setTyreSpeedRating("V");
		tlFastFitProductBean.setTyreWheelRimSize(new Short("0") );
		tlFastFitProductBean.setTyreWidth( new Short("0") );
		tlFastFitProductBean.setVersionNumber( new Short("1") );
    	tlTyreItemBean.setTlFastFitProductBean( tlFastFitProductBean );
    	tlTyreItemBeans.add( tlTyreItemBean );

    	tlTyreItemBean = new TlTyreItemBean();
    	tlTyreItemBean.setTransleaseTransactionNumber( 40043219 );
    	tlTyreItemBean.setItemNumber( new Short("4") );
    	tlTyreItemBean.setTyrePosition("NSRO");
    	tlTyreItemBean.setActionCode("R&R");
    	tlTyreItemBean.setItemCost( new BigDecimal ("25.00") );
    	tlTyreItemBean.setPositionDescription("N/S Rear");
    	tlTyreItemBean.setReasonCode("DEF");

    	tlFastFitProductBean = new TlFastFitProductBean();
		tlFastFitProductBean.setFastFitRecordType("TY");
		tlFastFitProductBean.setTransmissionAction("A");
		tlFastFitProductBean.setTyreAspectRatio( new Short ("0") );
//		tlFastFitProductBean.setTyreConstruction("R");
		tlFastFitProductBean.setTyreManufacturer("OTH");
//		tlFastFitProductBean.setTyrePlyRating("S");
//		tlFastFitProductBean.setTyreSpeedRating("V");
		tlFastFitProductBean.setTyreWheelRimSize(new Short("0") );
		tlFastFitProductBean.setTyreWidth( new Short("0") );
		tlFastFitProductBean.setVersionNumber( new Short("1") );
    	tlTyreItemBean.setTlFastFitProductBean( tlFastFitProductBean );

    	tlTyreItemBeans.add( tlTyreItemBean );

//Non Tyre Items
    	List < TlNonTyreItemBean > tlNonTyreItemBeans = new ArrayList < TlNonTyreItemBean > ();
    	TlNonTyreItemBean tlNonTyreItemBean = null;

//    	tlNonTyreItemBean = new TlNonTyreItemBean();
//    	tlNonTyreItemBean.setTransleaseTransactionNumber( 40043219 );
//    	tlNonTyreItemBean.setItemNumber( new Short ("1") );
//    	tlNonTyreItemBean.setWheelOrAxlePosition("OTH");
//    	tlNonTyreItemBean.setActionCode("ALN");
//    	tlNonTyreItemBean.setItemCost(new BigDecimal("20.00"));
//    	tlNonTyreItemBean.setProductDescription("Wheel Alignment");
//    	tlNonTyreItemBean.setReasonCode("006");
//    	tlNonTyreItemBean.setWheelPositionDescription("Other");
//    	tlFastFitProductBean = new TlFastFitProductBean();
//    	tlFastFitProductBean.setFastFitRecordType( "TR" );
//    	tlFastFitProductBean.setTransmissionAction("A");
//    	tlFastFitProductBean.setTyreAspectRatio( new Short( "0" ) );
//    	tlFastFitProductBean.setTyreWheelRimSize( new Short( "0" ) );
//    	tlFastFitProductBean.setTyreWidth( new Short( "0" ) );
//    	tlFastFitProductBean.setVersionNumber( new Short( "1" ) );
//    	tlNonTyreItemBean.setTlFastFitProductBean( tlFastFitProductBean );
//    	tlNonTyreItemBeans.add(tlNonTyreItemBean);

    	tlNonTyreItemBean = new TlNonTyreItemBean();
    	tlNonTyreItemBean.setTransleaseTransactionNumber(40043219);
    	tlNonTyreItemBean.setItemNumber( new Short ("2") );
    	tlNonTyreItemBean.setWheelOrAxlePosition("NSF");
    	tlNonTyreItemBean.setActionCode("RTN");
    	tlNonTyreItemBean.setItemCost(new BigDecimal("0.00"));
    	tlNonTyreItemBean.setProductDescription("Valve");
    	tlNonTyreItemBean.setReasonCode("DEF");
    	tlNonTyreItemBean.setWheelPositionDescription("N/S Front");
    	tlFastFitProductBean = new TlFastFitProductBean();
    	tlFastFitProductBean.setFastFitRecordType( "VL" );
    	tlFastFitProductBean.setTransmissionAction("A");
    	tlFastFitProductBean.setTyreAspectRatio( new Short( "0" ) );
    	tlFastFitProductBean.setTyreWheelRimSize( new Short( "0" ) );
    	tlFastFitProductBean.setTyreWidth( new Short( "0" ) );
    	tlFastFitProductBean.setVersionNumber( new Short( "1" ) );
    	tlNonTyreItemBean.setTlFastFitProductBean( tlFastFitProductBean );
    	tlNonTyreItemBeans.add(tlNonTyreItemBean);

    	tlNonTyreItemBean = new TlNonTyreItemBean();
    	tlNonTyreItemBean.setTransleaseTransactionNumber(40043219);
    	tlNonTyreItemBean.setItemNumber( new Short ("2") );
    	tlNonTyreItemBean.setWheelOrAxlePosition("NSF");
    	tlNonTyreItemBean.setActionCode("RTN");
    	tlNonTyreItemBean.setItemCost(new BigDecimal("0.00"));
    	tlNonTyreItemBean.setProductDescription("Balance");
    	tlNonTyreItemBean.setReasonCode("DEF");
    	tlNonTyreItemBean.setWheelPositionDescription("N/S Front");
    	tlFastFitProductBean = new TlFastFitProductBean();
    	tlFastFitProductBean.setFastFitRecordType( "BL" );
    	tlFastFitProductBean.setTransmissionAction("A");
    	tlFastFitProductBean.setTyreAspectRatio( new Short( "0" ) );
    	tlFastFitProductBean.setTyreWheelRimSize( new Short( "0" ) );
    	tlFastFitProductBean.setTyreWidth( new Short( "0" ) );
    	tlFastFitProductBean.setVersionNumber( new Short( "1" ) );
    	tlNonTyreItemBean.setTlFastFitProductBean( tlFastFitProductBean );
    	tlNonTyreItemBeans.add(tlNonTyreItemBean);

    	tlNonTyreItemBean = new TlNonTyreItemBean();
    	tlNonTyreItemBean.setTransleaseTransactionNumber(40043219);
    	tlNonTyreItemBean.setItemNumber( new Short ("2") );
    	tlNonTyreItemBean.setWheelOrAxlePosition("NSF");
    	tlNonTyreItemBean.setActionCode("RTN");
    	tlNonTyreItemBean.setItemCost(new BigDecimal("0.00"));
    	tlNonTyreItemBean.setProductDescription("Valve");
    	tlNonTyreItemBean.setReasonCode("DEF");
    	tlNonTyreItemBean.setWheelPositionDescription("Environmental Casing Disposal");
    	tlFastFitProductBean = new TlFastFitProductBean();
    	tlFastFitProductBean.setFastFitRecordType( "TR" );
    	tlFastFitProductBean.setTransmissionAction("A");
    	tlFastFitProductBean.setTyreAspectRatio( new Short( "0" ) );
    	tlFastFitProductBean.setTyreWheelRimSize( new Short( "0" ) );
    	tlFastFitProductBean.setTyreWidth( new Short( "0" ) );
    	tlFastFitProductBean.setVersionNumber( new Short( "1" ) );
    	tlNonTyreItemBean.setTlFastFitProductBean( tlFastFitProductBean );
    	tlNonTyreItemBeans.add(tlNonTyreItemBean);

    	tlNonTyreItemBean = new TlNonTyreItemBean();
    	tlNonTyreItemBean.setTransleaseTransactionNumber(40043219);
    	tlNonTyreItemBean.setItemNumber( new Short ("3") );
    	tlNonTyreItemBean.setWheelOrAxlePosition("OSF");
    	tlNonTyreItemBean.setActionCode("RTN");
    	tlNonTyreItemBean.setItemCost(new BigDecimal("0.00"));
    	tlNonTyreItemBean.setProductDescription("Valve");
    	tlNonTyreItemBean.setReasonCode("DEF");
    	tlNonTyreItemBean.setWheelPositionDescription("O/S Front");
    	tlFastFitProductBean = new TlFastFitProductBean();
    	tlFastFitProductBean.setFastFitRecordType( "VL" );
    	tlFastFitProductBean.setTransmissionAction("A");
    	tlFastFitProductBean.setTyreAspectRatio( new Short( "0" ) );
    	tlFastFitProductBean.setTyreWheelRimSize( new Short( "0" ) );
    	tlFastFitProductBean.setTyreWidth( new Short( "0" ) );
    	tlFastFitProductBean.setVersionNumber( new Short( "1" ) );
    	tlNonTyreItemBean.setTlFastFitProductBean( tlFastFitProductBean );
    	tlNonTyreItemBeans.add(tlNonTyreItemBean);

    	tlNonTyreItemBean = new TlNonTyreItemBean();
    	tlNonTyreItemBean.setTransleaseTransactionNumber(40043219);
    	tlNonTyreItemBean.setItemNumber( new Short ("3") );
    	tlNonTyreItemBean.setWheelOrAxlePosition("OSF");
    	tlNonTyreItemBean.setActionCode("RTN");
    	tlNonTyreItemBean.setItemCost(new BigDecimal("0.00"));
    	tlNonTyreItemBean.setProductDescription("Balance");
    	tlNonTyreItemBean.setReasonCode("DEF");
    	tlNonTyreItemBean.setWheelPositionDescription("O/S Front");
    	tlFastFitProductBean = new TlFastFitProductBean();
    	tlFastFitProductBean.setFastFitRecordType( "BL" );
    	tlFastFitProductBean.setTransmissionAction("A");
    	tlFastFitProductBean.setTyreAspectRatio( new Short( "0" ) );
    	tlFastFitProductBean.setTyreWheelRimSize( new Short( "0" ) );
    	tlFastFitProductBean.setTyreWidth( new Short( "0" ) );
    	tlFastFitProductBean.setVersionNumber( new Short( "1" ) );
    	tlNonTyreItemBean.setTlFastFitProductBean( tlFastFitProductBean );
    	tlNonTyreItemBeans.add(tlNonTyreItemBean);

    	tlNonTyreItemBean = new TlNonTyreItemBean();
    	tlNonTyreItemBean.setTransleaseTransactionNumber(40043219);
    	tlNonTyreItemBean.setItemNumber( new Short ("4") );
    	tlNonTyreItemBean.setWheelOrAxlePosition("NSRO");
    	tlNonTyreItemBean.setActionCode("RTN");
    	tlNonTyreItemBean.setItemCost(new BigDecimal("0.00"));
    	tlNonTyreItemBean.setProductDescription("Valve");
    	tlNonTyreItemBean.setReasonCode("DEF");
    	tlNonTyreItemBean.setWheelPositionDescription("N/S Rear");
    	tlFastFitProductBean = new TlFastFitProductBean();
    	tlFastFitProductBean.setFastFitRecordType( "VL" );
    	tlFastFitProductBean.setTransmissionAction("A");
    	tlFastFitProductBean.setTyreAspectRatio( new Short( "0" ) );
    	tlFastFitProductBean.setTyreWheelRimSize( new Short( "0" ) );
    	tlFastFitProductBean.setTyreWidth( new Short( "0" ) );
    	tlFastFitProductBean.setVersionNumber( new Short( "1" ) );
    	tlNonTyreItemBean.setTlFastFitProductBean( tlFastFitProductBean );
    	tlNonTyreItemBeans.add(tlNonTyreItemBean);

try {
	ttds.addTyres( tlTyreBeans, tlTyreItemBeans, tlNonTyreItemBeans);
	assertTrue(true);	
}
catch (Exception e) {
	LOG.error("Error class: " + e.getClass().getName());
    LOG.error("Caught error. Message: " + e.getMessage());
	assertTrue(false);
}

	}
}
