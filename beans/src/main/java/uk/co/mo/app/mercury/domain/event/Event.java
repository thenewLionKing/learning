package uk.co.mo.app.mercury.domain.event;

import java.io.Serializable;

/**
 * <p/>
 * User: prabat
 * Date: 13/06/11
 * Time: 12:20
 * <p/>
 * Change Log - Who : When : Comment
 */
public class Event implements Serializable {

	private static final long serialVersionUID = 7954412288256284850L;

	private EventKey key;

    private EventType type;

    public Event() {
    }

    public EventKey getKey() {
        return key;
    }

    public void setKey(EventKey key) {
        this.key = key;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }
}
