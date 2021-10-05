/**
 *
 * @author david
 */
public class Rectangulo{
    int alto;
    int ancho;
    
    int calcularArea(){
        int area;
        area = alto*ancho;
        return area;
    }
    
    int calcularPerimetro(){
        return (2*alto)+(2*ancho);
    }
    
    void mostrarResultados(){
        System.out.println("Alto  " + alto);
        System.out.println("Ancho  " + ancho);
        System.out.println("Area: " + calcularArea() + " cm");
        System.out.println("Perimetro: " + calcularPerimetro()+ " cm");
    }
    
    public static void main(String[] args){
        Rectangulo rec1 = new Rectangulo();
        rec1.alto = 15;
        rec1.ancho = 25;
        rec1.mostrarResultados();
    }
}
