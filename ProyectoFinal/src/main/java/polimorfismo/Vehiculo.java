package polimorfismo;

public abstract class Vehiculo {
    protected String matricula, modelo, marca;
    
    public Vehiculo(){
        
    }
    public Vehiculo(String mat, String mod, String mar){
        this.matricula=mat;
        this.modelo=mod;
        this.marca=mar;
    }
    public void setMatricula(String mat){
        this.matricula=mat;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setModelo(String mod){
        this.modelo=mod;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setMarca(String mar){
        this.marca=mar;
    }
    public String getMarca(){
        return this.marca;
    }
    public String toString(){
        return " Matricula: "+this.matricula + " Modelo: "+this.modelo+" Marca: " +this.marca;
    }
}