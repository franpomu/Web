package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
*
* @author alumno
*/
public class ConnectionFactoryImplJDBC implements ConnectionFactory{
    
    private Connection conexion = null;
    
    public ConnectionFactoryImplJDBC(){
        
    }

    @Override
    public Connection getConnection() {
        try {
            //Cargamos el puente JDBC
            Class.forName("com.mysql.jdbc.Driver");

            //Nos conectarnos a la Base de Datos
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/banco","root","root");

        } catch(SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return conexion;
    }

    @Override
    public void closeConnection(Connection conection) {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactoryImplJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}