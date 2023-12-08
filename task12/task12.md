# **Övning DD1338 Algoritmer och datastrukturer - Övning 12**
Mathias Grindsäter (grin@kth.se)

## 💬**Idag**
* Några punkter från förra veckans task
* Presentera veckans task
* RAST
* Övningar!
    * Matrismultiplikation

## 💬**Punkter från förra veckans task**
* Formattering
* Kommentarer

```java
int mid = (low + high)/2;
// eller
int mid = low + (high - low) / 2;
```


## 💬**DD1337 Lösningar**
* Diskutera era lösningar i grupper om två.
  * Vad gjorde ni annorlunda?
* Presentera i grupper om två.
* Glöm inte att ta frågor och input! 

## **Rast!**

## **Övningar**

## Matrismultiplikation
1. Skapa en klass `MatrixMultiplication`
2. Klassen ska innehålla en metod (se nedan för header) som givet 
matrisens dimensioner skapar en matris med randomiserade element
mellan 1 till 9.

`public int[][] randomMatrixFactory(int m, int n)` 

Givet är en metod som skriver ut matriser (notera att den använder
ett StringBuilder-objekt. Varför är detta bra?):

```java
    public void printMatrix(int[][] matrix) {
        StringBuilder sb = new StringBuilder();

        for (int[] row : matrix) {
            for (int value : row) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
```

3. Skapa en metod `multiplyMatrices` som givet två matriser A och B returnerar matrisen AB.
4. Vad blir tidskomplexiteten för `multiplyMatrices`?
5. Vad blir tidskomplexiteten för hela programmet från start till slut?


