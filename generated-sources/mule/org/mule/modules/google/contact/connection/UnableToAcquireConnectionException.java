
package org.mule.modules.google.contact.connection;

import javax.annotation.Generated;


/**
 * Exception thrown when the connection needed for executing an
 *  operation is null.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.0-M4", date = "2014-03-26T12:34:14-05:00", comments = "Build M4.1875.17b58a3")
public class UnableToAcquireConnectionException
    extends Exception
{

    /**
     * Create a new exception
     */
    public UnableToAcquireConnectionException() {
    }

    /**
     * Create a new exception
     */
    public UnableToAcquireConnectionException(String message) {
        super(message);
    }

    /**
     * Create a new exception
     *
     * @param throwable Inner exception
     */
    public UnableToAcquireConnectionException(Throwable throwable) {
        super(throwable);
    }
}