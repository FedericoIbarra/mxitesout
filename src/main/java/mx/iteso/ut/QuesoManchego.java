package mx.iteso.ut;

public class QuesoManchego implements Queso{

	private boolean melted;
	private int meltingTemp;
	private int currentTemp;
	
	public QuesoManchego(){
		this.melted = false;
		this.meltingTemp = 20;
		this.currentTemp = 0;
	}
	
	public QuesoManchego(boolean melted,int meltingTemp,int currentTemp){
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
