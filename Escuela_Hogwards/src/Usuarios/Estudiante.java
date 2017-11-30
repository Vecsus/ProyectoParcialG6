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
public class Estudiante {
    
    public void menuEstudiante(){
        Scanner menE=new Scanner(System.in);
        System.out.println("Escoja la opcion que desee hacer: ");
        System.out.println("1. Consultar Curso");
        System.out.println("2. Registro");
        System.out.println("3. Descripcion de Vuelo");
        int opcionEst=menE.nextInt();
        switch(opcionEst){
            case 1:
                ConsultaCurso();
                break;
            case 2:
                Registro();
                break;
            case 3:
                DescripcionVuelo();
                break;
            default:
                System.out.println("Usted ha finalizado sesion. ");
        }

    }
    public void ConsultaCurso(){}
    public void Registro(){}
    public void DescripcionVuelo(){}
    
}
