package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Encomenda;

public class EncomendaDAO {

	public void cadastrarEncomenda(Encomenda encomenda) {
	    String sql =
	        "INSERT INTO encomenda " +
	        "(nome, descricao, id_origem, id_destino, " +
	        "id_localizacao_atual, data_criacao) " +
	        "VALUES (?, ?, ?, ?, ?, ?)";

	    try (
	        Connection conexao = Conexao.conectar();
	        PreparedStatement stmt = conexao.prepareStatement(sql)
	    ) {
	        stmt.setString(1, encomenda.getNome());
	        stmt.setString(2, encomenda.getDescricao());
	        stmt.setInt(3, encomenda.getIdOrigem());
	        stmt.setInt(4, encomenda.getIdDestino());
	        stmt.setInt(5, encomenda.getIdLocalizacaoAtual());
	        stmt.setString(6, encomenda.getDataCriacao());

	        stmt.executeUpdate();

	    } catch (SQLException e) {
	        throw new RuntimeException(
	            "Erro ao cadastrar encomenda: " + e.getMessage(), e
	        );
	    }
	}

    public Encomenda buscarPorCodigoRastreamento(long codigo) {
        String sql = "SELECT * FROM encomenda WHERE codigo_rastreamento = ?";

        try (Connection conexao = Conexao.conectar(); PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setLong(1, codigo);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Encomenda encomenda = new Encomenda();
                    encomenda.idEncomenda = rs.getInt("id_encomenda");
                    encomenda.codigoRastreamento = rs.getLong("codigo_rastreamento");
                    encomenda.nome = rs.getString("nome");
                    encomenda.descricao = rs.getString("descricao");
                    encomenda.idOrigem = rs.getInt("id_origem");
                    encomenda.idDestino = rs.getInt("id_destino");
                    encomenda.idLocalizacaoAtual = rs.getInt("id_localizacao_atual");
                    encomenda.dataCriacao = rs.getString("data_criacao");
                    return encomenda;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}