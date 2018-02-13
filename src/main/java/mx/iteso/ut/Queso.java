/*
*
* Clase de Queso
* @author Federico Ibarra
* @version 1.0
*
* */

package mx.iteso.ut;

/** Queso.*/
public interface Queso {

    /**Booleano que dice si el queso esta o no derretido.
     * @return true si esta derretido el queso*/
     boolean isMelted();
    /** @return Valor de la temperatura actual.*/
     int getCurrentTemp();
    /** @return Valor de la temperatura a la que se derrite el queso.*/
     int getMeltingTemperature();
    /** @param temp asigna un valor a la nueva temperatura.*/
     void setCurrentTemp(int temp);
    /** @param melted Derrite el queso.*/
     void melt(boolean melted);
}
