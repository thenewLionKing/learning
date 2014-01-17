package uk.co.mo.app.mercury.domain.agreement.event;

import org.exolab.castor.mapping.ConfigurableFieldHandler;
import org.exolab.castor.mapping.GeneralizedFieldHandler;
import org.exolab.castor.mapping.ValidityException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * <p/>
 * User: prabat
 * Date: 01-Feb-2011
 * Time: 13:00:37
 * <p/>
 * Change Log - Who : When : Comment
 */
public class AgreementEventDateHandler extends GeneralizedFieldHandler implements ConfigurableFieldHandler {

    private SimpleDateFormat formatter;

    public void setConfiguration(final Properties config) throws ValidityException {
    	String pattern = config.getProperty("date-format");
    	if (pattern == null) {
    		throw new ValidityException("Required parameter \"date-format\" is missing for FieldHandlerImpl.");
    	}
    	try {
    		formatter = new SimpleDateFormat(pattern);
    	} catch (IllegalArgumentException e) {
    		throw new ValidityException("Pattern \""+pattern+"\" is not a valid date format.");
    	}
    }

    @Override
    public Object convertUponGet(Object value) {
        if (value == null) return null;
        Date date = (Date)value;
        return formatter.format(date);
    }

    @Override
    public Object convertUponSet(Object o) {
        return null;
    }

    @Override
    public Class getFieldType() {
        return Date.class;
    }
}