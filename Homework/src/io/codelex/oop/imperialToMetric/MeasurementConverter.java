package io.codelex.oop.imperialToMetric;


public class MeasurementConverter {

    public static double convert(int num, ConversionType conversionType) {
        return switch (conversionType) {
            case METERS_TO_YARDS -> num * ConversionType.METERS_TO_YARDS.getConverterType();
            case YARDS_TO_METERS -> num * ConversionType.YARDS_TO_METERS.getConverterType();
            case CENTIMETERS_TO_INCHES -> num * ConversionType.CENTIMETERS_TO_INCHES.getConverterType();
            case INCHES_TO_CENTIMETERS -> num * ConversionType.INCHES_TO_CENTIMETERS.getConverterType();
            case KILOMETERS_TO_MILES -> num * ConversionType.KILOMETERS_TO_MILES.getConverterType();
            case MILES_TO_KILOMETERS -> num * ConversionType.MILES_TO_KILOMETERS.getConverterType();
        };
    }

}
