package mx.iteso.ut;

/**
 * Abstract class Tortilla.
 */
public abstract class Tortilla {
    /**
     *
     * @return a boolean value
     *  True if the tortilla is toasted, otherwise false.
     */
    public abstract boolean isToasted();

    /**
     *
     * @return the value of the temperature with which the tortilla is toasted
     */
    public abstract int getToastTemperature();

    /**
     *
     * @return the current tortilla temperature
     */
    public abstract int getCurrentTemperature();

    /**
     *
     * @param  temp set the current temperature of the tortilla
     */
    public abstract void setCurrentTemperature(int temp);

    /**
     *
     * @param toasted indicates if the tortilla is totasted lol
     */
    public abstract void toast(boolean toasted);

}
