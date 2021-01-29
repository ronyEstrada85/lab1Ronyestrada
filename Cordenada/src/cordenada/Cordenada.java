package cordenada;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cordenada {

    public static void main(String[] args) {
        ArrayList Cordena = new ArrayList();
        int opcion = 0;
        while (opcion != 4) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("seleccione una opcion\n"
                    + "1.Agregar un circulo\n"
                    + "2.Imprime circulo\n"
                    + "3. choque\n"
                    + "4. salida"));
            switch (opcion) {
                case 1: {
                    int coordenada_x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cordenada x"));
                    int coordenada_y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cordenada y"));
                    int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Radio"));
                    Cordena.add(new Circulo(coordenada_x, radio,coordenada_x));

                    break;
                }case 2:{
                
                String salida="";
                for (Object t : Cordena) {
                    if (t instanceof Circulo) {
                        salida += Cordena.indexOf(t)+"- "+t+"\n";
                    }
                }
                JOptionPane.showMessageDialog(null, salida);
            }
                case 3:{
                int cordenada_1=Integer.parseInt(JOptionPane.showInputDialog("selecione cordenada 1"));
                int cordenada_2=Integer.parseInt(JOptionPane.showInputDialog("selecione cordenada 2"));
                if (!Cordena.get(cordenada_1).equals(cordenada_2)){
                
                JOptionPane.showMessageDialog(null, "El círculo en la posición "
                        +cordenada_1+"choca con el de la posición "+cordenada_2);
                }else {JOptionPane.showMessageDialog(null, "El círculo en la posición "
                        +cordenada_1+" no choca con el de la posición "+cordenada_2);}
                
                }
                }

            }

        }

    }


