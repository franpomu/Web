/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author iTo
 */
public class ConnectionFactoryImplDataSource implements ConnectionFactory{

    @Override
    public Connection getConnection(){
        Connection conexion=null;
        try{
            InitialContext initCntx=new InitialContext();;
            Context envCntx = (Context) initCntx.lookup("java:comp/env");
            DataSource data = (DataSource)envCntx.lookup("jdbc/Banco");
            conexion=data.getConnection();
        
            }catch(NamingException e){
            try {
                throw new RuntimeException();
            } catch (Exception ex) {
                Logger.getLogger(ConnectionFactoryImplDataSource.class.getName()).log(Level.SEVERE, null, ex);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactoryImplDataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return conexion;
    }

    @Override
    public void closeConnection(Connection conexion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
