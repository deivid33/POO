import java.text.DecimalFormat;
/**
 *
 * @author david
 */
public class Cilindro{
    private double diametro;
    private double altura;
    private double pi;
   
    public Cilindro(){
    }
    
    Cilindro(double di,double al,double p){
        calcularArea();
        calcularVolumen();
    }
    
    double calcularArea(){
       double area;
        area = 2*pi*(diametro/2)*(diametro/2+altura);
        return area;
    }
    
    double calcularVolumen(){
        double volumen;
        volumen = pi*(diametro/2*diametro/2)*altura;
        return volumen;
    }
    
    void mostrarResultados(){
        System.out.println("Diametro  " + diametro);
        System.out.println("Altura  " + altura);
        System.out.println("Pi  " + pi);
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Area: " + df.format(calcularArea()) + " cm");
        System.out.println("Volumen: " + df.format(calcularVolumen())+ " cm");
    }
    
    public static void main(String[] args){
        Cilindro cil1 = new Cilindro();
        cil1.diametro = 15.5;
        cil1.altura = 42.2;
        cil1.pi = 3.1416;
        cil1.mostrarResultados();
    }
}