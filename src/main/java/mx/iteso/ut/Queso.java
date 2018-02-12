package mx.iteso.ut;

/**Interfaz de queso.*/
public interface Queso {

/**Devuelve verdadero si está derretido, falso en otro caso.
 * @return boolean .*/
boolean isMelted();
/**Devuelve la termperatura actual.
 * @return int .*/
int getCurrentTemperature();
/**Devuelve la temperatura en la que se derrite el queso.
 * @return int .*/
int getMeltingTemperature();

/**Asignamos la temperatura actual.
* @param temp .*/
void setCurrentTemperature(int temp);

/**Derrite el queso.
* @param melted .*/
void melt(boolean melted);
}
