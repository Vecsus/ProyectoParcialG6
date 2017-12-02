/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Writer_Reader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Usuario
 */
public class Escritura {
    //Ruta relativa para la escritura de testos.
            String s= "src/Resources/";
    public static void main(String[] arg) {

        File archivo = new File("src/Resources/archivo.txt");
        try {
            //Apertura del fichero y creacion de BufferedReader para poder
            //hacer una lectura comoda (disponer del metodo readLine()).

        FileWriter fr = new FileWriter(archivo);
        BufferedWriter br = new BufferedWriter(fr);
        PrintWriter frr=new PrintWriter(br);
        frr.write("zero");
        frr.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        }
}
