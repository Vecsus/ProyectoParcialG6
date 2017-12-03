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
    String nombre, apellido, varita, cargo,fecha_ingreso;
    int edad;
    Casas_Hogwards casa;

    public Brujo_Mago(String nombre, String apellido, String varita, String fecha_ingreso, int edad, Casas_Hogwards casa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.varita = varita;
        this.fecha_ingreso = fecha_ingreso;
        this.edad = edad;
        this.casa = casa;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
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
    public void volar(){
        
    }
}
