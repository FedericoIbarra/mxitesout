package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla {
    /**
     *
     */
    private Queso queso;
    /**
     *
     */
    private Tortilla tortilla;
    /**
     *
     */
    private int heatLevel;

    /**
     * just for the checkpoint.
     * @return String
     */
    public final String prepareSingle() {

        while (getQueso().getCurrentTemperature()
            < getQueso().getMeltingTemperature()
            || getTortilla().getCurrentTemperature()
            < getTortilla().getToastTemperature()) {
                getTortilla().setCurrentTemperature(
                getTortilla().getCurrentTemperature() + getHeatLevel());
                getQueso().setCurrentTemperature(
                    getQueso().getCurrentTemperature() + getHeatLevel());
            if (getTortilla().getCurrentTemperature()
                >= getTortilla().getToastTemperature()) {
                getTortilla().toast(true);
            }
            if (getQueso().getCurrentTemperature()
                >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }

        if (getQueso().isMelted() && getTortilla().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQueso().isMelted() && !getTortilla().isToasted()) {
            return "Good quesadilla";
        }
        if (!getQueso().isMelted() && getTortilla().isToasted()) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }
    }

    /**
     * @return Queso
     */
    public final Queso getQueso() {
        return queso;
    }

    /**
     * @param q q
     */
    public final void setQueso(final Queso q) {
        this.queso = q;
    }

    /**
     * @return Tortilla
     */
    public final Tortilla getTortilla() {
        return tortilla;
    }

    /**
     * @param t t
     */
    public final void setTortilla(final Tortilla t) {
        this.tortilla = t;
    }

    /**
     * @return int
     */
    public final int getHeatLevel() {
        return heatLevel;
    }

    /**
     * @param h h
     */
    public final void setHeatLevel(final int h) {
        this.heatLevel = h;
    }
}
