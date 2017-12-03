/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;
import CursMate.Curso;
import CursMate.Materias;
import Personas.Brujo_Mago;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class Estudiante {
        public Materias[]materias=new Materias[]{Materias.Pociones,Materias.Defensascontraartesocuras,Materias.Adivinacion,Materias.Astronomia,Materias.Historiademagia,Materias.Herbologia,Materias.Encantamientos,Materias.Vuelo};
        ArrayList<Curso> cursos;
    public void menuEstudiante(){
        Scanner menE=new Scanner(System.in);
        System.out.println("Escoja la opcion que desee hacer: ");
        System.out.println("1. Consultar Curso");
        System.out.println("2. Registro");
        System.out.println("3. Descripcion de Vuelo");
        int opcionEst=menE.nextInt();
        switch(opcionEst){
            case 1:
                ConsultaCurso();
                break;
            case 2:
                Registro();
                break;
            case 3:
                DescripcionVuelo();
                break;
            default:
                System.out.println("Usted ha finalizado sesion. ");
        }

    }
    public void ConsultaCurso(){
   
    System.out.println("/** CURSOS PLANIFICADOS **/");
     for(int i=0;i<materias.length;i++){
            System.out.println(i+1+". "+materias[i].name());
        }
     System.out.println("Elija una materia del listado de materias:");
     Scanner mat = new Scanner(System.in);
     int materia=mat.nextInt();
     switch(materia){
         case 1:
              
             for(Curso c: cursos){
                 if(materias[0].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[0]+"/n"+"Profesor:"+profesor+"/n"+"Horario:"+c.getDia()+","+horario);
                 }
                 
             }
             break;
         case 2:
            for(Curso c: cursos){
                 if(materias[1].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[1]+"/n"+"Profesor:"+profesor+"/n"+"Horario:"+c.getDia()+","+horario);
                 } 
     }
             break;
         case 3:
             for(Curso c: cursos){
                 if(materias[2].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[2]+"/n"+"Profesor:"+profesor+"/n"+"Horario:"+c.getDia()+","+horario);
                 }
    }       break;
         case 4:
             for(Curso c: cursos){
                 if(materias[3].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[3]+"/n"+"Profesor:"+profesor+"/n"+"Horario:"+c.getDia()+","+horario);
                 }
    }       break;
         case 5:
             for(Curso c: cursos){
                 if(materias[4].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[4]+"/n"+"Profesor:"+profesor+"/n"+"Horario:"+c.getDia()+","+horario);
                 }
    }       break;
         case 6:
             for(Curso c: cursos){
                 if(materias[5].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[5]+"/n"+"Profesor:"+profesor+"/n"+"Horario:"+c.getDia()+","+horario);
                 }
    }       break;
         case 7:
             for(Curso c: cursos){
                 if(materias[6].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[6]+"/n"+"Profesor:"+profesor+"/n"+"Horario:"+c.getDia()+","+horario);
                 }
    }       break;
         case 8:
             for(Curso c: cursos){
                 if(materias[7].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[7]+"/n"+"Profesor:"+profesor+"/n"+"Horario:"+c.getDia()+","+horario);
                 }
    }
    }
    }
    public void Registro(){
    
    }
    public void DescripcionVuelo(){
        
    }
    
}
