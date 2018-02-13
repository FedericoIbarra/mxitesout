package mx.iteso.ut;

/**
 * Abstract class Tortilla.
 */
public interface Tortilla {
    /**
     *
     * @return a boolean value
     *  True if the tortilla is toasted, otherwise false.
     */
      boolean isToasted();

    /**
     *
     * @return the value of the temperature with which the tortilla is toasted
     */
      int getToastTemperature();

    /**
     *
     * @return the current tortilla temperature
     */
      int getCurrentTemperature();

    /**
     *
     * @param  temp set the current temperature of the tortilla
     */
      void setCurrentTemperature(int temp);

    /**
     *
     * @param toasted indicates if the tortilla is totasted lol
     */
      void toast(boolean toasted);

}
