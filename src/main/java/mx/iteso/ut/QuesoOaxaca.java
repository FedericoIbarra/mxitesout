package mx.iteso.ut;

public class QuesoOaxaca implements Queso {
    private static final int meltingTemperature = 30;

    private boolean melted;
    private int currentTemperature;

    public QuesoOaxaca(){
        this.melted = false;
        this.currentTemperature = 20;
    }
    public boolean isMelted(){
        return melted;
    }

    public int getCurrentTemperature(){
        return currentTemperature;
    }

    public int getMeltingTemperature(){
        return meltingTemperature;
    }

    public void setCurrentTemperature(int temp){
        this.currentTemperature = temp;
    }

    public void melt(boolean melted){
        this.melted = melted;
    }
}