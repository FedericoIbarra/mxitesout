package mx.iteso.ut;

public class TortillaMaiz implements Tortilla {

    private boolean toasted;
    private int toastTemperature;
    private int currentTemperature;

    public TortillaMaiz(){
        toasted = false;
        toastTemperature = 70;
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
