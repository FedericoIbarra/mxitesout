package mx.iteso.ut;

/**
 * Interfaz Tortilla.
 */
public interface Tortilla {
    /**
     * Método para saber si esta tostada la tortilla.
     * @return boolean de toast
     */
    boolean isToasted();

    /**
     * Método para obtener la temperatura de tostado.
     * @return int temperatura de tostado
     */
    int getToastTemperature();

    /**
     * Método para obtener la temperatura actual.
     * @return int temperatura actual
     */
    int getCurrentTemperature();

    /**
     * Método para establecer la temperatura actual.
     * @param temp temperatura que se va a establecer
     */
    void setCurrentTemperature(int temp);

    /**
     * Método para tostar.
     * @param toasted boolean que establece si está tostado o no.
     */
    void toast(boolean toasted);

}
