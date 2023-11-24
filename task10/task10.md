# **Övning DD1338 Algoritmer och datastrukturer - Övning 10**
Mathias Grindsäter (grin@kth.se)

## 💬**Idag**
* Slut på DD1337, nu DD1338
  * Rättning
* Presentera veckans task
* RAST
* Övningar!
  * Wrapper-metoder
  * Rekursion
  * Fibonacci
  * Börjar titta på nästa veckas task (sortering)

## 💬**DD1337 Lösningar**
* Diskutera era lösningar i grupper om två.
  * Vad gjorde ni annorlunda?
* Presentera i grupper om två.
* Glöm inte att ta frågor och input! 

## **Rast!**

## **Övningar**

## Rekursion

### Rekursiv palindromverifikator
Skriv en rekursiv funktion som tar en sträng som argument. Om strängen
är ett palindrom ska funktionen returnera `True`, annars `False`.

Exempel: abba och racecar ska returnera `True` men computer `False`.

<details>
  <summary>Tips!</summary>

Använd `charAt()`-metoden från `String`-klassen.

</details>


### Fibonacciföljden

1. Skriv en rekursiv funktion `fibonacci(int n)` som returnerar det n:te talet
i fibonaccitalföljden (se tavlan för definition). 

<details>
  <summary>Exempel på lösning</summary>

```java
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
```
</details>


2. Rita ett rekursionsträd för `fibonacci(5). Eftersom varje funktionsanrop 
ger upphov till två funktionsanrop får vi ett binärt rekursionsträd.


3. Som första rad i funktionen, lägg till en rad som skriver ut "Calling Fibonacci n"
där n är argumentets värde. Kan du följa hur programmet körs i ditt träd för `n=5`?
Varför körs programmet som det gör?

<details>
  <summary>Exempel på lösning</summary>

```java
    public static int fibonacci(int n) {
        System.out.println("Calling Fibonacci("  + n + ")");
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
```

</details>

4. Tidskomplexitet: hur många funktionsanrop ger `fibonacci(5)`. Kan vi beskriva det totala antalet funktionsanrop
som `fibonacci(n) med startvärde n ger upphov till? Använd trädet som hjälp!


5. Är detta en effektiv algoritm? Varför/varför inte? Kan du komma på en
mer effektiv (rekursiv) implementation?

Tips: I varje rekursivt anrop, vilka värden behöver vi ta med?

Tips: Använd en wrapper såhär:
```java

public static int fibonacci(int n) {
    return fibonacciRecursive(n, 0, 1);
}
```

### Permutationer 
Problem: givet en lista L, returnera en lista med listor. Varje lista ska utgöra en permutation av L.

1. Använd en wrapper.

```java
    public static <T> List<List<T>> getPermutations(List<T> list) {
        List<List<T>> allPermutations = new ArrayList<>();
        permute(list, 0, allPermutations);
        return allPermutations;
    }
```

Din uppgift blir att implementera permute-metoden. Använd t.ex.
denna header 

`private static <T> void permute(List<T> list, int start, List<List<T>> result)`









