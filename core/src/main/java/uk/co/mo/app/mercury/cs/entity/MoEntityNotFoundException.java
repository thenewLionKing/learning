/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.entity;

/**
 * <p/>
 * User: PrabaT
 * Date: 11-Mar-2010
 * Time: 14:09:33
 * <p/>
 * Change Log - Who : When : Comment
 */
public class MoEntityNotFoundException extends Exception {

    public MoEntityNotFoundException() {
    }

    public MoEntityNotFoundException(String s) {
        super(s);
    }

    public MoEntityNotFoundException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public MoEntityNotFoundException(Throwable throwable) {
        super(throwable);
    }
}
