# **Övning DD1338 Algoritmer och datastrukturer - Övning 11**
Mathias Grindsäter (grin@kth.se)

## 💬**Idag**
* Några punkter från förra veckans task
* Presentera veckans task
* RAST
* Övningar!
  * Tidskomplexitet
    * Insertion Sort
    * Selection Sort
  * Remove duplicates
  * Reverse array

## 💬**Punkter från förra veckans task**
* Identifiera problem med denna kod.
* Vad blir tidskomplexiteten?

```java
    public int sumRecursive(int[] arr){
        if (arr.length == 0){
            return 0;
        } else {
            int[] copyArr = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++){
                copyArr[i] = arr[i + 1];
            }
            return arr[0] + sumRecursive(copyArr);
        }
    }
```

En bättre lösning, men varför?

```java
    public int sumRecursive(int[] numbers){
        int[] arr = new int[numbers.length];
        System.arraycopy(numbers, 0, arr, 0, numbers.length); //copy

        if(arr.length == 0){ // If the array is empty
            return 0;
        }
        else{ // If not empty, invoke recursion method
            return arrayRecursionSum(arr, arr.length - 1);
        }
    }

    private int arrayRecursionSum(int[] arr, int i) {
        if (i == 0) { // Base case
            return arr[i];
        } else { // Recursive case
            return arr[i] + arrayRecursionSum(arr, i - 1);
        }
    }

```





## 💬**DD1337 Lösningar**
* Diskutera era lösningar i grupper om två.
  * Vad gjorde ni annorlunda?
* Presentera i grupper om två.
* Glöm inte att ta frågor och input! 

## **Rast!**

## **Övningar**

## Insertion Sort
```java
InsertionSort(A)
------------------
1   for i = 1 to A.length - 1
2       key = A[i]
3       j = i - 1
4       while j >= 0 and A[j] > key
5           A[j + 1] = A[j]
6           j = j - 1
7       A[j + 1] = key

```


1. Given en array A = {9, 6, 4, 2, 1}, 
gör en lista där du för varje iteration `i=1`, `i=2`, ... `i=|A|-1` 
anger hur många gånger raden `A[j + 1] = A[j]` körs.

```java
i    | antal
------------
1    | ?
2    | ?
3    | ?
...

```

2. Kan du generalisera ett uttryck i termer av `n` hur många
gånger raden `A[j + 1] = A[j]` körs.
3. Gör nu samma sak för A = {1, 2, 3, 4, 5} men undersök
hur många jämförelser `A[j] > key` som utförs.
4. Vad är bästa och sämsta fallet (dvs. hur inputlistan ser ut) för Insertion Sort?

## Selection Sort

```java
SelectionSort(A)
------------------
1   for i = 0 to A.length - 1
2       minIndex = i
3       for j = i + 1 to A.length
4           if A[j] < A[minIndex]
5               minIndex = j
6       swap A[i] and A[minIndex]

```

1. Givet en array `A = {5,4,3,2,1}` och `B = {1,2,3,4,5}`, för 
var och en av A och B, hur många slingor kör den inre loopen
för varje `i`? Gör en lista som i förra uppgiften.
2. Kan du komma på ett uttryck för antalet jämförelser i `n`?

## Remove Duplicates from Sorted Array
1. Att ta bort ett element från en array kan vara väldigt tidsineffektivt, varför?
2. För att inte behöva ta bort element, kommer vi istället att returnera k,
   som är storleken upp till vilket vår array nu är korrekt.
   T.ex.:
```java
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, listan kommer då att se ut såhär: nums = [0,1,2,3,4,_,_,_,_,_]
Där understrecken kan vara vilka tal som helst.
```
3. Implementera lösningen men med två pekare och endast en for-loop. Du får inte ta bort några element,
   dvs, storleken på input-array:en får inte ändras. Starta såhär:

```java
public int removeDuplicates(int[] nums)
```

Glöm inte basfallen!

4. Du kan testa din lösning i LeetCode där problemet är känt som [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)






## Recursive Array Reversal
1. Skapa en wrapper-metod `reverseArray` som tar en int-array som parameter.
Se till att få med relevanta edge-cases. Vi vill inte 
ändra originallistan, så se till att göra en kopia.
2. Skapa en hjälpmetod `swap` som tar en int-array och två indexpekare. Metoden
ska swappa mellan två element och då mutera arrayn (dvs. ingen kopia ska skapas!).
3. Skapa nu den rekursiva funktion `recursiveArrayReverse`. Den 
kommer att behöva tre paramentrar: en array och två indexpekare. 
4. T.ex. bör {1, 2, 3, 4, 5} bli {5, 4, 3, 2, 1}
5. Vad är tidskomplexiteten för din implementation? Vad är worst och best case?




