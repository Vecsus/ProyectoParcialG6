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

    public Normal(String deportef, String nombre, String apellido, int edad, Casas_Hogwards casa, String varita, String cargo) {
        super(nombre, apellido, edad, casa, varita, cargo);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void volar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
