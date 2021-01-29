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
    public static boolean pass=false;
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String letra = "";
        String Name;
        
        int Password;
        int opcion=0;
        a:   while(opcion!=4){
              opcion = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                + "1.   Login\n"
                + "2.Reporte de restauranteso\n"
                + " a. Reporte 1\n"
                + " b. Reporte 2\n"
                + " c. Reporte 3\n"
                + "3.   Manejo de restaurantes\n"
                + " a. CrearoListar\n"
                + " b. Modificar \n"
                + " c. Eliminar"
                + "4.   Salir."));

        switch (opcion) {
            case 1: {
                Name=JOptionPane.showInputDialog("Ingrese nombre");
                
                password N = new password(Name);
                
                Password=Integer.parseInt(JOptionPane.showInputDialog("Ingrese password"));
                password P = new password(Password);
                
                
          break;  }
            
            case 2:{
            if (pass ==true){
                System.out.println("hola");
            }else {JOptionPane.showMessageDialog(null, "Ingrese en el login primero");}
            break;}
            
            case 3:{
            if (pass ==true){
           
            }
            }
            case 4:{
            if (pass ==true){
            System.exit(opcion);
            }
            }
        }
        }
        
    }

}
