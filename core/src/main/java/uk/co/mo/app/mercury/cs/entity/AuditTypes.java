package uk.co.mo.app.mercury.cs.entity;

/**
 * Put your class comment here
 * <p/>
 * User: PrabaT
 * Date: 06-Feb-2010
 * <p/>
 * Change Log - Who : When : Comment
 */
public enum AuditTypes {
    AUDIT_CREATE(1), AUDIT_UPDATE(2);

    private int types;

    AuditTypes(int types) {
        this.types = types;
    }

    public int getTypes() {
        return types;
    }
}
