# **Övning DD1338 Algoritmer och datastrukturer - Övning 18**
Mathias Grindsäter (grin@kth.se)

## 💬**Idag**
* Presentera veckans task
* RAST
* Övningar
    * Graffärgningsverifikator
    * Största komponent

## 💬**Lite från förra veckan**
* Ha inte med variabler som inte används, städa koden.
* Var noga med att presentera teorifrågorna läsbart.
* Cool kod är inte alltid bäst. Måste vara lätt att läsa!

## 💬**DD1338 Lösningar**
* Diskutera era lösningar i grupper om två.
  * Vad gjorde ni annorlunda?
* Presentera i grupper om två.
  * Glöm inte att ta frågor och input! 

## **Rast!**

## **Övningar**

### **Graffärningsverifikator**
Problemet går vi först igenom på tavlan. Du ska sedan implementera
ett program som tar in en graf och en given färgning och verifierar 
om grafen uppfyller graffärgningsproblemet. Vi får alltså ut ett 
boolean-värde.

Du får implementera programmet som du önskar, men dessa krav måste uppfyllas:
1. Grafen ska presenteras som en 2D-array.
2. Färgerna representeras som siffror i en array, där varje index i array:en
motsvarar en nod i grafen.

Ett tips är att ha grafen och din färg-array som fält, som kan instantieras
i konstruktorn, dvs konstruktorn tar en graf och en färgläggning som argument.
Då kan grafen och färgläggningen skapas i mainmetoden.

När du är färdig med implementeringen ska du:
* Testa din algoritm genom att rita upp flera grafer, först på penna och papper.
* Fundera över vad din verifikator har för tidskomplexitet.
* Fundera över när det är bra och när det är mindre bra att 
representera en graf som en 2D-array.

### **Storleken på den största komponenten**
Du ska implementera ett program som tar en graf och beräknar
antalet noder för den största komponenten i grafen.
För detta är det effektivt att t.ex. använda BFS.

Du får en metod `getLargestComponentSize` som tar en graf som argument.
Den kan t.ex. se ut såhär:
```java
    public static int getLargestComponentSize(int[][] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        int maxSize = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int size = bfs(graph, visited, i);
                maxSize = Math.max(maxSize, size);
            }
        }
        return maxSize;
    }
```
Ditt jobb är nu att implementera BFS-algoritmen som ska returnera
varje komponents storlek per körning.

Här är en testgraf (som också kommer att ritas upp på tavlan):
```java
        int[][] graph = {
            {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0}
        };
```






 

