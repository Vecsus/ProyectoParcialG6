/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursMate;

/**
 *
 * @author SANDRA
 */
public class Registros {
    public String  nombre, apellidos, fecha;
    String tipo;
    
    Materias materia;
    
    public Registros(String fecha, String nombre, String apellidos, String tipo, Materias materia){
        this.fecha = fecha;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipo = tipo;
        this.materia = materia;
        
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setMateria(Materias materia){
        this.materia = materia;
    }
    public String getFecha(){
        return fecha;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public String getTipo(){
        return tipo;
    }
    public Materias getMateria(){
        return materia;
    }
}
