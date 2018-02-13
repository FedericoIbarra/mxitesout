package mx.iteso.ut;

/**Interface Queso. */
public interface Queso {
    /**Declaracion de variables. */
    /**@return booleano si esta melt. */
    boolean isMelted();
    /**Metodo getCurrentTemperatura.
     * @return temperatura actual.*/
    int getCurrentTemperature();
    /**Metodo para obtener la temperatura de melting.
     * @return temperatura de melting. */
    int getMeltingTemperature();
    /**Metodo para setear la temperatura actual.
     * @param temp temperatura es la actual.*/
    void setCurrentTemperature(int temp);
    /**Metodo para setear si esta derretido.
     * @param melted es un booleano que dice si esta derretido.*/
    void melt(boolean melted);
}
