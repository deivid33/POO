/**
 * @author david
 */
public class Persona{
     private String nombre;
     private int dia;
     private int mes;
     private int anio;
    
     public Persona(){
     }
     
     Persona(String nom,int d,int m,int a){
         cambiarNombre(nom);
         cambiarDia(d);
         cambiarMes(m);
         cambiarAnio(a);
     }
     
    void cambiarNombre(String n){   
         if( n == null){
             nombre="Mauricio";
         }else if(n.isEmpty()){
             nombre = "Federico";
         }else{
             nombre = n;
         }
     }
    
    void cambiarDia(int d){
         if(d>=1 && d<=30){
             dia=d;
         }else{
             dia=1;
         }
     }
     void cambiarMes(int m){
         if(m>=1 && m<=12){
             mes = m;
         }else{
             mes=1;
         }
     }
     void cambiarAnio(int a){
         if(a>=0 && a<=2020){
             anio=a;
         }else{
             anio =1;
         }
     }
     String devolverNombre(){
       return nombre;  
     }
     int devolverDia(){
         return dia;
     }
     int devolverMes(){
         return mes;
     }
     int devolverAnio(){
         return anio;
     }
     
    int calcularEdad(){
        return 2020-anio;
    }
    
    String mostrar(){
        return nombre+" tiene "+ calcularEdad()+ " años";
    }
    
    public static void main(String[] args){
        Persona p = new Persona("Angel",22,12,1990);
        System.out.println(p.mostrar());
        p.cambiarNombre("Antonio");
        p.cambiarAnio(1999);
        System.out.println(p.mostrar());
    }
}