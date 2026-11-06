<%@ page import="java.sql.*" %>
<%@ page import="dao.Conexao" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%
String cpf = request.getParameter("cpf");
String senha = request.getParameter("senha");

if (cpf == null || senha == null ||
    cpf.isEmpty() || senha.isEmpty()) {

    response.sendRedirect("");
    return;
}

String sql = "SELECT nome, senha FROM usuario WHERE cpf = ?";

try (Connection con = Conexao.conectar();
    PreparedStatement stmt = con.prepareStatement(sql)) {

    stmt.setString(1, cpf);	

    try (ResultSet rs = stmt.executeQuery()) {

        if (rs.next() && senha.equals(rs.getString("senha"))) {
            session.setAttribute("nome", rs.getString("nome"));
            response.sendRedirect("dashboard.jsp");
        } 
        
        else {
            response.sendRedirect("legal");
        }
    }

} catch (SQLException erro) {
    erro.printStackTrace();
    response.sendRedirect("");
}
%>