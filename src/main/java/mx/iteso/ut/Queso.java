package mx.iteso.ut;

/**
 * Queso interface.
 */
public interface Queso {
    /**
     * Instance method for checking if the instance is melted.
     * @return boolean value
     */
    boolean isMelted();
    /**
     * Getter for current temperature.
     * @return int value
     */
    int getCurrentTemp();
    /**
     * Getter for melting temperature.
     * @return int value
     */
    int getMeltingTemp();
    /**
     * Setter for temperature.
     * @param temp **name off variable**
     */
    void setTemp(int temp);
    /**
     * Instance method for melting the instance.
     * @param melted **name off variable**
     */
    void melt(boolean melted);
}
