package io.codelex.oop.parcels;

public class Exercise6 {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(100, 120, 100, 20, false);
        Parcel parcel1 = new Parcel(29, 100, 20, 30, false);
        Parcel parcel2 = new Parcel(60, 60, 60, 60, false);
        Parcel parcel3 = new Parcel(60, 60, 60, 16, true);
        Parcel parcel4 = new Parcel(60, 60, 60, 29, false);

        parcel.validate();
        parcel1.validate();
        parcel2.validate();
        parcel3.validate();
        parcel4.validate();
    }
}
