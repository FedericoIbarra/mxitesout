package mx.iteso.ut;

public class TortillaNopal implements Tortilla
{
    int temp;
    int toastTmp = 25;

    public boolean isToasted()
    {
        return false;
    }

    public int getToastTemperature()
    {
        return this.toastTmp;
    }

    public int getCurrentTemperature()
    {
        return this.temp;
    }

    public void setCurrentTemperature(int temp)
    {
        this.temp=temp;

    }

    public void toast(boolean toasted)
    {

    }
}
