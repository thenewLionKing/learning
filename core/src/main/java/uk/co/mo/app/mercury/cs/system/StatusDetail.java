package uk.co.mo.app.mercury.cs.system;

import java.io.Serializable;
import java.util.Date;

/**
 * <p/>
 * User: prabat
 * Date: 15/12/11
 * Time: 14:36
 * <p/>
 * Change Log - Who : When : Comment
 */
public class StatusDetail implements Serializable {

    private static final long serialVersionUID = 1713949325765753305L;

    private ConnectionStatus connectionStatus;
    private Long count;
    private String comment;

    public ConnectionStatus getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(ConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
