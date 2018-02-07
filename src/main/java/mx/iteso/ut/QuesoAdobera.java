package mx.iteso.ut;

public class QuesoAdobera implements Queso
{
    int temp;
    int meltingTemp = 10;

    public boolean isMelted() {
        return false;
    }

    public int getCurrentTemperature() {
        return this.temp;
    }

    public int getMeltingTemperature() {
        return this.meltingTemp;
    }

    public void melt(boolean melted) {

    }

    public void setCurrentTemperature(int temp)
    {
        this.temp = temp;

    }
}
