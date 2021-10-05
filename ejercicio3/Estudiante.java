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
public class Estudiante {
    private int matricula;
    private String nombre;
    private Departamental dep1, dep2, dep3;
    
    public Estudiante(int mat, String nom){
        matricula=mat;
        nombre = nom;
        dep1 = new Departamental();
        dep2 = new Departamental();
        dep3 = new Departamental();
    }
    public void setMatricula(int m){
        matricula = m;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setNombre(String n){
        nombre = n;
    }
    public String getNombre(){
        return nombre;
    }
    public Departamental getDep1(){
        return dep1;
    }
    public Departamental getDep2(){
        return dep2;
    }
    public Departamental getDep3(){
        return dep3;
    }
    public void setDep1(float exam, float p[],float t[]){
        dep1.setExamen(exam);
        dep1.setPracticas(p);
        dep1.setTareas(t);
    }
     public void setDep2(float exam, float p[],float t[]){
        dep2.setExamen(exam);
        dep2.setPracticas(p);
        dep2.setTareas(t);
    }
      public void setDep3(float exam, float p[],float t[]){
        dep3.setExamen(exam);
        dep3.setPracticas(p);
        dep3.setTareas(t);
    }
      
      public float calificarFinal(){
          float calif=0;
          calif = (dep1.calcularDepartamental()*3/100)+(dep2.calcularDepartamental()*3/100)+(dep3.calcularDepartamental()*4/100);
          return calif;
      }
}
