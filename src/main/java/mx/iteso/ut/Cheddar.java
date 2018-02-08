package mx.iteso.ut;

public class Cheddar implements Queso {
    private boolean melted;
    private int currentTemperature;
    private final int MELTING_TEMPERATURE;

    public Cheddar(){
        melted = false;
        currentTemperature = 0;
        MELTING_TEMPERATURE = 17;
    }


    public boolean isMelted() {
        return melted;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public int getMeltingTemperature() {
        return MELTING_TEMPERATURE;
    }

    public void setCurrentTemperature(int temp) {
        currentTemperature = temp;
    }

    public void melt(boolean melted) {
        this.melted = melted;
    }
}
