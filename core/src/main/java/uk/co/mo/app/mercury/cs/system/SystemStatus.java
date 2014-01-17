package uk.co.mo.app.mercury.cs.system;

import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <p/>
 * User: prabat
 * Date: 25-Feb-2011
 * Time: 09:13:20
 * <p/>
 * Change Log - Who : When : Comment
 */
public class SystemStatus {
    private static AtomicReference<ConnectionStatus> jmsConnectionStatus =
            new AtomicReference<ConnectionStatus>(ConnectionStatus.UNKNOWN);

    private static AtomicReference<ConnectionStatus> soaInterfaceDbStatus =
        new AtomicReference<ConnectionStatus>(ConnectionStatus.UNKNOWN);
    
    private static AtomicReference<Date> lastSuccessfulJobRunTime =
        new AtomicReference<Date>(null);

    public static ConnectionStatus getJmsConnectionStatus() {
        return jmsConnectionStatus.get();
    }

    public static void setJmsConnectionStatus(ConnectionStatus jmsConnectionStatus) {
        SystemStatus.jmsConnectionStatus.set(jmsConnectionStatus);
    }

	public static Object getSoaInterfaceDBStatus() {
		return soaInterfaceDbStatus.get();
	}
	
	public static void setSoaInterfaceDbStatus(ConnectionStatus soaInterfaceDbStatus) {
        SystemStatus.soaInterfaceDbStatus.set(soaInterfaceDbStatus);
    }

	public static void setLastSuccessfulJobRunTime(Date updateDate) {
		SystemStatus.lastSuccessfulJobRunTime.set(updateDate);
	}
	
	public static Date getLastSuccessfulJobRunTime(){
		return lastSuccessfulJobRunTime.get();
	}
	
}
