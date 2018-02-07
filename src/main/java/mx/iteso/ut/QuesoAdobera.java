package mx.iteso.ut;

public class QuesoAdobera implements Queso{
    private boolean  melt;
    private int currentTemperature , meltTemp;

    public QuesoAdobera(){
        this.melt = false;
        this.currentTemperature = 0;
        this.meltTemp = 40;
    }

    public boolean isMelted(){
        return melt;
    }

    public int getCurrentTemperature(){
        return this.currentTemperature;
    }

    public void setCurrentTemperature(int newTemp){
        this.currentTemperature = newTemp;
    }


    public int getMeltingTemperature(){
        return this.meltTemp;
    }

    public void melt(boolean m){
        this.melt = m;
    }

}
