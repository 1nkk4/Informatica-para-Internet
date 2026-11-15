<%@ page import="dao.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="modelo.*" %>
<%
    request.setCharacterEncoding("UTF-8");
    String nome = (String) session.getAttribute("nome");
    String tipo = (String) session.getAttribute("tipo");

    if (nome == null) {
        response.sendRedirect("index.jsp");
        return;
    }

    String erro = null;
    String sucesso = null;

    if ("POST".equalsIgnoreCase(request.getMethod())) {
        String tipoForm = request.getParameter("tipo_form");

        try {
            if ("localizacao".equals(tipoForm)) {
                String cidade = request.getParameter("cidade");
                String estado = request.getParameter("estado");
                String codigo = request.getParameter("codigo");

                if (cidade == null || cidade.trim().isEmpty() || estado == null || estado.trim().isEmpty()) {
                    erro = "Cidade e estado são obrigatórios.";
                } else {
                    LocalizacaoDAO dao = new LocalizacaoDAO();
                    dao.cadastrarLocalizacao(new Localizacao(cidade.trim(), estado.trim(), codigo != null ? codigo.trim() : ""));
                    sucesso = "Localização cadastrada com sucesso.";
                }
            } else if ("encomenda".equals(tipoForm)) {
                String nomeEncomenda = request.getParameter("nome");
                if (nomeEncomenda == null || nomeEncomenda.trim().isEmpty()) {
                    erro = "O nome da encomenda é obrigatório.";
                } else {
                    Encomenda e = new Encomenda();
                    e.nome = nomeEncomenda.trim();
                    e.descricao = request.getParameter("descricao");
                    e.idFornecedor = Integer.parseInt(request.getParameter("id_fornecedor"));
                    e.idOrigem = Integer.parseInt(request.getParameter("id_origem"));
                    e.idDestino = Integer.parseInt(request.getParameter("id_destino"));
                    e.idLocalizacaoAtual = Integer.parseInt(request.getParameter("id_localizacao"));
                    e.dataCriacao = request.getParameter("data");

                    EncomendaDAO dao = new EncomendaDAO();
                    dao.cadastrarEncomenda(e);
                    sucesso = "Encomenda cadastrada com sucesso.";
                }
            } else if ("status".equals(tipoForm)) {
                int idEncomenda = Integer.parseInt(request.getParameter("id_encomenda"));
                int idTipoStatus = Integer.parseInt(request.getParameter("id_tipo_status"));
                String descricao = request.getParameter("descricao");
                String data = request.getParameter("data");

                StatusEncomendaDAO dao = new StatusEncomendaDAO();
                dao.cadastrarStatusInicial(new StatusEncomenda(idEncomenda, idTipoStatus, descricao, data));
                sucesso = "Status da encomenda cadastrado com sucesso.";
            } else if ("historico".equals(tipoForm)) {
                int idEncomenda = Integer.parseInt(request.getParameter("id_encomenda"));
                int idTipoStatus = Integer.parseInt(request.getParameter("id_tipo_status"));
                int idLocalizacao = Integer.parseInt(request.getParameter("id_localizacao"));
                String descricao = request.getParameter("descricao");
                String data = request.getParameter("data");

                HistoricoDAO dao = new HistoricoDAO();
                dao.registrarHistorico(new Historico(idEncomenda, idTipoStatus, idLocalizacao, descricao, data));
                sucesso = "Histórico registrado com sucesso.";
            }
        } catch (NumberFormatException e) {
            erro = "Os campos numéricos precisam ser válidos.";
        } catch (Exception e) {
            erro = e.getMessage();
        }
    }
%>

<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Page</title>
    <link href="style.css" rel="stylesheet" type="text/css" media="all">
    <style>
		.dashboard-grid {
		  display: grid;
		  grid-template-columns: repeat(2, 1fr);
		  gap: 20px;
		}
		
		.dashboard-grid form {
		  padding: 15px;
		  border: 1px solid;
		}
		
		}
    </style>
  </head>
  <body>
    <div class="container">
      <div class="header"><a href="index.jsp"><img class="image" src="src/meimei.png" align="left"></a></div>

      <div class="menu"><a href="index.jsp">Ínicio</a><br><a href="rastreamento.jsp">Rastreamento</a><br><a href="login.jsp">Login/Registro</a><br><a href="sobrenos.jsp">Sobre Nós</a></div>

      <div class="content">
        <p>Bem-vindo, <%=tipo%> <strong><%=nome%></strong>!</p>

        <% if (erro != null) { %>
            <p><%= erro %></p>
        <% } %>

        <% if (sucesso != null) { %>
            <p><%= sucesso %></p>
        <% } %>

        <div class="dashboard-grid">
            <form method="post" action="">
                <input type="hidden" name="tipo_form" value="">
                <h3>Cadastro de encomenda</h3>
                <label for="nome">Nome:</label><br>
                <input type="text" name="nome" required><br>

                <label for="descricao">Descrição:</label><br>
                <input type="text" name="descricao"><br>

                <label for="id_fornecedor">Id do Fornecedor:</label><br>
                <input type="text" name="id_fornecedor" required><br>

                <label for="id_origem">Id da origem:</label><br>
                <input type="text" name="id_origem" required><br>

                <label for="id_destino">Id do destino:</label><br>
                <input type="text" name="id_destino" required><br>

                <label for="id_localizacao">Id da localização:</label><br>
                <input type="text" name="id_localizacao" required><br>

                <label for="data">Data:</label><br>
                <input type="text" name="data" required><br><br>

                <input type="submit" value="Enviar">
                <br>
            </form>

            <form method="post" action="">
                <input type="hidden" name="tipo_form" value="">
                <h3>Cadastro de localização</h3>
                <label for="cidade">Cidade:</label><br>
                <input type="text" name="cidade"><br>

                <label for="estado">Estado:</label><br>
                <input type="text" name="estado"><br>

                <label for="codigo">Código:</label><br>
                <input type="text" name="codigo"><br><br>

                <input type="submit" value="Enviar">
                <br>
            </form>

            <form method="post" action="">
                <input type="hidden" name="tipo_form" value="">
                <h3>Status da encomenda</h3>
                <label for="id_encomenda">Id da encomenda:</label><br>
                <input type="text" name="id_encomenda" required><br>

                <label for="id_tipo_status">Id do tipo de status:</label><br>
                <input type="text" name="id_tipo_status" required><br>

                <label for="descricao">Descrição:</label><br>
                <input type="text" name="descricao"><br>

                <label for="data">Data:</label><br>
                <input type="text" name="data" required><br><br>

                <input type="submit" value="Enviar">
                <br>
            </form>

            <form method="post" action="">
                <input type="hidden" name="tipo_form" value="">
                <h3>Histórico da encomenda</h3>
                <label for="id_encomenda">Id da encomenda:</label><br>
                <input type="text" name="id_encomenda" required><br>

                <label for="id_tipo_status">Id do tipo de status:</label><br>
                <input type="text" name="id_tipo_status" required><br>

                <label for="id_localizacao">Id da localização:</label><br>
                <input type="text" name="id_localizacao" required><br>

                <label for="descricao">Descrição:</label><br>
                <input type="text" name="descricao"><br>

                <label for="data">Data:</label><br>
                <input type="text" name="data" required><br><br>

                <input type="submit" value="Enviar">
                <br>
            </form>
        </div>
      </div>

      <div class="footer">MeiMeiFretes &reg; 2026</div>
    </div>
  </body>
</html>