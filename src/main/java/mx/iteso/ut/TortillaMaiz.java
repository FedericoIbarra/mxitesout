package mx.iteso.ut;

public class TortillaMaiz implements Tortilla {

    private boolean toast;
    private int currentTemp, toastTemp;

    public TortillaMaiz(){
        this.toast = false;
        this.currentTemp = 0;
        this.toastTemp = 50;
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
