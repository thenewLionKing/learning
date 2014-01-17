package uk.co.mo.app.mercury.domain.scanning.ejb;

import javax.ejb.Remote;

import uk.co.mo.app.mercury.domain.scanning.service.ScanningService;

/**
 * <p/>
 * User: amitm
 * Date: 24-May-2011
 * Time: 14:14:12
 * <p/>
 * Change Log - Who : When : Comment
 */
@Remote
public interface ScanningServiceSessionBeanRemote extends ScanningService{
}
