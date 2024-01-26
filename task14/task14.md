# **Övning DD1338 Algoritmer och datastrukturer - Övning 14**
Mathias Grindsäter (grin@kth.se)

## 💬**Idag**
* Presentera veckans task
* RAST
* Övningar
    * Singly Linked List

## 💬**DD1337 Lösningar**
* Diskutera era lösningar i grupper om två.
  * Vad gjorde ni annorlunda?
* Presentera i grupper om två.
  * Glöm inte att ta frågor och input! 

## **Rast!**

## **Övningar**

## Singly Linked List
1. Kopiera koden för din SLL och klistra in koden i en ny fil utanför veckans task.
2. Sätt klassen `ListElement<T>` till `public`.
3. I samma mapp, skapa en ny fil som ska innehålla metoderna i uppgifterna nedan.
4. Metoderna kan implementeras statiskt och behöver bara kunna hantera `Integers`
5. Innan du trycker på pilarna som ger dellösningar och tips, försök först själv
   att skriva varje del själv. Det finns ofta flera sätt att implementera
lösningarna.


### 1. copyLinkedList
Skapa en metod som tar en `LinkedList` som parameter och returnerar
en kopia av listan. 

<details>
  <summary>Header</summary>

`public static LinkedList<Integer> copyLinkedList(LinkedList<Integer> original)`

</details>

<details>
  <summary>Hämta ett element</summary>

`LinkedList.ListElement<Integer> current = original.first;`

</details>

* När du är färdig, fundera över hur din metod hanterar en tom lista.

### 2. removeDuplicates
Skapa en metod `removeDuplicates` som tar en länkad lista som input, och returnerar
en kopia av listan men där element inte dyker upp mer än en gång. Den första
förekomsten av ett element ska behållas (se exempel).

* Exempel
  * Indata: `10 -> 8 -> 8 -> 3 -> 10 -> 3 -> 8 -> 1`
  * Utdata: `10 -> 8 -> 3 -> 1`

Tänk över:
* Kan vi ta hjälp av någon datastruktur?
* Hur många pekare behöver vi, det vill säga hur många/vilka element måste vi
kunna nå.

<details>
  <summary>Header</summary>

`public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> list)`

</details>

<details>
  <summary>Tips på bra datastruktur</summary>

`HashSet`!
</details>

<details>
  <summary>Tips på pekare</summary>

Vi kan använda två pekare: `current` och `previous`
</details>

<details>
  <summary>Hjälp på vägen </summary>

```java

        // ...
        LinkedList<Integer> copiedList = copyLinkedList(list);
        HashSet<Integer> uniqueElements = new HashSet<>();
        LinkedList.ListElement<Integer> current = copiedList.first;
        LinkedList.ListElement<Integer> previous = null;

        while (current != null) {
            // ...
        }
        //...
```
</details>

### 3. reverse
Skapa en metod som tar en länkad lista som indata och returnerar en omvänd kopia 
av listan.

* Exempel:
  * Indata: `0 -> 6 -> 3 -> 9 -> 12 -> 15 -> 18`
  * Utdata: `18 -> 15 -> 12 -> 9 -> 3 -> 6 -> 0`

Tänk över:
* Kan vi representera utdatan på något annat sätt än i exemplet i relation
till indatan?
* Hur många pekare behöver vi.

<details>
  <summary>Representation av utdata</summary>

* Indata: `0 -> 6 -> 3 -> 9 -> 12 -> 15 -> 18`
* Utdata: `0 <- 6 <- 3 <- 9 <- 12 <- 15 <- 18`

</details>

<details>
  <summary>Pekare</summary>

Ett sätt är att använda 3 pekare: `previous`, `current` och `next`

</details>

<details>
  <summary>Hjälp på vägen</summary>

```java
        // ...
        LinkedList<Integer> copiedList = copyLinkedList(list);
        LinkedList.ListElement<Integer> current = copiedList.first;
        LinkedList.ListElement<Integer> previous = null;
        LinkedList.ListElement<Integer> next = null;
    
        while (current != null) {
            // ...
        }
        // ...
```

</details>

<details>
  <summary>Och mer hjälp på vägen</summary>

```java
        while (current != null) {
            next = current.next; 
            current.next = previous; 
            previous = current;
            current = next;
        }
```

</details>






 

