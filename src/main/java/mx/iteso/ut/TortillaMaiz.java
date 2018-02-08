package mx.iteso.ut;

public class TortillaMaiz implements Tortilla {
	int cTemperature;
	int tTemperature = 30;
	boolean toast=false;

	public boolean isToasted() {
			return toast;
	}

	public int getToastTemperature() {
		return tTemperature;
	}

	public int getCurrentTemperature() {
		return cTemperature;
	}

	public void setCurrentTemperature(int temp) {
		cTemperature = temp;
	}

	public void toast(boolean toasted) {
		toast = toasted;
	}

}
