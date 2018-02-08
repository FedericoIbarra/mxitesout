package mx.iteso.ut;

public class QuesoManchego implements Queso{
    private boolean melted;
    private int cTemperature = 10;
    private int mTemperature = 45;

    public boolean isMelted() {
        return melted;
    }

    public int getCurrentTemperature() {
        return cTemperature;
    }

    public int getMeltingTemperature() {
        return mTemperature;
    }

    public void setCurrentTemperature(int temp) {
        this.cTemperature = temp;
    }

    public void melt(boolean melted) {
        this.melted = melted;
    }
}
