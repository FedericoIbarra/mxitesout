package mx.iteso.ut;

/**
 * Clase del tipo tortilla.
 */
public class TortillaHarina implements Tortilla {
    /**
     * Variable para indicar
     * temperatura para tostar esta tortilla.
     */
    private static final int TOAST_TEMP = 30;
    /**
     * Variable para indicar si
     * la tortilla esta tostada.
     */
    private boolean toast;
    /**
     * Variable que indica la
     * temperatura actual.
     */
    private int currentTemp;

    /**
     * Constructor.
     */
    public TortillaHarina() {
        this.toast = false;
        this.currentTemp = 0;
    }

    /**
     *
     * @return si la tortilla esta tostada
     */
    public final boolean isToasted() {
        return  toast;
    }

    /**
     *
     * @return la temperatura para tostar
     * la tortilla
     */
    public final int getToastTemperature() {
        return this.TOAST_TEMP;
    }

    /**
     *
     * @return la temperatura actual
     */
    public final int getCurrentTemperature() {
        return this.currentTemp;
    }

    /**
     *
     * @param temp establecer la temp
     */
    public final void setCurrentTemperature(final int temp) {
        this.currentTemp = temp;

    }

    /**
     *
     * @param toasted cambiar estatus
     */
    public final void toast(final boolean toasted) {
        this.toast = toasted;
    }

}
