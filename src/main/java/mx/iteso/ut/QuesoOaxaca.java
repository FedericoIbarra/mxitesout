/*
 * Nombre: Alfonso Cervantes Alonso
 * Asignatura: Diseño de software
 * Profesor: Rodrigo Villalobos
 * Documento: "QuesoOaxaca.java"
 * Fecha de entrega: 07/02/2018
 * */

package mx.iteso.ut;

public class QuesoOaxaca implements Queso{
    int temp;
    int meltTemp = 20;

    public boolean isMelted() {
        return false;
    }

    public int getMeltingTemperature() {
        return this.meltTemp;
    }

    public int getCurrentTemperature() {
        return this.temp;
    }

    public void setCurrentTemperature(int temp) {
        this.temp = temp;
    }

    public void melt(boolean melted) {

    }
}
