/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Phuong
 */
public class MyDB {
    Connection con;
    public Connection getCon(){
      try{
          Class.forName("com.mysql.jdbc.Driver");
          DriverManager.getConnection("jdbc:mysql://localhost:3306/rolandgarros","root","Capgemini");
      }catch (ClassNotFoundException | SQLException ex){
          Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
      }
        return con;
    }
}
