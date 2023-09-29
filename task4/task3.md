# **Övning DD1337 Programmering - Övning 4**
Mathias Grindsäter (grin@kth.se)

## 💬**Idag**
* Viktiga punkter från task 3
* Presentera veckans task
* RAST
* Öva loopar!

## 💬**DD1337 Viktiga punkter**
* `/` - operatorn

```java
double x = 7.0;
int y = 3;
double result = x / y; // result = 2.3333333333333335
```
```java
int a = 7;
int b = 3;
int result = a / b; // result will be 2
```

* Testa er kod. Använd `System.out.println()`. Helst efter
att ha skrivit en metod, inte när hela programmet är färdigt.


* Direkt åtkomst till fälten i en klass.
```java
public class Car{
    int speed;
    String owner;
    
    public void printCarDetails() {
        System.out.println("Speed: " + getSpeed());
        System.out.println("Owner: " + getOwner());
    }
    
    //ELLER

    public void printCarDetails() {
        System.out.println("Speed: " + speed);
        System.out.println("Owner: " + owner);
    }
}
```


## 💬**DD1337 Lösningar**
* Presentera era for-loopar (slingor) och klockor!

## **Rast!**

## **Övningar**

### n-fakultet n!
Skapa ett program som givet ett tal n skriver ut n-fakultet n!

Definition: `n! = n*(n-1)*(n-2)*...*(3)*(2)*(1)`

Glöm inte att `0! = 1`

```java

public class Factorial {
    public static void main(String[] args) {

        int n = // Ange värde
        
        // Din kod här

    }
}
```

### SumOfDigits
Givet ett tal (t.ex. 7843) så ska programmet skriva ut de enskilda siffrornas summa
dvs. 22 (eftersom 3 + 4 + 8 + 7 = 22).

💬 Tips! Använd de två operatorerna `/` och `%` med talet `10`:

`748 / 10 ger 74`

`748 % 10 ger 8`

💬 Tips! Gå iterativt genom talet från ental, till tiotal osv. Plocka bort
en siffra i taget.

```java
public class SumOfDigits {
    public static void main(String[] args) {
        int number = 7843;

            int sum = 0; // initiera sum.
            
            // Din kod
        
        
            System.out.println("Sum of digits: " + sum);
    }
}
```

### Rita en rätvinklig triangel
Skriv ett program som ritar en rätvinklig triangel som i bilden nedan.
```java
*
* *
* * * 
* * * * 
* * * * *
```
Vi kan skriva programmet direkt i main-metoden. 

💬Ett tips: använd två for-loopar, en som går igenom varje rad och en som, för varje rad, går igenom
varje kolumn. Dvs. nästlade for-loopar.
```java
import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        int numRows = 5;

        // Din kod
        
    }
}
```

### Hitta minsta och största värdena i en array
Givet en array med tal, finn det minsta och det största värdet.
```java
public class FindMinMaxInArray {
    public static void main(String[] args) {

        int[] arr = {9, 18, 2, 183, 485, -54, 432, 4, 18493, 973};

        // Initialize variables to store the largest and smallest values
        int largest = -1;
        int smallest = Integer.MAX_VALUE;

        // Din kod...


        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

    }
}

```
💬Tips: 
* I Java är en array nollindexerad, så när vi itererar över en array
i en for-loop vill vi börja från index `0`.
* Längden för array:en i koden ges av `arr.length`. I koden ovan har arr längden
`10`.
* Ett specifikt värde i en array för ett givet index ges av `arr[i]`.
T.ex. har `arr[3]` värdet `183`. 
* Kuggfråga: vilket värde har `arr[10]` ?




