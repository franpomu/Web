package Datos;


import Negocio.EntidadBancaria;
import Negocio.TipoEntidadBancaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
*
* @author alumno
*/
public class EntidadBancariaDAOImplJDBC implements EntidadBancariaDAO{

    ConnectionFactory connectionFactory = new ConnectionFactoryImplJDBC();

    public EntidadBancariaDAOImplJDBC() {
    }


    @Override
    public EntidadBancaria read(Integer idEntidad){
        EntidadBancaria entidadBancaria = null;
        String selectSQL = "SELECT * FROM entidadbancaria WHERE idEntidad = ?";
        try {
            Connection conexion = connectionFactory.getConnection();
            PreparedStatement ps = conexion.prepareStatement(selectSQL);
            ps.setInt(1, idEntidad);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()){
                entidadBancaria = new EntidadBancaria();
                entidadBancaria.setIdEntidad(idEntidad);
                entidadBancaria.setCodigoEntidad(resultSet.getString("codigoEntidad"));
                entidadBancaria.setNombre(resultSet.getString("nombre"));
                entidadBancaria.setCif(resultSet.getString("cif"));
                entidadBancaria.setTipoEntidad(TipoEntidadBancaria.valueOf(resultSet.getString("TipoEntidadBancaria")));
                if (resultSet.next()){
                    throw new RuntimeException("Hay más de un resultado");
                }
            }
            else{
                entidadBancaria = null;
            }
            conexion.close();
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return entidadBancaria;
    }

    /**
*
* @param entidadBancaria
*/
    @Override
    public void insert(EntidadBancaria entidadBancaria){
        String insertSQL = "INSERT INTO entidadbancaria (idEntidad, codigoEntidad, nombre, cif, tipoEntidadBancaria) VALUES (?,?,?,?,?);";
        try {
            Connection conexion = connectionFactory.getConnection();
            PreparedStatement ps = conexion.prepareStatement(insertSQL);
            ps.setInt(1, entidadBancaria.getIdEntidad());
            ps.setString(2, entidadBancaria.getCodigoEntidad());
            ps.setString(3, entidadBancaria.getNombre());
            ps.setString(4, entidadBancaria.getCif());
            ps.setString(5, entidadBancaria.getTipoEntidad().name());
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    
    /**
*
* @param entity
* @return
*/
    @Override
            public void update(EntidadBancaria entity){
        String updateSQL = "UPDATE entidadbancaria SET codigoEntidad = ?, nombre = ?, cif = ?, tipoEntidadBancaria = ? WHERE idEntidad = ?";
        try {
            Connection conexion = connectionFactory.getConnection();
            PreparedStatement ps = conexion.prepareStatement(updateSQL);
            ps.setString(1, entity.getCodigoEntidad());
            ps.setString(2, entity.getNombre());
            ps.setString(3, entity.getCif());
            ps.setString(4, entity.getTipoEntidad().name());
            ps.setInt(5, entity.getIdEntidad());
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override    
    public void delete(Integer idEntidadBancaria){
        String deleteSQL = "DELETE FROM entidadbancaria WHERE idEntidad = ?";
        try {
            Connection conexion = connectionFactory.getConnection();
            PreparedStatement ps = conexion.prepareStatement(deleteSQL);
            ps.setInt(1, idEntidadBancaria);
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<EntidadBancaria> findAll(){
        List<EntidadBancaria> entidadesBancarias = new ArrayList();
        try {
            String selectSQL = "SELECT * FROM entidadbancaria";
            Connection conexion = connectionFactory.getConnection();
            PreparedStatement ps = conexion.prepareStatement(selectSQL);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                EntidadBancaria entidadBancaria = new EntidadBancaria();
                entidadBancaria.setIdEntidad(resultSet.getInt("idEntidad"));
                entidadBancaria.setCodigoEntidad(resultSet.getString("codigoEntidad"));
                entidadBancaria.setNombre(resultSet.getString("nombre"));
                entidadBancaria.setCif(resultSet.getString("cif"));
                entidadBancaria.setTipoEntidad(TipoEntidadBancaria.valueOf(resultSet.getString("tipoEntidadBancaria")));
                entidadesBancarias.add(entidadBancaria);
            }
            conexion.close();
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return entidadesBancarias;
    }

    
    public List<EntidadBancaria> findByCodigo(String codigo) {
        List<EntidadBancaria> entidadesBancarias = new ArrayList();
        try {
            String selectSQL = "SELECT * FROM entidadbancaria WHERE codigo=?";
            Connection conexion = connectionFactory.getConnection();
            PreparedStatement ps = conexion.prepareStatement(selectSQL);
            ps.setString(1, codigo);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                EntidadBancaria entidadBancaria = new EntidadBancaria();
                entidadBancaria.setIdEntidad(resultSet.getInt("idEntidad"));
                entidadBancaria.setCodigoEntidad(resultSet.getString("codigoEntidad"));
                entidadBancaria.setNombre(resultSet.getString("nombre"));
                entidadBancaria.setCif(resultSet.getString("cif"));
                entidadBancaria.setTipoEntidad(TipoEntidadBancaria.valueOf(resultSet.getString("tipoEntidadBancaria")));
                entidadesBancarias.add(entidadBancaria);
            }
            conexion.close();
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return entidadesBancarias;
        

    }
    
    public List<EntidadBancaria> findByNombre(String nombre){
        
        List<EntidadBancaria> entidadesBancarias = new ArrayList();
        
            if(nombre==null || nombre.trim().equals("")){
                try{
                String selectSQL = "SELECT * FROM entidadbancaria";
                Connection conexion = connectionFactory.getConnection();
                PreparedStatement ps = conexion.prepareStatement(selectSQL);
                ps.setString(1,"%"+nombre+"%");
                ResultSet resultSet = ps.executeQuery();
                while (resultSet.next()){
                    EntidadBancaria entidadBancaria = new EntidadBancaria();
                    entidadBancaria.setIdEntidad(resultSet.getInt("idEntidad"));
                    entidadBancaria.setCodigoEntidad(resultSet.getString("codigoEntidad"));
                    entidadBancaria.setNombre(resultSet.getString("nombre"));
                    entidadBancaria.setCif(resultSet.getString("cif"));
                    entidadBancaria.setTipoEntidad(TipoEntidadBancaria.valueOf(resultSet.getString("tipoEntidadBancaria")));
                    entidadesBancarias.add(entidadBancaria);
                    conexion.close();
              }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
               }
            }else{
                
                try{
                String selectSQL = "SELECT * FROM entidadbancaria WHERE nombre=?";
                Connection conexion = connectionFactory.getConnection();
                PreparedStatement ps = conexion.prepareStatement(selectSQL);
                ps.setString(1,"%"+nombre+"%");
                ResultSet resultSet = ps.executeQuery();
                while (resultSet.next()){
                    EntidadBancaria entidadBancaria = new EntidadBancaria();
                    entidadBancaria.setIdEntidad(resultSet.getInt("idEntidad"));
                    entidadBancaria.setCodigoEntidad(resultSet.getString("codigoEntidad"));
                    entidadBancaria.setNombre(resultSet.getString("nombre"));
                    entidadBancaria.setCif(resultSet.getString("cif"));
                    entidadBancaria.setTipoEntidad(TipoEntidadBancaria.valueOf(resultSet.getString("tipoEntidadBancaria")));
                    entidadesBancarias.add(entidadBancaria);
                    conexion.close();
              }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
               }
            }
            
            return entidadesBancarias;
           
            
        
        }
    
    }

    
    


