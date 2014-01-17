package uk.co.mo.app.mercury.domain.vehicle.ejb;

import javax.ejb.Remote;

import uk.co.mo.app.mercury.domain.vehicle.service.AdaptFitterService;

/**
 * <p/>
 * User: amitm
 * Date: 24-May-2011
 * Time: 14:14:12
 * <p/>
 * Change Log - Who : When : Comment
 */
@Remote
public interface AdaptFitterServiceSessionBeanRemote extends AdaptFitterService {
}
