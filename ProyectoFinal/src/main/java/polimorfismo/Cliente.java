package polimorfismo;

public class Cliente{
    private String nombre, direccion;
    private int cel, tel;
    
    public Cliente(){
        
    }
    public Cliente(String n, int cl){
        nombre=n;
        cel=cl;
    }
    public void setNombre(String n){
        nombre=n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setDireccion(String dir){
        direccion=dir;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setCel(int cl){
        cel=cl;
    }
    public int getCel(){
        return cel;
    }
    public void setTel(int t){
        tel=t;
    }
    public int getTel(){
        return tel;
    }
}