package mx.iteso.ut;
/**Implementacion.*/
public class TortillaHarina implements Tortilla {
/**VAR.*/
private int cTemperature;
/**VAR.*/
private static int tTemperature = 20;
/**VAR.*/
private boolean toast = false;
/**@return boolean*/
final boolean gettoa() {
return toast;
}
/**@param t int*/
final void settoa(final boolean t) {
toast = t;
}
/**@return int*/
final int getmtemp() {
return tTemperature;
}
/**@param t int*/
final void setmt(final int t) {
tTemperature = t;
}
/**@return int*/
final int getctemp() {
return cTemperature;
}
/**@param t int*/
final void setct(final int t) {
cTemperature = t;
}
/**@return boolean*/
public final boolean isToasted() {
return toast;
}
/**@return int*/
public final int getToastTemperature() {
return tTemperature;
}
/**@return int*/
public final int getCurrentTemperature() {
return cTemperature;
}
/**@param temp int*/
public final void setCurrentTemperature(final int temp) {
cTemperature = temp;
}
/**@param toasted boolean*/
public final void toast(final boolean toasted) {
toast = toasted;
}

}
