package mx.iteso.ut;

/**
 * Quesadilla Class.
 */
public class Quesadilla {
    /**
     * Instance Variable Queso for making the quesadilla.
     */
    private Queso queso;
    /**
     * Instance Variable Tortilla for making the quesadilla.
     */
    private Tortilla tortilla;  //Member variable Tortilla
    /**
     * Member Variable for tracking the heatLevel
     * at wiche our ingredients are beign cook.
     */
    private int heatLevel;
    /**
     * Member Variable for tracking how much time
     * has pass since we turned on the grill.
     */
    private int minutes;
    /**
     * Member Variable for tracking how much time
     * we have to wait to put the tortilla.
     */
    private int tortillaTimeOffset;
    /**
     * Member Variable for tracking how much time
     * we have to wait to put the queso.
     */
    private int quesoTimeOffset;
    /**
     * Member Variable for tracking how much
     * we still have.
     */
    private int gas;

    /**
     * Instance method for cooking one quesadilla.
     * @return string value
     */
    public final String prepareSingle() {
        queso = getQueso();
        tortilla = getTortilla();
        minutes = 0;
        while (getHeatLevel() > 0
                & (queso.getCurrentTemp() < queso.getMeltingTemp()
                || tortilla.getCurrentTemp() < tortilla.getToastTemp())) {
            if (getTortillaTimeOffset() <= minutes) {
                tortilla.setTemp(tortilla.getCurrentTemp() + getHeatLevel());
            }
            if (getQuesoTimeOffset() <= minutes) {
                queso.setTemp(queso.getCurrentTemp() + getHeatLevel());
            }
            if (tortilla.getCurrentTemp() >= tortilla.getToastTemp()) {
                tortilla.toast(true);
            }
            if (queso.getCurrentTemp() >= queso.getMeltingTemp()) {
                queso.melt(true);
            }
            if (queso.isMelted() || tortilla.isToasted()) {
                break;
            }
            minutes++;
            setGas(getGas() - 1);
        }

        if (queso.isMelted() && tortilla.isToasted()) {
            return "Perfect quesadilla";
        }
        if (queso.isMelted() && !tortilla.isToasted()) {
            return "Good quesadilla";
        }
        if (!queso.isMelted() && tortilla.isToasted()) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }
    }

    /**
     * Getter for queso.
     * @return Queso value
     */
    public final Queso getQueso() {
        return queso;
    }

    /**
     * Setter for queso.
     * @param q **Set member variable queso**
     */
    public final void setQueso(final Queso q) {
        this.queso = q;
    }

    /**
     * Getter for tortilla.
     * @return Tortilla value
     */
    public final Tortilla getTortilla() {
        return tortilla;
    }

    /**
     * Setter for tortilla.
     * @param t **Set member variable tortilla**
     */
    public final void setTortilla(final Tortilla t) {
        this.tortilla = t;
    }

    /**
     * Getter for heat level.
     * @return int value
     */
    public final int getHeatLevel() {
        if (getGas() > 0) {
            return heatLevel;
        }
        return 0;
    }

    /**
     * Setter for heat level.
     * @param hl **Set member variable heat level**
     */
    public final void setHeatLevel(final int hl) {
        this.heatLevel = hl;
    }

    /**
     * Setter for tortilla offset.
     * @param minuteOffset **Set member variable trtillaTimeOffset**
     */
    public final void setTortillaTimeOffset(final int minuteOffset) {
        tortillaTimeOffset = minuteOffset;
    }

    /**
     * Getter for tortilla offset.
     * @return int value
     */
    public final int getTortillaTimeOffset() {
        return tortillaTimeOffset;
    }

    /**
     * Setter for queso offset.
     * @param minuteOffset **Set member variable quesoTimeOffset**
     */
    public final void setQuesoTimeOffset(final int minuteOffset) {
        quesoTimeOffset = minuteOffset;
    }

    /**
     * Getter for queso offset.
     * @return int value
     */
    public final int getQuesoTimeOffset() {
        return quesoTimeOffset;
    }

    /**
     * Setter for gas level.
     * @param qtyGas **Set member variable gas**
     */
    public final void setGas(final int qtyGas) {
        if (qtyGas > 0) {
            gas = qtyGas;
        } else {
            gas = 0;
        }
    }

    /**
     * Getter for gas level.
     * @return int value
     */
    public final int getGas() {
        return gas;
    }
}
