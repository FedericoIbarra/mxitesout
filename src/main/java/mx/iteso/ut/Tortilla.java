package mx.iteso.ut;

/**
 * Interfaz Tortilla utilizada como atributo de clase Quesadilla.
 */
public interface Tortilla {
/**Permite saber si la tortilla se encuentra tostada.
 * @return verdadero si está tostada .*/
boolean isToasted();
/**Permite saber la temperatura a la cual se tuesta la tortilla.
 * @return temperatura requerida para tostar .*/
int getToastTemperature();
/**Permite obtener la temperatura actual de la tortilla.
 * @return temperatura de la tortilla .*/
int getCurrentTemperature();
/**Permite establecer la temperatura actual de la tortilla.
 * @param temp para establecer la nueva temperatura .*/
void setCurrentTemperature(int temp);
/**Permite cambiar el estado de la tortilla.
 * @param toasted verdadero o falso .*/
void toast(boolean toasted);
}
