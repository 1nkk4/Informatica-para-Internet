<%@ page import="java.sql.*" %>
<%@ page import="dao.Conexao" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%
String cpf = request.getParameter("cpf");
String senha = request.getParameter("senha");

if (cpf == null || senha == null || // testa se os campos estão preenchidos
    cpf.trim().isEmpty() || senha.trim().isEmpty()) {
    response.sendRedirect("login.jsp?erro=campos");
    return;
}

String sql = "SELECT nome, senha, tipo FROM usuario WHERE cpf = ?"; // bagulho pra preparar para puxar dados

try ( 
    Connection con = Conexao.conectar(); // puxar conexão (para dados)
    PreparedStatement stmt = con.prepareStatement(sql) // puxar dados 2
) {
    stmt.setString(1, cpf.trim()); // puxar cpf para pegar dados

    try (ResultSet rs = stmt.executeQuery()) { // rodar o ato de puxar dados
        if (rs.next() && senha.equals(rs.getString("senha"))) { // ver se os dados estão corretos
        	
        	session.setAttribute("nome", rs.getString("nome")); 
            session.setAttribute("cpf", cpf.trim());
            session.setAttribute("tipo", rs.getString("tipo"));
            
        	response.sendRedirect("dashboard.jsp"); 
            return;
        }
    }

    response.sendRedirect("login.jsp?erro=login"); 

} catch (SQLException erro) {
    erro.printStackTrace();
    response.sendRedirect("login.jsp?erro=banco"); 
}
%>