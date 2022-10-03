# Practice

## Exercise #1

See [NaturalNumbers.java](./NaturalNumbers.java)

## Exercise #2

See [MultiplyByItself.java](./MultiplyByItself.java)

## Exercise #3

Write a program that asks which number position out of 20 random numbers you want to know.
See [RandomNumberPositions.java](./RandomNumberPositions.java)

## Exercise #4

See [Vowels.java](./Vowels.java)

## Exercise #5

Write a program that asks the user to enter two words. The program then prints out both words on one line. The words will be separated by enough dots so that the total line length is 30:

```
Enter first word:
turtle
Enter second word
153
turtle....................153
```

This could be used as part of an index for a book. To print out the dots, use System.out.print(".") inside a loop body.

## Exercise #6

Write a console program in a class named FizzBuzz that prompts the user for an integer, then prints all of the numbers from one to that integer, separated by spaces.
 
Use a loop to print the numbers.
 
But for multiples of three, print "Fizz" instead of the number, and for the multiples of five print "Buzz".
 
For numbers which are multiples of both three and five print "FizzBuzz".
 
Drop to a new line after print each 20 numbers. If the user typed 100, the output would be:

```
Max value? 100
1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz
Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz
41 Fizz 43 44 FizzBuzz 46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz
61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz 76 77 Fizz 79 Buzz
Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz 91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz 
```

## Exercise #7

Write a console program in a class named Piglet that implements a simple 1-player dice game called "Piglet" (based on the game "Pig"). The player's goal is to accumulate as many points as possible without rolling a 1. Each turn, the player rolls the die; if they roll a 1, the game ends and they get a score of 0. Otherwise, they add this number to their running total score. The player then chooses whether to roll again, or end the game with their current point total. Here is an example dialogue where the user plays until rolling a 1, which ends the game with 0 points:

```
Welcome to Piglet!
You rolled a 5!
Roll again? yes
You rolled a 4!
Roll again? yes
You rolled a 1!
You got 0 points.
```

Here is another example dialogue where the user stops early and gets to end the game with 10 points:

```
Welcome to Piglet!
You rolled a 6!
Roll again? y
You rolled a 2!
Roll again? y
You rolled a 2!
Roll again? n
You got 10 points.
```

You can use the method readBoolean to ask the user a yes/no question.

## Exercise #8

Write a console program in a class named *AsciiFigure* that draws a figure of the following form, using for loops.

```
////////////////\\\\\\\\\\\\\\\\
////////////********\\\\\\\\\\\\
////////****************\\\\\\\\
////************************\\\\
********************************
```

Then, modify your program using an integer **class constant** so that it can create a similar figure of any size. For instance, the diagram above has a size of 5. For example, the figure below has a size of 3:

```
////////\\\\\\\\
////********\\\\
****************
```

And the figure below has a size of 7:

```
////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\
////////////////////********\\\\\\\\\\\\\\\\\\\\
////////////////****************\\\\\\\\\\\\\\\\
////////////************************\\\\\\\\\\\\
////////********************************\\\\\\\\
////****************************************\\\\
************************************************
```

## Exercise #9

Write a console program in a class named *RollTwoDice* that prompts the user for a desired sum, then repeatedly rolls two six-sided dice (using a Random or RandomGenerator object to generate random numbers from 1-6) until the sum of the two dice values is the desired sum. Here is the expected dialogue with the user:

```
Desired sum: 9
4 and 3 = 7
3 and 5 = 8
5 and 6 = 11
5 and 6 = 11
1 and 5 = 6
6 and 3 = 9
```

## Exercise #10

Write a console program in a class named NumberSquare that prompts the user for two integers, a min and a max, and prints the numbers in the range from min to max inclusive in a square pattern. Each line of the square consists of a wrapping sequence of integers increasing from min and max. The first line begins with min, the second line begins with min + 1, and so on. When the sequence in any line reaches max, it wraps around back to min. You may assume that min is less than or equal to max. Here is an example dialogue:

```
Min? 1
Max? 5
12345
23451
34512
45123
51234
```