package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla {
    /**
     * @param queso asdf
     */
    private Queso queso;
    /**
     * @param tortilla asdf
     */
    private Tortilla tortilla;
    /**
     * @param heatLevel asfd
     */
    private int heatLevel;

    /**
     *
     * @return asdf
     */
    public final String prepareSingle() {


     while (getQueso().getCurrentTemperature()
             < getQueso().getMeltingTemperature()
             && getTortilla().getCurrentTemperature()
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
     *
     * @return queso
     */
    public final Queso getQueso() {
        return queso;
    }

    /**
     *
     * @param quesillo poner queso
     */
    public final void setQueso(final Queso quesillo) {
        this.queso = quesillo;
    }

    /**
     *
     * @return tortilla chida
     */
    public final Tortilla getTortilla() {
        return tortilla;
    }

    /**
     *
     * @param tortillaHidden asdf
     */
    public final void setTortilla(final Tortilla tortillaHidden) {
        this.tortilla = tortillaHidden;
    }

    /**
     *
     * @return heat level
     */
    public final int getHeatLevel() {
        return heatLevel;
    }

    /**
     *
     * @param heatLevelHidden asdf
     */
    public final void setHeatLevel(final int heatLevelHidden) {
        this.heatLevel = heatLevelHidden;
    }
}
