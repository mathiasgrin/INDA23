# **Övning DD1337 Programmering - Övning 6**
Mathias Grindsäter (grin@kth.se)

## 💬**Idag**
* Presentera veckans task
* RAST
* Övningar!

## 💬**DD1337 Lösningar**
* Diskutera era lösningar i grupper om två.
* Presentera i grupper om två.
* Glöm inte att ta frågor och input! 

## **Rast!**

## **Övningar**

## Unika element
1. Skapa en klass som heter `UniqueElements`
2. Givet en lista innehållandes dubletter, returnera en lista
   med enbart unika element mha. ett `HashSet`. Ta gärna hjälp av Oracle:s dokumentationen för
`HashSet`.
   Se koden nedan för att komma igång:
```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        
    }

    public static void main(String[] args) {

    }
}

```

## Matrix

### 1. Printa matrisen

1. Skapa en klass `Matrix`.
2. Skapa en matris i `main`-metoden.
```java
   public static void main(String[] args) {
   int[][] matrix = // Din kod här

        System.out.println("Original Matrix:");
        printMatrix(matrix);
```
3. Skapa nu metoden `public static void printMatrix(int[][] matrix)`
Använd nästlade for-slingor och glöm inte att skilja på 
`System.out.print` och `System.out.println`. Testkör för att
se att utskriften blir korrekt. Den bör bli ungefär såhär:
```java
1 2 3 
4 5 6 
7 8 9 
```

### 2. Matrisens största element
4. Skapa i samma klass en metod `public static int findLargestElement(int[][] matrix)`
som returnerar matrisens största element. Glöm inte att testa
metoden!
```java
    public static int findLargestElement(int[][] matrix) {
        int largest = Integer.MIN_VALUE; // = -2,147,483,648
        /// Din kod här
    }
```

### 3. Transponat
5. Skapa en metod som tar en matris som argument och returnerar matrisens transponat. Metoden ska inte(!) ändra originalmatrisen, utan en ny
matris ska returneras.
```java
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = // Din kod här;
        int cols = // Din kod här;
        int[][] transposed = new int[cols][rows];

        // Din kod här...

        return transposed;
    }
```

### 4. Stack
Givet en stack, flytta det n:te elementet i stacken till toppen av stacken.
Använd `Stack.java` i repot (det är samma som vi gjorde förra gången). I samma mapp
där du har `Stack.java` ska du skriva ditt program, t.ex. `MoveToTop.java`.
Tips - titta på `Stack.java` för inspiration.
Tips - Använd en temporär/tillfällig stack.






