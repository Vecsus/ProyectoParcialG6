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

    public Normal(String deportef, String nombre, String apellido, Casas_Hogwards casa, String varita, String cargo, int edad) {
        super(nombre, apellido, casa, varita, cargo, edad);
        this.deportef = deportef;
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
