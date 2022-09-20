# Practice

## Exercise #1

Create a class Product that represents a product sold in a shop. A product has a price, amount and name.

The class should have:

  - A constructor public Product(String name, double priceAtStart, int amountAtStart)
  - A method public void printProduct() that prints a product in the following form:

```
Banana, price 1.1, amount 13
```

Test your code by creating a class with main method and add three products there:

  - "Logitech mouse", 70.00 EUR, 14 units
  - "iPhone 5s", 999.99 EUR, 3 units
  - "Epson EB-U05", 440.46 EUR, 1 units
  
Print out information about them.

Add new behaviour to the Product class:

  - possibility to change quantity
  - possibility to change price
  
Reflect your changes in a working application.

## Exercise #2

Think about the classes you need before you start writing. Let us do that with the Car class.

Create a class called *Car*

A class that calculates liter per kilometers.

Variables:

  - double startKilometers; // Starting odometer reading
  - double endKilometers; // Ending odometer reading
  - double liters; // Liters of gas used between the readings

Constructors:

  - Car( double startOdo, double endingOdo, double liters )
  
Methods:

  - double calculateConsumption()
  
Create a test class to verify how Car works:

```java
class LitersPerKilometer {
  public static void main( String[] args )  {
    Scanner scan = new Scanner(System.in);

    double startKilometers, endKilometers, liters;

    System.out.print("Enter first reading: " ); 
    startKilometers = scan.nextDouble();

    System.out.print("Enter second reading: " ); 
    endKilometers = scan.nextDouble();

    System.out.print("Enter liters consumed: " ); 
    liters  = scan.nextDouble();

    Car car = new Car( ? , ? , ?);

    System.out.println( "Kilometers per liter are "  + car.calculateConsumption() );
  }
}
```

Add one more car in the same method, calculate the fuel consumption for both of them.

Modify the Car class of the chapter by adding two methods:

  - boolean gasHog()
    - evaluates to true if the fuel consumption is higher than 15.0 l/km.
  - boolean economyCar()
    - evaluates to true if the fuel consumption is lower than 5.0 l/km.
    
The constructor and the calculateConsumption() method remain unchanged. Each of these new methods should use the calculateConsumption() to get the consumption, not calculate it themselves. An if-else statement picks the correct boolean return value.

Put user interaction back into the main() method method so the user enters values for each car. The main() method uses these additional methods to write a message to the user if the car is a gas hog or an economy car.

You might be tempted to make one of these common design errors:

  1. Saving miles per gallon in an instance variable of the object along with startKilometers, endKilometers, and liters.
    - This almost seems logical, but is a poor design. Don't keep a permanent copy of a value that can be easily calculated from data. The reason for this is that it adds complexity to the object, but offers little advantage.
  2. Directly calculating liters per kilometer inside each of the new methods.
    - It is usually best to do a particular calculation in only method, and to use it whenever the calculation is needed. Now if there is a bug in the calculation, or the calculation must be modified, there is only one place to look.

Change the constructor for the Car class so that it has only one parameter, the first reading of the odometer. The fuel consumption cannot yet be calculated. Now add a method to the class:

```java
void fillUp( int mileage, double liters )
```

This simulates filling up the tank at a gas station: mileage is the current odometer reading and liters is the number of liters that filled the tank.

Save these values in instance variables. With this information, fuel consumption can be calculated. Write the method so that it updates the instance variables each time it is called (simulating another visit to the pumps).

Write a testing class with a main() that constructs a car and calls fillUp() and calculateConsumption() a few times.

## Exercise #3

For this exercise, you will design a set of classes that work together to simulate a car's fuel gauge and odometer. The classes you will design are the following:

The FuelGauge Class: This class will simulate a fuel gauge. Its responsibilities are as follows:

 - To know the car’s current amount of fuel, in liters.
 - To report the car’s current amount of fuel, in liters.
 - To be able to increment the amount of fuel by 1 liter. This simulates putting fuel in the car. ( The car can hold a maximum of 70 liters.)
 - To be able to decrement the amount of fuel by 1 liter, if the amount of fuel is greater than 0 liters. This simulates burning fuel as the car runs.
 
The Odometer Class: This class will simulate the car’s odometer. Its responsibilities are as follows:

 - To know the car’s current mileage.
 - To report the car’s current mileage.
 - To be able to increment the current mileage by 1 kilometer. The maximum mileage the odometer can store is 999,999 kilometer. When this amount is exceeded, the odometer resets the current mileage to 0.
 - To be able to work with a FuelGauge object. It should decrease the FuelGauge object’s current amount of fuel by 1 liter for every 10 kilometers traveled. (The car’s fuel economy is 10 kilometers per liter.)
 
