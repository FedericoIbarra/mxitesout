package mx.iteso.ut;

    /**
    * Interfaz con metodos de tortilla.
    * @since 02-08-2018
    * */
public interface Tortilla {
    /**
     * metodo que indicara si esta tostada.
     * @return isToasted
     */
    boolean isToasted();
    /**
     * metodo para saber temperatura de tostado.
     * @return ToastTemp
     */
    int getToastTemp();
    /**
     * metodo para saber temperatura actual.
     * @return CurrentTemp
     */
    int getCurrentTemp();
    /**
     * @param temp
     * metodo para establecer temperatura.
     */
    void setCurrentTemp(int temp);
    /**
     * @param toasted
     * metodo que para definir tostado.
     */
    void toast(boolean toasted);

}
