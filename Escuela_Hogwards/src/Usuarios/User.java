/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import CursMate.Curso;
import CursMate.Dias;
import CursMate.Materias;
import Personas.Brujo_Mago;
import Personas.Casas_Hogwards;
import Writer_Reader.Lectura;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class User {
    private String rol;
    private String nusuario,contraseña;
    private Brujo_Mago est;
    public Lectura lectura;
    public Materias[]materias=new Materias[]{Materias.Pociones,Materias.Defensascontraartesocuras,Materias.Adivinacion,Materias.Astronomia,Materias.Historiademagia,Materias.Herbologia,Materias.Encantamientos,Materias.Vuelo};
    public Dias[]dias=new Dias[]{Dias.Lunes,Dias.Martes,Dias.Miercoles,Dias.Jueves,Dias.Viernes,Dias.Sabado,Dias.Domingo};
    public Casas_Hogwards[]casashog=new Casas_Hogwards[]{Casas_Hogwards.Grifindor,Casas_Hogwards.Hufflepuff,Casas_Hogwards.Ravenclaw,Casas_Hogwards.Slytherin};
    public ArrayList<Curso> cursos = new ArrayList();
    public ArrayList<Brujo_Mago> estudiantes = new ArrayList();
    public ArrayList<Brujo_Mago> profesores = new ArrayList();
    public ArrayList<User>usuarios=new ArrayList<>();

    public User(String nusuario, String contraseña, Brujo_Mago est,String rol) {
        this.rol = rol;
        this.nusuario = nusuario;
        this.contraseña = contraseña;
        this.est = est;
    }

    @Override
    public String toString(){
        String message=nusuario+","+contraseña+","+est.GetNombre()+","+est.GetApellido()+","+rol;
        return message;
    }
    public Brujo_Mago getEst() {
        return est;
    }

    public void setEst(Brujo_Mago est) {
        this.est = est;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNusuario() {
        return nusuario;
    }

    public void setNusuario(String nusuario) {
        this.nusuario = nusuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void Lecture(){
        lectura=new Lectura();
        lectura.lecturestu(estudiantes);
        lectura.lecturprofe(profesores);
        lectura.lecturcurso(cursos);
    }
    public void verificacionregistro(){
        boolean verificacion=true;
        lectura.lecturuse(usuarios);
        Scanner nom=new Scanner(System.in);
        System.out.println("Ingrese nombre de usuario: ");
        String nomusuario=nom.next();
        Scanner pasw=new Scanner(System.in);
        System.out.println("Ingrese contraseña: ");
        String password=pasw.next();
        do{
            for(User usuario: usuarios){
                if(nomusuario.equalsIgnoreCase(usuario.getNusuario())&&password.equalsIgnoreCase(usuario.getContraseña())){
                    verificacion=false;
                    System.out.println("Ingreso exitoso");
                    System.out.println();
                    Lecture();
                    if(rol.equalsIgnoreCase("estudiante")){
                        Estudiante est =(Estudiante)usuario;
                        est.menuEstudiante();
                    }else{
                        Planificador plan= (Planificador)usuario;
                        plan.menuplanificador();
                    }
                }
            }
                if(verificacion=false){
                    System.out.println("Su usuario y contraseña no son valido. Por favor intente otra vez.");
                }
        }while(verificacion);
        
    }
}