Demonstrate the classes by creating instances of each. Simulate filling the car up with fuel, and then run a loop that increments the odometer until the car runs out of fuel. During each loop iteration, print the car’s current mileage and amount of fuel.

## Exercise #4

The class Movie is started below. An instance of class Movie represents a film. This class has the following three class variables:

 - *title*, which is a String representing the title of the movie
 - *studio*, which is a String representing the studio that made the movie
 - *rating*, which is a String representing the rating of the movie (i.e. PG­13, R, etc)
 
 1. Write a constructor for the class Movie, which takes the title of the movie, studio, and rating as its arguments, and sets the respective class variables to these values.
 2. Write a second constructor for the class Movie, which takes the title of the movie and studio as its arguments, and sets the respective class variables to these values, while the class variable rating is set to "PG".
 3. Write a method getPG, which takes an array of base type Movie as its argument, and returns a new array of only those movies in the input array with a rating of "PG". You may assume the input array is full of Movie instances. The returned array need not be full.
 4. Write a piece of code that creates an instance of the class Movie:
    - with the title “Casino Royale”, the studio “Eon Productions” and the rating “PG­13”.
    - with the title “Glass”, the studio “Buena Vista International” and the rating “PG­13”.
    - with the title “Spider-Man: Into the Spider-Verse”, the studio “Columbia Pictures” and the rating “PG”.

## Exercise #5

Create a class called *Date* that includes: three pieces of information as instance variables — a month, a
day and a year.
 
Your class should have a constructor that initializes the three instance variables and assumes that the values provided are correct.
 
Provide a set and a get method for each instance variable.

