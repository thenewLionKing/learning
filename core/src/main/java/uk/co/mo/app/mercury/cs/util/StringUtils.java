/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.util;

/**
 * Put your class comment here
 * <p/>
 * User: PrabaT
 * Date: 21-Jan-2010
 * Time: 17:23:19
 * <p/>
 * Change Log - Who : When : Comment
 */
public class StringUtils {

    public static String toFirstUp(String str) {
        Character firstChar = str.toCharArray()[0];
        return Character.toUpperCase(firstChar) + str.substring(1); 
    }
    public static String extractInitials(String str){
    	if(str==null) return str;
    	String[] words = str.split("\\s");
    	StringBuilder sb = new StringBuilder();
    	for(String word : words){
    		if(word.isEmpty()) continue;
    		sb.append(word.charAt(0)+ " ");
    	}
    	return sb.toString().toUpperCase();
    }

    /**
     * Tests if a string contains no whitespace characters or is not
     * <code>null<code>.
     *
     * @param str string to test.
     *
     * @return  whether the string contains no whitespace characters or is not
     *          <code>null</code>.
     */
    public static final boolean isEmpty(String str) {
        boolean empty = true;

        if(str != null) {
           if(str.trim().length() != 0) {
              empty = false;
           }
        }

        return empty;
    }

    public static void main(String[] args){
    	String str = "bob  Remote    Customer  Service Test";
    	System.out.println(extractInitials(str));
    }
}
