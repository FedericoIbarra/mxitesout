package mx.iteso.ut;

public class TortillaHarinaIntegral implements Tortilla {
	
	private boolean toasted = false;
	private int currentTemperature = 8;
	private final int toastingTemperature = 26;

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
		currentTemperature = temp > -273 && temp < 80 ? temp : currentTemperature;
	}

	public void toast(boolean toasted) {
		// TODO Auto-generated method stub
		this.toasted = toasted;
	}

}
