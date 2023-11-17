# **Övning DD1337 Programmering - Övning 8**
Mathias Grindsäter (grin@kth.se)

## 💬**Idag**
* Från task 7
* Kort om static 
* EXPO
* RAST
* Presentation
* IntelliJ IDEA och tester

## 💬**Från task 7**
Vad kan vara bra här?
```java
public double frequencyOf(String word) {
    return (double) occurrencesOf(word) / wordCount();
}
```

Detta är onödigt.
```java
int counter = 0;
for (int i = 0; i < numbersList.size(); i++) {
    counter++;
}
```

Vad är problemet här?

```java
public Integer getFirstElement(ArrayList<Integer> arrayList) {
    Integer firstElement = arrayList.get(0);
    return firstElement;
}
```

## 💬**static**

Exempel
```java
    public static void swap(int[] arr, int index1, int index2) {
        if (index1 < 0 || index1 >= arr.length || index2 < 0 || index2 >= arr.length) {
            System.out.println("Invalid indices for swapping.");
            return;
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
```

```java
public static final int MY_CONSTANT_INTEGER = 42;
```

## 💬**EXPO**

## **Rast!**

## **Presentation**
Saker att utvärdera:

* Hur är klasstrukturen/klassindelningen? 

* Enkapsulering 
  * access modifiers (public, private, protected) 
  * getters/setters

* Används arv (inheritance)?

* Dokumentation

* Felhantering












