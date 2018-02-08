package mx.iteso.ut;

public class TortillaHarina implements Tortilla {
    int currentTemperature;
    int toastTemperature;
    boolean toast;

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public int getToastTemperature() {
        return toastTemperature;
    }

    public boolean isToasted() {
        return toast;
    }

    public void toast(boolean toasted) {
        this.toast = toasted;
    }
}