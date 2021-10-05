/**
 * @author David Sifuentes Guerrero
 * 2CM1
 * 2020670189
 */
package ejercicio2Herencia;

public class Vendedor extends Empleado{
    private float sueldoMinimo;
    private float ventas;
    
    public Vendedor(){
    }
    public Vendedor(String rfc, String nom){
        super(rfc,nom);
    }
    public void setSueldoMinimo(float sm){
        sueldoMinimo = sm;
    }
    public float getSueldoMinimo(){
        return sueldoMinimo;
    }
    public void setVentas(float v){
        if(v>0){
            ventas = v;
        }
    }
    public float getVentas(){
        return ventas;
    }
    public void agregarVenta(float venta){
        if(venta>0)
            ventas += venta;
    }
    
    @Override // SOBREESCRITURA
    public float calcularQuincena(){
        float qf;
        qf = (sueldoMinimo + (ventas * 0.02f));
        return qf;// redefiniendo comportamiento de un metodo heredado
    }
}