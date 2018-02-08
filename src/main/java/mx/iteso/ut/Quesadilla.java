package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla
{
    private Queso queso;
    private Tortilla tortilla;
    private int heatLevel;
    private int minutes;
    private int tortillaTimeOffset;
    private int quesoTimeOffset;
    private int gas;

    public String prepareSingle(){

     minutes = 0;
     while(getHeatLevel() > 0 & (getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() || getTortilla().getCurrentTemperature()< getTortilla().getToastTemperature())){
         if(getTortillaTimeOffset() <= minutes)
             getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());

         if(getQuesoTimeOffset() <= minutes)
             getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());

         if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature())
             getTortilla().toast(true);

         if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
             getQueso().melt(true);

         if(getQueso().isMelted() || getTortilla().isToasted())
             break;

         minutes ++;
         setGas(getGas()-1);
     }

     if(getQueso().isMelted() && getTortilla().isToasted())
         return "Perfect quesadilla";
     if(getQueso().isMelted() && !getTortilla().isToasted())
         return "Good quesadilla";
     if(!getQueso().isMelted() && getTortilla().isToasted())
         return "Terrible quesadilla";
     else
         return "You ran out of gas";

    }

    public Queso getQueso() {
        return queso;
    }

    public void setQueso(Queso queso) {
        this.queso = queso;
    }


    public Tortilla getTortilla() {
        return tortilla;
    }

    public void setTortilla(Tortilla tortilla) {
        this.tortilla = tortilla;
    }

    public int getHeatLevel() {
        return getGas() > 0 ? heatLevel : 0;
    }

    public void setHeatLevel(int heatLevel) {
        this.heatLevel = heatLevel;
    }

    public void setTortillaTimeOffset(int minuteOffset){
        tortillaTimeOffset = minuteOffset;
    }
    public int getTortillaTimeOffset(){
        return tortillaTimeOffset;
    }

    public void setQuesoTimeOffset(int minuteOffset){
        quesoTimeOffset = minuteOffset;
    }
    public int getQuesoTimeOffset(){
        return quesoTimeOffset;
    }

    public void setGas(int qtyGas){
        gas = qtyGas > 0 ? qtyGas : 0;
    }
    public int getGas(){
        return gas;
    }
}
