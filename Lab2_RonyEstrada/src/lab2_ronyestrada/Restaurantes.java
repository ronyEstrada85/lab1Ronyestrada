/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_ronyestrada;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author Reyn
 */
public class Restaurantes {

    public String nombredeFranquicia;
    public String NombredeRestaurante;
    public String Ubicación;
    public String Cantidaddeempleados;
    public String Parqueo;
    public String Áreadejuegos;
    public String Cantidaddemesas;
    public String CantidaddeCajeros;
    public String NombredeGerente;
    public String Especialidaddelrestaurante;
    public String Estadodelrestaurante;
    public ArrayList restaurantes = new ArrayList();
    public Restaurantes(){
    
    }

    public Restaurantes(String nombredeFranquicia, String NombredeRestaurante, String Ubicación, String Cantidaddeempleados, String Parqueo,
            String Áreadejuegos, String Cantidaddemesas, String CantidaddeCajeros, String NombredeGerente,
            String Especialidaddelrestaurante, String Estadodelrestaurante) {
        this.nombredeFranquicia = nombredeFranquicia;
        this.NombredeRestaurante = NombredeRestaurante;
        this.Parqueo = Parqueo;
        this.Áreadejuegos = Áreadejuegos;
        this.Ubicación = Ubicación;
        this.Cantidaddeempleados = Cantidaddeempleados;
        this.Cantidaddemesas = Cantidaddemesas;
        this.CantidaddeCajeros = CantidaddeCajeros;
        this.NombredeGerente = NombredeGerente;
        this.Especialidaddelrestaurante = Especialidaddelrestaurante;
        this.Estadodelrestaurante = Estadodelrestaurante;
    }

    public String getParqueo() {
        return Parqueo;
    }

    public void setParqueo(String Parqueo) {
        this.Parqueo = Parqueo;
    }

    public String getÁreadejuegos() {
        return Áreadejuegos;
    }

    public void setÁreadejuegos(String Áreadejuegos) {
        this.Áreadejuegos = Áreadejuegos;
    }

    public String getNombredeFranquicia() {
        return nombredeFranquicia;
    }

    public void setNombredeFranquicia(String nombredeFranquicia) {
        this.nombredeFranquicia = nombredeFranquicia;
    }

    public String getNombredeRestaurante() {
        return NombredeRestaurante;
    }

    public void setNombredeRestaurante(String NombredeRestaurante) {
        this.NombredeRestaurante = NombredeRestaurante;
    }

    public String getUbicación() {
        return Ubicación;
    }

    public void setUbicación(String Ubicación) {
        this.Ubicación = Ubicación;
    }

    public String getCantidaddeempleados() {
        return Cantidaddeempleados;
    }

    public void setCantidaddeempleados(String Cantidaddeempleados) {
        this.Cantidaddeempleados = Cantidaddeempleados;
    }

    public String getCantidaddemesas() {
        return Cantidaddemesas;
    }

    public void setCantidaddemesas(String Cantidaddemesas) {
        this.Cantidaddemesas = Cantidaddemesas;
    }

    public String getCantidaddeCajeros() {
        return CantidaddeCajeros;
    }

    public void setCantidaddeCajeros(String CantidaddeCajeros) {
        this.CantidaddeCajeros = CantidaddeCajeros;
    }

    public String getNombredeGerente() {
        return NombredeGerente;
    }

    public void setNombredeGerente(String NombredeGerente) {
        this.NombredeGerente = NombredeGerente;
    }

    public String getEspecialidaddelrestaurante() {
        return Especialidaddelrestaurante;
    }

    public void setEspecialidaddelrestaurante(String Especialidaddelrestaurante) {
        this.Especialidaddelrestaurante = Especialidaddelrestaurante;
    }

    public String getEstadodelrestaurante() {
        return Estadodelrestaurante;
    }

    public void setEstadodelrestaurante(String Estadodelrestaurante) {
        this.Estadodelrestaurante = Estadodelrestaurante;
    }

    public ArrayList getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(ArrayList restaurantes) {
        this.restaurantes = restaurantes;
    }

    @Override
    public String toString() {
        return ""
                + "Nombre de Franquicia= " + nombredeFranquicia + ", Nombre de Restaurante= " + NombredeRestaurante
                + ", Ubicaci= " + Ubicación + ", Cantidad de empleados= " + Cantidaddeempleados + ", Parqueo= " + Parqueo
                + ", reade juegos= " + Áreadejuegos + ", Cantidaddemesas= " + Cantidaddemesas + ", CantidaddeCajeros= "
                + CantidaddeCajeros + ", NombredeGerente= " + NombredeGerente + ", Especialidad del restaurante= " + Especialidaddelrestaurante
                + ", Estado del restaurante= " + Estadodelrestaurante ;
    }
    public void Print (ArrayList print){
        String todo="";
        for (int i = 0; i < print.size(); i++) {
            todo+= print.get(i)+"\n";
        }
        JOptionPane.showMessageDialog(null, todo);
    
    }
    
}
