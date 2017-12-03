/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Writer_Reader;


import CursMate.Curso;
import CursMate.Dias;
import CursMate.Materias;
import Personas.*;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Lectura {
    String s= "/Resources/";
    String stud=s+"estudiantes.txt";
    String tea=s+"profesores.xt";
    String par=s+"cursos.txt";
    
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    public void lecturestu(ArrayList<Brujo_Mago>Brujo){
        try {
        //Apertura del fichero y creacion de BufferedReader para poder
        //hacer una lectura comoda (disponer del metodo readLine()).
        InputStream inputstream = Lectura.class.getResourceAsStream(s+"estudiantes.txt");
        InputStreamReader inputreader = new InputStreamReader(inputstream);
        br = new BufferedReader(inputreader);
        // Lectura del fichero
        String linea;
        while ((linea = br.readLine()) != null) {
            String[]Lin=linea.split(",");
            if(Lin[Lin.length-1].equalsIgnoreCase("A")){
                Animagos an=new Animagos(null,null,Lin[0], Lin[1], Lin[3], null, Integer.parseInt(Lin[2]), Casas_Hogwards.valueOf(Lin[4]));
                Brujo.add((Brujo_Mago)an);
            }if(Lin[Lin.length-1].equalsIgnoreCase("N")){
                Normal nor=new Normal(null,Lin[0], Lin[1], Lin[3], null, Integer.parseInt(Lin[2]), Casas_Hogwards.valueOf(Lin[4]));
                Brujo.add((Brujo_Mago)nor);
            }else{
                Metamorfomago metam=new Metamorfomago(null,Lin[0], Lin[1], Lin[3], null, Integer.parseInt(Lin[2]), Casas_Hogwards.valueOf(Lin[4]));
                Brujo.add((Brujo_Mago)metam);                    
            }
            System.out.println(linea);
        }
    } catch (IOException | NumberFormatException e) {
            System.out.println("Error: "+e);;
    }finally {
        // En el finally cerramos el fichero, para asegurarnos
        // que se cierra tanto si todo va bien como si salta 
        // una excepcion.
        try {
            if (null != fr) {
                fr.close();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } 
    }
    }

    public void lecturprofe(ArrayList<Brujo_Mago>Brujo){
        try {
        //Apertura del fichero y creacion de BufferedReader para poder
        //hacer una lectura comoda (disponer del metodo readLine()).
        InputStream inputstream = Lectura.class.getResourceAsStream(s+"estudiantes.txt");
        InputStreamReader inputreader = new InputStreamReader(inputstream);
        br = new BufferedReader(inputreader);
        // Lectura del fichero
        String linea;
        while ((linea = br.readLine()) != null) {
            String[]Lin=linea.split(",");
            if(Lin[Lin.length-3].equalsIgnoreCase("A")){
                Animagos an=new Animagos(Lin[Lin.length-2],Lin[Lin.length-1],Lin[0], Lin[1], Lin[3], Lin[4], Integer.parseInt(Lin[2]), null);
                Brujo.add((Brujo_Mago)an);
            }if(Lin[Lin.length-1].equalsIgnoreCase("N")){
                Normal nor=new Normal(Lin[Lin.length-1],Lin[0], Lin[1], Lin[3], Lin[4], Integer.parseInt(Lin[2]), null);
                Brujo.add((Brujo_Mago)nor);
            }else{
                Metamorfomago metam=new Metamorfomago(Lin[Lin.length-1],Lin[0], Lin[1], Lin[3], Lin[4], Integer.parseInt(Lin[2]), null);
                Brujo.add((Brujo_Mago)metam);                    
            }
            System.out.println(linea);
        }
    } catch (IOException | NumberFormatException e) {
            System.out.println("Error: "+e);;
    }finally {
        // En el finally cerramos el fichero, para asegurarnos
        // que se cierra tanto si todo va bien como si salta 
        // una excepcion.
        try {
            if (null != fr) {
                fr.close();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } 
    }
    }
    
    public void lecturcurso(ArrayList<Curso>curs){
        ArrayList<Brujo_Mago>prof = new ArrayList<>();
        lecturprofe(prof);
        try {
        //Apertura del fichero y creacion de BufferedReader para poder
        //hacer una lectura comoda (disponer del metodo readLine()).
        InputStream inputstream = Lectura.class.getResourceAsStream(s+"estudiantes.txt");
        InputStreamReader inputreader = new InputStreamReader(inputstream);
        br = new BufferedReader(inputreader);
        // Lectura del fichero
        String linea;
        while ((linea = br.readLine()) != null) {
            String[]Lin=linea.split(",");
            for(Brujo_Mago pr:prof){
                if(pr.GetNombre().equalsIgnoreCase(Lin[1])&&pr.GetApellido().equalsIgnoreCase(Lin[2])){
                Curso cur=new Curso(Materias.valueOf(Lin[0]), pr, Lin[Lin.length-1], Dias.valueOf(Lin[4]), Integer.parseInt(Lin[3]));
                curs.add(cur);

                System.out.println(linea);
                }
            }
        }
    } catch (IOException | NumberFormatException e) {
            System.out.println("Error: "+e);;
    }finally {
        // En el finally cerramos el fichero, para asegurarnos
        // que se cierra tanto si todo va bien como si salta 
        // una excepcion.
        try {
            if (null != fr) {
                fr.close();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } 
    }
    }

        public static void main(String[] arg) {
        
        }
        
}
