<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<%
request.setCharacterEncoding("UTF-8");

String nome = (String) session.getAttribute("nome");
String tipo = (String) session.getAttribute("tipo"); %>

<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro</title>
    <link href="style.css" rel="stylesheet" type="text/css" media="all">
  </head>
  <body>
    <div class="container">
      <div class="header"><a href=  "index.jsp"><img class="image"  src="src/meimei.png" align="left"></a></div>
      
        <div class="menu">
            <a href="index.jsp">Início</a><br>
            <a href="rastreamento.jsp">Rastreamento</a><br>
            <% if (nome == null) {%><a href="login.jsp">Login</a><br><a href="registro.jsp">Registrar</a><br><%}%>
            <a href="sobrenos.jsp">Sobre Nós</a><br>
            <% if (nome != null) {%><a href="logout.jsp">logout</a><%}%>
        </div>
              
        <div class="content">
        	<div class="login">
	            <form method="post"
	      			action="fazerRegistro.jsp"><br><br>
	      			
					<label for="cpf">CPF:</label><br>
					<input type="text" name="cpf" required>
					<br>
					
					<label for="nome">Nome:</label><br>
					<input type="text" name="nome" required>
					<br>
					
					<label for="senha">Senha:</label><br>
					<input type="password" name="senha" required>
					<br><br>
					
	                <input type="submit" value="Entrar">
	            </form>
            </div>
        </div>
      
      <div class="footer">MeiMeiFretes &reg; 2026</div>
  </div>
      

  </body>
</html>