package mx.iteso.ut;

public class TortillaHarina implements Tortilla {
	
	private boolean toasted = false;
	private int currentTemperature = 0;
	private final int toastingTemperature = 28;

	public boolean isToasted() {
		// TODO Auto-generated method stub
		return toasted;
	}

	public int getToastTemperature() {
		// TODO Auto-generated method stub
		return toastingTemperature;
	}

	public int getCurrentTemperature() {
		// TODO Auto-generated method stub
		return currentTemperature;
	}

	public void setCurrentTemperature(int temp) {
		// TODO Auto-generated method stub
		currentTemperature = temp;
	}

	public void toast(boolean toasted) {
		this.toasted = toasted;
	}

}
