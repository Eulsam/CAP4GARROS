/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Phuong
 */
public class Joueur extends HttpServlet {
    //private static final long serialVersionUID = 1L;

    public Joueur() {

        super();

        // TODO Auto-generated constructor stub

    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         String nomJoueur = request.getParameter ("Nom");
         String prenomJoueur = request.getParameter ("Prenom");
         String nationaliteJoueur = request.getParameter ("Nationalite");
         System.out.println(prenomJoueur);
         System.out.println(nomJoueur);
         MyDB db = new MyDB();
         Connection con = db.getCon();
         Statement st = con.createStatement();    
         st.executeUpdate("INSERT INTO personne(Nom,Prenom,Nationalite) " +
                            "VALUES ('" + nomJoueur + "', '" + prenomJoueur + "','" + nationaliteJoueur + "' )");

         out.println("Vous avez ajouté une nouvelle personne " );
        }catch (SQLException ex){
          Logger.getLogger(Joueur.class.getName()).log(Level.SEVERE, null, ex);
        }
      request.getRequestDispatcher("Joueur.html").forward(request, response);
        
    }
    
    public void resultSet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        MyDB db = new MyDB();
        Connection con = db.getCon();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM personne");
        HttpSession session = request.getSession(true);
        session.setAttribute("resultset", rs); 
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	System.out.println("GET");
        try {
            //processRequest(request, response);
            resultSet(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Joueur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	System.out.println("POST");
        processRequest(request, response);
        try {
            resultSet(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Joueur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     
    @Override
    public String getServletInfo() {
        return "Vous avez bien engistré les données du joueur dans la DB";
    }// </editor-fold>
    */
    
}
