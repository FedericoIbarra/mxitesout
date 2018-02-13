package mx.iteso.ut;

public interface Queso {
    public boolean isMelted();
    public int getCurrentTemp();
    public int getMeltingTemp();
    public void setTemp(int temp);
    public void melt(boolean melted);
}
