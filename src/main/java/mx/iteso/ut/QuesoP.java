package mx.iteso.ut;

public interface QuesoP {
    public boolean isMelted();
    public int getCurrentTemperature();
    public int getMeltingTemperature();
    public void setCurrentTemperature(int temp);
    public void melt(boolean melted);
}
