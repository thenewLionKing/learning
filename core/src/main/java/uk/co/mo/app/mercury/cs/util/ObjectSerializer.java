/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.util;

import java.io.*;

/**
 * Put your class comment here
 * <p/>
 * User: PrabaT
 * Date: 07-Feb-2010
 * <p/>
 * Change Log - Who : When : Comment
 */
public class ObjectSerializer {
    /**
     *  Converts a serializable object to its bytes.
     * @param o the object to serialize.
     * @return the serialized bytes.
     * @throws java.io.IOException
     */
    public static byte[] getSerializedObject(Object o) throws IOException {
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        ObjectOutputStream p = new ObjectOutputStream(ba);
        p.writeObject(o);
        p.close();
        return ba.toByteArray();
    }

    /**
     *  Converts a serialized objects bytes back into an object.
     * @param b the bytes.
     * @return the object.
     * @throws java.io.IOException
     * @throws ClassNotFoundException
     */
    public static Object getObject( byte[] b) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream( new ByteArrayInputStream(b));
        Object o = in.readObject();
        in.close();
        return o;
    }
}
