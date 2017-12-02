/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import CursMate.*;
import Personas.*;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Planificador {
    public Materias[]materias=new Materias[]{Materias.Pociones,Materias.Defensascontraartesocuras,Materias.Adivinacion,Materias.Astronomia,Materias.Historiademagia,Materias.Herbologia,Materias.Encantamientos,Materias.Vuelo};
    public Brujo_Mago[] profesores;
    public Dias[]dias=new Dias[]{Dias.Lunes,Dias.Martes,Dias.Miercoles,Dias.Jueves,Dias.Viernes,Dias.Sabado,Dias.Domingo};
    public Casas_Hogwards[]casashog=new Casas_Hogwards[]{Casas_Hogwards.Grifindor,Casas_Hogwards.Hufflepuff,Casas_Hogwards.Ravenclaw,Casas_Hogwards.Slytherin};
    
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
        //Eleccion de materia
        Scanner mat= new Scanner(System.in);
        System.out.println("/''MATERIAS ''/");
        for(int i=0;i<materias.length;i++){
            System.out.println(i+1+". "+materias[i].name());
        }
        System.out.println("Elija una materia del listado de materias: ");
        materia=materias[mat.nextInt()];
        //Eleccion de profesor
        Scanner profe=new Scanner(System.in);
        System.out.println("/''PROFESORES ''/");
        for(int i=0;i<profesores.length;i++){
            System.out.println(i+1+". "+profesores[i].GetNombre()+" "+profesores[i].GetApellido());
        }
        System.out.println("Elija un profesor del listado: ");
        profesor=profesores[profe.nextInt()];
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
        dia=dias[di.nextInt()];
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
        }
    }
    public void crearProfesor(){
        String nombre, apellido,fecha_ingreso,varita,cualidad;int edad;
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

        Scanner var=new Scanner(System.in);
        System.out.println("Varita: ");
        varita=var.nextLine();
        
        System.out.println("Tipos de Magos/Brujas");
        System.out.println("1. Animago");
        System.out.println("2. Metamorfomago");
        System.out.println("3. Estandar");
        
        Scanner tip=new Scanner(System.in);
        System.out.println("Elija el tipo de mago/bruja que es: ");
        int tipo=tip.nextInt();
        
        Scanner anposdep=new Scanner(System.in);
        switch(tipo){
            case 1:
                System.out.println("¿En que clase de animal puede convertirse?: ");
                cualidad=anposdep.nextLine();
                Scanner verif=new Scanner(System.in);
                System.out.println("Desea crear el curso con la informacion deseada? S/N:  ");
                if(verif.next().equalsIgnoreCase("S")){

                }
                break;
            case 2:
                System.out.println("¿Que tipo de posicion consume: ?: ");
                cualidad=anposdep.nextLine();
                Scanner verif=new Scanner(System.in);
                System.out.println("Desea crear el curso con la informacion deseada? S/N:  ");
                if(verif.next().equalsIgnoreCase("S")){

                }
                break;
            default:
                System.out.println("¿Cual es su deporte favorito?: ");
                cualidad=anposdep.nextLine();
                break;
                Scanner verif=new Scanner(System.in);
                System.out.println("Desea crear el curso con la informacion deseada? S/N:  ");
                if(verif.next().equalsIgnoreCase("S")){

                }
        }
        
    }
    public void crearEstudiante(){
    String nombre,apellido,varita,casa,tipoMagoBruja;int edad;
    Scanner enter=new Scanner(System.in);
    System.out.println("/**Crear Estudiante**\");
    System.out.println("Ingrese Nombre: ");
    nombre=enter.nextLine();
    System.out.println("Ingrese Apellido: ");
    apellido=enter.nextLine();
    System.out.println("Ingrese Edad: ");
    edad=enter.nextInt();
    System.out.println("Varita: ");
    varita=enter.nextLine();
    System.out.println("\nTipos de Magos/Brujas");
    System.out.println("1. Animago");
    System.out.println("2. Metamorfomago");
    System.out.println("3. Estandar");
    System.out.println("Elija el tipo mago\bruja que es: ")
    int tipo=enter.nextInt();
    switch(tipo){
        case: 1
            tipoMagoBrujo="Animago";
            break;
        case:2
            tipoMagoBrujo="Metamorfomago";
            brak;
        case:3
            tipoMagoBrujo="Estandar";
    }         
    System.out.println("Desea guardar los dato? S/N: ")
    String eleccion=enter.nextLine();
    if(eleccion.equalsIgnoreCase("S")){//escritura del archivo.txt
    }
                       }                  }                   
    public void VerhorariosPlanificados(){}
    public void ListadoEstudiantes(){}
}
