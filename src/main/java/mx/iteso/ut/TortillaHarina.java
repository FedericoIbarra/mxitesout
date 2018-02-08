package mx.iteso.ut;

public class TortillaHarina implements Tortilla {
    private boolean toasted;
    private int tTemperature = 25;
    private int cTemperature = 5;

    public boolean isToasted() {
        return toasted;
    }

    public int getToastTemperature() {
        return tTemperature;
    }

    public int getCurrentTemperature() {
        return cTemperature;
    }

    public void setCurrentTemperature(int temp) {
        this.cTemperature = temp;
    }

    public void toast(boolean toasted) {
        this.toasted = toasted;
    }
}
