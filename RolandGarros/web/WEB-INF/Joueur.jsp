<%-- 
    Document   : Joueur.jsp
    Created on : 19 mai 2017, 11:49:43
    Author     : Phuong
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        
        <c:forEach var="personne" items="${ personnes }">
            <c:out value="${ personne.Nom }" /> 
            <c:out value="${ personne.Prenom }" />
            <c:out value="${ personne.Nationalite }" /> 
        </c:forEach>
        <%@include file= "Joueur.html" %>
         <%
         ResultSet rs = st.executeQuery("INSERT INTO personne(Nom,Prenom,Nationalite) " +
                            "VALUES ('" + nomJoueur + "', '" + prenomJoueur + "','" + nationaliteJoueur + "' )";
         int cntr = 0;
         while(rs.next())
         {
         cntr++; %>
                <tr>
                    <td><%= rs.getString(1)%></td>
                    <td><%= rs.getString(2)%></td>
                    <td><%= rs.getString(3)%></td>
                    
                </tr>
                <% } %>
    </body>
</html>
