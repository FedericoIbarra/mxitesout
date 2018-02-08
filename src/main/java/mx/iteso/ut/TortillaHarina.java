package mx.iteso.ut;

public class TortillaHarina implements TortillaH {
    private int temperature;
    private int toastTemperature;
    private boolean isToasted;

    public TortillaHarina() {
        temperature = 0;
        toastTemperature = 12;
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
