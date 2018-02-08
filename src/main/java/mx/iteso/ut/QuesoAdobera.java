package mx.iteso.ut;

public class QuesoAdobera implements Queso{
	
	int temp;
	boolean melted;
	int melTemp;
	
	public QuesoAdobera(){
		this.temp = 0;
		this.melted = false;
		this.melTemp = 18;
	}

	public boolean isMelted() {
		return this.melted;
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
