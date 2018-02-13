package mx.iteso.ut;

/**
 * Queso interface.
 */
public interface Queso {
    /**
     *
     * @return Returns true if queso is melted, otherwise returns false
     */
    boolean isMelted();

    /**
     *
     * @return Returns current temperature
     */
    int getCurrentTemperature();

    /**
     *
     * @return Returns melting temperature
     */
    int getMeltingTemperature();

    /**
     *
     * @param temp New temperature
     */
    void setCurrentTemperature(int temp);

    /**
     *
     * @param melted true or false if queso is melted or not
     */
    void melt(boolean melted);
}
