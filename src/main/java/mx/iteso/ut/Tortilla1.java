package mx.iteso.ut;

public class Tortilla1 implements Tortilla{
    protected boolean Toasted = false;
    protected int toastTemperature = 40; //temperatura de tostado
    protected int currentTemperature = 0; // default temperatura es 0
    public boolean isToasted() {
        return false;
    }

    public int getToastTemperature() {
        return toastTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int temp) {
        this.currentTemperature = temp;
    }

    public void toast(boolean toasted) {
        this.Toasted = toasted;
    }
}
