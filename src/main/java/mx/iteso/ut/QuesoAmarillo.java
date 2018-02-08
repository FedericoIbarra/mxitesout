package mx.iteso.ut;

public class QuesoAmarillo implements Queso{

    private static final int meltingTemperature = 20;
    private boolean melted;
    private int currentTemperature;

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
