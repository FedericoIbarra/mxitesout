package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla {
    private Queso queso = new Quesito();
    private Tortilla tortilla = new Tortillita();
    private int heatLevel;

    private QuesoP quesoPanela = new QuesoPanela();
    private TortillaH tortillaHarina = new TortillaHarina();

    public String prepareSingle() {

     while(getQueso().getCurrentTemperature() < getQueso().getMeltingTemperature() ||
             getTortilla().getCurrentTemperature() < getTortilla().getToastTemperature()) {

         getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
         getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
         if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature())
             getTortilla().toast(true);
         if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
             getQueso().melt(true);
     }

     if (getQueso().isMelted() && getTortilla().isToasted())
         return "Perfect quesadilla";

     if (getQueso().isMelted() && !getTortilla().isToasted())
         return "Good quesadilla";

     if (!getQueso().isMelted() && getTortilla().isToasted())
         return "Terrible quesadilla";
     else
         return "You ran out of gas";

    }

    public String prepareSingleConPanela() {

        while(getQuesoPanela().getCurrentTemperature() < getQuesoPanela().getMeltingTemperature() ||
                getTortillaHarina().getCurrentTemperature() < getTortillaHarina().getToastTemperature()) {

            getTortillaHarina().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
            getQuesoPanela().setCurrentTemperature(getQuesoPanela().getCurrentTemperature() + getHeatLevel());
            if (getTortillaHarina().getCurrentTemperature() >= getTortillaHarina().getToastTemperature())
                getTortillaHarina().toast(true);
            if (getQuesoPanela().getCurrentTemperature() >= getQuesoPanela().getMeltingTemperature())
                getQuesoPanela().melt(true);
        }

        if (getQuesoPanela().isMelted() && getTortillaHarina().isToasted())
            return "Perfect quesadilla";

        if (getQuesoPanela().isMelted() && !getTortillaHarina().isToasted())
            return "Good quesadilla";

        if (!getQuesoPanela().isMelted() && getTortillaHarina().isToasted())
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
        return heatLevel;
    }

    public void setHeatLevel(int heatLevel) {
        this.heatLevel = heatLevel;
    }




    public QuesoP getQuesoPanela() {
        return quesoPanela;
    }

    public void setQuesoPanela(QuesoP quesoPanela) {
        this.quesoPanela = quesoPanela;
    }


    public TortillaH getTortillaHarina() {
        return tortillaHarina;
    }

    public void setTortillaHarina(TortillaH tortilla) {
        this.tortillaHarina = tortilla;
    }


}
