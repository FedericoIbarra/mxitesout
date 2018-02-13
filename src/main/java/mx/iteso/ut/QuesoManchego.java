package mx.iteso.ut;

public class QuesoManchego implements Queso {
	int cTemperature;
	int mTemperature = 18;
	boolean melt=false;

	public final boolean isMelted() {
			return melt;
	}

	public final int getCurrentTemperature() {
		return cTemperature;
	}

	public final int getMeltingTemperature() {
		return mTemperature;
	}

	public final void setCurrentTemperature(int temp) {
		cTemperature = temp;
	}

	public final void melt(boolean melted) {
		melt = melted;
	}
}
