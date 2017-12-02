/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;
import java.util.ArrayList;
import CursMate.*;
import Personas.*;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Planificador {
    public Materias[]materias=new Materias[]{Materias.Pociones,Materias.Defensascontraartesocuras,Materias.Adivinacion,Materias.Astronomia,Materias.Historiademagia,Materias.Herbologia,Materias.Encantamientos,Materias.Vuelo};
    public ArrayList<Brujo_Mago> profesores = new ArrayList();
    public Dias[]dias=new Dias[]{Dias.Lunes,Dias.Martes,Dias.Miercoles,Dias.Jueves,Dias.Viernes,Dias.Sabado,Dias.Domingo};
    public Casas_Hogwards[]casashog=new Casas_Hogwards[]{Casas_Hogwards.Grifindor,Casas_Hogwards.Hufflepuff,Casas_Hogwards.Ravenclaw,Casas_Hogwards.Slytherin};
    public ArrayList<Curso> cursos = new ArrayList();
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
    public void crearCurso(){
        Materias materia;Brujo_Mago profesor;int capacidad;Dias dia;String horario;
        ArrayList<Curso> cursos = new ArrayList();
        //Eleccion de materia
        Scanner mat= new Scanner(System.in);
        System.out.println("/''MATERIAS ''/");
        for(int i=0;i<materias.length;i++){
            System.out.println(i+1+". "+materias[i].name());
        }
        System.out.println("Elija una materia del listado de materias: ");
        materia=materias[mat.nextInt()-1];
        //Eleccion de profesor
        Scanner profe=new Scanner(System.in);
        System.out.println("/''PROFESORES ''/");
        for(int i=0;i<profesores.size();i++){
            System.out.println(i+1+". "+profesores.get(i).GetNombre()+" "+profesores.get(i).GetApellido());
        }
        System.out.println("Elija un profesor del listado: ");
        profesor=profesores.get(profe.nextInt());
        //Eleccion de capacidad de curso
        Scanner cap=new Scanner(System.in);
        System.out.println("Ingrese la capacidad del curso para "+materia.name());
        capacidad=cap.nextInt();
        //Eleccion de dia
        Scanner di=new Scanner(System.in);
        for(int i=0;i<dias.length;i++){
            System.out.println(i+1+". "+dias[i].name());
        }
        System.out.println("Ingrese el dia: ");
        dia=dias[di.nextInt()-1];
        //Eleccion de horario
        Scanner hor=new Scanner(System.in);
        System.out.println("Ingrese el horario del curso: ");
        horario=hor.nextLine();
        //Verificacion
        Scanner verif=new Scanner(System.in);
        System.out.println("Desea crear el curso con la informacion deseada? S/N:  ");
        if(verif.next().equalsIgnoreCase("S")){
            Curso curso=new Curso(materia, profesor, horario, dia, capacidad);
            System.out.println("Se ha creado el curso: ");
            System.out.println("MATERIA: "+materia.name());
            System.out.println("PROFESOR: "+profesor.GetNombre()+" "+profesor.GetApellido());
            System.out.println("CAPACIDAD: "+capacidad);
            System.out.println("HORARIO: "+horario);
            cursos.add(curso);
        }
    }
    public void crearProfesor(){
        String nombre, apellido,fecha_ingreso,varita;int edad; Casas_Hogwards casa;
        System.out.println("/** CREAR PROFESOR **/");
        Scanner nom=new Scanner(System.in);
        System.out.println("Ingrese Nombre: ");
        nombre=nom.nextLine();
        
        Scanner ape=new Scanner(System.in);
        System.out.println("Ingrese Apellido: ");
        apellido=ape.nextLine();

        Scanner eda=new Scanner(System.in);
        System.out.println("Ingrese Edad: ");
        edad=eda.nextInt();
        
        Scanner fech = new Scanner(System.in);
        System.out.println("Ingrese la fecha de ingreso:");
        fecha_ingreso = fech.nextLine();

        Scanner var=new Scanner(System.in);
        System.out.println("Varita: ");
        varita=var.nextLine();
        
        for(int i=0;i<casashog.length;i++){
            System.out.println(i+1+". "+casashog[i].name());
        }
        System.out.println("Seleccion a la casa que pertenece:");
        Scanner cas= new Scanner(System.in);
        casa=casashog[cas.nextInt()-1];
        
        System.out.println("Tipos de Magos/Brujas");
        System.out.println("1. Animago");
        System.out.println("2. Metamorfomago");
        System.out.println("3. Estandar");
        
        Scanner tip=new Scanner(System.in);
        System.out.println("Elija el tipo de mago/bruja que es: ");
        int tipo=tip.nextInt();
        
        
        switch(tipo){
            case 1:
                System.out.println("¿En que clase de animal puede convertirse?: ");
                Scanner anim=new Scanner(System.in);
                String animal, hechizo;
                animal=anim.nextLine();
                Scanner hech = new Scanner(System.in);
                System.out.println("Ingrese el hechizo que usa:");
                hechizo = hech.nextLine();
                
                Scanner verif=new Scanner(System.in);
                System.out.println("Desea crear el curso con la informacion deseada? S/N:  ");
                if(verif.next().equalsIgnoreCase("S")){
                    Animagos ani = new Animagos(animal, hechizo,nombre, apellido, varita, fecha_ingreso, edad, casa);
                }
                break;
            case 2:
                System.out.println("¿Que tipo de posicion consume: ?: ");
                Scanner poc=new Scanner(System.in);
                String pocion;
                pocion=poc.nextLine();
                
                Scanner verif2=new Scanner(System.in);
                System.out.println("Desea crear el curso con la informacion deseada? S/N:  ");
                if(verif2.next().equalsIgnoreCase("S")){
                    Metamorfomago met= new Metamorfomago(pocion,nombre, apellido, varita, fecha_ingreso, edad, casa);
                }
                break;
            case 3:
                System.out.println("¿Cual es su deporte favorito?: ");
                Scanner dep=new Scanner(System.in);
                String deporte=dep.nextLine();
                
                Scanner verif3=new Scanner(System.in);
                System.out.println("Desea crear el curso con la informacion deseada? S/N:  ");
                if(verif3.next().equalsIgnoreCase("S")){
                    Normal norm = new Normal(deporte, nombre, apellido, varita, fecha_ingreso, edad, casa);
                }
        }
        
    }
    public void crearEstudiante(){
    String nombre, apellido,fecha_ingreso,varita;int edad; Casas_Hogwards casa;
    System.out.println("/** CREAR ESTUDIANTE **/");
    Scanner nom=new Scanner(System.in);
        System.out.println("Ingrese Nombre: ");
        nombre=nom.nextLine();
        
        Scanner ape=new Scanner(System.in);
        System.out.println("Ingrese Apellido: ");
        apellido=ape.nextLine();

        Scanner eda=new Scanner(System.in);
        System.out.println("Ingrese Edad: ");
        edad=eda.nextInt();
        
        Scanner fech = new Scanner(System.in);
        System.out.println("Ingrese la fecha de ingreso:");
        fecha_ingreso = fech.nextLine();

        Scanner var=new Scanner(System.in);
        System.out.println("Varita: ");
        varita=var.nextLine();
        
        for(int i=0;i<casashog.length;i++){
            System.out.println(i+1+". "+casashog[i].name());
        }
        System.out.println("Seleccion a la casa que pertenece:");
        Scanner cas= new Scanner(System.in);
        casa=casashog[cas.nextInt()-1];
        System.out.println("Tipos de Magos/Brujas");
        System.out.println("1. Animago");
        System.out.println("2. Metamorfomago");
        System.out.println("3. Estandar");
        
        Scanner tip=new Scanner(System.in);
        System.out.println("Elija el tipo de mago/bruja que es: ");
        int tipo=tip.nextInt();
        
        
        switch(tipo){
            case 1:
                System.out.println("¿En que clase de animal puede convertirse?: ");
                Scanner anim=new Scanner(System.in);
                String animal, hechizo;
                animal=anim.nextLine();
                Scanner hech = new Scanner(System.in);
                System.out.println("Ingrese el hechizo que usa:");
                hechizo = hech.nextLine();
                Animagos ani = new Animagos(animal, hechizo,nombre, apellido, varita, fecha_ingreso, edad, casa);
                Scanner verif=new Scanner(System.in);
                System.out.println("Desea crear el curso con la informacion deseada? S/N:  ");
                if(verif.next().equalsIgnoreCase("S")){

                }
                break;
            case 2:
                System.out.println("¿Que tipo de posicion consume: ?: ");
                Scanner poc=new Scanner(System.in);
                String pocion;
                pocion=poc.nextLine();
                Metamorfomago met= new Metamorfomago(pocion,nombre, apellido, varita, fecha_ingreso, edad, casa);
                Scanner verif2=new Scanner(System.in);
                System.out.println("Desea crear el curso con la informacion deseada? S/N:  ");
                if(verif2.next().equalsIgnoreCase("S")){

                }
                break;
            case 3:
                System.out.println("¿Cual es su deporte favorito?: ");
                Scanner dep=new Scanner(System.in);
                String deporte=dep.nextLine();
                Normal norm = new Normal(deporte, nombre, apellido, varita, fecha_ingreso, edad, casa);
                Scanner verif3=new Scanner(System.in);
                System.out.println("Desea crear el curso con la informacion deseada? S/N:  ");
                if(verif3.next().equalsIgnoreCase("S")){

                }
    }
    }
    public void VerhorariosPlanificados(){
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
                     System.out.println("Materia:"+materias[0]+"/n"+"Profesor:"+profesor+"/n"+"Horario:"+c.getDia()+","+horario+"/n"+"Registrados:"+registrados);
                 }
                 
             }
             break;
         case 2:
            for(Curso c: cursos){
                 if(materias[1].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[1]+"/n"+"Profesor:"+profesor+"/n"+"Horario:"+c.getDia()+","+horario+"/n"+"Registrados:"+registrados);
                 } 
     }
             break;
         case 3:
             for(Curso c: cursos){
                 if(materias[2].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[2]+"/n"+"Profesor:"+profesor+"/n"+"Horario:"+c.getDia()+","+horario+"/n"+"Registrados:"+registrados);
                 }
    }       break;
         case 4:
             for(Curso c: cursos){
                 if(materias[3].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[3]+"/n"+"Profesor:"+profesor+"/n"+"Horario:"+c.getDia()+","+horario+"/n"+"Registrados:"+registrados);
                 }
    }       break;
         case 5:
             for(Curso c: cursos){
                 if(materias[4].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[4]+"/n"+"Profesor:"+profesor+"/n"+"Horario:"+c.getDia()+","+horario+"/n"+"Registrados:"+registrados);
                 }
    }       break;
         case 6:
             for(Curso c: cursos){
                 if(materias[5].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[5]+"/n"+"Profesor:"+profesor+"/n"+"Horario:"+c.getDia()+","+horario+"/n"+"Registrados:"+registrados);
                 }
    }       break;
         case 7:
             for(Curso c: cursos){
                 if(materias[6].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[6]+"/n"+"Profesor:"+profesor+"/n"+"Horario:"+c.getDia()+","+horario+"/n"+"Registrados:"+registrados);
                 }
    }       break;
         case 8:
             for(Curso c: cursos){
                 if(materias[7].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[7]+"/n"+"Profesor:"+profesor+"/n"+"Horario:"+c.getDia()+","+horario+"/n"+"Registrados:"+registrados);
                 }
    }
    }
    }
    public void ListadoEstudiantes(){}
}
