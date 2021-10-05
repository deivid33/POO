/*
 * @author david
 */
public class Trabajador{
    String nombre;
    double salario;
    
    void mostrarNombre(){
        System.out.println("El nombre es:  " + nombre);
    }
    
    void mostrarSalario(){
        double saldo;
        System.out.println("Su salario es:  " + salario);
        if(salario>=1000){
            saldo = 0.12*salario;
        }
        else{
            saldo = 0.15*salario;
        }
        saldo = saldo+salario;
        System.out.println("Su salario con aumento es:  " + saldo);
    }
    
    public static void main(String[] args){
        Trabajador tra = new Trabajador();
        tra.nombre = "Juan Ramirez";
        tra.salario = 6500;
        tra.mostrarNombre();
        tra.mostrarSalario();
    }
}
