package mx.iteso.ut;

public class QuesoAdobera implements Queso {
    private boolean melted;
    private int meltingTemperature;
    private int currentTemperature;

    public QuesoAdobera(){
        meltingTemperature = 60;
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
