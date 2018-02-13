package mx.iteso.ut;

public interface Tortilla {
    public boolean isToasted();
    public int getToastTemp();
    public int getCurrentTemp();
    public void setTemp(int temp);
    public void toast(boolean toasted);

}
