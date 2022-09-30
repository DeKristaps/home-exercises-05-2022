package io.codelex.runners;

import java.time.LocalTime;

public enum Runner {
    BEGINNER(LocalTime.of(6,0,0),LocalTime.of(4,0,0)),
    INTERMEDIATE(LocalTime.of(3,59,59), LocalTime.of(2,0,0)),
    ADVANCED(LocalTime.of(1,59,59), LocalTime.of(0,0,0));

    final LocalTime minTime;
    final LocalTime maxTime;

    Runner(LocalTime minTime, LocalTime maxTime){
         this.minTime = minTime;
         this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(LocalTime runTime){
        if (runTime.isBefore(ADVANCED.minTime)){
            return ADVANCED;
        } else if (runTime.isBefore(INTERMEDIATE.minTime)) {
            return INTERMEDIATE;
        } else {
            return BEGINNER;
        }
    }
}
