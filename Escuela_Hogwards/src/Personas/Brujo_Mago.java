/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

/**
 *
 * @author Usuario
 */
public class Brujo_Mago {
    String nombre, apellido, varita, cargo;
    int edad;
    Casas_Hogwards casa;
    
    public Brujo_Mago(String nombre, String apellido, Casas_Hogwards casa, String varita, String cargo, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.casa = casa;
        this.varita = varita;
        this.cargo = cargo;
        this.edad = edad;
    }
    public String GetNombre(){
        return nombre;
    }
    public String GetApellido(){
        return apellido;
    }
    public String GetVarita(){
        return varita;
    }
    public String GetCargo(){
        return cargo;
    }
    public Casas_Hogwards GetCasa(){
        return casa;
    }
    public int GetEdad(){
        return edad;
    }
    public void SetNombre(String nombre){
        this.nombre = nombre;
    }
    public void SetApellido(String apellido){
        this.apellido = apellido;
    }
    public void SetVarita(String varita){
        this.varita = varita;
    }
    public void SetCargo(String cargo){
        this.cargo = cargo;
    }
    public void SetEdad(int edad){
        this.edad = edad;
    }
    public void SetCasa(Casas_Hogwards casa){
        this.casa = casa;
    }
}
