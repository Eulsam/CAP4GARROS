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
                <title>Joueurs</title>

                <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
                <link href="bootstrap/css/starter-template.css" rel="stylesheet">
                <link href="fontawesome/css/font-awesome.css" rel="stylesheet">

                <link href="css/style.css" rel="stylesheet">
                <title>Bienvenu</title>

    
        </head>
        <body>
        <div class="blog-masthead">
            <div class="container">
                <nav class="blog-nav">
                    <img id="logo" src ="photos/rg-logo-header.png" alt="logoRolandGarros" title ="logo de Roland Garros 2017"/>
                    <a class="blog-nav-item active" href="general.html">Home</a>
                    <a class="blog-nav-item" href="contact.html">Contact</a>
                  <form action="Connection" method="POST">
                    <input name="username" placeholder="Identifiant d'organisateur" type="text" id="UserUsername"/>
                    <input name="password" placeholder="Mot de passe" type="password" id="UserPassword"/>
                    <input id="Connexion" class="btn btn-success btn btn-success" type="submit" value="Connexion"/>
                  </form>
                </nav>
            </div>
        </div>
        <h1>Résultats</h1>                  
            
               <a href = "ResultatSimpleMessieurs.html"> <input class="btn btn-success btn btn-success" type="submit" value="Simple messieurs"/></a>
               <a href = "ResultatSimpleDames.html"><input class="btn btn-success btn btn-success" type="submit" value="Simple dames"/></a>
               <input  class="btn btn-success btn btn-success" type="submit" value="Double messieurs"/>
               <input  class="btn btn-success btn btn-success" type="submit" value="Double dames"/>
               <input  class="btn btn-success btn btn-success" type="submit" value="Double mixtes"/>
               <input  style = "width:250px;" class="btn btn-success btn btn-success" type="submit" value="Simples Juniors Garçons et Filles"/>
               <input  style = "width:250px;" class="btn btn-success btn btn-success" type="submit" value="Doubles Juniors Garçons et Filles"/> <br/><br/><br/>
               
               <img style="display: block;margin: auto; width: 70%;" src ="photos/YannickNoah.jpg" alt="photo_de_la_page_de_connection"/>

   
    

        <script src="jquery/jquery.js"></script>
        <script src="bootstrap/js/bootstrap.js"></script>
            
            
    </body>
</html>
