/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.remoting.support;

import java.io.Serializable;

/**
 * <p/>
 * User: PrabaT
 * Date: 29-Apr-2010
 * Time: 11:37:45
 * <p/>
 * Change Log - Who : When : Comment
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String ATTRIBUTE_NAME = "USER";

    private String userName;
    private String userRoleName;

    public User(String userName, String userRoleName) {
        this.userName = userName;
        this.userRoleName = userRoleName;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("User{").append("userName='").append(userName).append('\'')
                .append(", userRoleName='").append(userRoleName).append('\'').append('}').toString();
    }
}
