package uk.co.mo.app.mercury.domain.event;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.transform.stream.StreamResult;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.Marshaller;
import org.springframework.stereotype.Component;

/**
 * <p/>
 * User: prabat
 * Date: 13/06/11
 * Time: 16:23
 * <p/>
 * Change Log - Who : When : Comment
 */
@Component("xmlEventMarshaller")
public class XMLEventMarshaller implements MarshallEvent {

    @Autowired
    private Marshaller marshaller;
    
    private static final Log LOG = LogFactory.getLog(XMLEventMarshaller.class);  


    @Override
    public Serializable serialiseEvent(Serializable event) throws IOException {
        Writer out = new StringWriter();
        try {
            marshaller.marshal(event, new StreamResult(out));
            String output = out.toString();
//            LOG.debug(""+output);
            return output;
        } finally {
           out.close();
        }
    }
}
