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
        final int MAX_DIMENSION = 300;
        final int MIN_SIZE = 30;
        final double MAX_WEIGHT = 30.0;
        final double MAX_EXPRESS_WEIGHT = 15.0;

        if (xLength + yLength + zLength > MAX_DIMENSION) {
            System.out.println("Dimension exceeds 300");
            return false;
        } else if (xLength < MIN_SIZE || yLength < MIN_SIZE || zLength < MIN_SIZE) {
            System.out.println("Package to small");
            return false;
        } else if (!isExpress && weight > MAX_WEIGHT) {
            System.out.println("Package weight cant exceed 30.0 kg");
            return false;
        } else if (isExpress && weight > MAX_EXPRESS_WEIGHT) {
            System.out.println("Express package weight cant exceed 15.00 kg");
            return false;
        } else {
            System.out.println("Valid package size");
            return true;
        }
    }
}
