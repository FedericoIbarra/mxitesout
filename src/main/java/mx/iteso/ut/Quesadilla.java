package mx.iteso.ut;
/**
 *  Clase publica quesadilla.
 *  @type
 */
public class Quesadilla {
/** VAR queso.*/
private Queso queso;
/** VAR tortilla.*/
private Tortilla tortilla;
/** VAR heatlevel.*/
private int heatLevel;
/**@return string*/
public final String prepareSingle() {
while (getQueso().getCurrentTemperature() < getQueso().getMeltingTemperature()
&&
getTortilla().getCurrentTemperature() < getTortilla().getToastTemperature()) {
getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature()
+ getHeatLevel());
getQueso().setCurrentTemperature(getQueso().getCurrentTemperature()
+ getHeatLevel());
if (getTortilla().getCurrentTemperature()
>= getTortilla().getToastTemperature()) {
getTortilla().toast(true);
}
if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature()) {
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

/** @return Queso*/
public final Queso getQueso() {
return queso;
}

/**@param queso1 */
public final void setQueso(final Queso queso1) {
this.queso = queso1;
}

/** @return Tortilla*/
public final Tortilla getTortilla() {
return this.tortilla;
}

/** @param tortilla1 */
public final void setTortilla(final Tortilla tortilla1) {
this.tortilla = tortilla1;
}

/** @return int*/
public final int getHeatLevel() {
return this.heatLevel;
}

/** @param heatLevel1 */
public final void setHeatLevel(final int heatLevel1) {
this.heatLevel = heatLevel1;
}
}
