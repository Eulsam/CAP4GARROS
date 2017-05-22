<%-- 
    Document   : Joueur.jsp
    Created on : 19 mai 2017, 11:49:43
    Author     : Phuong
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.servlet.MyDB"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<!DOCTYPE html>
<html>


    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Courts</title>

        <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
        <link href="bootstrap/css/starter-template.css" rel="stylesheet">
        <link href="fontawesome/css/font-awesome.css" rel="stylesheet">

        <link href="css/style.css" rel="stylesheet">
    </head>
    <body>
        <div class="blog-masthead">
            <div class="container">
                <nav class="blog-nav">
                    <img id="logo" src ="photos/rg-logo-header.png" alt="logoRolandGarros" title ="logo de Roland Garros 2017"/>
                    <a class="blog-nav-item active" href="general.html">Home</a>
                    <a class="blog-nav-item" href="contact.html">Contact</a>
                    <input  class="btn btn-success btn btn-success" type="submit" value="Déconnexion"/>

                </nav>
            </div>
        </div>

        <h1>Enregistrement des courts</h1>


        <form action="Courts" method="POST">
            <label>Nom : </label>
            <input class="Courts" name="Numero" placeholder="Numeros" /> 
            <input class="Courts" name="Nom" placeholder="Nom" /> 
            <input id="Connexion" class="btn btn-success btn btn-success" type="submit" value="Enregistrer"/> 
        </form>

       

        <div class="formulaire">
            <table>
                <thead>
                    <tr>
                        <th>Numéros</th>
                        <th>Courts existants</th>
                    </tr>
                </thead>

                <tbody>
                    <%MyDB db = new MyDB();
                        Connection con = db.getCon();
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM court");
                        while (rs.next()) {%>                

                    <tr>
                        <%--<td><%= rs.getInt("Id")%></td>--%>
                        <td><%= rs.getString("Numero")%></td>
                        <td><%= rs.getString("Nom")%></td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>

        <script src="jquery/jquery.js"></script>
        <script src="bootstrap/js/bootstrap.js"></script>
        <script src="js/app.js"></script>
    </body>
</html>