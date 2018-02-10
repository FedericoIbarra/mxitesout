package mx.iteso.ut;

/**
 * Interfaz Queso para los objetos que serán atributos de Quesadilla.
 */
public interface Tortilla {
    /**Método que regresa si la tortilla está tostada o no.
     * @return estado de la tortilla.*/
    boolean isToasted();
    /**Método que regresa a que temperatura se tuesta la tortilla.
     * @return temperatura de tueste*/
    int getToastTemperature();
    /**Método que regresa la temperatura actual de la tortilla.
     * @return temperatura de la tortilla.*/
    int getCurrentTemperature();
    /**Método que establece la temperatura actual de la tortilla.
     * @param temp recibe un entero.*/
    void setCurrentTemperature(int temp);
    /**Método que establece el estado actual del la tortilla.
     * @param toasted recibe un booleano*/
    void toast(boolean toasted);
}
