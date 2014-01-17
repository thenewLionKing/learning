/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.util;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;

import java.util.Date;

/**
 * A Date helper class that uses JODA TIME 
 *
 * <p/>
 * User: PrabaT
 * Date: 18-Mar-2010
 * Time: 14:16:40
 * <p/>
 * Change Log - Who : When : Comment
 */
public class DateUtils {

    /**
     * Obtains today's date.
     *
     * @return today's date.
     */
    public static Date getToday() {

        DateMidnight dm = new DateMidnight();
        return dm.toDate();
    }

    /**
     * Helper method that zeros the time related fields of a date.
     *
     * @param d  the date to zero the time of.
     * @return midnight time for the given date
     */
    public static Date zeroTime(Date d) {
        DateMidnight dm = new DateMidnight(d);
        return dm.toDate();
    }

    public static Date moveDateByYear(Date date, int yrs) {
        DateTime dt = new DateTime(date);
        return dt.plusYears(yrs).toDate();
    }

    public static Date moveDateByDays(Date date, int days) {
        DateTime dt = new DateTime(date);
        return dt.plusDays(days).toDate();
    }
}
