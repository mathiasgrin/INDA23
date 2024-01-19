# **Övning DD1338 Algoritmer och datastrukturer - Övning 13**
Mathias Grindsäter (grin@kth.se)

## 💬**Idag**
* Presentera veckans task
* RAST
* Övningar
    * Inheritance

## 💬**DD1337 Lösningar**
* Diskutera era lösningar i grupper om två.
  * Vad gjorde ni annorlunda?
* Presentera i grupper om två.
* Glöm inte att ta frågor och input! 

## **Rast!**

## **Övningar**

## Inheritance

### Frågor
Börja med att besvara följande frågor
1. Vad är skillnaderna på `private`, `public` och `protected`?
2. Vad är skillnaderna mellan en superclass och en subclass?
3. Vad är en abstrakt klass?
4. Vad är upcasting/implicit casting?
5. `Animal myAnimal = new Dog();` Om `Dog`-klassen ärver från `Animal`-klassen,
   * vad sker vid kompilering och vad sker vid runtime? 
6. Hur fungerar metoden `super()`?
7. Vad är en `enum`?

### Shape.java
1. Börja med att skapa en `enum` `Color` och lägg till dina favoritfärger.
2. Skapa en abstrakt klass `Shape`. Varje `Shape` har ett namn och en färg.
3. Skapa en metod `displayInfo` som printar informationen för en `Shape` till terminalen.
4. Vi vill kunna beräkna arean för en `Shape`, men olika typer (t.ex. cirkel, rektangel osv.) 
kräver olika beräkningar. Hur bör vi implementera metoden `calculateArea`?

### Tre olika typer av `Shape`
Vi ska nu skapa tre olika typer av `Shape`. För varje `Shape` ska vi kunna
beräkna arean (`calculateArea`), Skriva ut information till terminalen (`displayInfo`) och
kunna ändra färg (`changeColor`). Endast `displayInfo` skriver ut till terminalen.
Inga klasser behöver ett fält för att spara arean (varför?). Det räcker med att `calculateArea`
returnerar värdet för arean.

### Circle.java
1. En `Circle` är en `Shape` som behöver en radie.
2. Utöver sin konstruktor bör `Circle` alltså ha tre metoder.
3. Glöm inte att skriva ut `@Override` för rätt metoder.

### Rectangle.java
1. Skapa en klass `Rectangle`. En `Rectangle` är en `Shape` med längd och bredd.
2. Klassen bör alltså ha tre metoder utöver sin konstruktor.
3. Glöm inte att skriva ut `@Override` för rätt metoder.  

### Square.java
1. Skapa en klass `Square`. `Square` är en typ av rektangel, men som känt bara
behöver längden av en sida.
2. Vilka metoder får Square och vilka behöver vi implementera? Klura väl!
3. Testa att sätta `displayInfo` till `private`. Vad händer och varför?

### Shapehandler.java
1. Skapa en klass `Shapehandler`.
2. Skapa en metod `public static double getAreaDifference` som ger differensen mellan arean
av två `Shape`-instanser.
3. Skapa en metod `public static void displayShapeInfo`.
4. 5. Skapa en metod `public static void updateColor` som ändrar färgen på en `Shape`.
5. I en main-metod, skapa tre `Shape`-instanser: en `Circel`, en `Rectangle` och en `Square`.
6. Testa att kompilera, du bör få ett felmeddelande.
Identifiera varför problemet uppstår och implementera sedan en lösning.
7. Efter att du har hittat en lösning, skapa en metod:
`public static void setStandardColors(Shape shape)` 
som målar om given `Shape` som följande:
   * `Circle` -> Röd
   * `Square` -> Blå
   * `Rectangle` -> Gul




 

