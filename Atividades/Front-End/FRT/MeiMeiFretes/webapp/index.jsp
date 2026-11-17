<%@page contentType=“text/html” pageEncoding=“UTF-8” %>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MeiMeiFretes</title>
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
  
  <%	
	String nome = (String) session.getAttribute("nome");
	
  if (nome != null) {
	    response.sendRedirect("dashboard.jsp");
	    return;
	} %>
  
  <body>
    <div class="container">
      <div class="header"><a href=  "index.jsp"><img class="image"  src="src/meimei.png" align="left"></a></div>
      
        <div class="menu">
            <a href="index.jsp">Início</a><br>
            <a href="rastreamento.jsp">Rastreamento</a><br>
            <% if (nome == null) {%><a href="login.jsp">Login</a><br><a href="registro.jsp">Registrar</a><br><%}%>
            <a href="sobrenos.jsp">Sobre Nós</a><br>
        </div>
              
      <div class="content">
      <marquee  scrollamount="10"><h1>BEM VINDOS CLIENTES E fornecedores.. (buzina triste)</h1></marquee>
      	<div class="wrapper" align="center">
      		<div class="">
      		<h3>Bem vindo ao MeiMeiFretes!</h3>
      		<p>
      		Sua loja pode ser um Ponto de Coleta dos MeiMeiFretes Seja parceiro MeiMei! 
      		Transforme seu estabelecimento em um Ponto de Coleta: amplie as oportunidades do seu negócio oferecendo serviços de recebimento e entrega de encomendas do MeiMeiFretes.
      		</p>
      		
      		<br>
			<h4>MeiMax, a encomenda líder do meu bairro!</h4>
			
			<p>Procurando confiança, qualidade e agilidade no seu envio? Vá de MeiMax! O líder de entregas expressas no país. Os MeiMeis possuem um MeiMax, para cada necessidade. Pensou encomenda, pensou MeiMax!</p>
      		</div>
      		<div >
      		<img src="src/slideshow.gif" alt="Gif de slides engraçados do gatinho meimei" width="300" border="1px">
      		</div>
      	</div>
      </div>
      
      <div class="footer">MeiMeiFretes &reg; 2026</div>
  </div>
      

  </body>
</html>
