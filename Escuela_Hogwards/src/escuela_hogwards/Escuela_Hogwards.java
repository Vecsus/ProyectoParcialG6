/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela_hogwards;

import Usuarios.Estudiante;
import Usuarios.Planificador;
import Usuarios.User;
import Writer_Reader.Lectura;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Escuela_Hogwards {
        
        boolean verificacion=true;
        public ArrayList<User>usuarios=new ArrayList<User>();
        
        public void leu(Lectura l){
            l.lecturuse(usuarios);
        }
        public void verificacionregistro(){
            Scanner nom=new Scanner(System.in);
            System.out.println("Ingrese nombre de usuario: ");
            String nomusuario=nom.next();
            Scanner pasw=new Scanner(System.in);
            System.out.println("Ingrese contraseña: ");
            String password=pasw.next();
            for(User usuario: usuarios){
                if(nomusuario.equalsIgnoreCase(usuario.getNusuario())&&password.equalsIgnoreCase(usuario.getContraseña())){
                    verificacion=false;
                    System.out.println("Ingreso exitoso");
                    System.out.println();
                    if(usuario.getRol().equalsIgnoreCase("estudiante")){
                        Estudiante est =new Estudiante(nomusuario, password, usuario.getEst(), "estudiante");
                        est.menuEstudiante();
                    }else{
                        Planificador plan=new Planificador(nomusuario, password, usuario.getEst(), "planificador");
                        plan.menuplanificador();
                    }
                }
            }
                if(verificacion==true){
                    System.out.println("Su usuario y contraseña no son valido. Por favor intente otra vez.");
                }
        

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido a la Escuela Hogwards");
        Escuela_Hogwards esh=new Escuela_Hogwards(); 
        Lectura lectura=new Lectura();
        User us=new User();
        us.Lecture(lectura);
        esh.leu(lectura);
        while(esh.verificacion){
        esh.verificacionregistro();
        }
    }
    
}
