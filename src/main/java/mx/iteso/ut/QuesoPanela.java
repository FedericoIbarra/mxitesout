package mx.iteso.ut;

public class QuesoPanela implements QuesoP {

    private int temperature;
    private int meltingTemperature;
    private boolean isMelted;

    public QuesoPanela(){
        temperature = 0;
        meltingTemperature = 30;
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
