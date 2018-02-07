package mx.iteso.ut;

public class Quesito implements Queso {

    private int temperature;
    private int meltingTemperature;
    private boolean isMelted;

    public Quesito(){
        temperature = 0;
        meltingTemperature = 20;
        isMelted = false;
    }

    public boolean isMelted() {
        return isMelted;
    }

    public int getCurrentTemperature() {
        return temperature;
    }

    public int getMeltingTemperature() {
        return meltingTemperature;
    }

    public void setCurrentTemperature(int temp) {
        temperature = temp;
    }

    public void melt(boolean melted) {
        isMelted = melted;
    }
}
