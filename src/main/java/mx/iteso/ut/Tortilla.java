package mx.iteso.ut;

/**Interfaz tortilla.*/
public interface Tortilla {
    /**Metodo booleano si esta tostado.
     * @return booleano*/
    boolean isToasted();
    /**Metodo obtener temperatura de tostado.
     * @return entero temperatura.*/
    int getToastTemperature();
    /**Metodo obtener temperatura actual.
     * @return entero temperatura.*/
    int getCurrentTemperature();
    /**Metodo setear temperatura actual.
     * @param temp es la temperatura en int.*/
    void setCurrentTemperature(int temp);
    /**Metodo toast para setear si esta tostado.
     * @param toasted booleano si esta tostado.*/
    void toast(boolean toasted);
}
