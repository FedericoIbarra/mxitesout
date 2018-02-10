package mx.iteso.ut;
/**
 * Clase Queso1 que implementa interfaz Queso.
 * @author Francisco Camacho
 * @since 02-08-2018
 * @version 1.0
 * */
public class Tortilla2 implements Tortilla {
    /**
     * Info about this package doing something for package-info.java file.
     */
    private boolean toasted = false;
    /**
     * Info about this package doing something for package-info.java file.
     */
    private static final Integer TOAST_TEMPERATURE = new Integer(30);
    /**
     * Info about this package doing something for package-info.java file.
     */
    private static final Integer DEFAULT_TEMPERATURE = new Integer(30);
    /**
     * Info about this package doing something for package-info.java file.
     */
    private int currentTemperature = DEFAULT_TEMPERATURE;
    /**
     *metodo para verificar si ya se tosto.
     *@return false
     * */
    public final boolean isToasted() {
        return false;
    }
    /**
     *metodo para verificar temperatura de tostado.
     *@return toastTemperature
     * */
    public final int getToastTemp() {
        return TOAST_TEMPERATURE;
    }
    /**
     *metodo para verificar temperatura actual.
     *@return currentTemperature
     * */
    public final int getCurrentTemp() {
        return currentTemperature;
    }
    /**
     *@param temp
     *metodo para verificar temperatura actual.
     * */
    public final void setCurrentTemp(final int temp) {
        this.currentTemperature = temp;
    }
    /**
     *@param toastTortilla
     *metodo para verificar temperatura actual.
     * */
    public final void toast(final boolean toastTortilla) {
        this.toasted = toastTortilla;
    }
}
