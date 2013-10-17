/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Negocio.TipoEntidadBancaria;
import Negocio.CuentaBancaria;
import Negocio.MovimientoBancario;
import Negocio.SucursalBancaria;
import Negocio.TipoMovimientoBancario;
import Negocio.EntidadBancaria;
import java.math.BigDecimal;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BigDecimal c1 = new BigDecimal("12153.02");
        BigDecimal c2 = new BigDecimal("4123412.21");
        
        //Cuentas
        CuentaBancaria CuentaBancaria1 = new CuentaBancaria("12345","001","00125885",01,c1,"124as");
        CuentaBancaria CuentaBancaria2 = new CuentaBancaria("67899","002","005698",02,c2,"534s");
        
        //Entidades
      //  EntidadBancaria EntidadBancaria1 = new EntidadBancaria("0001","01","BBVA","3214n",TipoEntidadBancaria.Banco);
        //EntidadBancaria EntidadBancaria2 = new EntidadBancaria("0002","02","BBVA","5465j",TipoEntidadBancaria.Banco);
        
        //Sucursales
        SucursalBancaria SucursalBancaria1 = new SucursalBancaria("001","01","20","BBVA1");
        SucursalBancaria SucursalBancaria2 = new SucursalBancaria("002","02","30","BBVA2");
        
        MovimientoBancario MovimientoBancario1 = new MovimientoBancario("1",TipoMovimientoBancario.Debe,c1, new GregorianCalendar(2012,02,20).getTime(),c1,"QuitarDinero");
        MovimientoBancario MovimientoBancario2 = new MovimientoBancario("2",TipoMovimientoBancario.Haber,c2, new GregorianCalendar(2013,01,01).getTime(),c2,"PonerDinero");
        
        List<MovimientoBancario> movimiento = CuentaBancaria1.getListMovimiento();
        movimiento.add(MovimientoBancario1);
        movimiento.add(MovimientoBancario2);
        
        for(MovimientoBancario movimientos: CuentaBancaria1.getListMovimiento()){
                System.out.println("Idcuenta"+CuentaBancaria1.getIdCuentaBancaria());
        }
        
    }
}
