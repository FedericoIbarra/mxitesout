package mx.iteso.ut;

/**
 * Clase principal del Proyecto.
 */
public class Quesadilla {
    /**Atributo tipo Queso del objeto Quesadilla.*/
    private Queso queso;
    /**Atributo tipo Tortilla del objeto Quesadilla.*/
    private Tortilla tortilla;
    /**Entero que indica la temperatura actual del objeto Quesadilla.*/
    private int heatLevel;

    /**Método que determina el tipo de quesadilla obtenida.
     * Compara los atributos meltingTemperature y toastTemperature de
     * Queso y Tortilla (respectivamente) contra la temperatura del
     * objeto quesadilla.
     * @return el resultado de las comparaciones.*/
    public final String prepareSingle() {

     while (getQueso().getCurrentTemperature()
             < getQueso().getMeltingTemperature()
             && getTortilla().getCurrentTemperature()
             < getTortilla().getToastTemperature()) {
         getTortilla().setCurrentTemperature(getTortilla()
                 .getCurrentTemperature() + getHeatLevel());
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
     } else if (getQueso().isMelted() && !getTortilla().isToasted()) {
         return "Good quesadilla";
     } else if (!getQueso().isMelted() && getTortilla().isToasted()) {
         return "Terrible quesadilla";
     } else {
         return "You ran out of gas";
     }

    }

    /**
     * Metodo para obtner el elemento Queso del objeto Quesadilla.
     * @return queso actual.
     */
    public final Queso getQueso() {
        return queso;
    }

    /**
     * Método que asigna un objeto Queso como atributo de Quesadilla.
     * @param myQueso recibe un objeto queso.
     */
    public final void setQueso(final Queso myQueso) {
        this.queso = myQueso;
    }

    /**
     * Metodo para obtner el elemento Tortilla del objeto Quesadilla.
     * @return tortilla actual.
     */
    public final Tortilla getTortilla() {
        return tortilla;
    }

    /**
     * Método que asigna un objeto Tortilla como atributo de Quesadilla.
     * @param myTortilla recibe un objeto tortilla.
     */
    public final void setTortilla(final Tortilla myTortilla) {
        this.tortilla = myTortilla;
    }

    /**
     * Metodo para obtner el atributo de temperatura del objeto Quesadilla.
     * @return temperatura actual.
     */
    public final int getHeatLevel() {
        return heatLevel;
    }

    /**
     * Método que asigna un entero como atributo de Quesadilla.
     * @param myHeatLevel recibe un entero.
     */
    public final void setHeatLevel(final int myHeatLevel) {
        this.heatLevel = myHeatLevel;
    }
}
