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
public class Metamorfomago extends Brujo_Mago implements Volador{
    private  String pocion;

    public Metamorfomago(String pocion, String nombre, String apellido, String varita, String fecha_ingreso, int edad, Casas_Hogwards casa) {
        super(nombre, apellido, varita, fecha_ingreso, edad, casa);
        this.pocion = pocion;
    }

    @Override
    public String toString(){
        String normal=GetNombre()+","+GetApellido()+","+GetEdad()+","+GetVarita()+","+GetCasa().name()+",M";
        return normal;
    }
    
    public String toStringProfesor(){
        String normal=GetNombre()+","+GetApellido()+","+GetEdad()+","+GetVarita()+","+getFecha_ingreso()+",M,"+getPocion();
        return normal;
    }



    public void setPocion(String pocion) {
        this.pocion = pocion;
    }

    public String getPocion() {
        return pocion;
    }

    @Override
    public void despegar() {
        System.out.println("El metamorfomago está a punto de despegar.");
    }

    @Override
    public void volar() {
        System.out.println("El metamorfomago puede volar con su poder.");
    }
    
}
