/**
 * @author david
 */
public class Hora {
   private int hora;
   private int minuto;
   private int segundo;
   
   public Hora(){
   }
   
   Hora(int h, int m, int s){
        cambiarHora(h);
        cambiarMinuto(m);
        cambiarSegundo(s);
    }
    
    private void mostrarHora(){
        System.out.println("La hora es:  " + hora+ ":" + minuto + ":" + segundo);
    }
    
    void cambiarHora(int h){
       if( h>=0 && h<=23){
           hora=h;
       }else{
           hora=0;
       }
    }
    
    void cambiarMinuto(int m){
        if(m>=0 && m<=59){
            minuto=m;
        }else{
            minuto=0;
        }
    }
    void cambiarSegundo(int s){
        if(s>=0 && s<=59){
            segundo=s;
        }else{
             segundo=0;
         }
    }
    
    int devolverHora(){
        return hora;
    }
    
    int devolverMinuto(){
        return minuto;
    }
    
    int devolverSegundo(){
        return segundo;
    }
    
    void cambiarHora(int h, int m, int s){
       cambiarHora(h);
       cambiarMinuto(m);
       cambiarSegundo(s);
    }

    void cambiarHora(){
       cambiarHora(15);
       cambiarMinuto(30);
       cambiarSegundo(59);         
    }
    
    public static void main(String[] args){
         Hora myhora = new Hora(12,22,40);
        myhora.mostrarHora();
        myhora.cambiarHora(25, 22, -200);
        myhora.mostrarHora();
        
        Hora h1 = new Hora();
        h1.cambiarHora();
        h1.mostrarHora();
    }
}