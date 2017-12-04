/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;
import CursMate.*;
import Personas.*;
import Writer_Reader.Lectura;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Usuario
 */
public class Estudiante extends User {
        
    Lectura letest=new Lectura(); 
    
    public Estudiante(String nusuario, String contraseña, Brujo_Mago est,String rol) {
        super(nusuario, contraseña, est,rol);
    }
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
        letest.lecturcurso(cursos);
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
                     System.out.println("Materia:"+materias[0]+"\n"+"Profesor:"+profesor+"\n"+"Horario:"+c.getDia()+","+horario);
                 }
                 
             }
             break;
         case 2:
            for(Curso c: cursos){
                 if(materias[1].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[1]+"\n"+"Profesor:"+profesor+"\n"+"Horario:"+c.getDia()+","+horario);
                 } 
     }
             break;
         case 3:
             for(Curso c: cursos){
                 if(materias[2].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[2]+"\n"+"Profesor:"+profesor+"\n"+"Horario:"+c.getDia()+","+horario);
                 }
    }       break;
         case 4:
             for(Curso c: cursos){
                 if(materias[3].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[3]+"\n"+"Profesor:"+profesor+"\n"+"Horario:"+c.getDia()+","+horario);
                 }
    }       break;
         case 5:
             for(Curso c: cursos){
                 if(materias[4].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[4]+"\n"+"Profesor:"+profesor+"\n"+"Horario:"+c.getDia()+","+horario);
                 }
    }       break;
         case 6:
             for(Curso c: cursos){
                 if(materias[5].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[5]+"\n"+"Profesor:"+profesor+"\n"+"Horario:"+c.getDia()+","+horario);
                 }
    }       break;
         case 7:
             for(Curso c: cursos){
                 if(materias[6].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[6]+"\n"+"Profesor:"+profesor+"\n"+"Horario:"+c.getDia()+","+horario);
                 }
    }       break;
         case 8:
             for(Curso c: cursos){
                 if(materias[7].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[7]+"\n"+"Profesor:"+profesor+"\n"+"Horario:"+c.getDia()+","+horario);
                 }
    }
    }
    }
    public void Registro(){
        letest.lecturcurso(cursos);
        letest.lecturestu(estudiantes);
    String nombre = "", apellidos = "";
    String fecha = "";
    String tipo = "";
    String horario = "";
    Materias materia = null;
    System.out.println("/** REGISTROS **/");
        for(int i=0;i<materias.length;i++){
            System.out.println(i+1+". "+materias[i].name());
        }
        System.out.println("Escoja la materia a registrar:");
        Scanner sc =new Scanner(System.in);
        int eleccion = sc.nextInt();
        switch(eleccion){
            
            case 1:
                for(Curso c: cursos){
                    if(materias[0].equals(c.getMateria())){
                        horario = c.getDia()+","+c.getHorario();
                        
                    }
                }
                System.out.println("El horario de"+materias[0]+"es"+horario);
                for(Brujo_Mago bru: estudiantes){
                    if(bru.GetNombre().equals(est.GetNombre())&&bru.GetApellido().equals(est.GetApellido())){
                        java.util.Date fech = new Date();
                        fecha = " "+fech.getDate()+"/"+fech.getMonth()+"/"+fech.getYear();
                        nombre = est.GetNombre(); apellidos = est.GetApellido(); materia = materias[0];
                        if(est.GetEdad() < 15){
                            tipo = "E";
                        }
                        else{tipo = "N";
                    }   
                }    
        }
        Scanner verif=new Scanner(System.in);
        System.out.println("¿Desea registrarse? S/N:  ");
        if(verif.next().equalsIgnoreCase("S")){
             Registros reg = new Registros(fecha, nombre, apellidos, tipo, materia);
             registros.add(reg);
              System.out.println("Se ha registrado la materia");
        }
        else{
            menuEstudiante();
        }
        break;
            case 2:
                for(Curso c: cursos){
                    if(materias[1].equals(c.getMateria())){
                        horario = c.getDia()+","+c.getHorario();
                        
                    }
                }
                System.out.println("El horario de"+materias[1]+"es"+horario);
                for(Brujo_Mago bru: estudiantes){
                    if(bru.GetNombre().equals(est.GetNombre())&&bru.GetApellido().equals(est.GetApellido())){
                        java.util.Date fech = new Date();
                        fecha = " "+fech.getDate()+"/"+fech.getMonth()+"/"+fech.getYear();
                        nombre = est.GetNombre(); apellidos = est.GetApellido(); materia = materias[0];
                        if(est.GetEdad() < 15){
                            tipo = "E";
                        }
                        else{tipo = "N";
                    }   
                }    
        }
        Scanner verif1=new Scanner(System.in);
        System.out.println("¿Desea registrarse? S/N:  ");
        if(verif1.next().equalsIgnoreCase("S")){
             Registros reg = new Registros(fecha, nombre, apellidos, tipo, materia);
             registros.add(reg);
              System.out.println("Se ha registrado la materia");
        }
        else{
            menuEstudiante();
        }
        break;
            case 3:
                for(Curso c: cursos){
                    if(materias[2].equals(c.getMateria())){
                        horario = c.getDia()+","+c.getHorario();
                        
                    }
                }
                System.out.println("El horario de"+materias[2]+"es"+horario);
                for(Brujo_Mago bru: estudiantes){
                    if(bru.GetNombre().equals(est.GetNombre())&&bru.GetApellido().equals(est.GetApellido())){
                        java.util.Date fech = new Date();
                        fecha = " "+fech.getDate()+"/"+fech.getMonth()+"/"+fech.getYear();
                        nombre = est.GetNombre(); apellidos = est.GetApellido(); materia = materias[0];
                        if(est.GetEdad() < 15){
                            tipo = "E";
                        }
                        else{tipo = "N";
                    }   
                }    
        }
        Scanner verif2=new Scanner(System.in);
        System.out.println("¿Desea registrarse? S/N:  ");
        if(verif2.next().equalsIgnoreCase("S")){
             Registros reg = new Registros(fecha, nombre, apellidos, tipo, materia);
             registros.add(reg);
              System.out.println("Se ha registrado la materia");
        }
        else{
            menuEstudiante();
        }
        break;
            case 4:
                for(Curso c: cursos){
                    if(materias[3].equals(c.getMateria())){
                        horario = c.getDia()+","+c.getHorario();
                        
                    }
                }
                System.out.println("El horario de"+materias[3]+"es"+horario);
                for(Brujo_Mago bru: estudiantes){
                    if(bru.GetNombre().equals(est.GetNombre())&&bru.GetApellido().equals(est.GetApellido())){
                        java.util.Date fech = new Date();
                        fecha = " "+fech.getDate()+"/"+fech.getMonth()+"/"+fech.getYear();
                        nombre = est.GetNombre(); apellidos = est.GetApellido(); materia = materias[0]; tipo = "N";
                          
                }    
        }
        Scanner verif3=new Scanner(System.in);
        System.out.println("¿Desea registrarse? S/N:  ");
        if(verif3.next().equalsIgnoreCase("S")){
             Registros reg = new Registros(fecha, nombre, apellidos, tipo, materia);
             registros.add(reg);
              System.out.println("Se ha registrado la materia");
        }
        else{
            menuEstudiante();
        }
        break;
            case 5:
                for(Curso c: cursos){
                    if(materias[4].equals(c.getMateria())){
                        horario = c.getDia()+","+c.getHorario();
                        
                    }
                }
                System.out.println("El horario de"+materias[0]+"es"+horario);
                for(Brujo_Mago bru: estudiantes){
                    if(bru.GetNombre().equals(est.GetNombre())&&bru.GetApellido().equals(est.GetApellido())){
                        java.util.Date fech = new Date();
                        fecha = " "+fech.getDate()+"/"+fech.getMonth()+"/"+fech.getYear();
                        nombre = est.GetNombre(); apellidos = est.GetApellido(); materia = materias[0]; tipo = "N";
                          
                }    
        }
        Scanner verif4=new Scanner(System.in);
        System.out.println("¿Desea registrarse? S/N:  ");
        if(verif4.next().equalsIgnoreCase("S")){
             Registros reg = new Registros(fecha, nombre, apellidos, tipo, materia);
             registros.add(reg);
              System.out.println("Se ha registrado la materia");
        }
        else{
            menuEstudiante();
        }
        break;
        case 6:
                for(Curso c: cursos){
                    if(materias[5].equals(c.getMateria())){
                        horario = c.getDia()+","+c.getHorario();
                        
                    }
                }
                System.out.println("El horario de"+materias[5]+"es"+horario);
                for(Brujo_Mago bru: estudiantes){
                    if(bru.GetNombre().equals(est.GetNombre())&&bru.GetApellido().equals(est.GetApellido())){
                        java.util.Date fech = new Date();
                        fecha = " "+fech.getDate()+"/"+fech.getMonth()+"/"+fech.getYear();
                        nombre = est.GetNombre(); apellidos = est.GetApellido(); materia = materias[0]; tipo = "N";
                          
                }    
        }
        Scanner verif5=new Scanner(System.in);
        System.out.println("¿Desea registrarse? S/N:  ");
        if(verif5.next().equalsIgnoreCase("S")){
             Registros reg = new Registros(fecha, nombre, apellidos, tipo, materia);
             registros.add(reg);
              System.out.println("Se ha registrado la materia");
        }
        else{
            menuEstudiante();
        }
        break;
        case 7:
                for(Curso c: cursos){
                    if(materias[6].equals(c.getMateria())){
                        horario = c.getDia()+","+c.getHorario();
                        
                    }
                }
                System.out.println("El horario de"+materias[6]+"es"+horario);
                for(Brujo_Mago bru: estudiantes){
                    if(bru.GetNombre().equals(est.GetNombre())&&bru.GetApellido().equals(est.GetApellido())){
                        java.util.Date fech = new Date();
                        fecha = " "+fech.getDate()+"/"+fech.getMonth()+"/"+fech.getYear();
                        nombre = est.GetNombre(); apellidos = est.GetApellido(); materia = materias[0]; tipo = "N";
                          
                }    
        }
        Scanner verif6=new Scanner(System.in);
        System.out.println("¿Desea registrarse? S/N:  ");
        if(verif6.next().equalsIgnoreCase("S")){
             Registros reg = new Registros(fecha, nombre, apellidos, tipo, materia);
             registros.add(reg);
              System.out.println("Se ha registrado la materia");
        }
        else{
            menuEstudiante();
        }
        break;
        case 8:
                for(Curso c: cursos){
                    if(materias[7].equals(c.getMateria())){
                        horario = c.getDia()+","+c.getHorario();
                        
                    }
                }
                System.out.println("El horario de"+materias[7]+"es"+horario);
                for(Brujo_Mago bru: estudiantes){
                    if(bru.GetNombre().equals(est.GetNombre())&&bru.GetApellido().equals(est.GetApellido())){
                        java.util.Date fech = new Date();
                        fecha = " "+fech.getDate()+"/"+fech.getMonth()+"/"+fech.getYear();
                        nombre = est.GetNombre(); apellidos = est.GetApellido(); materia = materias[0]; tipo = "N";
                          
                }    
        }
        Scanner verif7=new Scanner(System.in);
        System.out.println("¿Desea registrarse? S/N:  ");
        if(verif7.next().equalsIgnoreCase("S")){
             Registros reg = new Registros(fecha, nombre, apellidos, tipo, materia);
             registros.add(reg);
             System.out.println("Se ha registrado la materia");
        }
        else{
            menuEstudiante();
        }
        break;
    }
    }
    public void DescripcionVuelo(){
        letest.lecturestu(estudiantes);
        for(Brujo_Mago bru: estudiantes){
            if(bru.GetNombre().equals(est.GetNombre())&&bru.GetApellido().equals(est.GetApellido())){
            if(est instanceof Animagos){
            System.out.println("Usted es un animago, para volar necesita su varita");
            }
            if(est instanceof Normal){
                System.out.println("Usted es un mago Normal, para volar necesita su Nimbus 2000");
            }
            if(est instanceof Metamorfomago){
                System.out.println("Usted es un metamorfomago, para volar necesita de su poder");
            }
        }
        }
    }
    
}
