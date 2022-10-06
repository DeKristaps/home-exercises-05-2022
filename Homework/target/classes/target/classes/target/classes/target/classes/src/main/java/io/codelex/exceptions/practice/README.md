# Practice

## Exercise #1

See [Exercise1.java](Exercise1.java)

For each set of data, the program prints out the result, or an informative error message if there is a problem (division by zero or poor input data).

The program continues looping, even if there is a problem.

Exit the loop when data entered for the numerator start with characters "q" or "Q". Don't print out an error message in this case.

Don't ask for the divisor if the user just asked to quit.

Here is sample output from one run:

```
Enter the numerator: 12
Enter the divisor:  4
12 / 4 is 3

Enter the numerator: 12
Enter the divisor  : 0
You can't divide 12 by 0

Enter the numerator: glarch
You entered bad data.
Please try again.

Enter the numerator: quit
```

## Exercise #2

See [Exercise2.java](Exercise2.java)

Put a statement in methodA() that divides by zero to create an ArithmeticException.. Observe the output.

Remove the division statement from methodA(). Change the code so that methodA() calls methodB() which calls methodC(). Put a statement in methodC() that divides by zero to create an ArithmeticException.. Observe the output.

Add to the code so that methodA() calls methodB() inside a try{} block, and methodB() calls methodC() inside a try{} block. In methodC() put the divide by zero statement inside a try{} block. After each try{} block put a catch{} block which catches the exception, prints a stack trace, and throws the exception object to its caller. Observe the output.

Notice that the stack trace contains information about which class and which method was active at the time of the exception.

## Exercise #3

See [Exercise3.java](Exercise3.java)

## Exercise #4

See [Exercise4.java](Exercise4.java)

Define checked exception to handle cases when input is less than 0.

