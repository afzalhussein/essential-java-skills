# Java Essential Skills

This repo consists of Java foundation explanations and examples. I have put a lot of notes to save reader, mostly me to check back without lookign elsewere.

## Variables

## Constants

## NumberFormat

## Integer and Double
### Dos and Don'ts
```javascript
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
```


## Control structures
### switch
#### Old
```javascript
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
```javascript
switch (productCode) {
    case "hm01" -> System.out.println("hm01 was pressed");
    case "bn03" -> System.out.println("bn03 was pressed");
    default -> System.out.println("Product not found!");
}
```
