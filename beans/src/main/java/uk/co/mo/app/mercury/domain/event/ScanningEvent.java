package uk.co.mo.app.mercury.domain.event;

/**
 * <p/>
 * User: prabat
 * Date: 24/06/11
 * Time: 12:35
 * <p/>
 * Change Log - Who : When : Comment
 */
public class ScanningEvent extends Event {

	private static final long serialVersionUID = 6740032983122363397L;

	@Override
    public void setType(EventType type) {
        if(!(type instanceof ScanningEventType)) throw new IllegalArgumentException("Wrong type set. Type must be "
                + ScanningEventType.class.getName());
        super.setType(type);
    }
}
