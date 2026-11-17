<%@page contentType=“text/html” pageEncoding=“UTF-8” %>
<%@ page import="dao.*" %>
<%@ page import="modelo.*" %>
<%@ page import="java.util.*" %>


<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rastreio</title>
    <link href="style.css" rel="stylesheet" type="text/css" media="all">
  </head>

  <%
	request.setCharacterEncoding("UTF-8");
  	StatusEncomenda statusAtual = null;
    String nome = (String) session.getAttribute("nome");
    String cpf = (String) session.getAttribute("cpf");

    if (nome == null || cpf == null) {
        response.sendRedirect("login.jsp?erro=naoLogado");
        return;
    }

    String codigoRastreamento = request.getParameter("codigo");
    Encomenda encomenda = null;
    List<Historico> historicos = new ArrayList<>();

    if (codigoRastreamento != null && !codigoRastreamento.trim().isEmpty()) {
        try {
            long codigo = Long.parseLong(codigoRastreamento.trim());
            EncomendaDAO encomendaDAO = new EncomendaDAO();
            encomenda = encomendaDAO.buscarPorCodigoRastreamento(codigo);

            if (encomenda != null) {
            	StatusEncomendaDAO statusDAO = new StatusEncomendaDAO();
            	statusAtual = statusDAO.buscarStatusAtual(encomenda.getIdEncomenda());
            	
                HistoricoDAO historicoDAO = new HistoricoDAO();
                historicos = historicoDAO.listarHistorico(encomenda.getIdEncomenda());
            }
        } catch (NumberFormatException e) {
            encomenda = null;
            historicos = new ArrayList<>();
        }
    }
  %>

  <body>
    <div class="container">
      <div class="header"><a href="index.jsp"><img class="image" src="src/meimei.png" align="left"></a></div>

        <div class="menu">
            <a href="index.jsp">Início</a><br>
            <a href="rastreamento.jsp">Rastreamento</a><br>
            <a href="sobrenos.jsp">Sobre Nós</a><br>
            <% if (nome != null) {%><a href="logout.jsp">logout</a><%}%>
        </div>

      <div class="content">
        <p>Olá, <%=nome%> (<%=cpf%>)</p>

        <form method="get" action="rastreamento.jsp">
            <label for="codigo">Código de rastreio:</label><br>
            <input type="text" id="codigo" name="codigo" value="<%= codigoRastreamento != null ? codigoRastreamento : "" %>"><br><br>
            <input type="submit" value="Consultar">
        </form>

        <% if (codigoRastreamento != null && !codigoRastreamento.trim().isEmpty()) { %>
            <% if (encomenda == null) { %>
                <p>Encomenda não encontrada.</p>
            <% } else { %>
                <h3>Encomenda: <%= encomenda.getNome() %></h3>
                <p><strong>Código:</strong> <%= encomenda.getCodigoRastreamento() %></p>
			    <p><strong>Descrição:</strong> <%= encomenda.getDescricao() %></p>
			
			<% if (statusAtual != null) { %>
			    <p>
			        <strong>Status atual:</strong>
			        <%= statusAtual.getIdTipoStatus() %>
			    </p>
			<% } else { %>
			    <p>
			        <strong>Status atual:</strong>
			        Ainda não cadastrado.
			    </p>
			<% } %>
			
			<h3>Histórico</h3>

                <table border="1" style="width: 100%; margin-top: 20px;">
                    <tr>
                        <th>Data</th>
                        <th>Status</th>
                        <th>Localização</th>
                        <th>Descrição</th>
                    </tr>

                    <% if (historicos == null || historicos.isEmpty()) { %>
                        <tr>
                            <td colspan="4">Nenhum histórico encontrado.</td>
                        </tr>
                    <% } else { %>
                        <% for (Historico h : historicos) { %>
                            <tr>
                                <td><%= h.getData() %></td>
                                <td><%= h.getIdTipoStatus() %></td>
                                <td><%= h.getIdLocalizacao() %></td>
                                <td><%= h.getDescricao() %></td>
                            </tr>
                        <% } %>
                    <% } %>
                </table>
            <% } %>
        <% } %>
      </div>

      <div class="footer">MeiMeiFretes &reg; 2026</div>
    </div>
  </body>
</html>
