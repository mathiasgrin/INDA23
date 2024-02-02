# **Övning DD1338 Algoritmer och datastrukturer - Övning 15**
Mathias Grindsäter (grin@kth.se)

## 💬**Idag**
* Presentera veckans task
* RAST
* Övningar
    * Regex

## 💬**Från Förra veckans task**
* Återställa en Linked List (i Java).
* Statisk och dynamisk typ
```java
for (Object st : myList) {
    System.out.println(st);
}
```
Exempel:
`Animal myDog = new Dog();`

Upcasting sker implicit om vi har arv.

## 💬**DD1337 Lösningar**
* Diskutera era lösningar i grupper om två.
  * Vad gjorde ni annorlunda?
* Presentera i grupper om två.
  * Glöm inte att ta frågor och input! 

## **Rast!**

## **Övningar**


Grunder: Regex
* `[abc]`
* '?'
* \*
* '+'
* (a|b)
* \w
* \b
* {n} och {n,} och {n,m}
* \d eller [0-9] eller [:digit:]
* [:alpha:] eller [A-Za-z]
* [:alnum:] eller [A-Za-z0-9]

1. Beskriv med UNIX-regex språket:
`{x01y | x och y vilken sträng som helst bestående av ettor och/eller nollor}`
Ge DFA
2. Alternerande 0:or och 1:or (t.ex. 0101, 01010, 101010, 101, 0, 1). Notera också
enbart 1 eller 0 okej!
3. gmail-addresser som (aXj9D.DF@gmail.com).
4. Gör om 2 så att vi även matchar outlook-addresser.
5. Mobilnummer på formen +46 (0)7xx-xxx xxx (där x är siffror).
6. Palindrom där tre bokstäver repeteras (t.ex. kajjak, racecar)


###Inför nästa task
Att programmera mot ett interface
`ArrayList<String> myList = new ArrayList<>();`
`List<String> myList = new ArrayList<>();`




 

