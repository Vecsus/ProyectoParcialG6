/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursMate;

import Personas.Brujo_Mago;



/**
 *
 * @author Usuario
 */
public class Curso {
    private Materias materia;
    private Brujo_Mago profesor;
    private String horario;
    private Dias dia;
    private int capacidad;    

    public Curso(Materias materia, Brujo_Mago profesor, String horario, Dias dia, int capacidad) {
        this.materia = materia;
        this.profesor=profesor;
        this.horario = horario;
        this.dia = dia;
        this.capacidad = capacidad;
    }

    @Override
    public String toString(){
        String curso=getMateria().name()+","+getProfesor().GetNombre()+","+getProfesor().GetApellido()+","+getCapacidad()+","+getHorario();
        return curso;
    }
    public Materias getMateria() {
        return materia;
    }

    public void setMateria(Materias materia) {
        this.materia = materia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Dias getDia() {
        return dia;
    }

    public void setDia(Dias dia) {
        this.dia = dia;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Brujo_Mago getProfesor() {
        return profesor;
    }

    public void setProfesor(Brujo_Mago profesor) {
        this.profesor = profesor;
    }


    
    
}
