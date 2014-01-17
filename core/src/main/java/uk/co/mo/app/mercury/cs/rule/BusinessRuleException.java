/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.rule;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Put your class comment here
 * <p/>
 * User: prabat
 * Date: 29-Jan-2010
 * <p/>
 * Change Log - Who : When : Comment
 */
public class BusinessRuleException extends Exception {

    private Map<BusinessRule, String> rules = new HashMap<BusinessRule, String>(0);

    public BusinessRuleException() {
    }

    public BusinessRuleException(String message) {
        super(message);
    }

    public BusinessRuleException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessRuleException(Throwable cause) {
        super(cause);
    }

    public BusinessRuleException(Map<BusinessRule, String> rules) {
        this.rules = rules;
    }

    public void addBusinessRule(BusinessRule rule, String message) {
        this.rules.put(rule, message);
    }

    public void addBusinessRules(Map<BusinessRule, String> rules) {
        this.rules.putAll(rules);
    }

    public Map<BusinessRule, String> getRules(){
    	return this.rules;
    }

    public boolean isRulesViolated() {
        return rules.size() > 0;
    }

    public String getFailedRulesAsString() {
        Map failedRules = getRules();
        StringBuffer errors = new StringBuffer();
        int rule = 1;
        for (Iterator iterator = failedRules.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry entry = (Map.Entry) iterator.next();
            errors.append("\nRule ").append(rule).append(" ").
                    append(entry.getKey().toString()).append(" ").append(entry.getValue());
            rule++;
        }
        
        return errors.toString();
    }
}
