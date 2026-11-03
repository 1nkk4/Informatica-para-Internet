package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Produto;

public class EncomendaDAO {

    // ---------- READ: lista todos os produtos ----------
    public ArrayList<Encomenda> listar() throws SQLException {
        ArrayList<Encomenda> lista = new ArrayList<Encomenda>();
        String sql = "SELECT codigo, cod_fornecedor, nome_produto"
                   + "FROM Encomenda ORDER BY codigo";

        try (Connection con = Conexao.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
            	Encomenda p = new Encomenda();
                p.codigo = rs.getInt("codigo");
                p.nome_produto = rs.getString("nome_produto");
                p.cod_fornecedor = rs.getInt("cod_fornecedor");
               
             
                lista.add(p);
            }
        }
        return lista;
    }
    public Encomenda buscar(int codigo) throws SQLException {
        String sql = "SELECT p.codigo, p.nome_produto, p.cod_fornecedor"
                   + "       f.nome AS nome_fornecedor "
                   + "FROM Encomenda p "
                   + "JOIN fornecedor f ON f.codigo = p.cod_fornecedor "
                   + "WHERE p.codigo = ?";

        try (Connection con = Conexao.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, codigo);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Encomenda p = new Encomenda();
                    p.codigo = rs.getInt("codigo");
                    p.nome_produto = rs.getString("nome_produto");
                    p.cod_fornecedor = rs.getInt("cod_fornecedor");
                    return p;
                }
            }
        }
        return null;
    }

    public void inserir(Encomenda p) throws SQLException {
        String sql = "INSERT INTO produtos (codigo, cod_fornecedor, nome_produto) "
                   + "VALUES (?, ?, ?, ?)";

        try (Connection con = Conexao.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, p.nome_produto);
            ps.setInt(2, p.cod_fornecedor);
            ps.executeUpdate();
        }
    }
    public void alterar(Encomenda p) throws SQLException {
        String sql = "UPDATE produtos "
                   + "SET nome = ?, cod_fornecedor = ?, preco = ?, qtd_estoque = ? "
                   + "WHERE codigo = ?";

        try (Connection con = Conexao.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

        	 ps.setString(1, p.nome_produto);
             ps.setInt(2, p.cod_fornecedor);
             ps.setInt(3, p.copdigo);
             
            ps.executeUpdate();
        }
    }

    public void remover(int codigo) throws SQLException {
        String sql = "DELETE FROM Encomenda WHERE codigo = ?";

        try (Connection con = Conexao.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, codigo);
            ps.executeUpdate();
        }
    }
}
