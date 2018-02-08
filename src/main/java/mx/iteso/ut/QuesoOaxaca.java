package mx.iteso.ut;

public class QuesoOaxaca implements Queso {
    int currentTemperature;
    int meltingTemperature = 20;
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
        return (getCurrentTemperature() >= getMeltingTemperature());
    }

    public void melt(boolean melted) {
        this.melt = (getCurrentTemperature() >= meltingTemperature);
    }
}
