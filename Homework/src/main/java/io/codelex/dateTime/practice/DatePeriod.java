package io.codelex.dateTime.practice;

import java.time.LocalDate;

public class DatePeriod {
    private final LocalDate start;
    private final LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public DatePeriod intersection(DatePeriod datePeriod) {
        if (isPeriodPartOf(datePeriod)) {
            return new DatePeriod(this.start, this.end);
        } else if (isPeriodContainedBy(datePeriod)) {
            return datePeriod;
        } else if (isPeriodBefore(datePeriod)) {
            LocalDate end;
            if (this.end.isBefore(datePeriod.end)) {
                end = this.end;
            } else {
                end = datePeriod.end;
            }
            return new DatePeriod(datePeriod.start, end);
        } else if (isPeriodAfter(datePeriod)) {
            LocalDate end;
            if (this.end.isBefore(datePeriod.end)) {
                end = this.end;
            } else {
                end = datePeriod.end;
            }
            return new DatePeriod(this.start, end);
        } else {
            return null;
        }
    }

    private boolean isPeriodPartOf(DatePeriod datePeriod) {
        return datePeriod.start.isBefore(this.start) && this.end.isBefore(datePeriod.end);
    }

    private boolean isPeriodContainedBy(DatePeriod datePeriod) {
        return this.start.isBefore(datePeriod.start) && datePeriod.end.isBefore(this.end);
    }

    private boolean isPeriodBefore(DatePeriod datePeriod) {
        return this.start.isBefore(datePeriod.start);
    }

    private boolean isPeriodAfter(DatePeriod datePeriod) {
        return datePeriod.start.isAfter(this.start);
    }

}
