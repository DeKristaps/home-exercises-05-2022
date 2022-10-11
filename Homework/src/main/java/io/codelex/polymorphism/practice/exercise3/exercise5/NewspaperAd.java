package io.codelex.polymorphism.practice.exercise3.exercise5;

public class NewspaperAd extends Advert {
    private int columnCm;
    private int rate;

    public NewspaperAd(int fee, int columncm, int ratepercm) {
        super(fee);
        columnCm = columncm;
        rate = ratepercm;
    }

    public int cost() {
        return fee + rate * columnCm;
    }

    public String toString() {
        return super.toString()
                + " Newpaper ad: column_cm =" + columnCm
                + " rate=" + rate;
    }
}
