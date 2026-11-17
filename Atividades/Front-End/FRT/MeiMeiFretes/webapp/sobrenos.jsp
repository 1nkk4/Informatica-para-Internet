<%@page contentType=“text/html” pageEncoding=“UTF-8” %>

<%
request.setCharacterEncoding("UTF-8");

String nome = (String) session.getAttribute("nome");
String tipo = (String) session.getAttribute("tipo"); %>

<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sobre Nós!</title>
    <link href="style.css" rel="stylesheet" type="text/css" media="all">
    
        <style>
    
    .wrapper {
    	display: grid;
    	grid-template-columns: repeat(2, 1fr);
    	padding: 10px;
    	  align-content: center;
    }
    
    </style>
    
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
      
        <div class="wrapper" align="center">
        	<div>
        	<h3>XxT0L3xX</h3>
        	<p>Bom dia! Eu sou XxT0L3xX, fui organizador do site de review de jogos MegaFlowGames, mas, com a alta do uso de IA em jogos, a marca teve uma queda de capital e acabou em falência. Entrei para a empresa de Correios e Telégrafos local, MeiMeifretes, para utilizar minhas habilidades gamers em programação em um novo grande projeto!</p>

        	</div>
        	<div>
        	<h3>mei_xPrime</h3>
          <p>Bom dia! Eu sou mei_xPrime, fui um dos olaboradores do site de review de jogos MegaFlowGames, nós falimos feio por conta das inteligências artificiais. Me chamaram pra uma empresa de Correios e Telégrafos bem interessante, MeiMeifretes, para explorar minhas habilidades medíocres em programação em um novo projeto.</p>

        	</div>
        	
        </div>
        <div align="center">
        <img src="src/Jeanbebe.webp" width="150" alt="imagem de alien bebê fofinho">
        </div>
      </div>
      
      <div class="footer">MeiMeiFretes &reg; 2026</div>
  </div>
      

  </body>
</html>
