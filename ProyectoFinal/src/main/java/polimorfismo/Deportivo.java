package polimorfismo;

public class Deportivo extends Vehiculo{
    private String tamanio;
    private int cilindros;
    private float velocidad;
    
    public Deportivo(){}
    
    public Deportivo(String mat, String mod, String mar, String tam, int cil, float vel){
        super(mat, mod, mar);
        this.tamanio=tam;
        this.cilindros=cil;
        this.velocidad=vel;
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
    public void setVelocidad(float vel){
        this.velocidad=vel;
    }
    public float getVelocidad(){
        return this.velocidad;
    }
    public String toString(){
        return super.toString() + " Tamaño: "+this.tamanio+
                " No. cilindros: "+this.cilindros +" Velocidad Max: "+this.velocidad;
    }
}
