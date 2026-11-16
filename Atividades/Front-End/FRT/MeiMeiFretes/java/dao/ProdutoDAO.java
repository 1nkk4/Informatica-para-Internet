
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

}
