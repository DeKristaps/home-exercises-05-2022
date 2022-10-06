# Practice

## Exercise #1
Create application in which you can enter two dates (LocalDate) and it will calculate how many hours regular office 
employee works in that period of time. Assumptions are that employee works only in working days, national holidays are 
ignored and he works 8h per working day.

## Exercise #2
Server update must be performed every two weeks (14 days). 
Given a date when server is launched create a method that calculates at which dates server must be updated in given month.
For example if server is launched on 02.02.2022 it must be updated on 16th of February, then on 2nd of March.

So if user inputs server launch date (for ex. 01.06.2022), year (for ex. 2022) and month (for ex. September), then 
application should return at which dates server must be updated in September 2022.

## Exercise #3

Create a class DatePeriod. It should contain two LocalDate fields - start and end.
In the class create a method named - intersection. The intersection method should receive DatePeriod as a parameter and return DatePeriod - the intersection of both periods. If periods do not intersect with each other, intersection method should return null.

See example how it should work:

```
LocalDate firstStart = LocalDate.of(2022, 1, 1);
LocalDate firstEnd = LocalDate.of(2022, 1, 15);
DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

LocalDate secondStart = LocalDate.of(2022, 1, 10);
LocalDate secondEnd = LocalDate.of(2022, 1, 25);
DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

DatePeriod overlap = firstPeriod.intersection(secondPeriod);

//overlap variable should have start date 10.01.2022 and end date 15.01.2022
```

Hint: think of all the possible scenarios how two periods can overlap each other before writing code. Write smaller private methods inside DatePeriod class that would help to calculate intersection, like for example method that would check if periods even overlap, if one period completely includes the other etc.

