/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author sndmonreal
 */
public class Departamental {
    private float examen;
    private float practicas[];
    private float tareas[];
    
    public Departamental(){
        practicas =new float[4];
        tareas=new float[7];
    }
    
    public void setExamen(float e){
        examen=e;
    }
    public float getExamen(){
        return examen;
    }
    public void setPracticas(float p[]){
        practicas=p;
    }
    public float[] getPracticas(){
        return practicas;
    }
    public void setTareas(float t[]){
        tareas=t;
    }
    public float[] getTareas(){
        return tareas;
    }
    
    public float sumarTareas(){
        float tar=0;
        for(float  t: tareas){
            tar = tar + t;
        }
        return tar;
    }
    public float sumarPracticas(){
        float p=0;
        for(float  pr: practicas){
            p = p + pr;
        }
        return p;
    }
    
    public float calcularDepartamental(){
        float dep=0;
        dep = ( examen*4/100)+(sumarPracticas()*4/400)+(sumarTareas()*2/700);
        return dep;
    }
}
