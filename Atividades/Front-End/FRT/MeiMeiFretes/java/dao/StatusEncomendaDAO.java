package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.StatusEncomenda;
import util.Conexao;

public class StatusEncomendaDAO {

    // CADASTRAR STATUS INICIAL
    public void cadastrarStatusInicial(StatusEncomenda status) {

        String sql = "INSERT INTO status_encomenda "
                + "(id_encomenda, id_tipo_status, descricao, data) "
                + "VALUES (?, ?, ?, ?)";

        try {
            Connection conexao = Conexao.getConnection();

            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, status.getIdEncomenda());
            stmt.setInt(2, status.getIdTipoStatus());
            stmt.setString(3, status.getDescricao());
            stmt.setString(4, status.getData());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // BUSCAR STATUS ATUAL
    public StatusEncomenda buscarStatusAtual(int idEncomenda) {

        String sql = "SELECT * FROM status_encomenda WHERE id_encomenda = ?";

        try {
            Connection conexao = Conexao.getConnection();

            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, idEncomenda);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                StatusEncomenda status = new StatusEncomenda(
                    rs.getInt("id_encomenda"),
                    rs.getInt("id_tipo_status"),
                    rs.getString("descricao"),
                    rs.getString("data")
                );

                rs.close();
                stmt.close();
                conexao.close();

                return status;
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


    // ATUALIZAR STATUS ATUAL
    public void atualizarStatus(StatusEncomenda status) {

        String sql = "UPDATE status_encomenda "
                + "SET id_tipo_status = ?, descricao = ?, data = ? "
                + "WHERE id_encomenda = ?";

        try {
            Connection conexao = Conexao.getConnection();

            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, status.getIdTipoStatus());
            stmt.setString(2, status.getDescricao());
            stmt.setString(3, status.getData());
            stmt.setInt(4, status.getIdEncomenda());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
