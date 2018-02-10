package mx.iteso.ut;

/**
 * Clase que implementa la interfaz Tortilla.
 */
public class TortillaMaiz implements Tortilla {
    /**Atributo de temperatura actual.*/
    private int currentTemperature;
    /**Atributo de temperatura de tueste.*/
    private int toastTemperature;
    /**Atributo de estado actual.*/
    private boolean toast;

    /**Método que regresa la temperatura actual de la tortilla.
     * @return temperatura de la tortilla.*/
    public final int getCurrentTemperature() {
        return currentTemperature;
    }

    /**Método que establece la temperatura actual de la tortilla.
     * @param myCurrentTemperature recibe un entero.*/
    public final void setCurrentTemperature(final int myCurrentTemperature) {
        this.currentTemperature = myCurrentTemperature;
    }

    /**Método que regresa a que temperatura se tuesta la tortilla.
     * @return temperatura de tueste*/
    public final int getToastTemperature() {
        return toastTemperature;
    }

    /**Método que estable la temperatura de tueste de la tortilla.
     * @param myToastTemperature recibe un entero.
     */
    public final void setToastTemperature(final int myToastTemperature) {
        this.toastTemperature = myToastTemperature;
    }

    /**Método que regresa si la tortilla está tostada o no.
     * @return estado de la tortilla.*/
    public final boolean isToasted() {
        return toast;
    }

    /**Método que establece el estado actual del la tortilla.
     * @param toasted recibe un booleano*/
    public final void toast(final boolean toasted) {
        this.toast = toasted;
    }
}
