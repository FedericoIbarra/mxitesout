package mx.iteso.ut;

/**Hello world!
 *
 */
public class Quesadilla {
/**Creando objetos de tipo Queso.*/
private Queso queso;
/**Creando objetos de tipo Tortilla.*/
private Tortilla tortilla;
/**Int de nivel de calor.*/
private int heatLevel;

/**Método para preparar una quesadilla.
 * @return String .*/
public final String prepareSingle() {

while (getQueso().getCurrentTemperature()
< getQueso().getMeltingTemperature()
&& getTortilla().getCurrentTemperature()
< getTortilla().getToastTemperature()) {
getTortilla().setCurrentTemperature(getTortilla()
.getCurrentTemperature()
+ getHeatLevel());
getQueso().setCurrentTemperature(getQueso()
.getCurrentTemperature()
+ getHeatLevel());
if (getTortilla().getCurrentTemperature()
>= getTortilla()
.getToastTemperature()) {
getTortilla().toast(true);
}
if (getQueso().getCurrentTemperature()
>= getQueso().getMeltingTemperature()) {
getQueso().melt(true);
}
}

if (getQueso().isMelted()
&& getTortilla().isToasted()) {
return "Perfect quesadilla";
} else if (getQueso().isMelted()
&& !getTortilla().isToasted()) {
return "Good quesadilla";
} else if (!getQueso().isMelted()
&& getTortilla().isToasted()) {
return "Terrible quesadilla";
} else {
return "You ran out of gas";
}

}

/**Devuelve el valor de queso.
 * @return queso .*/
public final Queso getQueso() {
return queso;
}

/**Asigna un valor a queso.
 * @param quesito .*/
public final void setQueso(final Queso quesito) {
this.queso = quesito;
}

/**Devuelve el valor de tortilla.
 * @return tortilla .*/
public final Tortilla getTortilla() {
return tortilla;
}

/**Asigna un valor a tortilla.
 * @param tortillita .*/
public final void setTortilla(final Tortilla tortillita) {
this.tortilla = tortillita;
}

/**Devuelve el valor de heatLevel.
 * @return heatLevel .*/
public final int getHeatLevel() {
return heatLevel;
}

/**Asigna un valor a heatLevel.
 * @param heatLevelNow . */
public final void setHeatLevel(final int heatLevelNow) {
this.heatLevel = heatLevelNow;
}
}
