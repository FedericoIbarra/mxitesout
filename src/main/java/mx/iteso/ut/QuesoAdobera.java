package mx.iteso.ut;

public class QuesoAdobera implements Queso{
	
	int temp;
	boolean melted;
	int melTemp = 18;

	public boolean isMelted() {
		if(this.melted)
			return true;
		return false;
	}

	public int getCurrentTemperature() {
		return this.temp;
	}

	public int getMeltingTemperature() {
		return this.melTemp;
	}

	public void setCurrentTemperature(int temp) {
		this.temp = temp;
	}

	public void melt(boolean melted) {
		this.melted = melted;
	}
	
}
