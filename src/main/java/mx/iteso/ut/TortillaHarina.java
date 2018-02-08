package mx.iteso.ut;

public class TortillaHarina implements Tortilla {
    int currentTemperature;
    int toastTemperature = 20;
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
        return (getCurrentTemperature() >= getToastTemperature());
    }

    public void toast(boolean melted) {
        this.toast = (getCurrentTemperature() >= toastTemperature);
    }
}