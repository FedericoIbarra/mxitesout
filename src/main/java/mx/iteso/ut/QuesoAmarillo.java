package mx.iteso.ut;

public class QuesoAmarillo implements Queso {
    int currentTemperature;
    int meltingTemperature;
    boolean melt;

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public int getMeltingTemperature() {
        return meltingTemperature;
    }

    public boolean isMelted() {
        return melt;
    }

    public void melt(boolean melted) {
        this.melt = melted;
    }
}
