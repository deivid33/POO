/**
 * @author David Sifuentes Guerrero
 * 2CM1
 * 2020670189
 */
package ejercicio2Herencia;

public class Administrador extends Empleado{
    private float sueldoMensual;
    
    public Administrador(){
    }
    public Administrador(String rfc, String nom){
        super(rfc,nom);
    }
    public void setSueldoMensual(float sm){
        sueldoMensual = sm;
    }
    public float getSueldoMensual(){
        return sueldoMensual;
    }
    @Override // SOBREESCRITURA
    public float calcularQuincena(){
        return sueldoMensual/2;
    }
}