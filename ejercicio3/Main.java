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
public class Main {
    public static void main(String args[]){
        RegistroCalificaciones reg=new RegistroCalificaciones();
        reg.agregarEstudiante(20201234, "Alejadro Rivas Aranda");
        float p[]={90,90,90,90};
        float t[]={100,100,100,100,100,100,100};
        reg.calificarDep1(20201234, 100, p, t);
        System.out.println(reg.sacarAlumno(20201234).getDep1().calcularDepartamental());
        
    }
}
