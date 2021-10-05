package polimorfismo;

public class Auto extends Vehiculo{
    private int cilindros, pasajeros, puertas;
    private String tamanio;
    
    public Auto(){}
    
    public Auto( String mat, String mod, String mar, int cil, int pas, int puer, String tam){
        super(mat, mod, mar);
        this.cilindros=cil;
        this.pasajeros=pas;
        this.puertas=puer;
        this.tamanio=tam;
    }
    public void setTamanio(String tam){
        this.tamanio=tam;
    }
    public String getTamanio(){
        return this.tamanio;
    }
    public void setCilindros(int cil){
        this.cilindros=cil;
    }
    public int getCilindros(){
        return this.cilindros;
    }
        public void setPuertas(int p){
        this.puertas=p;
    }
    public int getPuertas(){
        return this.puertas;
    }
        public void setPasajeros(int pas){
        this.pasajeros=pas;
    }
    public int getPasajeros(){
        return this.pasajeros;
    }
    public String toString(){
        return super.toString()+ " Tamaño: " +this.tamanio +
                " No. cilindros: "+this.cilindros + " No. pasajeros: " +this.pasajeros+
                " No. puertas: "+this.puertas;
    }
}