# Java Essential Skills

This repo consists of Java foundation explanations and examples. I have put a lot of notes to save reader, mostly me to check back without lookign elsewere.

## Variables

## static methods
### syntax
- access modifier (`public`/`private`)
- static keyword
- return type can be only one, however a colleciton type can be returned like array, Set etc.
- method identifier
- params and types within () separated by , if more than one like (int param1, double param2, String param3)
- calling any method should follow it's signature, i.e., method name and params with their types `say("hello")`
- `public` access modifier allows static method to be callable from other classes in their methods
- paramets are optional and in that case keep () empty
```java
public|private static returnType methodName ([parameterList]) {
    statements
}
// Example with a class
class TestBed { // class identifier is TitleCase
    public static void main(String[] args){
        System.out.println("getIntOne returns: " +getInt(1)); // called statement method within the class
    }

    private static int getIntOne(int num) { // a private static method declared name is in camelCase
        return num;
    }
}
```

## Constants

## NumberFormat

## Integer and Double
### Dos and Don'ts
```java
// Don't parseInt string
Integer quantity = Integer.parseInt("123");
// Do valueOf string
Integer quantity = Integer.valueOf("123");

// Don't Integer new int, it's deprecated
Integer quantityIntegerObject = new Integer(123);
// Do direct assignment int
Integer quantityIntegerObject = 123;

// Don't Double new double deprecated
Double priceDoubleObject = new Double(123.45);
// Do direct assignment double
Double priceDoubleObject = 123.45;

// Don't directly parse Integer/Double
System.out.println("Double:" + Double.parseDouble("123.abc")); // throws NumberFormatException
// Do enclose in try/catch, use appropriate Exception (checked) vs NumberFormatException (unchecked) exceptions, use valueOf instead to avoid unncessary boxing
try {
    System.out.println("Double:" + Double.valueOf("123.abc"));
} catch (NumberFormatException e) {
    System.out.println("Error: " + e); // Error: java.lang.NumberFormatException: For input string: "123.abc"
}

// Do not forget to handle resource after usage
Scanner sc = new Scanner(System.in);
String choice = "y";
while (choice.equalsIgnoreCase("y")) {
    .....
    choice = sc.next();
}
sc.close();

// Do use try with resource to better handle resource closes automatically
try(Scanner sc = new Scanner(System.in)) {
    String choice = "y";
    while(choice.equalsIgnoreCase("y") {
     ...
    }
}

// Don't use complicated string concatenations
String debugString = "Unformatted: \n" + "Subtotal: " + subtotal + "\n";
// Do use Java text blocks to make it more readable
String debugString = """
    Unformatted:
    Subtotal: """ + subtotal + "\n";
```
Ref: [JavaTextBlock](https://www.baeldung.com/java-text-blocks#:~:text=Since%20Java%2015%2C%20text%20blocks%20are%20available%20as,this%3A%20String%20example%20%3D%20%22%22%22%20Example%20text%22%22%22%3B%20Copy)

## Control structures

- If loop contains only one statement, then {} are not required and become optional. This loop can not have variable declaration and will not compile.
- Any variables declared within {} are block scope
- If condition provided never becomes false, then loop will run infinitely

### while loop syntax
```java
while (booleanExpression)
{
    statements;
}

// Calculate a future value
int i = 1;
int months = 36;
double futureValue = 0;
double monthlyInterestRate = .05;
while (i <= months) { // condition is tested for truthiness first everytime loop starts
    futureValue = (futureValue + monthlyInterestRate) * (1 + monthlyInterestRate);
    i++;
}
```
### do while loop syntax
```java
do {
    statements;
} while(booleanExpression) // condition is tested for truthiness after loop executes

// runs at least once
int i = 1;
int months = 36;
double monthlyInterestRate = .05;
double futureValue = 0;
do {
    futureValue = (futureValue + monthlyPayment) * (1 + monthlyInterestRate)
} while (i <= months)
```
### for loop syntax
```java
for(initializeExpression; booleanExpression; increment/decrementExpression) {
    statements;
}
// single statement no {}
for(int i=0; i<5; i++) System.out.println(i);
// All expression are visible separated by ; inside (). If necessary counter variable can be declared outside of the loop to be accessible after the loop ends as variable declared inside () or loop body between {} is only accessible inside.
```
### nested loops
```java
for(initializeExpression; booleanExpression; incrementDecrementExpression) { // proper indentation is required for readability
    statements;
    do { // variables declared in outer loop are accessible here unless shadowed
        statements;
        while(booleanExpression_3) { // condition once untruthy shall exit the loop
            statements;
        }
    } while(booleanExpression_2)
}
```

### break and continue statements
#### continue
- continue and continue labeled work similarly to break statement, but they jump to the beginning of a loop instead of the end of the loop.
- The unlabeled version of the statement works with the current loop, and labeled version to work with nested loops.
- To skip the rest of the statements in the current loop and jump to the top of the current loop, you can use the continue statement.
- To skip the rest of the statements in the current loop and jump to the top of a labeled loop, you can add a label to the lop and use the labeled continue statement.
- To code a label, type the name of the label and a colon before a loop.
```java
// syntax
label:
loop declaration {
    statements
    another loop declaration {
        statements
        if(conditionalExpression) {
            statements
            continue label;
        }
    }
}
// example
ouer:
for(int i = 2; i<20; i++) {
    for( int j =2; j<i-1;j++){
        int remainder = i%j;
        if(remainder == 0) {
            continue outer;
        }
    }
}

// continue usage - for loop
for(int i=0; i<25; i++) {
    if(i%2==0) continue;// goes on to next iteration at the beginning of iteration
    System.out.println(i);
}

// continue usage - while loop
int i=0;
while (i<100) {
    if(i%2) continue // continue to next iteration without print or increment, an infinite loop may incur or can be moved under increment with print
    System.out.println(i);
    i++;
}
```
#### break
- To jump to the end of the current loop, you can use the break statement
- To jump to the end of an outer loop from an inner loop, you can label teh outerloop and use the labeled break statement. To code a label, type the name of the label and colon before a loop.
```java
// Same goes for do {} while()

// break usage
labelOuter: // can be any label name
while (true) {
    break labelOuter; // breaks the loop and control transfers to line following ending } or line following labelOuter (label name)
}
System.out.println("Ended by the break!");
// break exits the current loop and can transfer control to outer loop or context
```

### switch
#### Old
```java
switch (productCode) {
    case "hm01":
        System.out.println("hm01 was pressed");
        break;
    case "bn03":
        System.out.println("bn03 was pressed");
        break;
    default:
        System.out.println("Product not found!");
        break;
}
```
#### new
```java
switch (productCode) {
    case "hm01" -> System.out.println("hm01 was pressed");
    case "bn03" -> System.out.println("bn03 was pressed");
    default -> System.out.println("Product not found!");
}
```
