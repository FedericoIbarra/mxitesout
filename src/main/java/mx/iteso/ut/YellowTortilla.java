package mx.iteso.ut;

public class YellowTortilla implements Tortilla {
    private boolean toasted;
    private final int TOAST_TEMPERATURE;
    private int currentTemperature;

    public YellowTortilla(){
        toasted = false;
        TOAST_TEMPERATURE = 21;
        currentTemperature = 0;
    }
    public boolean isToasted() {
        return toasted;
    }

    public int getToastTemperature() {
        return TOAST_TEMPERATURE;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int temp) {
        currentTemperature = temp;
    }

    public void toast(boolean toasted) {
        this.toasted = toasted;
    }
}
