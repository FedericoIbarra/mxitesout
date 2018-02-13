package mx.iteso.ut;

/**
 * Tortilla interface.
 */
public interface Tortilla {
    /**
     * Instance method for checking if the instance is toasted.
     * @return boolean value
     */
    boolean isToasted();
    /**
     * Getter for toast temperature.
     * @return int value
     */
    int getToastTemp();
    /**
     * Getter for current temperature.
     * @return int value
     */
    int getCurrentTemp();
    /**
     * Setter for temperature.
     * @param temp **name off variable**
     */
    void setTemp(int temp);
    /**
     * Instance method for toasting the instance.
     * @param toasted **name off variable**
     */
    void toast(boolean toasted);

}
