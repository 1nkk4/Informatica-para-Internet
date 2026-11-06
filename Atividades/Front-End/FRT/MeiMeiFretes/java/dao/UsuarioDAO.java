package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Usuario;
import dao.Conexao;

public class UsuarioDAO {

    public void cadastrarUsuario(Usuario usuario) {

        String sql = "INSERT INTO usuario (nome, cpf, tipo) VALUES (?, ?, ?)";

        try {
            Connection conexao = Conexao.getConnection();

            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getTipo());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
