import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * @author david
*/      
public class ConversionTemperatura{
    private float celsius;
    private float fahrenheit;
    private float kelvin;
    
    public static Scanner scan = new Scanner(System.in);
    
    public static float pedirFlotante(){
        System.out.println("Introduce un dato flotante: ");
        float dato = scan.nextFloat();
        return dato;
    }
    
    public static float CelsiusAF(float cel){
        return (cel*9/5)+32;
    }
    public static float CelsiusAK(float cel){
        return (float)(cel + 273.15);
    }
    
    void calcularCelsius(){
        float fa,kel;
        fa = (celsius*9/5)+32;
        kel = (float) (celsius + 273.15);
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Los grados celsius a fahrenheit son:  " + fa+ "°");
        System.out.println("Los grados celsius a kelvin son:  " + df.format(kel)+ "°");
    } 
    
    public static float FahrenheitAC(float fah){
        return (fah-32)*5/9;
    }
    public static float FahrenheitAK(float fah){
        return (float)((fah-32)*5/9 + 273.15);
    }
    
    
    void calcularFahrenheit(){
        float cel,kel;
        cel = (fahrenheit-32)*5/9;
        kel = (float) ((fahrenheit-32)*5/9 + 273.15);
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Los grados fahrenheit a celsius son:  " + df.format(cel) + "°");
        System.out.println("Los grados fahrenheit a kelvin son:  " + df.format(kel) + "°");
    }
    
    public static float KelvinAC(float kel){
       return (float) (kel-273.15);
    }
    public static float KelvinAF(float kel){
       return (float)((kel-273.15)*9/5 + 32);
    }
    
    void calcularKelvin(){
        float cel,fa;
       cel = (float) (kelvin-273.15);
       fa = (float) ((kelvin-273.15)*9/5 + 32);
       System.out.println("Los grados kelvin a celsius son:  " + cel + "°");
       System.out.println("Los grados kelvin a fahrenheit son:  " + fa + "°");
    }
    
    public static void main(String[] args){
        float res = pedirFlotante();
        System.out.println("Los grados celsius a fahrenheit son:  " + ConversionTemperatura.CelsiusAF(res)+"°");
        System.out.println("Los grados celsius a kelvin son: " + ConversionTemperatura.CelsiusAK(res)+"°");
        System.out.println("Los grados fahrenheit a celsius son: " + ConversionTemperatura.FahrenheitAC(res)+"°");
        System.out.println("Los grados fahrenheit a kelvin son: " + ConversionTemperatura.FahrenheitAK(res)+"°");
        System.out.println("Los grados kelvin a celsius son: " + ConversionTemperatura.KelvinAC(res)+"°");
        System.out.println("Los grados kelvin a fahrenheit son: " + ConversionTemperatura.KelvinAF(res)+"°");
    }
}