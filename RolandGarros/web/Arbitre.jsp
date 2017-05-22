<%-- 
    Document   : Joueur.jsp
    Created on : 19 mai 2017, 11:49:43
    Author     :  Romain et Sam 
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.servlet.MyDB"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="fr">

    <head>
        <meta charset="utf-8">
        <title>Arbitres</title>

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
        <h1>Enregistrement des arbitres</h1>
        <div class="Arbitre">


            <label style = "width:175px">Prénom : </label>
            <input name="Prenom" placeholder="Prénom" />

            <label style = "width:175px">Nom :</label>
            <input name="Nom" class="deroulant" placeholder="Nom" />

           
            <input id="Connexion" class="btn btn-success btn btn-success" type="submit" value="Enregistrer"/> 

        </div>

        <div class="formulaire">
            <table>

                <thead>
                    <tr>
                        <th>Prénom</th>
                        <th>Nom</th>
                    </tr>
                </thead>

                <tbody>
                    <%MyDB db = new MyDB();
                        Connection con = db.getCon();
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("SELECT prenom, nom,nationalite FROM personne WHERE nationalite = NULL");
                        while (rs.next()) {%>                

                    <tr>
                        <%--<td><%= rs.getInt("Id")%></td>--%>
                        <td><%= rs.getString("Nom")%></td>
                        <td><%= rs.getString("Prenom")%></td>

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
