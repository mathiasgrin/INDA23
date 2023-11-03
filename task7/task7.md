# **Övning DD1337 Programmering - Övning 7**
Mathias Grindsäter (grin@kth.se)

## 💬**Idag**
* Presentera veckans task
* RAST
* Övningar

## 💬**DD1337 Lösningar**
* Diskutera era lösningar i grupper om två.
* Presentera i grupper om två.
* Glöm inte att ta frågor och input! 

## **Rast!**

## **Övningar**

### TwoSum
1. Börja med att titta in instruktionerna för Two Sum-problemet på
[LeetCode](https://leetcode.com/problems/two-sum/). 
2. Testa att lösa problemet genom att använda två for-slingor
   (varav en nästlad). Se till att LeetCode ger godkänt!
3. Problemet med att använda en nästlad for-slinga såhär
är att algoritmen blir långsam. Testa nu istället att lösa problemet
genom att använda en for-loop istället för två och en hashmap.
Om ingen lösning hittas kan du returnerna en array `{-1, -1}`.

```java
public int[] twoSum(int[] nums, int target){
    HashMap<Integer, Integer> numToIndex = new HashMap<>();
    //...
}
```
Tips: använd `int complement = target - nums[i];`

Tips: Fundera på varför hashmappen heter `numToIndex`. 

### Graf som HashMap
Det är vanligt att representera en graf som en grannlista. Vi kan då använda
en hashmap där varje key är en nod och varje value är en lista
med nodens grannar. Vi ska nu skapa en klass `Graph` som ska kunna
skapa en graf och skriva ut den.

1. Börja såhär:
```java
import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjacencyList.put(vertex, new ArrayList<>());
    }
```
2. Skapa en metod `public void addEdge(int source, int destination)`
som skapar en kant från source till destination

<details>
<summary>Lösningsförslag</summary>

```java
public void addEdge(int source, int destination) {
    adjacencyList.get(source).add(destination);
    adjacencyList.get(destination).add(source);
}
```
</details>

3. Skapa en funktion `public List<Integer> getNeighbors(int vertex)`
som hämtar grannlistan för noden given som argument.

<details>
<summary>Lösningsförslag</summary>

```java
public List<Integer> getNeighbors(int vertex) {
    return adjacencyList.get(vertex);
}
```

</details>

4. Skapa en toString metod som skriver ut grafen. Använd en StringBuilder
för att bygga strängen.
```java
@Override
public String toString() {
    StringBuilder sb = new StringBuilder("Graph adjacency list:\n");
    // ...
}
```

<details>
<summary>Lösningsförslag</summary>

```java
@Override
public String toString() {
        StringBuilder sb = new StringBuilder("Graph adjacency list:\n");
        for (Integer key : adjacencyList.keySet()) {
            List<Integer> values = adjacencyList.get(key);
            sb.append(key).append(" -> ");
            for (int value : values) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
}
```

</details>

Testa nu att i main-metoden skapa följande graf:
```java
  1
 / \
2   3
 \ /
  4
```

Resultatet bör skrivas ut ungefär såhär:
```java
1 -> 2 3 
2 -> 1 4 
3 -> 1 4 
4 -> 2 3
```










