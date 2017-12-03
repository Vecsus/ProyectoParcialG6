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
import Usuarios.User;
import escuela_hogwards.Escuela_Hogwards;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Lectura {
    String s= "/Resources/";
    String stud=s+"estudiantes.txt";
    String tea=s+"profesores.txt";
    String par=s+"cursos.txt";
    String use=s+"usuarios.txt";
    
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    InputStream inputstream=null;
    InputStreamReader inputreader=null;
    public void lecturestu(ArrayList<Brujo_Mago>Brujo){
        try {
        //Apertura del fichero y creacion de BufferedReader para poder
        //hacer una lectura comoda (disponer del metodo readLine()).
        InputStream inputstream = Lectura.class.getResourceAsStream(stud);
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
        }
    } catch (Exception e) {
            System.out.println("Error al leer archivo estudiantes: "+e);;
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

    public void lecturprofe(ArrayList<Brujo_Mago>profBrujo){
        try {
        //Apertura del fichero y creacion de BufferedReader para poder
        //hacer una lectura comoda (disponer del metodo readLine()).
        inputstream = Lectura.class.getResourceAsStream(tea.toString());
        inputreader = new InputStreamReader(inputstream);
        br = new BufferedReader(inputreader);
        // Lectura del fichero
        String linea;
        while ((linea = br.readLine()) != null) {
            String[]Lin=linea.split(",");
            if(Lin[Lin.length-3].equalsIgnoreCase("A")){
                Animagos an=new Animagos(Lin[Lin.length-2],Lin[Lin.length-1],Lin[0], Lin[1], Lin[3], Lin[4], Integer.parseInt(Lin[2]), null);
                profBrujo.add((Brujo_Mago)an);
            }if(Lin[Lin.length-2].equalsIgnoreCase("N")){
                Normal nor=new Normal(Lin[Lin.length-1],Lin[0], Lin[1], Lin[3], Lin[4], Integer.parseInt(Lin[2]), null);
                profBrujo.add((Brujo_Mago)nor);
            }else{
                Metamorfomago metam=new Metamorfomago(Lin[Lin.length-1],Lin[0], Lin[1], Lin[3], Lin[4], Integer.parseInt(Lin[2]), null);
                profBrujo.add((Brujo_Mago)metam);                    
            }
        }
    } catch (Exception e) {
            System.out.println("Error al leer archivo profesores: "+e);
            e.printStackTrace();
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
        InputStream inputstream = Lectura.class.getResourceAsStream(par);
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
    } catch (Exception e) {
            System.out.println("Error al leer archivo cursos: "+e);;
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

    public void lecturuse(ArrayList<User>usuarios){
        ArrayList<Brujo_Mago>est = new ArrayList<>();
        lecturestu(est);
        lecturprofe(est);
        try {
        //Apertura del fichero y creacion de BufferedReader para poder
        //hacer una lectura comoda (disponer del metodo readLine()).
        inputstream = Lectura.class.getResourceAsStream(use);
        inputreader = new InputStreamReader(inputstream);
        br = new BufferedReader(inputreader);
        // Lectura del fichero
        String linea;
        while ((linea = br.readLine()) != null) {
            String[]Lin=linea.split(",");
                for(Brujo_Mago estud:est){
                    if(estud.GetNombre().equalsIgnoreCase(Lin[2])&&estud.GetApellido().equalsIgnoreCase(Lin[3])){
                        User us=new User(Lin[0], Lin[1], estud, Lin[Lin.length-1]);
                        usuarios.add(us);
                    }/**else{
                        Brujo_Mago esas=new Brujo_Mago("Albus", "Dumbledoreea", " ", " ", 0, Casas_Hogwards.Griffindor);
                        User us=new User(Lin[0], Lin[1], esas, Lin[Lin.length-1]);
                        usuarios.add(us);
                    }**/
                }
        }
    } catch (Exception e) {
            System.out.println("Error al leer archivo usuarios: "+e);
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
        Lectura le=new Lectura();
        Escuela_Hogwards as=new Escuela_Hogwards();
        ArrayList<Brujo_Mago>estid=new ArrayList<>();
        ArrayList<User>estd=new ArrayList<>();
        /**le.lecturuse(as.usuarios);
        for(User an:as.usuarios){
            System.out.println(an);
        }**/
        le.lecturprofe(estid);

        }
        
}
