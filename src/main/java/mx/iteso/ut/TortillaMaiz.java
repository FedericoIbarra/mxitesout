package mx.iteso.ut;

public class TortillaMaiz implements Tortilla{
    private static final int toastTemp = 25;

    private boolean toast;
    private int currentTemp;

    public TortillaMaiz(){
        this.toast = false;
        this.currentTemp = 20;
    }

    public boolean isToasted(){
        return  toast;
    }

    public int getToastTemperature(){
        return this.toastTemp;
    }

    public int getCurrentTemperature(){
        return this.currentTemp;
    }

    public void setCurrentTemperature(int temp){
        this.currentTemp = temp;

    }

    public void toast(boolean toasted){
        this.toast = toasted;
    }

}