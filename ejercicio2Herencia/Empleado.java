/**
 * @author David Sifuentes Guerrero
 * 2CM1
 * 2020670189
 */
package ejercicio2Herencia;

public class Empleado{
    private String RFC, nombre, departamento, puesto;
    
    public Empleado(){   
    }
    public Empleado(String rfc, String nom){
        RFC = rfc;
        nombre = nom;
    }
    // getters y setters
    public void setRFC(String rfc){
        RFC=rfc;
    }
    public String getRFC(){
        return RFC;
    }
    public void setNombre(String nom){
        nombre=nom;
    }
    public String getNombre(){
        return nombre;
    }
    public void setDepartamento(String dep){
        departamento = dep;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void setPuesto(String p){
        puesto = p;
    }
    public String getPuesto(){
        return puesto;
    }
    public float calcularQuincena(){
        return 0;
    }
}