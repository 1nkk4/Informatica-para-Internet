
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Encomenda;
import util.Conexao;

public class rastreamentoEncomenda {

    // READ: pra busca uma encomenda pelo código de rastreamento
    public Encomenda buscar(long codigo) throws SQLException {

        String sql = "SELECT * FROM encomenda, localizacao JOIN localizacao ON localizacao.id_localizacao = id_localizacao WHERE codigo_rastreamento = ?";

        try (Connection con = Conexao.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setLong(1, codigo);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    Encomenda entrega = new Encomenda(
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        rs.getString("cidade"),
                        rs.getInt("estado"),
                        rs.getString("data_criacao")
                    );

                    return entrega;
                }
            }
        }

        return null;
    }

}
