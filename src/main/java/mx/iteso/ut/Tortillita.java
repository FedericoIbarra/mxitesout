package mx.iteso.ut;

public class Tortillita implements Tortilla {

    private int temperature;
    private int toastTemperature;
    private boolean isToasted;

    public Tortillita() {
        temperature = 0;
        toastTemperature = 20;
        isToasted = false;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public int getToastTemperature() {
        return toastTemperature;
    }

    public int getCurrentTemperature() {
        return temperature;
    }

    public void setCurrentTemperature(int temp) {
        temperature = temp;
    }

    public void toast(boolean toasted) {
        isToasted = toasted;
    }
}
