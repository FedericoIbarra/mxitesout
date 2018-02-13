package mx.iteso.ut;

public class QuesoManchego implements Queso {
    private boolean melted;
    private int meltingTemperature;
    private int currentTemperature;

    public QuesoManchego(){
        meltingTemperature = 80;
        currentTemperature = 25;
        melted = false;
    }

    public boolean isMelted() {
        return melted;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public int getMeltingTemperature() {
        return meltingTemperature;
    }

    public void setCurrentTemperature(int temp) {
        this.currentTemperature = temp;
    }

    public void melt(boolean melted) {
        this.melted = melted;
    }
}
