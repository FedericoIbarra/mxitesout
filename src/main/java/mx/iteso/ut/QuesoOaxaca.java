package mx.iteso.ut;

/**
 * Clase que implementa la interfaz Queso.
 */
public class QuesoOaxaca implements Queso {
    /**Atributo de temperatura actual.*/
    private int currentTemperature;
    /**Atributo de temperatura de derretido.*/
    private int meltingTemperature;
    /**Atributo de estado actual.*/
    private boolean melt;

    /**Método que regresa la temperatura actual del queso.
     * @return temperatura del queso.*/
    public final int getCurrentTemperature() {
        return currentTemperature;
    }

    /**Método que establece la temperatura actual del queso.
     * @param myCurrentTemperature recibe un entero.*/
    public final void setCurrentTemperature(final int myCurrentTemperature) {
        this.currentTemperature = myCurrentTemperature;
    }

    /**Método que regresa a que temperatura se derrite el queso.
     * @return temperatura de derretido*/
    public final int getMeltingTemperature() {
        return meltingTemperature;
    }

    /**Método que establece a que temperatura se derrite el queso.
     * @param myMeltingTemperature recibe un entero*/
    public final void setMeltingTemperature(final int myMeltingTemperature) {
        this.meltingTemperature = myMeltingTemperature;
    }

    /**Método que regresa si el queso está derretido o no.
     * @return estado del queso.*/
    public final boolean isMelted() {
        return melt;
    }

    /**Método que establece el estado actual del queso.
     * @param melted recibe un booleano*/
    public final void melt(final boolean melted) {
        this.melt = melted;
    }
}
