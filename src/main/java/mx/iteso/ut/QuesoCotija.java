package mx.iteso.ut;

public class QuesoCotija implements Queso{

	private boolean melted;
	private int meltingTemp;
	private int currentTemp;
	
	public QuesoCotija(){
		this.melted = true;
		this.meltingTemp = 30;
		this.currentTemp = 0;
	}
	
	public QuesoCotija(boolean melted,int meltingTemp,int currentTemp){
		this.melted = melted;
		this.meltingTemp = meltingTemp;
		this.currentTemp = currentTemp;
	}
	
	public boolean isMelted(){
		return melted;
	}
	
    public int getMeltingTemperature(){
    	return meltingTemp;
    }
    
    public int getCurrentTemperature(){
    	return currentTemp;
    }
    
    public void setCurrentTemperature(int temp){
    	currentTemp = temp;
    }
    
    public void melt(boolean melted){
    	if(melted == false)
    		this.melted = true;
    	else
    		this.melted = true;
    }
	
}
