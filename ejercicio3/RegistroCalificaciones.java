/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.ArrayList;
/**
 *
 * @author sndmonreal
 */
public class RegistroCalificaciones {
    private ArrayList<Estudiante> misestudiantes;
    
    public RegistroCalificaciones(){
        misestudiantes = new ArrayList();
    }
    public void agregarEstudiante(int mat, String nom){
        Estudiante est = new Estudiante(mat,nom);
        misestudiantes.add(est);
    }
    public void agregarEstudiantes(Estudiante e){
        misestudiantes.add(e);
    }
    public void eliminarEstudiante(int mat){
        for(Estudiante est: misestudiantes){
            if(est.getMatricula() == mat){
                est=null;
            }
        }
    }
    public void calificarDep1(int matr, float ex, float p[], float t[]){
        for(Estudiante est: misestudiantes){
            if(est.getMatricula()== matr){
                est.setDep1(ex, p, t);
                break;
            }
        }
    }
    public void calificarDep2(int matr, float ex, float p[], float t[]){
        for(Estudiante est: misestudiantes){
            if(est.getMatricula()== matr){
                est.setDep2(ex, p, t);
                break;
            }
        }
    }
    public void calificarDep3(int matr, float ex, float p[], float t[]){
        for(Estudiante est: misestudiantes){
            if(est.getMatricula()== matr){
                est.setDep3(ex, p, t);
                break;
            }
        }
    }
    public Estudiante sacarAlumno(int mat){
        Estudiante d=null;
        for(Estudiante est: misestudiantes){
            if(est.getMatricula()==mat){
                d = est;
            }
        }
        
        return d;
    }
}