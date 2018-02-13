/*
*
* Clase de Tortilla
* @author Federico Ibarra
* @version 1.0
*
* */

package mx.iteso.ut;

/**Tortilla.*/
public interface Tortilla {

    /** @return true si la tortilla esta doradita.*/
    boolean isToasted();

    /** @return la temperatura a la que se tuesta la tortilla.*/
    int getToastTem();
    /** @return la temperatura actual de la toritilla.*/
    int getCurrentTemp();

    /** @param temp la temperatura a la que se actualzara la tortilla.*/
    void setCurrentTemp(int temp);

    /** @param toasted si la tortilla esta tostada.*/
    void toast(boolean toasted);

}
