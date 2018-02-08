package mx.iteso.ut;

public interface TortillaH {
    public boolean isToasted();
    public int getToastTemperature();
    public int getCurrentTemperature();
    public void setCurrentTemperature(int temp);
    public void toast(boolean toasted);
}
