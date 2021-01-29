/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_ronyestrada;

import java.util.ArrayList;
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
    public static boolean pass = true;

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String letra = "";
        String Name;

//********************************************************************************
        String nombredeFranquicia;
        String NombredeRestaurante;
        String Ubicación = "";
        String Cantidaddeempleados;
        String Parqueo;
        String Áreadejuegos;
        String Cantidaddemesas;
        String CantidaddeCajeros;
        String NombredeGerente;
        String Especialidaddelrestaurante;
        String Estadodelrestaurante;
        ArrayList restaurantes = new ArrayList();

//********************************************************************************
        int Password;
        int opcion = 0;
        a:
        while (opcion != 4) {
            ArrayList ubicacionrepetida = new ArrayList();
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
                    Name = JOptionPane.showInputDialog("Ingrese nombre");

                    password N = new password(Name);

                    Password = Integer.parseInt(JOptionPane.showInputDialog("Ingrese password"));
                    password P = new password(Password);

                    break;
                }

                case 2: {
                    if (pass == true) {
                        letra = JOptionPane.showInputDialog(" "
                                + " a. Reporte 1\n"
                                + " b. Reporte 2\n"
                                + " c. Reporte 3\n");
                        switch (letra) {
                            case "a": {

                                break;
                            }
                            case "b": {

                                break;
                            }
                            case "c": {

                                break;
                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese en el login primero");
                    }
                    break;
                }

                case 3: {
                    if (pass == true) {
                        letra = JOptionPane.showInputDialog(" "
                                + " a. CrearoListar\n"
                                + " b. Listar \n"
                                + " c. Modificar \n"
                                + " d. Eliminar");
                        switch (letra) {
                            case "a": {
                                // agregar listar
                                int cont = 0;
                                nombredeFranquicia = JOptionPane.showInputDialog("nombredeFranquicia");
                                NombredeRestaurante = JOptionPane.showInputDialog("NombredeRestaurante");
                                String Ubicacion1 = JOptionPane.showInputDialog("Ubicacion");
                                    boolean check = false;
                                for (int i = 0; i < ubicacionrepetida.size(); i++) {
                                    
                                    
                                    if (ubicacionrepetida.get(i).equals(Ubicacion1)) {
                                        check = true;
                                        continue a;
                                    }
                                    if (check == true) {
                                        Ubicación=Ubicacion1;
                                        
                                    }else{continue a;}
                                
                            }

                            Cantidaddeempleados = JOptionPane.showInputDialog("Cantidad de empleados");
                            Parqueo = JOptionPane.showInputDialog(null, "Parqueo");
                            Áreadejuegos = JOptionPane.showInputDialog(null, "Area de juego");
                            Cantidaddemesas = JOptionPane.showInputDialog("cantidad de mesas");
                            CantidaddeCajeros = JOptionPane.showInputDialog("cantidad de Cajeros");
                            NombredeGerente = JOptionPane.showInputDialog(null, "Nombre de Gerente");
                            Especialidaddelrestaurante = JOptionPane.showInputDialog(null, "Especialidad del restaurante");
                            Estadodelrestaurante = JOptionPane.showInputDialog(null, "Especialidad del restaurante");

                            restaurantes.add(new Restaurantes(nombredeFranquicia, NombredeRestaurante, Ubicación, Cantidaddeempleados,
                                    Parqueo, Áreadejuegos, Cantidaddemesas, CantidaddeCajeros, NombredeGerente,
                                    Especialidaddelrestaurante, Estadodelrestaurante));

                            continue a;
                        }
                    
                
                case "b": {
                                //listar
                                Restaurantes R = new Restaurantes();
                                R.Print(restaurantes);
                                continue a;
                            }

                            case "c": {
                                //modificar
                                int posicion1 = Integer.parseInt(JOptionPane.showInputDialog("posicion a cambiar"));

                                if (restaurantes.get(posicion1) instanceof Restaurantes) {
                                    int mod = Integer.parseInt(JOptionPane.showInputDialog(""
                                            + "1. Nombre de Franquicia\n "
                                            + "2.  Nombre de Restaurante \n"
                                            + "3. Ubicación \n"
                                            + "4. Cantidad de empleados + \n"
                                            + "5. Parqueo + \n"
                                            + "6. Áreadejuegos + \n"
                                            + "7. Cantidaddemesas  +\n"
                                            + "8. CantidaddeCajeros + \n"
                                            + "9. NombredeGerente + \n" + ""
                                            + "10. Especialidaddelrestaurante + \n"
                                            + "11. Estadodelrestaurante "));
                                    switch (mod) {

                                        case 1: {
                                            String nombre = JOptionPane.showInputDialog("ingrese Nombre de Franquicia");
                                            ((Restaurantes) restaurantes.get(posicion1)).setNombredeFranquicia(nombre);
                                            continue a;
                                        }
                                        case 2: {
                                            String nombre = JOptionPane.showInputDialog("ingrese Nombre de Restaurante");
                                            ((Restaurantes) restaurantes.get(posicion1)).setNombredeRestaurante(nombre);
                                            continue a;
                                        }
                                        case 3: {
                                            String nombre = JOptionPane.showInputDialog("ingrese Ubicación ");
                                            ((Restaurantes) restaurantes.get(posicion1)).setUbicación(nombre);
                                            continue a;
                                        }
                                        case 4: {
                                            String nombre = JOptionPane.showInputDialog("ingrese Cantidad de empleados ");
                                            ((Restaurantes) restaurantes.get(posicion1)).setCantidaddeempleados(nombre);

                                            continue a;
                                        }
                                        case 5: {
                                            String nombre = JOptionPane.showInputDialog("ingrese Parqueo ");
                                            ((Restaurantes) restaurantes.get(posicion1)).setParqueo(nombre);

                                            continue a;
                                        }
                                        case 6: {
                                            String nombre = JOptionPane.showInputDialog("ingrese Area de juegos ");
                                            ((Restaurantes) restaurantes.get(posicion1)).setÁreadejuegos(nombre);
                                            continue a;
                                        }
                                        case 7: {
                                            String nombre = JOptionPane.showInputDialog("ingrese Cantidad de Mesas ");
                                            ((Restaurantes) restaurantes.get(posicion1)).setCantidaddemesas(nombre);
                                            continue a;
                                        }
                                        case 8: {
                                            String nombre = JOptionPane.showInputDialog("ingrese Cantidad de Cajeros ");
                                            ((Restaurantes) restaurantes.get(posicion1)).setCantidaddeCajeros(nombre);
                                            continue a;
                                        }
                                        case 9: {
                                            String nombre = JOptionPane.showInputDialog("Nombre de gerente ");
                                            ((Restaurantes) restaurantes.get(posicion1)).setNombredeGerente(nombre);

                                            continue a;
                                        }
                                        case 10: {
                                            String nombre = JOptionPane.showInputDialog("Especialidad del restaurante ");
                                            ((Restaurantes) restaurantes.get(posicion1)).setEspecialidaddelrestaurante(nombre);

                                            continue a;
                                        }
                                        case 11: {
                                            String nombre = JOptionPane.showInputDialog("Estado del restaurante ");
                                            ((Restaurantes) restaurantes.get(posicion1)).setEstadodelrestaurante(nombre);
                                            continue a;
                                        }
                                    }

                                } else {
                                    System.out.println(" not existe esa pocicion");
                                }

                                break;

                            }
                            case "d": {
// eliminar**********************************************************************************************************
                                    // tengo error si no haya el numero
                                int p = Integer.parseInt(
                                        JOptionPane.showInputDialog("ingrese posicion del "
                                                + "Lista a eliminar"));
                                if (restaurantes.get(p) instanceof Restaurantes) {
                                    restaurantes.remove(p);
                                    continue a;
                                } else{}
                                

                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese en el login primero");
                    }
            }
        
    

case 4: {
                    if (pass == true) {
                        System.exit(opcion);
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese en el login primero");
                    }
                }
            }
        }

    }

}
