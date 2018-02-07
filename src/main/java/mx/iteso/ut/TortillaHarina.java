package mx.iteso.ut;

public class TortillaHarina implements Tortilla{

	private boolean toasted;
	private int toastTemp;
	private int currentTemp;
	
	public TortillaHarina(){
		this.toasted = true;
		this.toastTemp = 20;
		this.currentTemp = 0;
	}
	
	public TortillaHarina(boolean toasted,int toastTemp,int currentTemp){
		this.toasted = toasted;
		this.toastTemp = toastTemp;
		this.currentTemp = currentTemp;
	}
	
	public boolean isToasted(){
		return toasted;
	}
	
    public int getToastTemperature(){
    	return toastTemp;
    }
    
    public int getCurrentTemperature(){
    	return currentTemp;
    }
    
    public void setCurrentTemperature(int temp){
    	currentTemp = temp;
    }
    
    public void toast(boolean toasted){
    	if(toasted == false)
    		this.toasted = true;
    	else
    		this.toasted = true;
    }
	
}
