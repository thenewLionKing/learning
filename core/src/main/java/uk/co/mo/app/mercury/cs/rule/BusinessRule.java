package uk.co.mo.app.mercury.cs.rule;

import java.io.Serializable;

/**
 * Put your class comment here
 * <p/>
 * User: PrabaT
 * Date: 30-Jan-2010
 * <p/>
 * Change Log - Who : When : Comment
 */
public class BusinessRule implements Serializable {
    private String code;
    private String description;

    public BusinessRule(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "code: " + code + " description:" + description;
    }
}
