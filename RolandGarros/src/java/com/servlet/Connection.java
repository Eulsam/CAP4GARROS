/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;

import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Phuong
 */
@WebServlet(name = "Connection", urlPatterns = {"/Connection"})
public class Connection extends HttpServlet {

    private static final long serialVersionUID = 1L;
     public Connection() {

        super();
     }
    private ServletConfig config;
 
    public void init(ServletConfig config)
    throws ServletException{
  // this.config=config;
   }
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try{
        
        String username=new String("");
        String password=new String("");
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rolandgarros","root","Capgemini");
        Statement st = con.createStatement();      
        String strQuery = "select * from organisateur WHERE username='"+ username + "' and password='" + password + "'";
        ResultSet rs = st.executeQuery(strQuery);
     out.print(rs);
        while (rs.next()){
        username=rs.getString("Nom");
        password=rs.getString("MotDePass");
        
        if(username.equals(request.getParameter("username")) && password.equals(request.getParameter("password"))){
        request.getSession().setAttribute("username", username);
        response.sendRedirect("general.html");
      
        }else{
            response.sendRedirect("Connection.jsp"); 
        }
        }
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
          

     }
     
}
