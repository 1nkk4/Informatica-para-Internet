package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.TipoStatus;
import dao.Conexao;

public class TipoStatusDAO {

    public List<TipoStatus> listarTiposStatus() {

        List<TipoStatus> lista = new ArrayList<>();

        String sql = "SELECT * FROM tipo_status";

        try {
            Connection conexao = Conexao.conectar();

            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                TipoStatus tipo = new TipoStatus(
                    rs.getString("nome"),
                    rs.getString("descricao")
                );

                lista.add(tipo);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
