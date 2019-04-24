package ifms.ws1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NVIDIA
 */
public class FabricaConexao {

    private static Connection conn;
    private static String url = "jdbc:mariaDB://localhost:3306/meudicionario";
    private static String usuario = "root";
    private static String senha = "root";

    public static Connection getConexao() {

        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/meudicionario?user=root&password=root");

            } catch (SQLException ex) {
                Logger.getLogger(FabricaConexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conn;
    }

}
