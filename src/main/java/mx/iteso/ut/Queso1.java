package mx.iteso.ut;

public class Queso1 implements Queso {
    protected boolean Melted = false;
    protected int meltingTemperature = 20; //temperatura de tostado
    protected int currentTemperature = 0; // default temperatura es 0
    public boolean isMelted() {
        return Melted;
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
        this.Melted = melted;
    }
}
