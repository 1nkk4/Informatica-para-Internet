<%@ page import="java.sql.*" %>
<%@ page import="dao.Conexao" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%
String nome = request.getParameter("nome");
String cpf = request.getParameter("cpf");
String senha = request.getParameter("senha");

if (nome == null || cpf == null || senha == null ||
    nome.trim().isEmpty() ||
    cpf.trim().isEmpty() ||
    senha.trim().isEmpty()) {

    response.sendRedirect("registro.jsp?erro=campos");
    return;
}

String consulta = "SELECT cpf FROM usuario WHERE cpf = ?";
String insercao = "INSERT INTO usuario (nome, cpf, senha, tipo) VALUES (?, ?, ?, ?)";

try (
    Connection con = Conexao.conectar();
    PreparedStatement consultaStmt = con.prepareStatement(consulta)
) {
    consultaStmt.setString(1, cpf.trim());

    try (ResultSet rs = consultaStmt.executeQuery()) {
        if (rs.next()) {
            response.sendRedirect("registro.jsp?erro=usuarioexistente");
            return;
        }
    }

    try (PreparedStatement insercaoStmt = con.prepareStatement(insercao)) {
        insercaoStmt.setString(1, nome.trim());
        insercaoStmt.setString(2, cpf.trim());
        insercaoStmt.setString(3, senha);
        insercaoStmt.setString(4, "CLIENTE");

        insercaoStmt.executeUpdate();
    }

    response.sendRedirect("login.jsp");
    return;

} catch (SQLException erro) {
    erro.printStackTrace();
    response.sendRedirect("registro.jsp?erro=banco");
    return;
}
%>