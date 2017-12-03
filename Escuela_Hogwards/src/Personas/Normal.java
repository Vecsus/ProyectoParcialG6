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
public class Normal extends Brujo_Mago implements Volador{
    private String deportef;

    public Normal(String deportef, String nombre, String apellido, String varita,  String fecha_ingreso, int edad, Casas_Hogwards casa) {
        super(nombre, apellido, varita,  fecha_ingreso, edad, casa);
        this.deportef = deportef;
    }

    @Override
    public String toString(){
        String normal=GetNombre()+","+GetApellido()+","+GetEdad()+","+GetVarita()+","+GetCasa().name()+",N";
        return normal;
    }
    
    public String toStringProfesor(){
        String normal=GetNombre()+","+GetApellido()+","+GetEdad()+","+GetVarita()+","+getFecha_ingreso()+",N,"+getDeportef();
        return normal;
    }


    public void setDeportef(String deportef) {
        this.deportef = deportef;
    }

    public String getDeportef() {
        return deportef;
    }

    @Override
    public void despegar() {
        System.out.println("El mago normal está a punto de despegar");
    }

    @Override
    public void volar() {
        System.out.println("El mago normal puede volar con su escoba de modelo Nimbus 2000.");
    }
    
    
}
