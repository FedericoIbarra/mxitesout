package mx.iteso.ut;

/**
 * Hello world!
 *
 */

public class Quesadilla {
    /** Variable de tipo Queso con nombre de queso.*/
    private Queso queso;
    /**Variable de tipo Tortilla.*/
    private Tortilla tortilla;
    /**Nivel de calor que, 0 es default.*/
    private final int heatLevel = 0;

    /**Metodo que hace una sola quesadila.
     * @return un string con el estado de la quesadilla.*/
    public final String prepareSingle() {


        while (queso.getCurrentTemp() < queso.getMeltingTemperature()
                || tortilla.getCurrentTemp() < tortilla.getToastTem()) {
            tortilla.setCurrentTemp(tortilla.getCurrentTemp() + heatLevel);
            queso.setCurrentTemp(queso.getCurrentTemp() + heatLevel);
            if (tortilla.getCurrentTemp() >= tortilla.getToastTem()) {
                tortilla.toast(true);
            }
            if (queso.getCurrentTemp() >= queso.getMeltingTemperature()) {
                queso.melt(true);
            }
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


/*
    public final void setHeatLevel(int heatLevel) {

        this.heatLevel = heatLevel;
    }
*/
}
