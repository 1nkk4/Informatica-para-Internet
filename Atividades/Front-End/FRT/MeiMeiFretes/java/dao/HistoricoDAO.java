package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Historico;

public class HistoricoDAO {

	public void registrarHistorico(Historico historico) {

		String sql = "INSERT INTO historico " + "(id_encomenda, id_tipo_status, id_localizacao, descricao, data) "
				+ "VALUES (?, ?, ?, ?, ?)";

		try (Connection conexao = Conexao.conectar(); PreparedStatement stmt = conexao.prepareStatement(sql)) {

			stmt.setInt(1, historico.getIdEncomenda());
			stmt.setInt(2, historico.getIdTipoStatus());
			stmt.setInt(3, historico.getIdLocalizacao());
			stmt.setString(4, historico.getDescricao());
			stmt.setString(5, historico.getData());

			stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Historico> listarHistorico(int idEncomenda) {

		List<Historico> lista = new ArrayList<>();

		// pega o registros da encomenda informada e ordena pelo id

		String sql = "SELECT * FROM historico " + "WHERE id_encomenda = ? " + "ORDER BY id_historico ASC";

		try (Connection conexao = Conexao.conectar(); PreparedStatement stmt = conexao.prepareStatement(sql)) {

			stmt.setInt(1, idEncomenda);

			try (ResultSet rs = stmt.executeQuery()) {

				// lê o bd 
				while (rs.next()) {

					Historico historico = new Historico(rs.getInt("id_encomenda"), rs.getInt("id_tipo_status"),
							rs.getInt("id_localizacao"), rs.getString("descricao"), rs.getString("data"));

					lista.add(historico);
				}
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return lista;
	}
}
