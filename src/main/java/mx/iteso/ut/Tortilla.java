package mx.iteso.ut;

/**
 * Interfaz de tortilla.*/
public interface Tortilla {

/**Devuelve verdadero si está tostada, falso en otro caso.
* @return boolean .*/
boolean isToasted();

/**Devuelve la termperatura de tostamiento.
* @return int .*/
int getToastTemperature();

/**Devuelve la termperatura actual.
* @return int .*/
int getCurrentTemperature();

/**Asignamos la temperatura actual.
* @param temp valor .*/
void setCurrentTemperature(int temp);

/**Tuesta la tortilla.
* @param toasted valor .*/
void toast(boolean toasted);

}
