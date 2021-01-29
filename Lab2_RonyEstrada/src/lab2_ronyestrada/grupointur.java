/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_ronyestrada;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Reyn
 */
public class grupointur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String letra = "";
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                + "1.   Login\n"
                + "2.Reporte de restauranteso\n"
                + " a. Reporte 1\n"
                + " b. Reporte 2\n"
                + " c. Reporte 3\n"
                + "2.   Manejo de restaurantes\n"
                + " a. CrearoListar\n"
                + " b. Modificar \n"
                + " c. Eliminar"
                + "3.   Salir."));

        switch (opcion) {
            case 1: {
                
                break;
            }
            case 2:{
            
            break;}
            
            case 3:{
            
            System.exit(opcion);}
        }
    }

}
