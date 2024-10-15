# Java Essential Skills

This repo consists of Java foundation explanations and examples. I have put a lot of notes to save reader, mostly me to check back without lookign elsewere.

## Variables

## Constants

## NumberFormat

## Integer and Double

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
