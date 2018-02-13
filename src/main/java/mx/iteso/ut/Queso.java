package mx.iteso.ut;

/**
 *
 */
public interface Queso {
    /**
     *
     * @return a boolean value that indicates if the queso is melted
     */
     boolean isMelted();

    /**
     *
     * @return the int value with the current temperature of the Quesito
     */
     int getCurrentTemperature();

    /**
     *
     * @return the int value of the temperature in which the cheese is melted
     */
     int getMeltingTemperature();

    /**
     *
     * @param temp to set the current temperature of the cheese
     */
     void setCurrentTemperature(int temp);

    /**
     *
     * @param melted sets if the cheese is melted
     */
     void melt(boolean melted);
}
