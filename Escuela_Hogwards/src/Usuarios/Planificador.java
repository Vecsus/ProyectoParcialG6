/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Planificador {
    
    public void menuplanificador(){
        Scanner men=new Scanner(System.in);
        System.out.println("Escoja la opcion que desee hacer: ");
        System.out.println("1. Crear Curso");
        System.out.println("2. Crear Profesor");
        System.out.println("3. Crear Estudiante");
        System.out.println("4. Ver horarios planificados");
        System.out.println("5. Listado de Estudiantes");
        int opcion=men.nextInt();
        switch (opcion){
            case 1:
                crearCurso();
                break;
            case 2:
                crearProfesor();
                break;
            case 3:
                crearEstudiante();
                break;
            case 4:
                VerhorariosPlanificados();
                break;
            case 5:
                ListadoEstudiantes();
                break;
            default:
                System.out.println("Usted ha finalizado sesion. ");
        }
                
        
    }
    public void crearCurso(){}
    public void crearProfesor(){}
    public void crearEstudiante(){}
    public void VerhorariosPlanificados(){}
    public void ListadoEstudiantes(){}
}
