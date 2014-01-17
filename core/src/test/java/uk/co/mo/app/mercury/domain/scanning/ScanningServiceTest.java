package uk.co.mo.app.mercury.domain.scanning;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;
import uk.co.mo.app.mercury.domain.scanning.beans.ProfileBean;
import uk.co.mo.app.mercury.domain.scanning.service.ScanningService;


public class ScanningServiceTest extends AbstractJunit4Test{

    private static final Log LOG = LogFactory.getLog(ScanningServiceTest.class);

    @Autowired
    @Qualifier("ScanningService")
    private ScanningService ss;


    @Test
    public void testGetDocumentInformationByDocNumber() {

        try {
        		Integer docNumber =20337158; 
        		ProfileBean bean = ss.getDocumentInformationByDocNumber(docNumber);
        		System.out.println("Profile bean ::: "+bean.getApplicationName() + " Storage Type::: "+bean.getSTORAGETYPE()
        				+"Document Full Path "+bean.getFullPath()+ "Path "+bean.getPATH());
        }catch (Exception e) {
            LOG.debug("Caught exception ", e);
        }

        	
    }
  
    @Override
    protected void setup() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected void destroy() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
