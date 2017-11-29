/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursMate;



/**
 *
 * @author Usuario
 */
public class Curso {
    private Materias materia;
    private String horario;
    private Dias dia;
    private int capacidad;

    public Curso(Materias materia, String horario, Dias dia, int capacidad) {
        this.materia = materia;
        this.horario = horario;
        this.dia = dia;
        this.capacidad = capacidad;
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
    
    
}
