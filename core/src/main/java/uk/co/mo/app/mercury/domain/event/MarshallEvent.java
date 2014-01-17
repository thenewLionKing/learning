package uk.co.mo.app.mercury.domain.event;

import java.io.IOException;
import java.io.Serializable;

/**
 * <p/>
 * User: prabat
 * Date: 13/06/11
 * Time: 16:22
 * <p/>
 * Change Log - Who : When : Comment
 */
public interface MarshallEvent {
    Serializable serialiseEvent(Serializable event) throws IOException;
}
