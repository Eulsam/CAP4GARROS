/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.exception;

/**
 *
 * @author Phuong
 */
public class DAOException extends RuntimeException {

    
    
    public DAOException( String message ) {

        super( message );

    }


    public DAOException( String message, Throwable cause ) {

        super( message, cause );

    }


    public DAOException( Throwable cause ) {

        super( cause );

    }

}

