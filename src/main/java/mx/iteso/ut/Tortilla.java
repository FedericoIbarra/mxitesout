package mx.iteso.ut;

/**Interface Tortilla. /*
 *
 */
public interface Tortilla {
    /**Method isToasted. /*
     *
     * @return if the Tortilla is toasted.
     */
    boolean isToasted();

    /**Method getToastTemperature. /*
     *
     * @return get the toasting temperature.
     */
    int getToastTemperature();

    /**Method getCurrent Temperature. /*
     *
     * @return the actual temperature.
     */
    int getCurrentTemperature();

    /**Method setCurrentTemperature. /*
     *
     * @param temp the new actual temperature.
     */
    void setCurrentTemperature(int temp);

    /**Method toast. /*
     *
     * @param toasted if the Tortilla is toasted.
     */
    void toast(boolean toasted);
}
