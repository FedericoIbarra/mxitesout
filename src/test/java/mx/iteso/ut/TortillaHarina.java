package mx.iteso.ut;

public class TortillaHarina implements Tortilla{
    private boolean toasted;
    private int toastTemperature;
    private int currentTemperature;

    public TortillaHarina(){
        toasted = false;
        toastTemperature = 60;
        currentTemperature = 25;
    }

    public boolean isToasted() {
        return toasted;
    }

    public int getToastTemperature() {
        return toastTemperature;
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
