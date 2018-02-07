package mx.iteso.ut;

public class TortillaMaiz implements Tortilla{

	int temp;
	boolean toasted;
	int toastTemp = 20;
	
	public boolean isToasted() {
		if(this.toasted)
			return true;
		return false;
	}

	public int getToastTemperature() {
		return this.toastTemp;
	}

	public int getCurrentTemperature() {
		return this.temp;
	}

	public void setCurrentTemperature(int temp) {
		this.temp = temp;
	}

	public void toast(boolean toasted) {
		this.toasted = toasted;
	}

}
