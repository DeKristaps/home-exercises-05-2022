# Practice

### NB: Create each exercise in separate package

## Exercise #1

Package: shapes
1) Write an abstract class Shape 
   * Data members: numSides (number of sides)
   * Constructor: initialize numSides
   * Concrete method: get method for numSides
   * Abstract methods: getArea(), getPerimeter()
2) Write a concrete subclass Rectangle
   * Data members: width, height
3) Write a concrete subclass Triangle
   * Data members: width, height
4) In another class, write a main method to define a Rectangle and a Triangle and test their functionality

## Exercise #2

Package: persons
1) Write an abstract class Person
    * Data members: firstName, lastName, id (String), age
   * Constructor: initialize all data variables
   * Concrete methods: getFirstName, getLastName, getId, getAge
   * Abstract methods: getInfo that returns String
2) Write a concrete subclass Employee
   * Data members: position (String, for ex. "Accountant"), startedWorking (date)
   * Constructor: initialize all data variables
   * Methods: getWorkExperience - returns int with how many full years employee has been working in company
   * getInfo should return firstName + lastName + position + howLongHasBeenWorking in company, for example "Accountant John Brown (7 years)"
3) Write a concrete subclass Customer
   * Data members: customerId (String), purchaseCount
   * Constructor: initialize all data variables
   * Methods: getPurchaseCount, setPurchaseCount
   * getInfo should return firstName + lastName + customerId + purchase count, for example "Peter Brown CID1234 (10 purchases)"
4) Write separate class where to test functionality

## Exercise #3

Package: cars

#### First part

1) Create a Manufacturer class that will contain fields: name, year of establishment, country. Include all necessary methods and constructor parameters. Implement the hashCode() and equals() methods.

2) Create a Car class that will contain fields: name, model, price, year of manufacture, manufacturer list (Manufacturer), and engine type (represented as the enum class, e.g. V12, V8, V6, S6, S4, S3). Include all necessary methods and constructor parameters. Implement the hashcode() and equals() methods.

3) Create a class to test functionality

#### Second part

Create a CarService class that will contain a list of cars and implement the following methods:
1. adding cars to the list,
2. removing a car from the list,
3. returning a list of all cars,
4. returning cars with a V12 engine,
5. returning cars produced before 1999,
6. returning the most expensive car,
7. returning the cheapest car,
8. returning the car with at least 3 manufacturers,
9. returning a list of all cars sorted according to the passed parameter: ascending / descending,
10. checking if a specific car is on the list,
11. returning a list of cars manufactured by a specific manufacturer,
12. returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =,
    =,! = from the given.

Add class to test all methods - adding, removing, searching etc. (or add testing to previously created class in the first part)

## Exercise #4

Package: runners
Create an enum Runner class with constants BEGINNER, INTERMEDIATE, ADVANCED. Enum should have two
parameters:
* minimum time of running a marathon in minutes
* maximum running time of the marathon in minutes

In addition, the Runner enum should contain the static getFitnessLevel() method, which takes any time
result of a marathon run, and as a result should return a specific Runner object based on the given time.

## Exercise #5

Package: imperialToMetric

1) Create a ConversionType enum class with the constants METERS_TO_YARDS, YARDS_TO_METERS, CENTIMETERS_TO_ICHES, INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES, MILES_TO_KILOMETERS. Enum should have a Converter type parameter used to perform calculations for a given type.

2) Then create a MeasurementConverter class that will have the convert(int value, ConvertionType conversionType) method and based on the value and type of conversion, used the Converter of the given type and returned the result.

3) Create class to test functionality

## Exercise #6

Package: parcels

Parcel validator
1) Create interface Validatable, which will include a method boolean validate() in its declaration.

2) Create a Parcel class with the parameters:
   • int xLength
   • int yLength
   • int zLength
   • float weight
   • boolean isExpress

3) Implement the Validatable interface in Parcel class

The validate() method should verify that the sum of the dimensions (x, y, z) does not exceed 300, whether each size is not less than 30, whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true. In case of errors, it should inform the user about them.

4) Create class to test functionality


## Exercise #7

Package: computers

Create a Computer class with fields defining computer features: processor, ram, graphics card, company and model. Implement setters, getters, constructor with all fields, toString(), equals() and hashcode() methods.
Instantiate several objects and check how the methods work.


## Exercise #8

Package: computers

Create a Laptop class extending the Computer class from the previous task. The Laptop class should additionally contain the battery parameter.
Implement additional getters, setters, constructor and overwrite the toString(), equals() and hashcode() methods accordingly.
Use a reference to parent class methods (from Laptop class call Computer methods).

## Exercise #9

Create an abstract Shape class with the abstract methods calculatePerimeter() for calculating the
perimeter and calculateArea() for calculating the area.

Create Rectangle, Triangle, Hexagon classes, extending the Shape class, and implementing abstract methods accordingly. Verify the solution correctness.

## Exercise #10

Create an abstract 3DShape class that extends the Shape class from the previous task. Add an additional
method calculateVolume().

Create Cone and Qube classes by extending the 3DShape class, properly implementing abstract methods. Verify the solution correctness.