package uk.co.mo.app.mercury.domain.event;

/**
 * <p/>
 * User: amitm
 * Date: 24/06/11
 * Time: 12:35
 * <p/>
 * Change Log - Who : When : Comment
 */
public class VehicleEvent extends Event {


	private static final long serialVersionUID = 9159318695053430412L;

	@Override
    public void setType(EventType type) {
        if(!(type instanceof VehicleEventType)) throw new IllegalArgumentException("Wrong type set. Type must be "
                + VehicleEventType.class.getName());
        super.setType(type);
    }
}
