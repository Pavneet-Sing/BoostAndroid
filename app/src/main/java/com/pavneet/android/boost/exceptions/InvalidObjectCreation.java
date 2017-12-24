package com.pavneet.android.boost.exceptions;

/**
 * Created by Pavneet_Singh on 12/18/17.
 */

final public class InvalidObjectCreation extends RuntimeException {

    public InvalidObjectCreation(String className) {
        super("Object of "+className+" class cannot be created");
    }
}