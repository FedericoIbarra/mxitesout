package mx.iteso.ut;

public class TortillaHarina implements Tortilla {

	int cTemperature;
	int tTemperature = 20;
	boolean toast=false;

	public final boolean isToasted() {
		return toast;
	}

	public final int getToastTemperature() {
		return tTemperature;
	}

	public final int getCurrentTemperature() {
		return cTemperature;
	}

	public final void setCurrentTemperature(int temp) {
		cTemperature = temp;
	}

	public final void toast(boolean toasted) {
		toast = toasted;
	}

}
