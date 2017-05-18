/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Phuong
 */
public class Joueur extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         
         String nomJoueur = request.getParameter ("Nom");
         String prenomJoueur = request.getParameter ("Prenom");
         String nationaliteJoueur = request.getParameter ("Nationalite");
         MyDB db = new MyDB();
         Connection con = db.getCon();
         Statement st = con.createStatement();
         st.executeUpdate("INSERT INTO Personne(Nom,Prenom,Nationalite) " +
                            "VALUES ('" + nomJoueur + "', '" + prenomJoueur + "','" + nationaliteJoueur + "' )");

         out.println("Vous avez ajouté une nouvelle personne " );
        }catch (SQLException ex){
          Logger.getLogger(Joueur.class.getName()).log(Level.SEVERE, null, ex);
    }
        

    }
}