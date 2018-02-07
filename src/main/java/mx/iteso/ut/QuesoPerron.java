package mx.iteso.ut;

public class QuesoPerron implements Queso {
    protected boolean _isMelted;
    protected int _temperature;

    public QuesoPerron(){
        _isMelted = false;
    }
    public boolean isMelted(){
        return _isMelted;
    }
    public int getCurrentTemperature(){
        return _temperature;
    }
    public int getMeltingTemperature(){
        return 150;
    }
    public void setCurrentTemperature(int temp){
        _temperature = temp;
    }
    public void melt(boolean melted){
        _isMelted = melted;
    }
}
