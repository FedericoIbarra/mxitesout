/**
 * Clase de Quesadilla.
 * @since 1.0
 * @version 1.1
 * @author luisacfl
 */

package mx.iteso.ut;

/**
 * Clase de Quesadilla.
 */
public class Quesadilla {
    /**
     *  Objeto Queso instanciado.
     */
    private Queso queso;
    /**
     *  Objeto Tortilla instanciado.
     */
    private Tortilla tortilla;
    /**
     *  Variable del nivel del calor.
     */
    private int heatLevel;

    /**
     * Metodo para hacer quesadilla.
     * @return Regresa una cadena de texto
     * indicando el tipo de quesadilla
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
     * @return Regresa el objeto del Queso utilizado
     */
    public final Queso getQueso() {
        return this.queso;
    }

    /**
     *  @param  quesoNuevo que se va a utilizar
     */
    public final void setQueso(final Queso quesoNuevo) {
        this.queso = quesoNuevo;
    }

    /**
     * @return Objeto de la Tortilla utilizada
     */
    public final Tortilla getTortilla() {
        return this.tortilla;
    }

    /**
     *  @param  tortillaNueva que se va a utilizar
     */
    public final void setTortilla(final Tortilla tortillaNueva) {
        this.tortilla = tortillaNueva;
    }

    /**
     * @return Nivel de calor
     */
    public final int getHeatLevel() {
        return this.heatLevel;
    }

    /**
     *  @param  heatLevelNew que se va a establecer
     */
    public final void setHeatLevel(final int heatLevelNew) {
        this.heatLevel = heatLevelNew;
    }
}
