/**
 * @author david
 */
public class Punto{
    int x;
    int y;
    
    void mostrarValores(){
        System.out.println("(" + x + "x" + "," + y + "y)");
    }
    
    public static void main(String[] args){
        Punto p1 = new Punto();
        p1.x = 5;
        p1.y = 7;
        p1.mostrarValores();
    }
}
