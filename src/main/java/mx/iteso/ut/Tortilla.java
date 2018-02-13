package mx.iteso.ut;
/**Interface publica Tortilla.*/
public interface Tortilla {
/**@return boolean*/
boolean isToasted();
/**@return int*/
int getToastTemperature();
/**@return int*/
int getCurrentTemperature();
/**@param temp int */
void setCurrentTemperature(final int temp);
/**@param toasted boolean*/
void toast(final boolean toasted);
}