Provide a method displayDate that displays the month, day and year separated by forward slashes */*.

Write a test application named DateTest that demonstrates class *Date* capabilities.

## Exercise #6

A soft drink company recently surveyed 12,467 of its customers and found that approximately 14 percent of those surveyed purchase one or more energy drinks per week. Of those customers who purchase energy drinks, approximately 64 percent of them prefer citrus flavored energy drinks. Write a program that displays the following:

 - The approximate number of customers in the survey who purchased one or more energy drinks per week
 - The approximate number of customers in the survey who prefer citrus flavored energy drinks
 
See [EnergyDrinks.java](./EnergyDrinks.java)

## Exercise #7

The questions in this exercise all deal with a class Dog that you have to program from scratch. 

  - Create a class Dog. Dogs should have a name, and a sex.
  - Equip the Dogs with a toString() method, so they are easy to print.
  - Make a class DogTest with a main method in which you create the following Dogs:
    - Max, male
    - Rocky, male
    - Sparky, male
    - Buster, male
    - Sam, male
    - Lady, female
    - Molly, female
    - Coco, female
  - Change the Dog class so that each dog has a mother and a father.
  - Add to the main method in DogTest, so that:
    - Max has Lady as mother, and Rocky as father
    - Coco has Molly as mother, and Buster as father
    - Rocky has Molly as mother, and Sam as father
    - Buster has Lady as mother, and Sparky as father
  - Change the dog class to include a method fathersName that return the name of the father. If the father reference is null, return "Unknown". Test in the DogTest main method that it works. 
    - referenceToCoco.fathersName() returns the string "Buster"
    - referenceToSparky.fathersName() returns the string "Unknown"
  - Change the dog class to include a method boolean hasSameMotherAs(Dog otherDog). The method should return true on the call
    - referenceToCoco.hasSameMotherAs(referenceToRocky). Show that the new method works in the DogTest main method.

## Exercise #8

Design a SavingsAccount class that stores a savings account’s annual interest rate and balance.

 - The class constructor should accept the amount of the savings account’s starting balance.
 - The class should also have methods for:
   - subtracting the amount of a withdrawal
   - adding the amount of a deposit
   - adding the amount of monthly interest to the balance
  
The monthly interest rate is the annual interest rate divided by twelve. To add the monthly interest to the balance, multiply the monthly interest rate by the balance, and add the result to the balance.

Test the class in a program that calculates the balance of a savings account at the end of a period of time. It should ask the user for the annual interest rate, the starting balance, and the number of months that have passed since the account was established. A loop should then iterate once for every month, performing the following:

Ask the user for the amount deposited into the account during the month. Use the class method to add this amount to the account balance.
Ask the user for the amount withdrawn from the account during the month. Use the class method to subtract this amount from the account balance.
Use the class method to calculate the monthly interest.
After the last iteration, the program should display the ending balance, the total amount of deposits, the total amount of withdrawals, and the total interest earned.

Output should be similar to this:

```
How much money is in the account?: 10000
Enter the annual interest rate:5
How long has the account been opened? 4
Enter amount deposited for month: 1: 100
Enter amount withdrawn for 1: 1000
Enter amount deposited for month: 2: 230
Enter amount withdrawn for 2: 103
Enter amount deposited for month: 3: 4050
Enter amount withdrawn for 3: 2334
Enter amount deposited for month: 4: 3450
Enter amount withdrawn for 4: 2340
Total deposited: $7,830.00
Total withdrawn: $5,777.00
Interest earned: $29,977.72
Ending balance: $42,030.72
```

## Exercise #9

Write a method named swapPoints that accepts two Points as parameters and swaps their x/y values.

Consider the following example code that calls swapPoints:

```
Point p1 = new Point(5, 2);
Point p2 = new Point(-3, 6);
swapPoints(p1, p2);
System.out.println("(" + p1.x + ", " + p1.y + ")");
System.out.println("(" + p2.x + ", " + p2.y + ")");
```

The output produced from the above code should be:

```
(-3, 6)
(5, 2)
```

## Exercise #10

Finish [BankAccount.java](./BankAccount.java).

Add the following method:

```
public String toString()
```

Your method should return a string that contains the account's name and balance separated by a comma and space. For example, if an account object named benben has the name "Benson" and a balance of 17.25, the call of benben.toString() should return:

```
Benson, $17.25
```

There are some special cases you should handle. If the balance is negative, put the - sign before the dollar sign. Also, always display the cents as a two-digit number. For example, if the same object had a balance of -17.5, your method should return:

## Exercise #11

See [VideoStoreTest.java](./videostore/VideoStoreTest.java)

The goal of this optional exercise is to design and implement a simple inventory control system for a small video rental store. Define least two classes: a class Video to model a video and a class VideoStore to model the actual store.

Assume that a Video may have the following state:

 - A title;
 - a flag to say whether it is checked out or not; and
 - an average user rating.

In addition, Video has the following behaviour:

 - being checked out;
 - being returned;
 - receiving a rating.
 
The VideoStore may have the state of videos in there currently. The VideoStore will have the following behaviour:

 - add a new video (by title) to the inventory;
 - check out a video (by title);
 - return a video to the store;
 - take a user's rating for a video;
 - list the whole inventory of videos in the store.
 
Finally, create a VideoStoreTest which will test the functionality of your other two classes. It should allow the following.

 - Add 3 videos: "The Matrix", "Godfather II", "Star Wars Episode IV: A New Hope".
 - Give several ratings to each video.
 - Rent each video out once and return it.
 - List the inventory after "Godfather II" has been rented out out.
 
Summary of design specs:

 - Store a library of videos identified by title.
 - Allow a video to indicate whether it is currently rented out.
 - Allow users to rate a video and display the percentage of users that liked the video.
 - Print the store's inventory, listing for each video:
    - its title,
    - the average rating,
    - and whether it is checked out or on the shelves.

## Exercise #13

You are handed a ready-made class [Account.java](./Account.java) along with your exercise files. 
The object of the class Account represents a bank account that has a balance (meaning some amount of money). The accounts are used as follows:

```
Account bartosAccount = new Account("Barto's account",100.00);
Account bartosSwissAccount = new Account("Barto's account in Switzerland",1000000.00);

System.out.println("Initial state");
System.out.println(bartosAccount);
System.out.println(bartosSwissAccount);

bartosAccount.withdrawal(20);
System.out.println("Barto's account balance is now: "+bartosAccount.balance());
bartosSwissAccount.deposit(200);
System.out.println("Barto's Swiss account balance is now: "+bartosSwissAccount.balance());

System.out.println("Final state");
System.out.println(bartosAccount);
System.out.println(bartosSwissAccount);
```

### Your first account

Create a program that creates an account with the balance of 100.0, deposits 20.0 and prints the account.

Note! do all the steps described in the exercise exactly in the described order!

### Your first money transfer

Create a program that:

  - Creates an account named "Matt's account" with the balance of 1000
  - Creates an account named "My account" with the balance of 0
  - Withdraws 100.0 from Matt's account
  - Deposits 100.0 to My account
  - Prints both accounts
  
### Money transfers

In the above program, you made a money transfer from one person to another. Let us next create a method that does the same!

Create the method:

```java
public static void transfer(Account from, Account to, double howMuch)
```
 
The method transfers money from one account to another. You do not need to check that the from account has enough balance.

After completing the above, make sure that your main method does the following:

  - Creates an account "A" with the balance of 100.0
  - Creates an account "B" with the balance of 0.0
  - Creates an account "C" with the balance of 0.0
  - Transfers 50.0 from account A to account B
  - Transfers 25.0 from account B to account C