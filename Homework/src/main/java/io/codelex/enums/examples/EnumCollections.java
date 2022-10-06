package io.codelex.enums.examples;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class EnumCollections {
    static final Set<Day> WORKDAYS = EnumSet.of(
            Day.MONDAY,
            Day.TUESDAY,
            Day.WEDNESDAY,
            Day.THURSDAY,
            Day.FRIDAY
    );

    static final Map<Day, Integer> ORDINALS = new EnumMap<>(Day.class);
}
