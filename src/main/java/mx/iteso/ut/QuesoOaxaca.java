package mx.iteso.ut;

public class QuesoOaxaca implements Queso {
	
	private boolean melted = false;
	private int currentTemperature = 0;
	private final int meltingTemperature = 25;

	public boolean isMelted() {
		// TODO Auto-generated method stub
		return melted;
	}

	public int getCurrentTemperature() {
		// TODO Auto-generated method stub
		return currentTemperature;
	}

	public int getMeltingTemperature() {
		// TODO Auto-generated method stub
		return meltingTemperature;
	}

	public void setCurrentTemperature(int temp) {
		// TODO Auto-generated method stub
		currentTemperature = temp;
	}

	public void melt(boolean melted) {
		// TODO Auto-generated method stub
		this.melted = melted;
	}

}
