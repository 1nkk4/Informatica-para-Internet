
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Encomenda;
import util.Conexao;

public class EncomendaDAO {

    // READ:pra listar todas as encomendas
    public ArrayList<Encomenda> listar() throws SQLException {

        ArrayList<Encomenda> lista = new ArrayList<Encomenda>();

        String sql = "SELECT * FROM encomenda ORDER BY id_encomenda";

        try (Connection con = Conexao.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Encomenda e = new Encomenda(
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getInt("id_fornecedor"),
                    rs.getInt("id_origem"),
                    rs.getInt("id_destino"),
                    rs.getInt("id_localizacao_atual"),
                    rs.getString("data_criacao")
                );

                lista.add(e);
            }
        }

        return lista;
    }

    // READ: pra busca uma encomenda pelo código de rastreamento
    public Encomenda buscar(long codigo) throws SQLException {

        String sql = "SELECT * FROM encomenda WHERE codigo_rastreamento = ?";

        try (Connection con = Conexao.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setLong(1, codigo);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    Encomenda e = new Encomenda(
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        rs.getInt("id_fornecedor"),
                        rs.getInt("id_origem"),
                        rs.getInt("id_destino"),
                        rs.getInt("id_localizacao_atual"),
                        rs.getString("data_criacao")
                    );

                    return e;
                }
            }
        }

        return null;
    }

    // CREATE: pra cadastrar/criar uma encomenda
    public void inserir(Encomenda e) throws SQLException {

        String sql = "INSERT INTO encomenda "
            + "(nome, descricao, id_fornecedor, id_origem, "
            + "id_destino, id_localizacao_atual, data_criacao) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = Conexao.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, e.getNome());
            ps.setString(2, e.getDescricao());
            ps.setInt(3, e.getIdFornecedor());
            ps.setInt(4, e.getIdOrigem());
            ps.setInt(5, e.getIdDestino());
            ps.setInt(6, e.getIdLocalizacaoAtual());
            ps.setString(7, e.getDataCriacao());

            ps.executeUpdate();
        }
    }

    // UPDATE: pra alterar os produtos de uma encomenda
    public void alterar(Encomenda e) throws SQLException {

        String sql = "UPDATE encomenda SET "
            + "nome = ?, descricao = ?, id_origem = ?, "
            + "id_destino = ?, id_localizacao_atual = ?, "
            + "data_criacao = ? "
            + "WHERE id_encomenda = ?";

        try (Connection con = Conexao.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
    //3 da manhã pqp nao aguento mais to ficando maluco ioghvbajkbh\dvigb
            ps.setString(1, e.getNome());
            ps.setString(2, e.getDescricao());
            ps.setInt(3, e.getIdOrigem());
            ps.setInt(4, e.getIdDestino());
            ps.setInt(5, e.getIdLocalizacaoAtual());
            ps.setString(6, e.getDataCriacao());
            ps.setInt(7, e.getIdEncomenda());

            ps.executeUpdate();
        }
    }

    // DELETE: pra remover a encomenda
    public void remover(int id) throws SQLException {

        String sql = "DELETE FROM encomenda WHERE id_encomenda = ?";

        try (Connection con = Conexao.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            ps.executeUpdate();
        }
    }
}
