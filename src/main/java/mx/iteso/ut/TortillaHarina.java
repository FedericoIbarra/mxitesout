/*
 * Nombre: Alfonso Cervantes Alonso
 * Asignatura: Diseño de software
 * Profesor: Rodrigo Villalobos
 * Documento: "TortillaHarina.java"
 * Fecha de entrega: 07/02/2018
 * */

package mx.iteso.ut;

public class TortillaHarina implements Tortilla{

    int temp;
    int toastTemp = 20;

    public boolean isToasted() {
        return false;
    }

    public int getToastTemperature() {
        return this.toastTemp;
    }

    public int getCurrentTemperature() {
        return this.temp;
    }

    public void setCurrentTemperature(int temp) {
        this.temp = temp;
    }

    public void toast(boolean toasted) {

    }
}
