package mx.iteso.ut;


import com.sun.xml.internal.fastinfoset.algorithm.BooleanEncodingAlgorithm;

public class QuesoOaxaca implements Queso {
    private boolean melted;
    private int cTemperature;
    private int mTemperature = 38;

    public boolean isMelted() {
        return melted;
    }

    public int getCurrentTemperature() {
        return cTemperature;
    }

    public int getMeltingTemperature() {
        return mTemperature;
    }

    public void setCurrentTemperature(int cTemp) {
        cTemperature = cTemp;
    }

    public void melt(boolean melted) {
        this.melted = melted;
    }
}
