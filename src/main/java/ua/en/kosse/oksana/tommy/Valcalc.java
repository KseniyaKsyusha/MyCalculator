package ua.en.kosse.oksana.tommy;

public abstract class Valcalc {

    public abstract double getVal();

    public abstract String getName();

    @Override
    public String toString() {
        return "[Операція: " + getName() + " значення " + getVal() + "]";
    }
}
