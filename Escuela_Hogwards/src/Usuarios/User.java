/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import CursMate.Curso;
import CursMate.Dias;
import CursMate.Materias;
import CursMate.Registros;
import Personas.Brujo_Mago;
import Personas.Casas_Hogwards;
import Personas.EstudiantesRegistros;
import Writer_Reader.Lectura;
import escuela_hogwards.Escuela_Hogwards;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class User {
    private String rol;
    private String nusuario,contraseña;
     Brujo_Mago est;
    public Materias[]materias=new Materias[]{Materias.Pociones,Materias.Defensascontraartesocuras,Materias.Adivinacion,Materias.Astronomia,Materias.Historiademagia,Materias.Herbologia,Materias.Encantamientos,Materias.Vuelo};
    public Dias[]dias=new Dias[]{Dias.Lunes,Dias.Martes,Dias.Miercoles,Dias.Jueves,Dias.Viernes,Dias.Sabado,Dias.Domingo};
    public Casas_Hogwards[]casashog=new Casas_Hogwards[]{Casas_Hogwards.Griffindor,Casas_Hogwards.Hufflepuff,Casas_Hogwards.Ravenclaw,Casas_Hogwards.Slytherin};
    public ArrayList<Curso> cursos = new ArrayList<Curso>();
    public ArrayList<Brujo_Mago> estudiantes = new ArrayList<Brujo_Mago>();
    public ArrayList<Brujo_Mago> profesores = new ArrayList<Brujo_Mago>();
    public ArrayList<Registros> registros = new ArrayList<Registros>();
    public ArrayList<EstudiantesRegistros>estreg=new ArrayList<EstudiantesRegistros>();

    public User(String nusuario, String contraseña, Brujo_Mago est,String rol) {
        this.rol = rol;
        this.nusuario = nusuario;
        this.contraseña = contraseña;
        this.est = est;
    }

    public User(){
        
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
    
    public void Lecture(Lectura lectura){
        lectura.lecturestu(estudiantes);
        lectura.lecturprofe(profesores);
        lectura.lecturcurso(cursos);
    }

}
