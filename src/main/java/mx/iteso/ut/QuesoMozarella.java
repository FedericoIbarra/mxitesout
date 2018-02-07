package mx.iteso.ut;

public class QuesoMozarella implements Queso {
    boolean  melt;
    int Temperature, meltTemp;

    public void QuesoMozarella(){
        this.melt = false;
        this.Temperature = 0;
        this.meltTemp = 30;
    }

    public boolean isMelted(){
        if(melt)
            return  true;
        else
            return false;
    }

    public int getCurrentTemperature(){
        return this.Temperature;
    }

    public void setCurrentTemperature(int newTemp){
        this.Temperature = newTemp;
    }



    public int getMeltingTemperature(){
        return this.meltTemp;
    }

    public void melt(boolean m){
        this.melt = m;
    }


}
