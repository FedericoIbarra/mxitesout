package mx.iteso.ut;

/**
 * Clase.
 */
public class TortillaMaiz implements Tortilla {

    /** */
    private static final int TOASTTEMPERATURE = 15;
    /** */
    private boolean toasted;
    /** */
    private int currentTemperature;

    /**
     * @return boolean
     */
    public final boolean isToasted() {
        return toasted;
    }

    /**
     * @return int
     */
    public final int getToastTemperature() {
        return TOASTTEMPERATURE;
    }

    /**
     * @return int
     */
    public final int getCurrentTemperature() {
        return currentTemperature;
    }

    /**
     * @param temp temp
     */
    public final void setCurrentTemperature(final int temp) {
        this.currentTemperature = temp;
    }

    /**
     * @param t toasted
     */
    public final void toast(final boolean t) {
        this.toasted = t;
    }

}
