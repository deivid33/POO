package polimorfismo;

public class Camioneta extends Vehiculo {
    private float peso;
    
    public Camioneta(){}
    public Camioneta(String mat, String mod, String mar,float p){
        super(mat, mod, mar);
        this.peso=p;
    }
    public void setPeso(float p){
        this.peso=p;
    }
    public float getPeso(){
        return peso;
    }
    public String toString(){
        return super.toString()+" Peso: "+this.peso;
    }
}
