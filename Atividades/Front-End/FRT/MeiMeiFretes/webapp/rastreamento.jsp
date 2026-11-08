<%@ page import="dao.*" %>

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
	String cpf = (String) session.getAttribute("cpf");
	
	
	
	if (nome == null || cpf == null) {
	    response.sendRedirect("login.jsp?erro=naoLogado");
	    return;
	}
	%>  
  
  <body>
    <div class="container">
      <div class="header"><a href=  "index.jsp"><img class="image"  src="src/meimei.png" align="left"></a></div>
      
      <div class="menu"><a href="index.jsp">Ínicio</a><br><a href="rastreamento.jsp">Rastreamento</a><br><a href="sobrenos.jsp">Sobre Nós</a><br><a href="logout.jsp">Logout</a></div>
      
      <div class="content">
        <p>Ol�, <%=nome%> (<%=cpf%>) </p>
        <table>
	        <tr>
	        	<th>
	        	</th>
	        </tr>
        </table>
      </div>
      
      <div class="footer">MeiMeiFretes &reg; 2026</div>
  </div>
      

  </body>
</html>