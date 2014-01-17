package uk.co.mo.app.mercury.domain.translease.vcd;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.translease.transaction.exception.TransactionNotFoundException;
import uk.co.mo.app.mercury.domain.translease.tyre.TransleaseTyreDataServiceTest;
import uk.co.mo.app.mercury.domain.translease.vcd.beans.TlVcdBean;
import uk.co.mo.app.mercury.domain.translease.vcd.beans.TlVcdConditionLineBean;
import uk.co.mo.app.mercury.domain.translease.vcd.service.TlVcdDataService;

public class TransleaseVcdDataServiceTest extends AbstractJunit4Test{

    @SuppressWarnings("unused")
	private static final Log LOG = LogFactory.getLog(TransleaseTyreDataServiceTest.class);

    @Autowired
    @Qualifier("tlVcdDataService")
    private TlVcdDataService tvcdService;

    private static final String TL_TRANSACTION_NO = "9999999";

	@Override
	protected void setup() {
		// TODO Auto-generated method stub
	}

	@Override
	protected void destroy() {
		// TODO Auto-generated method stub
	}

    @Test
    public void testAddVcd() throws TransactionNotFoundException {
    	String[] tlVcdSampleData =
    			{TL_TRANSACTION_NO, "2006-08-30 00:00:00","EX53PXO","760858","18086","1001897","42386","C WOOD","A1",null,"A1","A1","0x000000002B74CDE7","15DAEE9C-4635-472C-A481-6CF883F09A5C"};
    	TlVcdBean vcdBean = new TlVcdBean();
    	vcdBean.setTransleaseTransactionNumber( tlVcdSampleData[0] == null ? null : new Integer( tlVcdSampleData[0] ) );
    	vcdBean.setVcdDate( new Date() ); //1
    	vcdBean.setCarRegistrationNumber( tlVcdSampleData[2] == null ? null : tlVcdSampleData[2] );
    	vcdBean.setAssetNumber( tlVcdSampleData[3] == null ? null : new Integer ( tlVcdSampleData[3] ) );
    	vcdBean.setOdometerReading( tlVcdSampleData[4] == null ? null : new Integer ( tlVcdSampleData[4] ) );
    	vcdBean.setTransleaseRepairerNumber( tlVcdSampleData[5] == null ? null : new Integer ( tlVcdSampleData[5] ) );
    	vcdBean.setLeasecoRepairerRef( tlVcdSampleData[6] == null ? null : tlVcdSampleData[6] );
    	vcdBean.setCompletedBy( tlVcdSampleData[7] == null ? null : tlVcdSampleData[7] );
    	vcdBean.setJobTitle( tlVcdSampleData[8] == null ? null : tlVcdSampleData[8] );
    	vcdBean.setJobTitleOther( tlVcdSampleData[9] == null ? null : tlVcdSampleData[9] );
    	vcdBean.setGeneralExteriorCondition( tlVcdSampleData[10] == null ? null : tlVcdSampleData[10] );
    	vcdBean.setGeneralInteriorCondition( tlVcdSampleData[11] == null ? null : tlVcdSampleData[11] );

    	String[][] tlVcdConditionLineBeanSampleData = {
    	{ TL_TRANSACTION_NO,"1","A1","A5","0x000000002BCC22CA","1C5D2B54-6BEC-4B40-A4AD-7D3221BF43A1" },
    	{ TL_TRANSACTION_NO,"10","A1","A5","0x000000002B3EAF34","E006463A-2350-4F58-B759-0549CF0CA119" },
    	{ TL_TRANSACTION_NO,"11","A1","A5","0x000000002B3EAF35","0CF464AB-69C4-4FC1-A29A-3C4492E33544" },
    	{ TL_TRANSACTION_NO,"12","A1","A5","0x000000002B3EAF36","91EDB7F9-2E96-49A7-85A3-4ECEDC477104" },
    	{ TL_TRANSACTION_NO,"13","A1","A5","0x000000002B3EAF37","57A5035C-9058-46F0-947A-638B19C14131" },
    	{ TL_TRANSACTION_NO,"14","A1","A5","0x000000002B3EAF38","36E0E5AE-FC6F-4B0C-8F8D-086646D1E149" },
    	{ TL_TRANSACTION_NO,"15","A1","A5","0x000000002B3EAF39","DBFD7469-013F-4059-941C-B3CEC9786ED8" },
    	{ TL_TRANSACTION_NO,"16","A1","A5","0x000000002B3EAF3A","C6095E65-C314-48D6-BA84-32AD1AF1AE3F" },
    	{ TL_TRANSACTION_NO,"17","A1","A5","0x000000002B3EAF3B","2165F760-FCF7-4E28-B86B-E4B1F3CDFCEA" },
    	{ TL_TRANSACTION_NO,"18","A1","A5","0x000000002B3EAF3C","3ECF8A90-0EA2-4E08-AEC4-7E7959A69E40" },
    	{ TL_TRANSACTION_NO,"19","A1","A5","0x000000002B3EAF3D","876B158C-91CD-4308-9F87-DC0758A9F2C4" },
    	{ TL_TRANSACTION_NO,"2","A1","A5","0x000000002BCC22CB","4FDBB850-D771-4785-BF12-E09561BFE625" },
    	{ TL_TRANSACTION_NO,"20","A1","A5","0x000000002B3EAF3E","F1A71C53-0F50-4F1F-9C5D-B4CB2C6D1A92" },
    	{ TL_TRANSACTION_NO,"21","A1","A5","0x000000002B3EAF3F","C6CAE8BE-EF3D-4D78-B577-E44B6C0F9418" },
    	{ TL_TRANSACTION_NO,"22","A1","A5","0x000000002B3EAF40","8CFAEDBF-D404-441D-8A2C-557A4ABDC43F" },
    	{ TL_TRANSACTION_NO,"23","A1","A5","0x000000002B3EAF41","62284AFE-EF31-48AB-9CBE-9DB0D278E38C" },
    	{ TL_TRANSACTION_NO,"24","A1","A5","0x000000002B3EAF42","21E4AA9F-2A4B-46EF-851D-E144B4FC0AA6" },
    	{ TL_TRANSACTION_NO,"25","A1","A5","0x000000002B3EAF43","C49A565D-DF2C-46DF-B585-4E9BDE2DDA0D" },
    	{ TL_TRANSACTION_NO,"26","A1","A5","0x000000002B3EAF44","64967DA9-1C09-42A7-A064-6ECE6BAD73C2" },
    	{ TL_TRANSACTION_NO,"27","A1","A5","0x000000002B3EAF45","9C280766-B1CB-41EA-A2F2-4CC19E6BE119" },
    	{ TL_TRANSACTION_NO,"28","A1","A5","0x000000002B3EAF46","325EDBE9-7299-48D2-8375-A68F61F9D6DE" },
    	{ TL_TRANSACTION_NO,"29","A1","A5","0x000000002B3EAF47","99333EA2-F7CA-49B2-9F48-2E964DFE80F9" },
    	{ TL_TRANSACTION_NO,"3","A1","A5","0x000000002BCC22CC","6C0A0AEF-58F4-47ED-A8AC-19E811B7487F" },
    	{ TL_TRANSACTION_NO,"30","A1","A5","0x000000002B3EAF48","224B028F-6C51-492D-8751-DB32B26B9DBD" },
    	{ TL_TRANSACTION_NO,"31","A1","A5","0x000000002B3EAF49","0E27D3F5-D157-42EB-8DE8-D0C427ADAF9E" },
    	{ TL_TRANSACTION_NO,"32","A6","A5","0x000000002B3EAF4A","660FB801-2499-4E79-BCE3-7A9847750465" },
    	{ TL_TRANSACTION_NO,"33","A6","A5","0x000000002B3EAF4B","63CEA18F-6C0B-4BF9-8070-AC1FAEC9625F" },
    	{ TL_TRANSACTION_NO,"34","A6","A5","0x000000002B3EAF4C","F5E2F59A-A864-470A-88FB-8EAF741FCB8F" },
    	{ TL_TRANSACTION_NO,"35","A6","A5","0x000000002B3EAF4D","91301D95-4DFC-46B2-9A65-FDF83B0B7D11" },
    	{ TL_TRANSACTION_NO,"36","A6","A5","0x000000002B3EAF4E","81FF1215-F789-4332-A37D-B31E60826408" },
    	{ TL_TRANSACTION_NO,"37","A6","A5","0x000000002B3EAF4F","2FAC7E68-B9D5-415F-8310-3E9C3CEB6E0E" },
    	{ TL_TRANSACTION_NO,"38","A5","A5","0x000000002B3EAF50","831961C3-8C09-4F64-988C-ADFDEE211858" },
    	{ TL_TRANSACTION_NO,"39","A5","A5","0x000000002B3EAF51","7492685E-4EFF-4503-933E-2154B4AC953F" },
    	{ TL_TRANSACTION_NO,"4","A1","A5","0x000000002BCC22CD","740CDA3F-1BC7-4C53-993F-489D21862D9B" },
    	{ TL_TRANSACTION_NO,"40","A5","A5","0x000000002B3EAF52","DB3BB615-650A-4D09-9981-AE6A8861A6D3" },
    	{ TL_TRANSACTION_NO,"41","A5","A5","0x000000002B3EAF53","11ED8B3B-8A49-40B7-A8D6-6C0D910359B3" },
    	{ TL_TRANSACTION_NO,"42","A5","A5","0x000000002B3EAF54","3925830A-E844-4190-A8AB-3A5F4F783230" },
    	{ TL_TRANSACTION_NO,"5","A1","A5","0x000000002BCC22CE","A29D9C3B-958E-49C6-B49D-BF626404D1DC" },
    	{ TL_TRANSACTION_NO,"6","A1","A5","0x000000002BCC22CF","C493F1C2-2EB8-49ED-89A8-CDDC44311365" },
    	{ TL_TRANSACTION_NO,"7","A1","A5","0x000000002BCC22D0","246D2E76-6AED-42C9-86B7-CE5E1B35B5B4" },
    	{ TL_TRANSACTION_NO,"8","A1","A5","0x000000002BCC22D1","1D5F86C2-EF59-43BE-937C-AEE0CDC5405E" },
    	{ TL_TRANSACTION_NO,"9","A1","A5","0x000000002BCC22D2","ABC2B5C5-4502-47C1-A1AD-929D30FD7EFE" } };

    	List< TlVcdConditionLineBean > tlVcdConditionLineBeans = new ArrayList< TlVcdConditionLineBean >();
    	TlVcdConditionLineBean tlVcdConditionLineBean;
    	for(int i = 0; i < tlVcdConditionLineBeanSampleData.length; i++) { // For each element of that array, 
    		tlVcdConditionLineBean = new TlVcdConditionLineBean();
    		tlVcdConditionLineBean.setTransleaseTransactionNumber( tlVcdConditionLineBeanSampleData[i][0] == null ? null : new Integer ( tlVcdConditionLineBeanSampleData[i][0] ) );
    		tlVcdConditionLineBean.setAttributeCode( tlVcdConditionLineBeanSampleData[i][1] == null ? null : tlVcdConditionLineBeanSampleData[i][1] );
    		tlVcdConditionLineBean.setAttributeValue( tlVcdConditionLineBeanSampleData[i][2] == null ? null : tlVcdConditionLineBeanSampleData[i][2] );
    		tlVcdConditionLineBean.setMobilityAidDamageValue( tlVcdConditionLineBeanSampleData[i][3] == null ? null : tlVcdConditionLineBeanSampleData[i][3] );
//    		tlVcdConditionLineBean.setTimestamp(new Date () ); //4

    		tlVcdConditionLineBeans.add( tlVcdConditionLineBean );
    	}

    	vcdBean.setTlVcdConditionLineBeans(tlVcdConditionLineBeans);

		tvcdService.addVcd( vcdBean );

		assertTrue(true);
	}
}
