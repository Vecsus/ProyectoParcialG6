/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;
import java.util.ArrayList;
import CursMate.*;
import Personas.*;
import Writer_Reader.*;
import escuela_hogwards.Escuela_Hogwards;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Usuario
 */
public class Planificador extends User {
    
    Lectura let=new Lectura();
    Escuela_Hogwards esho=new Escuela_Hogwards();

    public Planificador(String nusuario, String contraseña, Brujo_Mago est,String rol) {
        super(nusuario, contraseña, est,rol);
    }
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
        let.lecturcurso(cursos);
        let.lecturprofe(profesores);
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
        profesor=profesores.get(profe.nextInt()-1);
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
            Escritura esc=new Escritura();
            esc.escrituracurso(cursos);
        }else{
            menuplanificador();
            }
    }
    public void crearProfesor(){
        String nombre, apellido,fecha_ingreso,varita;int edad;
        Escritura esc=new Escritura();
        let.lecturprofe(profesores);
                            
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
                String animal=anim.nextLine();
                
                System.out.println("¿Que hechizo puede usar?: ");
                Scanner hech=new Scanner(System.in);
                String hechizo=hech.nextLine();
                
                Scanner verif=new Scanner(System.in);
                System.out.println("Desea crear el profesor con la informacion deseada? S/N:  ");
                if(verif.next().equalsIgnoreCase("S")){
                    Animagos ani = new Animagos(animal,hechizo,nombre, apellido, varita, fecha_ingreso, edad, null);
                    profesores.add(ani);
                    esc.escrituraprof(profesores);
                }else{
                    menuplanificador();
                }
                break;
            case 2:
                System.out.println("¿Que tipo de posicion consume: ?: ");
                Scanner poc=new Scanner(System.in);
                String pocion;
                pocion=poc.nextLine();
                
                Scanner verif2=new Scanner(System.in);
                System.out.println("Desea crear el profesor con la informacion deseada? S/N:  ");
                if(verif2.next().equalsIgnoreCase("S")){
                    Metamorfomago met= new Metamorfomago(pocion,nombre, apellido, varita, fecha_ingreso, edad, null);
                    profesores.add(met);
                    esc.escrituraprof(profesores);
                }else{
                    menuplanificador();
                }
                break;
            case 3:
                System.out.println("¿Cual es su deporte favorito?: ");
                Scanner dep=new Scanner(System.in);
                String deporte=dep.nextLine();
                
                Scanner verif3=new Scanner(System.in);
                System.out.println("Desea crear el profesor con la informacion deseada? S/N:  ");
                if(verif3.next().equalsIgnoreCase("S")){
                    Normal norm = new Normal(deporte, nombre, apellido, varita, fecha_ingreso, edad, null);
                    profesores.add(norm);
                    esc.escrituraprof(profesores);
                }else{
                    menuplanificador();
                }
                break;
        }
        
    }
    public void crearEstudiante(){
    String nombre, apellido,varita;int edad; Casas_Hogwards casa;
    Escritura est=new Escritura();
    let.lecturestu(estudiantes);
    let.lecturuse(esho.usuarios);
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
                String animal=anim.nextLine();
                
                System.out.println("¿Que hechizo puede usar?: ");
                Scanner hech=new Scanner(System.in);
                String hechizo=hech.nextLine();
                
                Animagos ani = new Animagos(hechizo,animal,nombre, apellido, varita, null, edad, casa);
                Scanner verif=new Scanner(System.in);
                System.out.println("Desea crear el estudiante con la informacion deseada? S/N:  ");
                if(verif.next().equalsIgnoreCase("S")){
                    estudiantes.add(ani);
                    est.escrituraest(estudiantes);
                }else{
                    menuplanificador();
                }
                break;
            case 2:
                System.out.println("¿Que tipo de posicion consume: ?: ");
                Scanner poc=new Scanner(System.in);
                String pocion;
                pocion=poc.nextLine();
                Metamorfomago met= new Metamorfomago(pocion,nombre, apellido, varita, null, edad, casa);
                Scanner verif2=new Scanner(System.in);
                System.out.println("Desea crear el estudiante con la informacion deseada? S/N:  ");
                if(verif2.next().equalsIgnoreCase("S")){
                    estudiantes.add(met);
                    est.escrituraest(estudiantes);
                }else{
                    menuplanificador();
                }
                break;
            case 3:
                System.out.println("¿Cual es su deporte favorito?: ");
                Scanner dep=new Scanner(System.in);
                String deporte=dep.nextLine();
                Normal norm = new Normal(deporte, nombre, apellido, varita, null, edad, casa);
                Scanner verif3=new Scanner(System.in);
                System.out.println("Desea crear el estudiante con la informacion deseada? S/N:  ");
                if(verif3.next().equalsIgnoreCase("S")){
                    estudiantes.add(norm);
                    est.escrituraest(estudiantes);
                }else{
                    menuplanificador();
                }
                break;
    }
    }
    
    public User CrearUserEstudiante(Brujo_Mago bruj){
        String palabra=bruj.GetNombre().substring(0, 2)+bruj.GetApellido().substring(0, 5);
        User rei=new User(palabra, palabra, bruj, "estudiante");
    return rei;
    }
    public void VerhorariosPlanificados(){
        let.lecturcurso(cursos);
        let.lecturprofe(profesores);
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
                     System.out.println("Materia:"+materias[0]+"\n"+"Profesor:"+profesor+"\n"+"Horario:"+c.getDia()+","+horario+"\n"+"Registrados:"+registrados);
                 }
                 
             }
             break;
         case 2:
            for(Curso c: cursos){
                 if(materias[1].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[1]+"\n"+"Profesor:"+profesor+"\n"+"Horario:"+c.getDia()+","+horario+"\n"+"Registrados:"+registrados);
                 } 
     }
             break;
         case 3:
             for(Curso c: cursos){
                 if(materias[2].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[2]+"\n"+"Profesor:"+profesor+"\n"+"Horario:"+c.getDia()+","+horario+"\n"+"Registrados:"+registrados);
                 }
    }       break;
         case 4:
             for(Curso c: cursos){
                 if(materias[3].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[3]+"\n"+"Profesor:"+profesor+"\n"+"Horario:"+c.getDia()+","+horario+"\n"+"Registrados:"+registrados);
                 }
    }       break;
         case 5:
             for(Curso c: cursos){
                 if(materias[4].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[4]+"\n"+"Profesor:"+profesor+"\n"+"Horario:"+c.getDia()+","+horario+"\n"+"Registrados:"+registrados);
                 }
    }       break;
         case 6:
             for(Curso c: cursos){
                 if(materias[5].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[5]+"\n"+"Profesor:"+profesor+"\n"+"Horario:"+c.getDia()+","+horario+"\n"+"Registrados:"+registrados);
                 }
    }       break;
         case 7:
             for(Curso c: cursos){
                 if(materias[6].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[6]+"\n"+"Profesor:"+profesor+"\n"+"Horario:"+c.getDia()+","+horario+"\n"+"Registrados:"+registrados);
                 }
    }       break;
         case 8:
             for(Curso c: cursos){
                 if(materias[7].equals(c.getMateria())){
                     String profesor = c.getProfesor().GetNombre()+" "+ c.getProfesor().GetNombre();
                     String horario = c.getHorario();
                     int registrados = c.getCapacidad();
                     System.out.println("Materia:"+materias[7]+"\n"+"Profesor:"+profesor+"\n"+"Horario:"+c.getDia()+","+horario+"\n"+"Registrados:"+registrados);
                 }
    }
    }
    }
    
    public void ListadoEstudiantes(){
        let.lecturestu(estudiantes);
        let.lecturreg(registros);
    System.out.println("/** LISTADO DE ESTUDIANTES**/");
    System.out.println("1. Edad"+"\n"+"2. Nombre"+"\n"+"3. Numero de materias registradas");
    System.out.println("Escoja el criterio para ordenar:");
    Scanner sc = new Scanner(System.in);
    int eleccion = sc.nextInt();
    switch(eleccion){
        case 1:
            Comparator<Brujo_Mago> comparator;
            comparator = new Comparator<Brujo_Mago>(){
            @Override
            public int compare(Brujo_Mago t, Brujo_Mago t1) {
              {
                int resultado = Integer.compare(t.GetEdad(), t1.GetEdad());
                if ( resultado != 0 ) { return resultado; }
        
                return resultado;  
            }

        }          
    };
            Collections.sort(estudiantes,comparator);
            for(Brujo_Mago b: estudiantes){
                int x = 0;
                for(Registros reg: registros){
                    
                    if(b.GetNombre().equalsIgnoreCase(reg.getNombre())&&b.GetApellido().equalsIgnoreCase(reg.getApellidos())){
                        x++;
                    }
                }
                System.out.println(b.GetNombre()+" "+b.GetApellido()+" -- "+b.GetEdad()+" -- " +b.GetCasa()+" -- "+x+" materias");
            }
            break;
        case 2:
            Comparator<Brujo_Mago> comparator2;
            comparator2 = new Comparator<Brujo_Mago>(){
                @Override
                public int compare(Brujo_Mago t, Brujo_Mago t1){
                    {
                        int resultado1 = t.GetNombre().compareTo(t1.GetNombre());
                        if (resultado1 != 0){return resultado1;}
                        return resultado1;
                    }
                    
                }
            };
            Collections.sort(estudiantes,comparator2);
            for(Brujo_Mago b:estudiantes){
                int x = 0;
                for(Registros reg: registros){
                    
                    if(b.GetNombre().equalsIgnoreCase(reg.getNombre())&&b.GetApellido().equalsIgnoreCase(reg.getApellidos())){
                        x++;
                    }
                }
                System.out.println(b.GetNombre()+" "+b.GetApellido()+" -- "+b.GetEdad()+" -- " +b.GetCasa()+" -- "+x+" materias");
            }
            break;
        case 3:
            for(Brujo_Mago b:estudiantes){
                int x = 0;
                for(Registros reg: registros){
                    
                    if(b.GetNombre().equalsIgnoreCase(reg.getNombre())&&b.GetApellido().equalsIgnoreCase(reg.getApellidos())){
                        x++;
                    }
                    EstudiantesRegistros er= new EstudiantesRegistros(x,b);
                    estreg.add(er);
                }
                Comparator<EstudiantesRegistros> comparator3;
                comparator3 = new Comparator<EstudiantesRegistros>(){
                    @Override
                    public int compare(EstudiantesRegistros t, EstudiantesRegistros t1) {
                        int resultado2 = Integer.compare(t.getContador(), t.getContador());
                        if ( resultado2 != 0 ) { return resultado2; }
                        return resultado2;
                    }
                    };
                Collections.sort(estreg,comparator3);
                for(Brujo_Mago br:estudiantes){
                    for(EstudiantesRegistros er: estreg){
                        if((br.GetNombre().equalsIgnoreCase(er.getEstudiante().GetNombre()))&&(br.GetApellido().equalsIgnoreCase(er.getEstudiante().GetApellido()))){
                            System.out.println(br.GetNombre()+" "+br.GetApellido()+" -- "+br.GetEdad()+" -- " +br.GetCasa()+" -- "+er.getContador()+" materias");
                        }
                    }
                }
                }
}
}
}