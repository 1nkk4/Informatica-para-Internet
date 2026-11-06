package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Encomenda;
import dao.Conexao;

public class EncomendaDAO {

    public void cadastrarEncomenda(Encomenda encomenda) {

        String sql = "INSERT INTO encomenda "
                + "(nome, descricao, id_fornecedor, "
                + "id_origem, id_destino, "
                + "id_localizacao_atual, data_criacao) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection conexao = Conexao.getConnection();

            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, encomenda.getNome());
            stmt.setString(2, encomenda.getDescricao());
            stmt.setInt(3, encomenda.getIdFornecedor());
            stmt.setInt(4, encomenda.getIdOrigem());
            stmt.setInt(5, encomenda.getIdDestino());
            stmt.setInt(6, encomenda.getIdLocalizacaoAtual());
            stmt.setString(7, encomenda.getDataCriacao());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
