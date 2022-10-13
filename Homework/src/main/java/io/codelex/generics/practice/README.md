# Practice

## Exercise #1

Implement a list with two methods:

```java
public void add(int i, Object el) { ... }

public Object get(int i) { ... }
```

Implement the list and discuss the advantages and the limitations of the three different approaches below.

  - Implement the list using only one class without generics.
  - Implement the list using one abstract class/interface and then (some) subclasses that implement it for different types.
  - Implement the list using generic types.
  
## Exercise #2

Consider the following Java method:

```java
    String concatenate(List<?> list) {
        String result = "";
        String separator = "";
        if (list instanceof List<String>) {
            result = "String:";
            separator = " ";
        } else if (list instanceof List<Integer>) {
            result = "Integers:";
            separator = "+";
        }
        for (Object el : list)
            result = result + separator + el.toString();
        return result;
    }
```

  - This program is rejected by the Java compiler. Why?
  - Rewrite and compile the program. What are the results of executing the method passing each of the following:
    - list of strings containing only one element "word"?
    - list of Integers containing only one element Integer(1)?
    - list of Objects containing only one element (initialized by new Object())?
  - Is this behaviour consistent with what you would expect from the initial program? If not, how can you fix it?
  - What would happen if you tried to implement the different cases using method overloading instead of just one method. Why is this the case?

## Exercise #3

Consider the following Java method:

```java
public void add(Object value, List<?> list) {
    list.add(value);
}
```

The Java compiler rejects this program, with the following message:

```The method add(capture#1-of ?) in the type List<capture#1-of ?> is not applicable for the arguments (Object)```

  - Explain why we obtain such an error.
  - Fix the program by using a generic type for the parameter of method add and constraining the wildcard appropriately.
  - We can use the following alternative signature for add: ```public <V> void add(V value, List<V> list)``` Is this solution more restricted than the one obtained using the wildcard?

Consider the following methods:
```java
public <V> void addAllX(List<V> v, List<? super V> l) {
    for(V el : v) l.add(el);
}
public <V> void addAllY(List<V> v, List<V> l) {
    for(V el : v) l.add(el);
}
```

Method addAllX is less restrictive than addAllY. Provide an example to prove this claim.

## Exercise #4

Clearly a Wolf can eat a Sheep but not the other way around. In the following subtasks we explore if relaxing some of the Java type rules can lead to a situation where a Sheep can eat a Wolf - that is, the method eat is called on an object of the dynamic type Sheep with an argument object of the dynamic type Wolf.
 
All the code you give in the answers to the following sections is in the same package as the code above, and must type check in standard Java. The top method that is called in all sections is Zoo.manage.

1. Assume the following body of Zoo.feedAnimal(Cage cage), which is rejected by the
   Java type checker:
   
```java
feed(cage.getAnimal().lunchBag, cage.getAnimal());
```
   
Make a Sheep eat a Wolf assuming the body of feedAnimal is exempted from the type checker. Show all necessary code. You are only allowed to change the Cage class and provide the body of the Zoo.manage method

2. Assume the following body of Zoo.feedAnimal(Cage cage), which is rejected by the Java type checker:

```java
feed(cage.animal.getLunchBag(), cage.animal);
```

Can you make a Sheep eat a Wolf if the body of feedAnimal is exempted from the type checker? If so, show all necessary code, otherwise explain why not. You are only allowed to change the Cage class, provide the body of the Zoo.manage method, and add new classes.

3. Answer the question in the previous section, assuming the field Cage.animal is final. Explain your answer. Reminder: Java’s final fields can be assigned to only in the constructor of the class that declares them.

4. Assume the following body of Zoo.feedAnimal(Cage cage), which is rejected by the Java type-checker:

```java
feed(cage.animal.lunchBag, cage.animal);
```

Can you make a Sheep eat a Wolf if the body of feedAnimal is exempted from the typechecker? If so, show all necessary code, otherwise explain why not.