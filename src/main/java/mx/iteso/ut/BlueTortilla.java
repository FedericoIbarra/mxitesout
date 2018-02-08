package mx.iteso.ut;

public class BlueTortilla implements Tortilla{
    private boolean toasted;
    private final int TOAST_TEMPERATURE;
    private int currentTemperature;

    public BlueTortilla(){
        toasted = false;
        TOAST_TEMPERATURE = 19;
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
