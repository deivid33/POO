/**
 * @author David Sifuentes Guerrero
 * 2CM1
 * 2020670189
 */
package ejercicio2Herencia;

public class Test{
    public static void main(String args[]){
        Empleado e=new Empleado("JUHG9900887","Gustavo Juanes");
        System.out.println(e.calcularQuincena());
        
        //Mecanico
        Mecanico m = new Mecanico();
        m.agregarTrabajo(33101);
        System.out.println("Pago del mecanico:   " + m.calcularQuincena());
        
        //Administrador
        Administrador a = new Administrador();
        a.setSueldoMensual(3112.45f);
        System.out.println("Pago del administrador:   " + a.calcularQuincena());
        
        //Vendedor
        Vendedor v = new Vendedor();
        v.agregarVenta(11589);
        v.setSueldoMinimo(500);
        System.out.println("Pago del vendedor:   " + v.calcularQuincena());  
    }
}