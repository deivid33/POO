/**
 * @author David Sifuentes Guerrero
 * 2CM1
 * 2020670189
 */
package ejercicio2Herencia;

public class Mecanico extends Empleado{
    private float trabajos;
    
    public Mecanico(){
    }
    public Mecanico(String rfc, String nom){
        super(rfc,nom);
    }
    public void setTrabajos(float t){
        if(t>0)
            trabajos = t;
    }
    public float getTrabajos(){
        return trabajos;
    }
    
    public void agregarTrabajo(float trab){
        if(trab>0)
            trabajos += trab;
    }
    
    @Override // SOBREESCRITURA
    public float calcularQuincena(){
        return trabajos * 0.04f;// redefiniendo comportamiento de un metodo heredado
    }
}
