package mx.iteso.ut;

public class TortillaPerron implements Tortilla{
    protected boolean _isToasted;
    protected int _temperature;

    public boolean isToasted(){
        return _isToasted;
    }
    public int getToastTemperature(){
        return 100;
    }
    public int getCurrentTemperature(){
        return _temperature;
    }
    public void setCurrentTemperature(int temp){
        _temperature = temp;
    }
    public void toast(boolean toasted){
        _isToasted = toasted;
    }
}
