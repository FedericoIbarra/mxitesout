package mx.iteso.ut;

    /**
     * Interfaz con metodos de queso.
     * @since 02-08-2018
     * */
public interface Queso {
    /**
     *metodo para verificar si ya se derritio.
     *@return isMelted
     * */
    boolean isMelted();
    /**
    *metodo para saber la temperatura actual.
    * @return CurrentTemp
    * */
    int getCurrentTemp();
    /**
    * metodo saber la temperatura de derretido.
    * @return MeltingTemp
    * */
    int getMeltingTemp();
    /**
    * @param temp
    * metodo para saber temperatura actual.
    * */
    void setCurrentTemp(int temp);
    /**
     * @param melted
     * metodo que para definir derretido.
     */
    void melt(boolean melted);
}
