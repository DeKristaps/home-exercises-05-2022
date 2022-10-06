# Practice

## Exercise #1

See [Exercise1.java](./Exercise1.java)

## Exercise #2

Train your skills on List, complete all exercises in [lists](./lists) package

## Exercise #3

See [Exercise3.java](./Exercise3.java)

## Exercise #4

Write a console program that asks the user for a list of names (one per line) until the user enters a blank line (i.e., just presses Enter when asked for a name). At that point the program should print out the list of names entered, where each name is listed only once (i.e., uniquely) no matter how many times the user entered the name in the program. For example, your program should behave as follows:

```
Enter name: Alice
Enter name: Bob
Enter name: Alice
Enter name: Alice
Enter name: Alice
Enter name: Bob
Unique name list contains: Alice Bob
```
  
## Exercise #5

Write a console program that asks user for a number and prints whether a given integer is "happy". An integer is "happy" if repeatedly summing the squares of its digits eventually leads to the number 1.

For example, 139 is happy because:

```
1^2 + 3^2 + 9^2 = 91
9^2 + 1^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
```

By contrast, 4 is not happy because:

```
4^2 = 16
1^2 + 6^2 = 37
3^2 + 7^2 = 58
5^2 + 8^2 = 89
8^2 + 9^2 = 145
1^2 + 4^2 + 5^2 = 42
4^2 + 2^2 = 20
2^2 + 0^2 = 4
...
```

## Exercise #6

See [WordCount.java](./WordCount.java)

Write a console program named WordCount that reads a file and reports how many lines, words, and characters appear in it. Suppose, for example, that the file lear.txt contains the passage from Shakespeare's King Lear.

Given this file, your program should be able to generate the following sample run:

```
Lines = 6
Words = 47
Chars = 248
```

For the purposes of this program, a word consists of a consecutive sequence of letters and/or digits, which you can test using the static method Character.isLetterOrDigit.

## Exercise #7

See [FlightPlanner](./FlightPlanner.java)

Write a console program that reads in a file containing flight destinations from various cities, and then allow the user to plan a round-trip flight route.

The flight data come from a file named flights.txt, which has the following format:

  - Each line consists of a pair of cities separated by an arrow indicated by the two character combination ->, as in:
    - New York -> Anchorage
  - The file may contain blank lines for readability (you should just ignore these).

Your program should:

  - Read in the flight information from the file flights.txt and store it in an appropriate data structure.
  - Display the complete list of cities.
  - Allow the user to select a city from which to start.
  - In a loop, print out all the destinations that the user may reach directly from the current city, and prompt the user to select the next city.
  - Once the user has selected a round-trip route (i.e., once the user has selected a flight that returns them to the starting city), exit from the loop and print out the route that was chosen.

Program should start like this:

```
What would you like to do:
To display list of the cities press 1
To exit program press #
> 1
To select a city from which you would like to start press 1
...
```

A critical issue in building this program is designing appropriate data structures to keep track of the information you'll need in order to produce flight plans. You'll need to both have a way of keeping track of information on available flights that you read in from the flights.txt file, as well as a means for keeping track of the flight routes that the user is choosing in constructing their flight plan. Consider how both ArrayLists and HashMaps might be useful to keep track of the information you care about.

## Exercise #8

See [Histogram.java](./Histogram.java)

Write a console program named Histogram that reads a list of exam scores from an input file that contains one score per line and then displays a histogram of those numbers, divided into the ranges 0-9, 10-19, 20-29, and so forth, up to the range containing only the value 100.

```
00-09:
10-19: *
20-29: *
30-39: **
40-49: *
50-59: *****
60-69: *******
70-79: *****************
80-89: ******
90-99: **********
  100: *
```

## Exercise #9

Rewrite the [PhoneDirectory](./phonebook/PhoneDirectory.java) class so that it uses a TreeMap to store directory entries, instead of an array.