<%@ page import="dao.*" %>
<%@ page import="modelo.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

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

                if (cidade == null || cidade.trim().isEmpty()
                        || estado == null || estado.trim().isEmpty()) {
                    erro = "Cidade e estado são obrigatórios.";
                } else {
                    LocalizacaoDAO dao = new LocalizacaoDAO();

                    dao.cadastrarLocalizacao(
                        new Localizacao(
                            cidade.trim(),
                            estado.trim(),
                            codigo != null ? codigo.trim() : ""
                        )
                    );

                    sucesso = "Localização cadastrada com sucesso.";
                }

            } else if ("encomenda".equals(tipoForm)) {
                String nomeEncomenda = request.getParameter("nome");

                if (nomeEncomenda == null || nomeEncomenda.trim().isEmpty()) {
                    erro = "O nome da encomenda é obrigatório.";
                } else {
                    Encomenda encomenda = new Encomenda();

                    encomenda.nome = nomeEncomenda.trim();
                    encomenda.descricao = request.getParameter("descricao");
                    encomenda.idOrigem =
                        Integer.parseInt(request.getParameter("id_origem"));
                    encomenda.idDestino =
                        Integer.parseInt(request.getParameter("id_destino"));
                    encomenda.idLocalizacaoAtual =
                        Integer.parseInt(request.getParameter("id_localizacao"));
                    encomenda.dataCriacao = request.getParameter("data");

                    EncomendaDAO dao = new EncomendaDAO();
                    dao.cadastrarEncomenda(encomenda);

                    sucesso = "Encomenda cadastrada com sucesso.";
                }

            } else if ("status".equals(tipoForm)) {
                int idEncomenda =
                    Integer.parseInt(request.getParameter("id_encomenda"));

                int idTipoStatus =
                    Integer.parseInt(request.getParameter("id_tipo_status"));

                String descricao = request.getParameter("descricao");
                String data = request.getParameter("data");

                StatusEncomendaDAO dao = new StatusEncomendaDAO();

                dao.cadastrarStatusInicial(
                    new StatusEncomenda(
                        idEncomenda,
                        idTipoStatus,
                        descricao,
                        data
                    )
                );

                sucesso = "Status cadastrado com sucesso.";

            } else if ("historico".equals(tipoForm)) {
                int idEncomenda =
                    Integer.parseInt(request.getParameter("id_encomenda"));

                int idTipoStatus =
                    Integer.parseInt(request.getParameter("id_tipo_status"));

                int idLocalizacao =
                    Integer.parseInt(request.getParameter("id_localizacao"));

                String descricao = request.getParameter("descricao");
                String data = request.getParameter("data");

                HistoricoDAO dao = new HistoricoDAO();

                dao.registrarHistorico(
                    new Historico(
                        idEncomenda,
                        idTipoStatus,
                        idLocalizacao,
                        descricao,
                        data
                    )
                );

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

    <title>Admin</title>

    <link href="style.css" rel="stylesheet" type="text/css">

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
    </style>
</head>

<body>
    <div class="container">

        <div class="header">
            <a href="index.jsp">
                <img class="image" src="src/meimei.png" align="left">
            </a>
        </div>

        <div class="menu">
            <a href="index.jsp">Início</a><br>
            <a href="rastreamento.jsp">Rastreamento</a><br>
            <a href="sobrenos.jsp">Sobre Nós</a><br>
            <% if (nome != null) {%><a href="logout.jsp">logout</a><%}%>
        </div>

        <div class="content">
            <p>
                Bem-vindo, <%= tipo %>
                <strong><%= nome %></strong>!
            </p>

            <% if (erro != null) { %>
                <p><%= erro %></p>
            <% } %>

            <% if (sucesso != null) { %>
                <p><%= sucesso %></p>
            <% } %>

            <div class="dashboard-grid">

                <!-- Cadastro de encomenda -->
                <form method="post" action="dashboard.jsp">
                    <input type="hidden" name="tipo_form" value="encomenda">

                    <h3>Cadastro de encomenda</h3>

                    <label>Nome:</label><br>
                    <input type="text" name="nome" required><br>

                    <label>Descrição:</label><br>
					<textarea name="descricao" rows="5" cols="33"></textarea><br>

                    <label>ID da origem:</label><br>
                    <input type="number" name="id_origem" required><br>

                    <label>ID do destino:</label><br>
                    <input type="number" name="id_destino" required><br>

                    <label>ID da localização:</label><br>
                    <input type="number" name="id_localizacao" required><br>

                    <label>Data:</label><br>
					<input type="date" id="date" name="data" required><br><br>
                    <input type="submit" value="Enviar">
                </form>

                <!-- Cadastro de localização -->
                <form method="post" action="dashboard.jsp">
                    <input type="hidden" name="tipo_form" value="localizacao">

                    <h3>Cadastro de localização</h3>

                    <label>Cidade:</label><br>
                    <input type="text" name="cidade" required><br>

                    <label>Estado:</label><br>
                    <input type="text" name="estado" required><br>

                    <label>Código:</label><br>
                    <input type="text" name="codigo"><br><br>

                    <input type="submit" value="Enviar">
                </form>

                <!-- Cadastro de status -->
                <form method="post" action="dashboard.jsp">
                    <input type="hidden" name="tipo_form" value="status">

                    <h3>Status da encomenda</h3>

                    <label>ID da encomenda:</label><br>
                    <input type="number" name="id_encomenda" required><br>

                    <label>ID do tipo de status:</label><br>
                    <input type="number" name="id_tipo_status" required><br>

                    <label>Descrição:</label><br>
                    <input type="text" name="descricao"><br>

                    <label>Data:</label><br>
					<input type="date" id="date" name="data" required><br><br>

                    <input type="submit" value="Enviar">
                </form>

                <!-- Cadastro de histórico -->
                <form method="post" action="dashboard.jsp">
                    <input type="hidden" name="tipo_form" value="historico">

                    <h3>Histórico da encomenda</h3>

                    <label>ID da encomenda:</label><br>
                    <input type="number" name="id_encomenda" required><br>

                    <label>ID do tipo de status:</label><br>
                    <input type="number" name="id_tipo_status" required><br>

                    <label>ID da localização:</label><br>
                    <input type="number" name="id_localizacao" required><br>

                    <label>Descrição:</label><br>
                    <input type="text" name="descricao"><br>

                    <label>Data:</label><br>
					<input type="date" id="date" name="data" required><br><br>

                    <input type="submit" value="Enviar">
                </form>

            </div>
        </div>

        <div class="footer">
            MeiMeiFretes &reg; 2026
        </div>

    </div>
</body>
</html>