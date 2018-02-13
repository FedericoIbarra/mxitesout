package mx.iteso.ut;

public class QuesoAdobera implements Queso{

    private static final int meltingTemperature = 25;

    private boolean melted;
    private int currentTemperature;

    public QuesoAdobera(){
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