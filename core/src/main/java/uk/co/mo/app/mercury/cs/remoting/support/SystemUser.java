/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.remoting.support;

/**
 * <p/>
 * User: PrabaT
 * Date: 29-Apr-2010
 * Time: 13:29:31
 * <p/>
 * Change Log - Who : When : Comment
 */
public class SystemUser {

    private static class ThreadLocalUser extends ThreadLocal {
        @Override
        protected Object initialValue() {
            return new User();
        }

        public User getUser() {
            return (User) super.get();
        }
    }

    private static ThreadLocalUser user = new ThreadLocalUser();

    public static void setUserName(String username) {
        user.getUser().setUserName(username);
    }

    public static String getUserName() {
        return user.getUser().getUserName();
    }
}
