package mx.iteso.ut;

public class TortillaHarina implements Tortilla{

    private static final int toastTemperature = 15;

    private boolean toasted;
    private int currentTemperature; 

    public boolean isToasted(){
        return toasted;
    }
    
    public int getToastTemperature(){
        return toastTemperature;
    }
    public int getCurrentTemperature(){
        return currentTemperature;
    }

    public void setCurrentTemperature(int temp){
        this.currentTemperature = temp;
    }

    public void toast(boolean toasted){
        this.toasted = toasted;
    }

}
