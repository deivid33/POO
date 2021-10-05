package polimorfismo;

public class Turismo extends Vehiculo{
    private int numPuertas;
    private int numPasajeros;
    
    public Turismo(){}
    public Turismo(String mat, String mod, String mar,int npu,int npa){
        super(mat, mod, mar);
        this.numPuertas=npu;
        this.numPasajeros=npa;
    }
    public void setPuertas(int npu){
        this.numPuertas=npu;
    }
    public int getPuertas(){
        return this.numPuertas;
    }
    public void setPasajeros(int npa){
        this.numPasajeros=npa;
    }
    public int getPasejeros(){
        return this.numPasajeros;
    }
    public String toString(){
        return super.toString()+" No. Puertas: "+this.numPuertas + " No. Pasajeros: "+this.numPasajeros;
    }
}
