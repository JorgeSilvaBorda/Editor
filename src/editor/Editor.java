package editor;
import editor.Ventana.Log;
import java.sql.*;  
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jasilvab
 */
public class Editor {
public static Ventana v = new Ventana();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        v.setVisible(true);
    }
    public static void probarConex(int tipoServer, String ruta, String usuario, String pass){
        //Int tipo server = 1[Sql Server] - 2[MySql]
        ruta = "jdbc:sqlserver://"+ruta+":1443";
        if(tipoServer == 1){
            Connection conn = null;
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conn = DriverManager.getConnection(ruta, usuario, pass);
                if(conn != null ){
                    v.log("info", "Conexión SQL exitosa");
                }
            } catch (    ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
                v.log("error", "problemas al conectar con SQL Server.");
                v.log("advertencia", ex.toString());
            }
        }else{
            
        }
    }
    
}
