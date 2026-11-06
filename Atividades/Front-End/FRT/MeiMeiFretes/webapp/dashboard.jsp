<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Page</title>
    <link href="style.css" rel="stylesheet" type="text/css" media="all">
  </head>
  <body>
    <div class="container">
      <div class="header"><a href=  "/"><img class="image"  src="src/meimei.png" align="left"></a></div>
      
      <div class="menu"><a href="/">Inicio</a><br><a href="rastreamento">Rastreamento</a><br><a href="login">Login/Registro</a><br><a href="sobrenos">Sobre Nós</a></div>
      
      <div class="content">
        <div class="login">
			<form method="post" action="login.jsp">
			  <label for="cpf">CPF:</label><br>
			  <input type="text" id="cpf" name="cpf" required><br>
			
			  <label for="senha">Senha:</label><br>
			  <input type="password" id="senha" name="senha" required><br><br>
			
			  <input type="submit" value="Entrar">
			</form>

        </div>
      </div>
      
      <div class="footer">MeiMeiFretes &reg; 2026</div>
  </div>
      

  </body>
</html>