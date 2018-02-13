package mx.iteso.ut;

/**
 * Interfaz Queso utilizada como atributo de clase Quesadilla.
 */
public interface Queso {
/**Permite saber si el queso se encuentra derretido.
 * @return verdadero si está derretido.*/
boolean isMelted();
/**Permite obtener la temperatura actual del queso.
 * @return temperatura del queso .*/
int getCurrentTemperature();
/**Permite saber la temperatura a la cual se derrite el queso.
 * @return temperatura requerida para derretir .*/
int getMeltingTemperature();
/**Permite establecer la temperatura actual del queso.
 * @param temp para establecer la nueva temperatura .*/
void setCurrentTemperature(int temp);
/**Permite cambiar el estado del queso.
 * @param melted verdadero o falso .*/
void melt(boolean melted);
}
