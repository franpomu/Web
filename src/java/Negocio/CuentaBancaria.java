/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class CuentaBancaria {
    
    private String IdCuentaBancaria;
    private String SucursalBancaria;
    private String NumeroCuenta;
    private int DigitoControl;
    private BigDecimal Saldo;
    private String Cif;
    private List<MovimientoBancario> listMovimiento = new ArrayList();

    
    public CuentaBancaria(String IdCuentaBancaria,String SucursalBancaria,String NumeroCuenta,int DigitoControl,BigDecimal Saldo,String Cif){
        
        this.IdCuentaBancaria=IdCuentaBancaria;
        this.SucursalBancaria=SucursalBancaria;
        this.NumeroCuenta=NumeroCuenta;
        this.DigitoControl=DigitoControl;
        this.Saldo=Saldo;
        this.Cif=Cif;
        
    }
    /**
     * @return the IdCuentaBancaria
     */
    public String getIdCuentaBancaria() {
        return IdCuentaBancaria;
    }

    /**
     * @param IdCuentaBancaria the IdCuentaBancaria to set
     */
    public void setIdCuentaBancaria(String IdCuentaBancaria) {
        this.IdCuentaBancaria = IdCuentaBancaria;
    }

    /**
     * @return the SucursalBancaria
     */
    public String getSucursalBancaria() {
        return SucursalBancaria;
    }

    /**
     * @param SucursalBancaria the SucursalBancaria to set
     */
    public void setSucursalBancaria(String SucursalBancaria) {
        this.SucursalBancaria = SucursalBancaria;
    }

    /**
     * @return the NumeroCuenta
     */
    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    /**
     * @param NumeroCuenta the NumeroCuenta to set
     */
    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    /**
     * @return the DigitoControl
     */
    public int getDigitoControl() {
        return DigitoControl;
    }

    /**
     * @param DigitoControl the DigitoControl to set
     */
    public void setDigitoControl(int DigitoControl) {
        this.DigitoControl = DigitoControl;
    }

    /**
     * @return the Saldo
     */
    public BigDecimal getSaldo() {
        return Saldo;
    }

    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(BigDecimal Saldo) {
        this.Saldo = Saldo;
    }

    /**
     * @return the Cif
     */
    public String getCif() {
        return Cif;
    }

    /**
     * @param Cif the Cif to set
     */
    public void setCif(String Cif) {
        this.Cif = Cif;
    }

    /**
     * @return the listMovimiento
     */
    public List<MovimientoBancario> getListMovimiento() {
        return listMovimiento;
    }

    /**
     * @param listMovimiento the listMovimiento to set
     */
    public void setListMovimiento(List<MovimientoBancario> listMovimiento) {
        this.listMovimiento = listMovimiento;
    }
    
}
