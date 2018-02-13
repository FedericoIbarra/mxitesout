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
void setCurrentTemperature(int temp);
/** @param melted boolean*/
void melt(boolean melted);
}
