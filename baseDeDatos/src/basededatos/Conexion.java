
package basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    
    private final String url = "jdbc:mysql://localhost:3306/baseDeDatos?characterEncoding=utf8";
    private final String login = "root"; // administrador base de datos
    private final String password = "localhost";
    private Connection cnx = null;
    private Statement sttm = null;
    private ResultSet rst = null;
 
    
    public Conexion(){
    
        try {
             Class.forName("com.mysql.jdbc.Driver");
             cnx = DriverManager.getConnection(url,login,password);
        } catch (ClassNotFoundException | SQLException c) {
            JOptionPane.showMessageDialog(null, "ERROR:" + c.getMessage());
            System.exit(1);//salir aplicacion
        }
       
        
    }
    //jdbc conexion
    //metodo para actualizar datos
    
   
}
