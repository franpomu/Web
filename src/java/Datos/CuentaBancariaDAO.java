/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


import Negocio.CuentaBancaria;
import java.util.List;

/**
 *
 * @author iTo
 */
public interface CuentaBancariaDAO extends GenericDAO<CuentaBancaria,Integer>{
 
    public CuentaBancaria read(int idCuentaBancaria);
    public void insert(CuentaBancaria cuentaBancaria);
    public void update(CuentaBancaria cuentaBancaria);
    public void delete(int idCuentaBancaria);
    public List<CuentaBancaria> findAll();
    public List<CuentaBancaria> findByCodigo(String codigo);
}
