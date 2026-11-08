<%@ page import="java.sql.*" %>
<%@ page import="dao.Conexao" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%
String cpf = request.getParameter("cpf");
String senha = request.getParameter("senha");

if (cpf == null || senha == null ||
    cpf.trim().isEmpty() || senha.trim().isEmpty()) {
    response.sendRedirect("login.jsp?erro=campos");
    return;
}

String sql = "SELECT nome, senha FROM usuario WHERE cpf = ?";

try (
    Connection con = Conexao.conectar();
    PreparedStatement stmt = con.prepareStatement(sql)
) {
    stmt.setString(1, cpf.trim());

    try (ResultSet rs = stmt.executeQuery()) {
        if (rs.next() && senha.equals(rs.getString("senha"))) {
        	session.setAttribute("nome", rs.getString("nome"));
        	response.sendRedirect("dashboard.jsp");
            return;
        }
    }

    response.sendRedirect("dashboard.jsp?erro=login");

} catch (SQLException erro) {
    erro.printStackTrace();
    response.sendRedirect("dashboard.jsp?erro=banco");
}
%>