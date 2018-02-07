/*
 * Nombre: Alfonso Cervantes Alonso
 * Asignatura: Diseño de software
 * Profesor: Rodrigo Villalobos
 * Documento: "Queso.java"
 * Fecha de entrega: 07/02/2018
 * */

package mx.iteso.ut;

public interface Queso {
    public boolean isMelted();
    public int getCurrentTemperature();
    public int getMeltingTemperature();
    public void setCurrentTemperature(int temp);
    public void melt(boolean melted);
}
