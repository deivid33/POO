package polimorfismo;
import java.util.ArrayList;

public class Agencia{
    private ArrayList<Vehiculo> vehiculos;
    private int contA, contD, contC, contT;
    private Cliente list[];

    public Agencia(){
        vehiculos = new ArrayList();
        list = new Cliente[10];
    }
    public Agencia(int c) {
        list = new Cliente[c];
    }
    public void registrarVehiculo(Vehiculo ve){
        if(ve != null)
            vehiculos.add(ve);
    }
    public Vehiculo buscarVehiculo(String matr){
        //Vehiculo ve=null;
        for(Vehiculo v : vehiculos){
            if ( v.getMatricula().compareTo(matr)==0){
                //ve= v;
                // break;
                return v;
            }
        }
        return null;
    }
    //Sobrecarga del método buscar
    public Vehiculo buscarVehiculo(String mod,String mar){
        //Vehiculo ve=null;
        for(Vehiculo v : vehiculos){
            if ((v.getModelo().compareTo(mod))==0&&(v.getMarca().compareTo(mar))==0){
                //ve= v;
                // break;
                return v;
            }
        }
        return null;
    }
    
    public String mostrarInfo(){
        String info="";
        for(Vehiculo v: vehiculos){
            info+=v.toString()+"\n";
        }
        return info;
    }
    
    public int contarA(){
        for(Vehiculo v: vehiculos){
            if ( v instanceof Auto){
                 contA++;
            }
        }
        return contA;
     }
    public int contarD(){
        for(Vehiculo v: vehiculos){
            if(v instanceof Deportivo){
                 contD++;
            }
        }
        return contD;
     }
    public int contarC(){
        for(Vehiculo v: vehiculos){
            if(v instanceof Camioneta){
                 contC++;
            }
        }
        return contC;
     }
    public int contarT(){
        for(Vehiculo v: vehiculos){
            if(v instanceof Turismo){
                 contT++;
            }
        }
        return contT;
    }

    public void agregarContacto(Cliente cont){
        for(int i=0;i<list.length;i++){
            if(list[i]==null){
                list[i]=cont;
                break;
            }
        }
    }
    public void eliminarContacto(String nom, int cl) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if ((list[i].getNombre() == nom) && (list[i].getCel() == cl)) {
                    list[i] = null;
                }
            }
        }
    }
    //Sobrecarga del método eliminar
    public void eliminarContacto(String nom) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if (list[i].getNombre() == nom) {
                    list[i] = null;
                }
            }
        }
    }
   
    public String mostrar(){
        String datos="";
        //ciclo for each
        for(Cliente i: list){
            if(i!=null){
                datos+="Nombre: " + i.getNombre()+
                        "   Direccion: "+i.getDireccion()+
                        "   Telefono: "+i.getTel()+
                        "   Cel: "+i.getCel()+"\n";
            }
        }
        return datos;
    }
}