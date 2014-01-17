/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.audit;

import java.util.ArrayList;
import java.util.List;

/**
 * <p/>
 * User: PrabaT
 * Date: 29-Apr-2010
 * Time: 18:53:27
 * <p/>
 * Change Log - Who : When : Comment
 */
public class SystemAudit {

    private static class ThreadLocalUserAudit extends ThreadLocal {
        @Override
        protected Object initialValue() {
            return new ArrayList<String>(0);
        }

        public void addLog(String message) {
            ((List) super.get()).add(message);
        }

        public List<String> getLogs() {
            return (List<String>) super.get();
        }

        public void cleanLogs() {
            ((List<String>) super.get()).clear();
        }
    }

    private static ThreadLocalUserAudit user = new ThreadLocalUserAudit();

    public static void addUserTrail(String message) {
        user.addLog(message);
    }

    public static String getUserTrailAndClean() {
        StringBuffer buf = new StringBuffer();
        for(String msg : user.getLogs()){
            buf.append(msg).append("\n");
        }
        user.cleanLogs();
        return buf.toString();
    }
}
