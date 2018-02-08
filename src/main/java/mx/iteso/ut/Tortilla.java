package mx.iteso.ut;

/**
 *
 */
public interface Tortilla {
    /**
     *
     * @return boolean
     */
    boolean isToasted();

    /**
     *
     * @return temperatura de tostado
     */
    int getToastTemperature();

    /**
     *
     * @return temperatura de tortilla
     */
    int getCurrentTemperature();

    /**
     *
     * @param temp temperatura de tortilla
     */
    void setCurrentTemperature(int temp);

    /**
     *
     * @param toasted boolean
     */
    void toast(boolean toasted);

}
