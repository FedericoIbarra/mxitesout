package mx.iteso.ut;

/**
 * Tortilla interface.
 */
public interface Tortilla {
    /**
     *
     * @return Returns true if the tortilla is toasted, otherwise returns false.
     */
    boolean isToasted();

    /**
     *
     * @return Returns toast temperature
     */
    int getToastTemperature();

    /**
     *
     * @return Returns currrent temperature
     */
    int getCurrentTemperature();

    /**
     *
     * @param temp New temperature
     */
    void setCurrentTemperature(int temp);

    /**
     *
     * @param toasted True or false if the tortilla is toasted or not
     */
    void toast(boolean toasted);

}
