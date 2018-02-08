package mx.iteso.ut;

public class TortillaMaiz implements Tortilla{

	int temp;
	boolean toasted;
	int toastTemp;
	
	public TortillaMaiz(){
		this.temp = 0;
		this.toasted = false;
		this.toastTemp = 20;
	}
	
	public boolean isToasted() {
		return this.toasted;
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
