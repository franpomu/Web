/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class SucursalBancaria {
    private String IdSucursalBancaria;
    private String EntidadBancaria;
    private String CodigoSucursal;
    private String Nombre;
    private List<CuentaBancaria> listaCuenta = new ArrayList();

    
    public SucursalBancaria(String IdSucursalBancaria,String EntidadBancaria,String CodigoSucursal,String Nombre){
    this.IdSucursalBancaria=IdSucursalBancaria;
    this.EntidadBancaria=EntidadBancaria;
    this.CodigoSucursal=CodigoSucursal;
    this.Nombre=Nombre;
    }
    
    /**
     * @return the IdSucursalBancaria
     */
    public String getIdSucursalBancaria() {
        return IdSucursalBancaria;
    }

    /**
     * @param IdSucursalBancaria the IdSucursalBancaria to set
     */
    public void setIdSucursalBancaria(String IdSucursalBancaria) {
        this.IdSucursalBancaria = IdSucursalBancaria;
    }

    /**
     * @return the EntidadBancaria
     */
    public String getEntidadBancaria() {
        return EntidadBancaria;
    }

    /**
     * @param EntidadBancaria the EntidadBancaria to set
     */
    public void setEntidadBancaria(String EntidadBancaria) {
        this.EntidadBancaria = EntidadBancaria;
    }

    /**
     * @return the CodigoSucursal
     */
    public String getCodigoSucursal() {
        return CodigoSucursal;
    }

    /**
     * @param CodigoSucursal the CodigoSucursal to set
     */
    public void setCodigoSucursal(String CodigoSucursal) {
        this.CodigoSucursal = CodigoSucursal;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the listaCuenta
     */
    public List<CuentaBancaria> getListaCuenta() {
        return listaCuenta;
    }

    /**
     * @param listaCuenta the listaCuenta to set
     */
    public void setListaCuenta(List<CuentaBancaria> listaCuenta) {
        this.listaCuenta = listaCuenta;
    }
    
}
