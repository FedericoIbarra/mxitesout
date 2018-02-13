package mx.iteso.ut;

/**
 * Interfaz Tortilla:
 * Define la referencia al tipo
 * de tortilla que utiliza Quesadilla.*/

public interface Tortilla {
	/**@return si la tortilla está fundida o no.*/
    boolean isToasted();
    /**@return la temperatura de tueste.*/
    int getToastTemperature();
    /**@return la temperatura actual.*/
    int getCurrentTemperature();
    /**Establece la temperatura actual.
     * @param temp es el valor nuevo.*/
    void setCurrentTemperature(int temp);
    /**@param toasted si está tostado.*/
    void toast(boolean toasted);

}
