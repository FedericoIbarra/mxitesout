package mx.iteso.ut;

/**Interface Queso/*.
 *
 */
public interface Queso {

    /**Method isMelted. /*
     *
     * @return if is melted.
     */
    boolean isMelted();

    /**Method getCurrentTemperature. /*
     *
     * @return the current temperature of the Queso.
     */
    int getCurrentTemperature();

    /**Method getMeltingTemperature. /*
     *
     * @return the melting temperature of the Queso.
     */
    int getMeltingTemperature();

    /**Method setCurrentTemperature. /*
     *
     * @param temp set the new temperature.
     */
    void setCurrentTemperature(int temp);

    /**Method melt. /*
     *
     * @param melted Set if is melted.
     */
    void melt(boolean melted);
}
