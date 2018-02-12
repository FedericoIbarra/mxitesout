package mx.iteso.ut;

/** */
public interface Tortilla {
    /**
     * @return boolean
     */
    boolean isToasted();
    /**
     * @return int
     */
    int getToastTemperature();
    /**
     * @return int
     */
    int getCurrentTemperature();
    /**
     * @param temp temp
     */
    void setCurrentTemperature(int temp);
    /**
     * @param toasted toasted
     */
    void toast(boolean toasted);

}
