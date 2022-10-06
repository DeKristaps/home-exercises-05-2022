# Practice

## Exercise #1 - LazyBox
Sometimes initializing of an object takes a long time for example when there is a need to do a lot of calculations
before object can be created. Objects that are initialized only upon request are called lazy objects.

Create a class LazyBox that can store any object but will actually create it only when someone requests to take it 
out of the box.

Example of functionality:
```
    public static void main(String[] args) {

        LazyBox<Integer> box = new LazyBox<>(MainProgram::calculate);
        
        //First time calling get - it should calculate the value
        Integer contents = box.get();
        
        //Second time calling get - it should just return previously calculated value and not calculate again
        Integer contents2 = box.get();
    }

    public static Integer calculate() {
        return 200;
    }
```

## Exercise #2 - Orders and invoices

There is a necessity to create orders with items and afterwards invoices. Items can 
be of three different types - food, electronics and household items.

Objects from business viewpoint:
* Item - available data: name and price without VAT
* Order - should contain list of items
* Invoice - should contain list of items, total sum without and with VAT, invoice can have two statuses: approved and sent

Classes from programmers perspective:
* Item - interface, should contain methods that return name, price and fullInfo
* AbstractItem - abstract class, should implement Item interface and contain functionality and variables that are common for all types of items
* FoodItem - class, should extend AbstractItem, should also contain date of expiration
  * fullInfo method should return "{name}, {price} EUR, best before: {date of expiration}", for example: "Milk, 0.75 EUR, best before: 01.04.2022"
  * constructor should receive name, price and bestBefore date
* ElectronicsItem - class, should extend AbstractItem, should also contain power in watts (W)
  * fullInfo method should return "{name}, {price} EUR, power: {power}W", for example: "Radio, 25.00 EUR, power: 100W"
  * constructor should receive name, price and power
* HouseholdItem - class, should extend AbstractItem, should also contain color (as text)
  * fullInfo method should return "{name}, {price} EUR, color: {color}", for example: "Bucket, 5.00 EUR, color: red"
  * constructor should receive name, price and color
* Order - class, should contain list of items, should have method to add items and to return text that contains list of items
* InvoiceStatus - enum with two values APPROVED, SENT
* Invoice - class, should contain list of items, invoice number, invoice status, price without VAT, price with VAT, constructor should accept order and invoice number. 
By default invoice is with status APPROVED. Invoice should not be editable, it should only contain method send() that will change its status to SENT. 
Invoice should contain method that returns text with formatted invoice. See example below:

```
===================================================
= INVOICE NUMBER: INV123                          =
= STATUS: APPROVED                                =
= 1. Milk, 0.75 EUR, best before: 01.04.2022      =
= 2. Radio, 25.00 EUR, power: 100W                =
= 3. Bucket, 5.00 EUR, color: red                 =
= SUM: 30.75 EUR                                  =
= VAT (21%): 6.46 EUR                             =
= TOTAL: 37.21 EUR                                =
===================================================
```
Test the functionality by creating a class OrderProgram with main method.
* Create items with all three types (food, electronics, household)
* Create order, add items to the order.
* Create invoice from the order.
* Print out invoice.

####NB! No other class except OrderProgram should contain System.out.print / println etc.

## Exercise #3 - Orders and invoices pt 2.

Add functionality to previously created classes.

* If invoice is being created with and empty order - throw error WrongOrderException with appropriate error message
* If trying to add to order food item with expiration date less than today - throw error BadFoodException (think how 
to check if the item that is being added is food item, is there a way to check if object is actually FoodItem?)

## Exercise #4 - Orders and invoices pt 3.

* It should be possible to add to order not only items but also other services, like for example - packing of items.
  * Create interface SellableThing that should contain the same methods as Item interface
  * Edit interface Item so that it extends SellableThing and remove all methods from Item (code should still work)
  * Create interface Service that extends SellableThing
  * Create class ItemPacking that implements Service
    * it should contain static final values - name "Item packing" and price 5, those values must be returned by methods 
    that are required by implementing Service interface
    * method that returns fullInfo should just return "Item packing, 5.00 EUR"
  * Modify the Order class so that it can store both Services and Items. It can be done by using SellableThing interface.
  The method to add items to order should look like something like this: `public void addItem(SellableItem item) { .. }`.
  Also the list type of items in the Order should be changed to `List<SellableItem>`
  * Modify the Invoice class and also change types to `SellableItem` instead of `Item` (code should work)
* Check that you can add also ItemPacking to the order and once we create Invoice from the order it can be printed out 
together with other items, for example:

```
===================================================
= INVOICE NUMBER: INV123                          =
= STATUS: APPROVED                                =
= 1. Milk, 0.75 EUR, best before: 01.04.2022      =
= 2. Radio, 25.00 EUR, power: 100W                =
= 3. Bucket, 5.00 EUR, color: red                 =
= 4. Item packing, 5.00 EUR                       =
= SUM: 35.75 EUR                                  =
= VAT (21%): 7.51 EUR                             =
= TOTAL: 43,26 EUR                                =
===================================================
```