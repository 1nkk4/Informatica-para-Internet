<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Page</title>
    <link href="style.css" rel="stylesheet" type="text/css" media="all">
  </head>
  
  <%	
	String nome = (String) session.getAttribute("nome");
	
  if (nome != null) {
	    response.sendRedirect("dashboard.jsp");
	    return;
	} %>
  
  <body>
    <div class="container">
      <div class="header"><a href=  "index.jsp"><img class="image"  src="src/meimei.png" align="left"></a></div>
      
      <div class="menu"><a href="index.jsp">Ínicio</a><br><a href="rastreamento.jsp">Rastreamento</a><br><a href="sobrenos.jsp">Sobre Nós</a><br><a href="registro.jsp">Registro</a><br><a href="login.jsp">Login</a></div>
      
      <div class="content">
      
      </div>
      
      <div class="footer">MeiMeiFretes &reg; 2026</div>
  </div>
      

  </body>
</html>