package uk.co.mo.app.mercury.domain.event;

/**
 * <p/>
 * User: prabat
 * Date: 24/06/11
 * Time: 12:32
 * <p/>
 * Change Log - Who : When : Comment
 */
public class AgreementEvent extends Event {

	private static final long serialVersionUID = -3774365892725085882L;

	@Override
    public void setType(EventType type) {
        if(!(type instanceof AgreementEventType)) throw new IllegalArgumentException("Wrong type set. Type must be " + AgreementEventType.class.getName());
        super.setType(type);
    }
}
