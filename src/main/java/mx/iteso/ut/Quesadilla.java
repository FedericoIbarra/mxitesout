package mx.iteso.ut;

/**
 * Hello world!
 *
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

    public final Queso getQueso() {
        return queso;
    }

    public final void setQueso(final Queso queso) {
        this.queso = queso;
    }


    public final Tortilla getTortilla() {
        return tortilla;
    }

    public final void setTortilla(final Tortilla tortilla) {
        this.tortilla = tortilla;
    }

    public final int getHeatLevel() {
        return getGas() > 0 ? heatLevel : 0;
    }

    public final void setHeatLevel(int heatLevel) {
        this.heatLevel = heatLevel;
    }

    public final void setTortillaTimeOffset(int minuteOffset) {
        tortillaTimeOffset = minuteOffset;
    }
    public final int getTortillaTimeOffset() {
        return tortillaTimeOffset;
    }

    public final void setQuesoTimeOffset(int minuteOffset) {
        quesoTimeOffset = minuteOffset;
    }
    public final int getQuesoTimeOffset() {
        return quesoTimeOffset;
    }

    public final void setGas(int qtyGas) {
        gas = qtyGas > 0 ? qtyGas : 0;
    }
    public final int getGas() {
        return gas;
    }
}
