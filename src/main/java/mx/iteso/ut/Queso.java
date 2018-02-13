package mx.iteso.ut;

/**
 *Interfaz Queso.
 */
public interface Queso {
    /**
     * Método para conocer si el queso esta derretido.
     * @return un boolean de melt
     */
    boolean isMelted();

    /**
     * Método para obtener la temperatura actual.
     * @return int temperatura
     */
    int getCurrentTemperature();

    /**
     * Método para obtener la temperatura de derretimiento.
     * @return temperatura de derretimiento int
     */
    int getMeltingTemperature();

    /**
     * Método para establecer la temperatura actual.
     * @param temp temperatura que se va a establecer
     */
    void setCurrentTemperature(int temp);

    /**
     * Método para derretir el queso.
     * @param melted un boolean para establecer si esta derretido
     */
    void melt(boolean melted);
}
