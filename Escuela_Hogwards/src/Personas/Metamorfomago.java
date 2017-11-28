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

    public Metamorfomago(String pocion, String nombre, String apellido, Casas_Hogwards casa, String varita, String cargo, int edad) {
        super(nombre, apellido, casa, varita, cargo, edad);
        this.pocion = pocion;
    }



    public void setPocion(String pocion) {
        this.pocion = pocion;
    }

    public String getPocion() {
        return pocion;
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
