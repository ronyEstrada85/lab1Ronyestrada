
package cordenada;

import java.util.ArrayList;


public class Circulo {
    public int coordena_x;
    public int coordena_y;
    public int radio;
    ArrayList cordenadas = new ArrayList();
    public Circulo(int coordena_x, int radio,int coordena_y){
    this.coordena_x= coordena_x;
    this.coordena_y= coordena_y;
    this.radio=radio;
    }

    public int getCoordena_x() {
        return coordena_x;
    }

    public void setCoordena_x(int coordena_x) {
        this.coordena_x = coordena_x;
    }

    public int getCoordena_y() {
        return coordena_y;
    }

    public void setCoordena_y(int coordena_y) {
        this.coordena_y = coordena_y;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public ArrayList getCordenadas() {
        return cordenadas;
    }

    public void setCordenadas(ArrayList cordenadas) {
        this.cordenadas = cordenadas;
    }

    public String toString(){
        return "Cordenada x= "+coordena_x+" Cordenada y= "+coordena_y+"radio = "+radio;
    }
    
}
