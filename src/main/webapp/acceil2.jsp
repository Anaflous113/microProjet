<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Bonjour Monsieur
    <%
    String name = (String)request.getAttribute("CHAMP_NOM");
    out.println();
    %>
</p>
<ul>
    <li><a href="catalogue.jsp">consulter le catalogue</a></li>
    <li><a href="commandes.jsp">Suivre vos commandes </a></li>
     <li><a href="panier.jsp">visualiser votre panier</a></li>
  
</ul>
</body>
</html>