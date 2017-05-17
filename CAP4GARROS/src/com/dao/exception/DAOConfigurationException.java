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
public class DAOConfigurationException extends Exception {

    /**
     * Creates a new instance of <code>CustomException</code> without detail
     * message.
     */
    public DAOConfigurationException() {
    }

    /**
     * Constructs an instance of <code>CustomException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public DAOConfigurationException(String msg) {
        super(msg);
    }
}
