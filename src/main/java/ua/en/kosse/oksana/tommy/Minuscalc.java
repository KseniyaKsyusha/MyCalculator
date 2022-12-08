package ua.en.kosse.oksana.tommy;

public abstract class Minuscalc {

    public static int oper(int valA, int valB) {
        return valA - valB;
    }
}
/*public class Minuscalc extends Valcalc {

    private int valA;
    private int valB;

    public Minuscalc(int valA, int valB) {
        this.valA = valA;
        this.valB = valB;
    }

    public void setValA(int valA) {
        this.valA = valA;
    }

    public void setValB(int valB) {
        this.valB = valB;
    }

    @Override
    public double getVal() {
        return valA - valB;
    }

    @Override
    public String getName() {
        return "Різниця";
    }
}*/

