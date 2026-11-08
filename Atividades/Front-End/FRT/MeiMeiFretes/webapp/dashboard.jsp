<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
String nome = (String) session.getAttribute("nome");

if (nome == null) {
    response.sendRedirect("login.jsp?erro=naoLogado");
    return;
}
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/style.css">
</head>
<body>

<div class="container">
    <header>
        <h1>MeiMeiFretes</h1>
        <p>Bem-vindo, <strong><%= nome %></strong>!</p>
    </header>

    <nav>
        <a href="${pageContext.request.contextPath}/dashboard.jsp">
            Início
        </a>
        <a href="${pageContext.request.contextPath}/rastreamento.jsp">
            Rastrear encomenda
        </a>
        <a href="${pageContext.request.contextPath}/perfil.jsp">
            Meu perfil
        </a>
        <a href="${pageContext.request.contextPath}/logout.jsp">
            Sair
        </a>
    </nav>

    <main>
        <h2>Painel principal</h2>
        <p>Escolha uma opção no menu acima.</p>
    </main>
</div>

</body>
</html>