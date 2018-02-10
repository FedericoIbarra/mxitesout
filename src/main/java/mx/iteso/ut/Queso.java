package mx.iteso.ut;

/**
 * Interfaz Queso para los objetos que serán atributos de Quesadilla.
 */
public interface Queso {
    /**Método que regresa si el queso está derretido o no.
     * @return estado del queso.*/
    boolean isMelted();
    /**Método que regresa la temperatura actual del queso.
     * @return temperatura del queso.*/
    int getCurrentTemperature();
    /**Método que regresa a que temperatura se derrite el queso.
     * @return temperatura de derretido*/
    int getMeltingTemperature();
    /**Método que establece la temperatura actual del queso.
     * @param temp recibe un entero.*/
    void setCurrentTemperature(int temp);
    /**Método que establece el estado actual del queso.
     * @param melted recibe un booleano*/
    void melt(boolean melted);
}
