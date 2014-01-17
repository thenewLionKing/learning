package uk.co.mo.app.mercury.cs.rule;

/**
 * Put your class comment here
 * <p/>
 * User: PrabaT
 * Date: 30-Jan-2010
 * <p/>
 * Change Log - Who : When : Comment
 */
public enum RuleType {

    /**
     * signifies creation rule sets to be executed
     */
    CREATION,

    /**
     * signifies modification rule sets to be executed
     */
    MODIFICATION,
    /**
     * Rule of Deletion type
     */
    DELETION,

    /**
     * signifies customer rule sets to be executed
     */
    CUSTOM,

    NONE     
}
