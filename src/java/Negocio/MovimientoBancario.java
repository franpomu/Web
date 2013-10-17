/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author alumno
 */
public class MovimientoBancario {
    
   private String IdMovimientoBancario;
   private TipoMovimientoBancario TipoMovimiento;
   private BigDecimal Importe;
   private Date Fecha;
   private BigDecimal SaldoTotal;
   private String Concepto;

   
   public MovimientoBancario(String IdMovimientoBancario,TipoMovimientoBancario TipoMovimiento,BigDecimal Importe,Date Fecha,BigDecimal SaldoTotal,String Concepto){
       this.IdMovimientoBancario=IdMovimientoBancario;
       this.TipoMovimiento=TipoMovimiento;
       this.Importe=Importe;
       this.Fecha=Fecha;
       this.SaldoTotal=SaldoTotal;
       this.Concepto=Concepto;
   
   }
    /**
     * @return the IdMovimientoBancario
     */
    public String getIdMovimientoBancario() {
        return IdMovimientoBancario;
    }

    /**
     * @param IdMovimientoBancario the IdMovimientoBancario to set
     */
    public void setIdMovimientoBancario(String IdMovimientoBancario) {
        this.IdMovimientoBancario = IdMovimientoBancario;
    }

    /**
     * @return the TipoMovimiento
     */
    public TipoMovimientoBancario getTipoMovimiento() {
        return TipoMovimiento;
    }

    /**
     * @param TipoMovimiento the TipoMovimiento to set
     */
    public void setTipoMovimiento(TipoMovimientoBancario TipoMovimiento) {
        this.TipoMovimiento = TipoMovimiento;
    }

    /**
     * @return the Importe
     */
    public BigDecimal getImporte() {
        return Importe;
    }

    /**
     * @param Importe the Importe to set
     */
    public void setImporte(BigDecimal Importe) {
        this.Importe = Importe;
    }

    /**
     * @return the Fecha
     */
    public Date getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the SaldoTotal
     */
    public BigDecimal getSaldoTotal() {
        return SaldoTotal;
    }

    /**
     * @param SaldoTotal the SaldoTotal to set
     */
    public void setSaldoTotal(BigDecimal SaldoTotal) {
        this.SaldoTotal = SaldoTotal;
    }

    /**
     * @return the Concepto
     */
    public String getConcepto() {
        return Concepto;
    }

    /**
     * @param Concepto the Concepto to set
     */
    public void setConcepto(String Concepto) {
        this.Concepto = Concepto;
    }
   
   
   
    
}
