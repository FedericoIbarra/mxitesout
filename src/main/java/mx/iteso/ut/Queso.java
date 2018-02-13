package mx.iteso.ut;
/** Interface Queso.*/
public interface Queso {
/**@return boolean*/
boolean isMelted();
/**@return int*/
int getCurrentTemperature();
/**@return int*/
int getMeltingTemperature();
/** @param temp int*/
void setCurrentTemperature(final int temp);
/** @param melted boolean*/
void melt(final boolean melted);
}
