package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        if (xLength + yLength + zLength > 300) {
            System.out.println("Dimension exceeds 300");
            return false;
        } else if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Package to small");
            return false;
        } else if (!isExpress && weight > 30.0) {
            System.out.println("Package weight cant exceed 30.0 kg");
            return false;
        } else if (isExpress && weight > 15.0) {
            System.out.println("Express package weight cant exceed 15.00 kg");
            return false;
        } else {
            System.out.println("Valid package size");
            return true;
        }
    }
}
