<%@ page import="dao.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="modelo.Encomenda, dao.EncomendaDAO, util.Texto" %>
<%
    /*
     * Esta página NÃO mostra nada quando dá certo: ela monta um objeto Produto
     * com os dados do formulário, pede ao DAO para inserir no banco e
     * redireciona o usuário para a lista (index.jsp).
     * Só aparece algo na tela se acontecer um erro.
     */

    // Garante que acentos digitados no formulário sejam lidos corretamente
    request.setCharacterEncoding("UTF-8");
    String nome = (String) session.getAttribute("nome");
    String tipo = (String) session.getAttribute("tipo");
    
    if (nome == null) {
	    response.sendRedirect("index.jsp");
	    return;
	}

    String erro = null;
    try {
        // 1) Cria um objeto Produto e preenche com os dados do formulário
    	Encomenda e = new Encomenda();
        
        e.nome = request.getParameter("nome");
        e.descricao = request.getParameter("descricao");
        e.idFornecedor = Integer.parseInt(request.getParameter("id_fornecedor"));
        e.idOrigem = Integer.parseInt(request.getParameter("id_origem"));
        e.idDestino = Integer.parseInt(request.getParameter("id_destino"));
        e.idLocalizacaoAtual = Integer.parseInt(request.getParameter("id_localizacao"));
        e.dataCriacao = request.getParameter("data");


        // 2) O próprio produto confere se os dados são válidos
        erro = null;

        // 3) Se está tudo certo, o DAO grava no banco
        if (erro == null) {
            e.nome = e.nome.trim();
            EncomendaDAO dao = new EncomendaDAO();
            dao.cadastrarEncomenda(e);
        }
    } catch (NumberFormatException e) {
        erro = "Fornecedor, preço e quantidade precisam ser números válidos.";
    } catch (Exception e) {
        erro = e.getMessage();
    }

    // 4) Deu certo? Volta para a lista e encerra esta página.
    if (erro == null) {
        response.sendRedirect("index.jsp?msg=incluido");
        return;
    }
    

%>

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
      <div class="header"><a href=  "index.jsp"><img class="image"  src="src/meimei.png" align="left"></a></div>
      
      <div class="menu"><a href="index.jsp">Ínicio</a><br><a href="rastreamento.jsp">Rastreamento</a><br><a href="login.jsp">Login/Registro</a><br><a href="sobrenos.jsp">Sobre Nós</a></div>
      
      <div class="content">
        <p>Bem-vindo, <%=tipo%> <strong><%=nome%></strong>! </p>
        <form method="post" action=""><br><br>
	       	<label for="nome">Nome:</label><br>
			<input type="text" name="nome" required>
			<br>
							
			<label for="descricao">Descrição:</label><br>
			<input type="text" name="descricao">
			<br>
			
			<label for="id_fornecedor">Id do Fornecedor:</label><br>
			<input type="text" name="id_fornecedor" required>
			<br>
			
			<label for="id_origem">Id da origem:</label><br>
			<input type="text" name="id_origem" required>
			<br>
			
			<label for="id_localizacao">Id da localização:</label><br>
			<input type="text" name="id_localizacao" required>
			<br>
			
			<label for="data">Data:</label><br>
			<input type="text" name="data" required>
			<br>
			
			<input type="submit" value="Enviar">
			<br>
		</form>
      </div>					

						

					
      
      <div class="footer">MeiMeiFretes &reg; 2026</div>
  </div>
      

  </body>
</html>