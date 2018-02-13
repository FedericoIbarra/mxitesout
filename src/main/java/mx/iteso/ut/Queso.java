package mx.iteso.ut;

/**
 * Interfaz Queso:
 * Define la referencia al tipo
 * de queso que utiliza Quesadilla.*/

public interface Queso {
	/**@return si el queso está fundido o no.*/
    boolean isMelted();
    /**@return la temperatura actual del queso.*/
    int getCurrentTemperature();
    /**@return la temperatura específica de fundición del queso.*/
    int getMeltingTemperature();
    /**Establece la temperatura actual.
     * @param temp es el valor nuevo.*/
    void setCurrentTemperature(int temp);
    /**@param melted si está derretido.*/
    void melt(boolean melted);
}
