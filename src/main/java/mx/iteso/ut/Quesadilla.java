package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla {

    /**
     * @param cheese af
     */
    private Queso queso;
    /**
     * @param tortilla the tortilla for the quesadilla
     */

    private Tortilla tortilla;
    /**
     * @param heatLevel this the heat level (?)
     */

    private int heatLevel;

    /**
     *
     * @return the status of your quesadillita
     */
    public final String prepareSingle() {


        /*If we change the condition || to &&
            all the functions will enter to the cycle
        */

        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()) {
            getTortilla().setCurrentTemperature(
                    getTortilla().getCurrentTemperature() + getHeatLevel()
            );
            getQueso().setCurrentTemperature(
                    getQueso().getCurrentTemperature() + getHeatLevel()
            );
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
     * @return queso instance
     */
     final Queso getQueso() {
        return queso;
    }

    /**
     *
     * @param hQueso set the object queso
     */
     final void  setQueso(final Queso hQueso) {
        this.queso = queso;
    }

    /**
     *
     * @return the tortilla instance
     */
     final Tortilla getTortilla() {
        return tortilla;
    }

    /**
     *
     * @param hTortilla set the tortillita
     */
    final void setTortilla(final Tortilla hTortilla) {
        this.tortilla = tortilla;
    }

    /**
     *
     * @return the heat level
     */
     final int getHeatLevel() {
        return heatLevel;
    }

    /**
     *
     * @param hHeatLevel set the heat level
     */
     final void setHeatLevel(final int hHeatLevel) {
        this.heatLevel = heatLevel;
    }
}
