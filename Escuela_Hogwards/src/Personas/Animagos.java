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
public class Animagos extends Brujo_Mago implements Volador{
    private String animal;
    private String hechizo;

    public Animagos(String animal, String hechizo, String nombre, String apellido, String varita, String fecha_ingreso, int edad, Casas_Hogwards casa) {
        super(nombre, apellido, varita, fecha_ingreso, edad, casa);
        this.animal = animal;
        this.hechizo = hechizo;
    }





    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }
    public void setHechizo(String hechizo){
        this.hechizo = hechizo;
    }
    public String getHechizo(){
        return hechizo;
    }

    @Override
    public void despegar() {
        System.out.println("El animago està a punto de despegar");
    }

    @Override
    public void volar() {
        System.out.println("El animago vuela con ayuda de su varita.");
    }
    
    
}
