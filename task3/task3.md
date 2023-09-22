# **Övning DD1337 Programmering - Övning 3**
Mathias Grindsäter (grin@kth.se)

## 💬**Idag**
* Viktiga punkter från task 2
* Presentera veckans task
* RAST
* ATMSystem.java

## 💬**DD1337 Viktiga punkter**
* Kommentera er kod - `Javadoc`
```java
    /**
     * Generates two random integers within the specified range and returns their sum.
     *
     * @param min The minimum value for the random integers (inclusive).
     * @param max The maximum value for the random integers (inclusive).
     * @return The sum of two random integers.
     * @throws IllegalArgumentException If the min value is greater than the max value.
     */
    public static int randomAdd(int min, int max) {
        ...
    }
```

* Deskriptiva variabelnamn.
* Magic number

```java
if (i < 33) {return sum};
```
* Indentering och formattering.
* Kompilering i terminalen: `javac`

## 💬**DD1337 Lösningar**
* Presentera veckans task!
## **Rast!**

## **Övningar**

### ATMSystem.java - kör i par!

1) Skapa en klass: `ATMSystem`
2) Klassen ska ha två fält: `accountBalance`
och `userPin`. Tänk på vilka typer
som passar.
3) Skapa en konstruktor.
4) Skapa en getter- och  settermetod
för fältet `accountBalance`. Ingen setter eller getter
behövs för fältet `userPin`.
5) Skapa en metod `deposit`. Metoden ska inte 
returnera något, men ska ändra värdet på
accountBalance med en summa givet som argument.
Se till så att vi inte kan sätta in negativa summor på kontot.
Om insättningen lyckas respektive misslyckas ska det
skrivas ut till användaren.
6) Skapa en metod `withdraw`. Metoden ska inte 
returnera något. Metoden
ska ta in en summa som argument och ändra värdet på
`accountBalance`. Om vi lyckas ta ut den
givna summan så ska metoden skriva ut att 
uttaget lyckats ihop med det nya saldot.
Se till att man inte kan ta ut mer pengar
än man har på kontot och att man inte kan
ta ut summor mindre eller lika med 0. Om uttaget misslyckas
ska anledningen skrivas ut till användaren.
7) Fyll i metoden `runATM()`. Ta en titt på koden nedan innan du går vidare och se
till att du förstår vad den gör - fråga gärna om hjälp!
* Om användaren skriver in `1` så ska metoden skriva ut `accountBalance`.
* Om användaren skriver in `2` så ska bankomaten fråga användaren
vilken summa den vill ta ut, ta in summan med `scanner`-objektet
och sen ta ut den givna summan från kontot.
* Om användaren skriver in `3` så ska bankomaten fråga användaren
hur stor summa som ska sättas in på kontot, ta in summan och sen se
till att pengarna hamnar på kontot.
* Om användaren skriver in `4` så ska bankomaten önska användaren
en fortsatt trevlig dag!
* Om någon annan siffra än `1,2,3 eller 4` har angetts ska bankomaten
skriva ut `"invalid user input. Please try again."`.
8. Testa att skapa ett objekt och anropa `runATM`-metoden.
9. Om allt fungerar som det ska så kan du göra om punkt 7 fast med
`switch statements` - använd en sökmotor du gillar och fråga gärna mig om hjälp!

```java
public void runATM() {
        // Skapa ett Scanner-objekt för att läsa
        // användarens input.
        Scanner scanner = new Scanner(System.in);
        
        // Hämta användarens input.
        System.out.print("Enter your PIN: ");
        int enteredPIN = scanner.nextInt();

        // Vid korrekt angiven PIN.
        if (enteredPIN == userPIN) {
            int userInput;
            do {
                // Bankomaten har 4 knappar.
                System.out.println("\nATM Menu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Funds");
                System.out.println("3. Deposit Funds");
                System.out.println("4. Exit");
                System.out.print("Enter your userInput: ");
                // Hämta användarens input
                userInput = scanner.nextInt();

                // DIN KOD HÄR...

        
        
            // Håller oss i loopen (koden mellan do och while)
            // tills användaren matar in 4.
            // Då lämnar vi loopen och avslutar programmet.
            } while (userInput != 4); 
        }
        // Hit kommer vi om om användaren ger fel PIN.
        // Vilket if-statement hör denna else ihop med?
        else {
            System.out.println("Invalid PIN. Access denied.");
        }
    }
```


