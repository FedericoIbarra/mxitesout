package mx.iteso.ut;

public class QuesoOaxaca implements Queso {
	int cTemperature;
	int mTemperature = 14;
	boolean melt=false;

	public boolean isMelted() {
			return melt;
	}

	public int getCurrentTemperature() {
		return cTemperature;
	}

	public int getMeltingTemperature() {
		return mTemperature;
	}

	public void setCurrentTemperature(int temp) {
		cTemperature = temp;
	}

	public void melt(boolean melted) {
		melt = melted;
	}

}
