package mx.iteso.ut;

/**
 * @author Mariana Sierra Vega
 *
 */

/**Class Quesadilla. */
public class Quesadilla {

    /**Declare variables. */
    private Queso queso; /**Queso.*/
    private Tortilla tortilla; /**Tortilla.*/
    private int heatLevel; /**Heat Level.*/

    /** @return String with the preparation result of the quesadilla */
    final String prepareSingle() {


        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()) {
            getTortilla().setCurrentTemperature(
                    getTortilla().getCurrentTemperature()
                            + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature()
                    + getHeatLevel());
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

    /** Method getQueso/*.
     *  @return Get the Queso inside the Quesadilla.
     */

    public final Queso getQueso() {
        return queso;
    }

    /**Method setQueso/*.
     *
     * @param newQueso the Queso to set to the Quesadilla.
     *
     */
    public final void setQueso(final Queso newQueso) {
        this.queso = newQueso;
    }

    /**Method getTortilla/*.
     *
     * @return Get the Tortilla of the Quesadilla.
     */
    public final Tortilla getTortilla() {
        return tortilla;
    }

    /** Method setTortilla/*.
     *
      * @param newTortilla the Tortilla to set to the Quesadilla.
     */
    public final void setTortilla(final Tortilla newTortilla) {
        this.tortilla = newTortilla;
    }

    /** Method getHeatLevel/*.
     *
     * @return Get the actual heat level.
     */
    public final int getHeatLevel() {
        return heatLevel;
    }

    /**Method setHeatLevel/*.
     *
     * @param newHeatLevel the new heat level.
     */
    public final void setHeatLevel(final int newHeatLevel) {
        this.heatLevel = newHeatLevel;
    }
}
