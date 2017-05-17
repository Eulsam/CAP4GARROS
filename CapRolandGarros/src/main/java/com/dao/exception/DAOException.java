/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.exception;

/**
 *
 * @author etudiant
 */
public class DAOException extends RuntimeException {

    /**
     * Creates a new instance of <code>DAOException</code> without detail
     * message.
     */
    public DAOException(String message) {

        super(message);
    }

    /**
     * Constructs an instance of <code>DAOException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOException(Throwable cause) {
        super(cause);
    }
}
