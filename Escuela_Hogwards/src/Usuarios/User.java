/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class User {
    private String rol;
    private String usuario,contraseña;

    public User(String rol, String usuario, String contraseña) {
        this.rol = rol;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void verificacionregistro(){
        boolean verificacion=true;
        Scanner nom=new Scanner(System.in);
        System.out.println("Ingrese nombre de usuario: ");
        String nomusuario=nom.next();
        Scanner pasw=new Scanner(System.in);
        System.out.println("Ingrese contraseña: ");
        String password=pasw.next();
        do{
            if(nomusuario.equalsIgnoreCase(usuario)&&password.equalsIgnoreCase(contraseña)){
                verificacion=false;
                if(rol.equalsIgnoreCase("estudiante")){
                    Estudiante est=new Estudiante();
                    est.menuEstudiante();
                }else{
                    Planificador plan= new Planificador();
                    plan.menuplanificador();
                }
            }else{
                System.out.println("Su usuario o contraseña es erronea, intente nuevamente.");
            }
        }while(verificacion);
        
    }
}
