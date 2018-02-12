package mx.iteso.ut;

/**
 * Clase.
 */
public interface Queso {
    /**
     * @return boolean
     */
    boolean isMelted();
    /**
     * @return int
     */
    int getCurrentTemperature();
    /**
     * @return int
     */
    int getMeltingTemperature();
    /**
     * @param temp temp
     */
    void setCurrentTemperature(int temp);
    /**
     * @param melted melted
     */
    void melt(boolean melted);
}
