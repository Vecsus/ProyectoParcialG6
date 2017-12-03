/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

/**
 *
 * @author SANDRA
 */
public class EstudiantesRegistros {
    int contador;
    Brujo_Mago estudiante;
    public EstudiantesRegistros(int contador, Brujo_Mago estudiante){
        this.contador = contador;
        this.estudiante = estudiante;
    }
    
    public Brujo_Mago getEstudiante(){
        return estudiante;
    }
    public int getContador(){
        return contador;
    }
    public void setContador(int contador){
        this.contador = contador;
    }
    public void setBrujo_Mago(Brujo_Mago estudiante){
        this.estudiante = estudiante;
    }
}
