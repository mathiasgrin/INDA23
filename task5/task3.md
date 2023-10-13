# **Övning DD1337 Programmering - Övning 5**
Mathias Grindsäter (grin@kth.se)

## 💬**Idag**
* Viktiga punkter från task 4
* Presentera veckans task
* RAST
* Vi bygger en (generisk) stack!
* Balanserade parenteser? (Om vi hinner, annars nästa vecka!)

## 💬**DD1337 Viktiga punkter**
* Angivna instruktioner och testfall.
* Kommentarer
* Skilj på att returnera och att printa.

## 💬**DD1337 Lösningar**
* Presentera era tasks i grupper om två.
* Glöm inte att ta frågor och input! 

## **Rast!**

## **Övningar**

### Vi bygger en stack!
### Balanserade parenteser? (Om vi hinner)
Skapa en metod `isBalanced` som tar in en sträng med parenteser:
`"()(()))("` och ger `true` om den är balanserad, annars `false`.

Exempel:
* `((()))` ger `true`
* `(()(` ger `false`
* `()()()` ger `true`

Innan du börjar programmera. Tänk på följande.
1) När är uttrycket balanserat?
2) Hur kan stacken användas för att lösa uppgiften?

`Tips!` : För att en efter en kunna plocka ut varje `char`
i en sträng `str` kan vi göra såhär:
```java
char[] charArr = str.toCharArray();`
```

För att skapa en stack för `char`-typen måste vi använda
en `Wrapper-klass`:
```java
Stack<Character> stack = new Stack<>();
```




