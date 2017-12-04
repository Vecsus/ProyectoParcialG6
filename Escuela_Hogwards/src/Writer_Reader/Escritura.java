/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Writer_Reader;

import CursMate.*;
import Personas.*;
import Usuarios.User;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Escritura {
    //Ruta relativa para la escritura de textos.
    String s= "src/Resources/";
    private final File student = new File(s+"estudiantes.txt");
    private final File teacher = new File(s+"profesores.txt");
    private final File curse = new File(s+"cursos.txt");
    private final File users = new File(s+"usuarios.txt");
    private final File registross=new File(s+"registros.txt");
    
        FileWriter fr = null;
        BufferedWriter br = null;
        PrintWriter frr = null;
    public void escrituraest(ArrayList<Brujo_Mago>Brujo){

    try {
        //Apertura del fichero y creacion de BufferedReader para poder
        //hacer una escritura comoda (disponer del metodo readLine()).
    fr = new FileWriter(student);
    br = new BufferedWriter(fr);
    frr=new PrintWriter(br);
    for(Brujo_Mago estudiante:Brujo){
        if(estudiante instanceof Normal){
            Normal estudiantes=(Normal)estudiante;
            frr.append(estudiantes.toString()+"\n");
        }
        if(estudiante instanceof Animagos){
           Animagos estudiantes=(Animagos)estudiante;
            frr.append(estudiantes.toString()+"\n"); 
        }
        if(estudiante instanceof Metamorfomago){
            Metamorfomago estudiantes=(Metamorfomago)estudiante;
            frr.append(estudiantes.toString()+"\n");
        }              
    }

    } catch (IOException e) {
        System.out.println("Error: "+e);

    }finally{
            try {
                frr.close();
                br.close();
                fr.close();
            } catch (IOException ex) {
                System.out.println("Error: "+ex);
            }
    }
    }

    public void escrituraprof(ArrayList<Brujo_Mago>Brujo){
    try {
        //Apertura del fichero y creacion de BufferedReader para poder
        //hacer una escritura comoda (disponer del metodo readLine()).
    fr = new FileWriter(teacher);
    br = new BufferedWriter(fr);
    frr=new PrintWriter(br);
    for(Brujo_Mago profesor:Brujo){
        if(profesor instanceof Normal){
            Normal profes=(Normal)profesor;
            frr.append(profes.toStringProfesor()+"\n");
        }
        if(profesor instanceof Animagos){
            Animagos profes=(Animagos)profesor;
            frr.append(profes.toStringProfesor()+"\n");
        }if(profesor instanceof Metamorfomago){
            Metamorfomago profes=(Metamorfomago)profesor;
            frr.append(profes.toStringProfesor()+"\n");
        }              
    }

    } catch (IOException e) {
        System.out.println("Error: "+e);

    }finally{
            try {
                frr.close();
                br.close();
                fr.close();
            } catch (IOException ex) {
                System.out.println("Error: "+ex);
            }
    }
    }
    
    public void escrituracurso(ArrayList<Curso>Curs){
        
    try {
        //Apertura del fichero y creacion de BufferedReader para poder
        //hacer una escritura comoda (disponer del metodo readLine()).
    fr = new FileWriter(curse);
    br = new BufferedWriter(fr);
    frr=new PrintWriter(br);
    Curs.forEach((cursos8) -> {       
        frr.append(cursos8.toString()+"\n");
        });
    } catch (IOException e) {
        System.out.println("Error: "+e);

    }finally{
            try {
                frr.close();
                br.close();
                fr.close();
            } catch (IOException ex) {
                System.out.println("Error: "+ex);
            }
    }
    }
    
    public void escriturausuar(ArrayList<User>us){
                
    try {
        //Apertura del fichero y creacion de BufferedReader para poder
        //hacer una escritura comoda (disponer del metodo readLine()).
    fr = new FileWriter(users);
    br = new BufferedWriter(fr);
    frr=new PrintWriter(br);
    us.forEach((usuar) -> {       
        frr.append(usuar.toString()+"\n");
        });
    } catch (IOException e) {
        System.out.println("Error: "+e);

    }finally{
            try {
                frr.close();
                br.close();
                fr.close();
            } catch (IOException ex) {
                System.out.println("Error: "+ex);
            }
    }
    }
    
        public void escrituregist(ArrayList<Registros>regist){
                
    try {
        //Apertura del fichero y creacion de BufferedReader para poder
        //hacer una escritura comoda (disponer del metodo readLine()).
    fr = new FileWriter(registross);
    br = new BufferedWriter(fr);
    frr=new PrintWriter(br);
    regist.forEach((usuar) -> {       
        frr.append(usuar.toString()+"\n");
        });
    } catch (IOException e) {
        System.out.println("Error: "+e);

    }finally{
            try {
                frr.close();
                br.close();
                fr.close();
            } catch (IOException ex) {
                System.out.println("Error: "+ex);
            }
    }
    }
    public static void main(String[] arg) {
        Escritura es=new Escritura();
        }
}
