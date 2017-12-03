/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Writer_Reader;


import java.io.*;

/**
 *
 * @author Usuario
 */
public class Lectura {
        String s= "/Resources/";
        String stud=s+"estudiantes.txt";
        String tea=s+"profesores.xt";
        String par=s+"cursos.txt";
        BufferedReader br = null;
        public void lecturestu(){
            try {
            //Apertura del fichero y creacion de BufferedReader para poder
            //hacer una lectura comoda (disponer del metodo readLine()).
            InputStream inputstream = Lectura.class.getResourceAsStream(s+"estudiantes.txt");
            InputStreamReader inputreader = new InputStreamReader(inputstream);
            br = new BufferedReader(inputreader);
            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        }
    
        
        public static void main(String[] arg) {
        
        }
        
}
