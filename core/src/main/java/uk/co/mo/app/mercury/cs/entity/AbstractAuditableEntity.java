/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.entity;

import java.util.Date;
import java.util.Observable;

/**
 * Put your class comment here
 * <p/>
 * User: PrabaT
 * Date: 05-Feb-2010
 * <p/>
 * Change Log - Who : When : Comment
 */
public abstract class AbstractAuditableEntity extends Observable {

    private Date insertDate;
    private String insertUser;
    private String updateUser;
    private Date updateDate;
    private String hostName;

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public String getInsertUser() {
        return insertUser;
    }

    public void setInsertUser(String insertUser) {
        this.insertUser = insertUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public final void audit(AuditTypes type) {
        setChanged();
        notifyObservers(type);
    }
}
