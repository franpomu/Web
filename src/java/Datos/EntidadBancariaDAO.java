/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.EntidadBancaria;
import java.util.List;

/**
 *
 * @author iTo
 */
public interface EntidadBancariaDAO extends GenericDAO<EntidadBancaria,Integer>{
    public EntidadBancaria read(Integer idEntidad);
    public void insert(EntidadBancaria entidadBancaria);
    public void update(EntidadBancaria entidadBancaria);
    public void delete(Integer idEntidadBancaria);
    public List<EntidadBancaria> findAll();
    public List<EntidadBancaria> findByCodigo(String codigo);
    public List<EntidadBancaria> findByNombre(String nombre); 
    
}
