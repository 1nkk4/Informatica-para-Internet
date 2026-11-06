package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Localizacao;
import dao.Conexao;

public class LocalizacaoDAO {

    public void cadastrarLocalizacao(Localizacao localizacao) {

        String sql = "INSERT INTO localizacao (cidade, estado, codigo) VALUES (?, ?, ?)";

        try {
            Connection conexao = Conexao.getConnection();

            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, localizacao.getCidade());
            stmt.setString(2, localizacao.getEstado());
            stmt.setString(3, localizacao.getCodigo());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Localizacao buscarLocalizacao(int id) {

        String sql = "SELECT * FROM localizacao WHERE id_localizacao = ?";

        try {
            Connection conexao = Conexao.getConnection();

            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                Localizacao localizacao = new Localizacao(
                    rs.getString("cidade"),
                    rs.getString("estado"),
                    rs.getString("codigo")
                );

                rs.close();
                stmt.close();
                conexao.close();

                return localizacao;
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
