/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */

package uk.co.mo.app.mercury.cs.rule;

/**
 * An interface that models business rule execution
 *
 *
 * <p/>
 * User: prabat
 * Date: 29-Jan-2010
 * <p/>
 * Change Log - Who : When : Comment
 */
public interface IRule {
    /**
     * method to validate a domain object
     *
     * @throws BusinessRuleException if validation fail
     */
    void validate() throws BusinessRuleException;

    /**
     * method to execute rules associated with creation
     *
     * @throws BusinessRuleException  if rules fail
     */
    void executeCreationRules() throws BusinessRuleException;

    /**
     * method to execute rules associated with modifications
     *
     * @throws BusinessRuleException  if rules fail
     */
    void executeModificationRules() throws BusinessRuleException;
    
    /**
     * method that would validate business rules associated with deletion 
     * of business object
     * 
     * @throws BusinessRuleException
     */
    
    void executeDeletionRules() throws BusinessRuleException;
}
