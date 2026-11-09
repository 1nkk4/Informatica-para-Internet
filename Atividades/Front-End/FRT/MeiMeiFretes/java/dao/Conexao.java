package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

    public static final String URL = "jdbc:postgresql://localhost:5432/meimeifretes";
    public static final String USUARIO = "postgres";
    public static final String SENHA = "1234";

    public static Connection conectar() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver do PostgreSQL não encontrado. "
                    + "Coloque o arquivo .jar na pasta WEB-INF/lib.");
        }
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
