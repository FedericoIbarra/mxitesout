package mx.iteso.ut;

/** */
public class QuesoAmarillo implements Queso {

    /** */
    private static final int MELTINGTEMPERATURE = 20;
    /** */
    private boolean melted;
    /** */
    private int currentTemperature;
    /**
     * @return boolean
     */
    public final boolean isMelted() {
        return melted;
    }
    /**
     * @return int
     */
    public final int getCurrentTemperature() {
        return currentTemperature;
    }
    /**
     * @return int
     */
    public final int getMeltingTemperature() {
        return MELTINGTEMPERATURE;
    }
    /**
     * @param temp temp
     */
    public final void setCurrentTemperature(final int temp) {
        this.currentTemperature = temp;
    }
    /**
     * @param melt melted
     */
    public final void melt(final boolean melt) {
        this.melted = melt;
    }
}
