import java.text.DecimalFormat;

/**
 * @author david
 */
public class TrianguloEquilatero{
    int lado;
   
    int calcularPerimetro(){
       int perimetro;
        perimetro = 3*lado;
        return perimetro;
    }
 
    double calcularVolumen(){
        double volumen;
        volumen = (Math.sqrt(3)*(lado*lado))/4;
        return volumen;
    }
    
    void mostrarResultados(){
        System.out.println("Lado  " + lado);
        System.out.println("Perimetro: " + calcularPerimetro()+ " cm");
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Volumen: " + df.format(calcularVolumen())+ " cm");
    }
    
    public static void main(String[] args){
        TrianguloEquilatero trian1 = new TrianguloEquilatero();
        trian1.lado = 13;
        trian1.mostrarResultados();
    }
}