package mx.iteso.ut;

/**
 * Interfaz de la tortilla.
 */

public interface Tortilla {
    /**
     *
     * @return si la tortilla esta tostada
     */
    boolean isToasted();

    /**
     *
     * @return la temp para tostar
     * la tortilla
     */
    int getToastTemperature();

    /**
     *
     * @return la temp actual
     */
    int getCurrentTemperature();

    /**
     *
     * @param temp establecer la temp
     *             actual
     */
    void setCurrentTemperature(int temp);

    /**
     *
     * @param toasted cambiar estatus
     *                de la tortilla
     */
    void toast(boolean toasted);

}
