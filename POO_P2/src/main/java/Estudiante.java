import java.text.DecimalFormat;
/**
 * @author david
 */
public class Estudiante{
   private String nombre;
   private double departamental1;
   private double departamental2;
   private double departamental3;
   
   public Estudiante(){
   }
   
   Estudiante(String nom,double dep1,double dep2,double dep3){
       cambiarNombre(nom);
       cambiarDepartamental1(dep1);
       cambiarDepartamental2(dep2);
       cambiarDepartamental3(dep3);
   }
   
   void cambiarNombre(String nom){
       if( nom == null){
             nombre="Ana";
         }else if(nom.isEmpty()){
             nombre = "Juan";
         }else{
             nombre = nom;
         }
   }
   
    void cambiarDepartamental1(double dep1){
        departamental1 = dep1;
    }
    
    void cambiarDepartamental2(double dep2){
        departamental2 = dep2;
    }
    
    void cambiarDepartamental3(double dep3){
        departamental3 = dep3;
    }
    
    void mostrarNombre(){
        System.out.println("Su nombre es: " + nombre);
    }
    
    void mostrarCalDepartamentales(){
        System.out.println("Su calificacion del departamental #1 es: " + departamental1);
        System.out.println("Su calificacion del departamental #2 es: " + departamental2);
        System.out.println("Su calificacion del departamental #3 es: " + departamental3);
    }
    
    void mostrarCalFinal(){
        double fin;
        fin = (departamental1+departamental2+departamental3)/3;
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Su calificacion final es: " + df.format(fin));
    }
    
    public static void main(String[] args){
        Estudiante dep1 = new Estudiante("Francisco",9.1,7.5,8.3);
        dep1.mostrarNombre();
        dep1.mostrarCalDepartamentales();
        dep1.mostrarCalFinal();
        
        Estudiante d1 = new Estudiante("Luis",9.5,8.34,6.89);
        d1.mostrarNombre();
        d1.mostrarCalDepartamentales();
        d1.mostrarCalFinal();
    }
}