/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.List;

/**
 *
 * @author iTo
 */
public interface GenericDAO<T,ID>{
    
    public T read(ID id);
    public void insert(T entity);
    public void update(T entity);
    public void delete(ID id);
    public List<T> findAll();

    
}
