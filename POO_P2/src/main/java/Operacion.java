import java.text.DecimalFormat;
/**
 * @author david
 */
public class Operacion{
    private double numero1;
    private double numero2;
    
    public Operacion(){
    }
    
    Operacion(double n1,double n2){
        sumar(n1,n2);
    }
    
    void sumar(double n1,double n2){
        double suma;
        suma = n1 + n2;
        System.out.println("La suma de: "+ numero1 + "+" + numero2+ " = " + suma);
    }
    
    void restar(){
        double resta;
        resta = numero1 - numero2;
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("La resta de: "+ numero1 + "-" + numero2+ " = " + df.format(resta));
    }
    
    void multiplicar(){
        double multiplicacion;
        multiplicacion = numero1 * numero2;
        System.out.println("La multiplicacion de: "+ numero1 + "x" + numero2+ " = " + multiplicacion);
    }
    
    void dividir(){
        double division;
        division = numero1/numero2;
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("La division de "+ numero1+ "/" + numero2+ " = " + df.format(division));
    }
    
    void sacarReciproco(){
        double reciproco1,reciproco2;
        reciproco1 = 1/numero1;
        reciproco2 = 1/numero2;
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Primer numero: " + numero1+"  el reciproco es: " + df.format(reciproco1));
        System.out.println("Segundo numero: " + numero2+ "  el reciproco es: " + df.format(reciproco2));
    }
    
    void cambiarSigno(){
        double signo1,signo2;
        signo1 = numero1*(1-2);
        signo2 = numero2*(1-2);
        System.out.println("El cambio de signo es: " + signo1 + "  y  " + signo2);
    }
    
    void elevarCuadrado(){
        double elevar1,elevar2;
        elevar1 = numero1*numero1;
        elevar2 = numero2*numero2;
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Primer numero: " + numero1+"  al elevar el resultado es: " + df.format(elevar1));
        System.out.println("Segundo numero: " + numero2+"  al elevar el resultado es: " + df.format(elevar2));
    }
    
    void sacarRaizCuadrada(){
        double raiz1,raiz2;
        raiz1 = Math.sqrt(numero1);
        raiz2 = Math.sqrt(numero2);
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Primer numero: " + numero1+"  la Raiz Cuadrada es: " + df.format(raiz1));
        System.out.println("Segundo numero: " + numero2+"  la Raiz Cuadrada es: " + df.format(raiz2));
    }
    
    void sacarPorcentaje(){
        double porcentaje1,porcentaje2;
        porcentaje1 = 0.25*numero1;
        porcentaje2 = 0.10*numero2;
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Primer numero 25%: " + numero1+"  el porcentaje es: " + df.format(porcentaje1));
        System.out.println("Segundo numero 10%: " + numero2+"  el porcentaje es: " + df.format(porcentaje2));
    }

    public static void main(String[] args){
        Operacion op1 = new Operacion(12.23,8.57);
        op1.numero1 = 56.62;
        op1.numero2 = 89.48;
        op1.restar();
        op1.multiplicar();
        op1.dividir();
        op1.sacarReciproco();
        op1.cambiarSigno();
        op1.elevarCuadrado();
        op1.sacarRaizCuadrada();
        op1.sacarPorcentaje();
    }
}