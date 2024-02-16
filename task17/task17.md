# **Övning DD1338 Algoritmer och datastrukturer - Övning 17**
Mathias Grindsäter (grin@kth.se)

## 💬**Idag**
* Presentera veckans task
* RAST
* Övningar
    * Delete
    
## 💬**DD1337 Lösningar**
* Diskutera era lösningar i grupper om två.
  * Vad gjorde ni annorlunda?
* Presentera i grupper om två.
  * Glöm inte att ta frågor och input! 

## **Rast!**

## **Övningar**

### **Delete**
* Går igenom de tre fallen på talvan:
  * Inga barn
  * Ett barn
  * 2 barn

* Kopiera din lösning för Tree.java i en ny fil som kan heta samma sak.
* Här är en början på metoden `delete` som hittar `current`, den nod vi vill ta bort.
<details>
  <summary>Klicka här för koden</summary>

```java
public boolean delete(T data) {
        if (root == null) { // Case if the tree is empty
            return false; 
        }

        TreeNode<T> current = root;
        TreeNode<T> parent = null;
        boolean isLeftChild = false;

        // Search for the node to be deleted and its parent
        while (current != null && !current.data.equals(data)) {
            parent = current;
            if (data.compareTo(current.data) < 0) {
                current = current.leftChild;
                isLeftChild = true;
            } else {
                current = current.rightChild;
                isLeftChild = false;
            }
        }

        // If the node isn't found
        if (current == null) {
            return false;
        }
        
        // Implementation av de tre fallen
        // ...
        
        size--;
        return true;

```
</details>

1. Nu ska du i en första if-sats implementera fall 1. Här är en början på koden 
för att komma igång.

<details>
  <summary>Klicka här!</summary>

```java
// Case 1
if (current.leftChild == null && current.rightChild == null) {
    if (current == root) {
        root = null; // Tree is now empty
    } else if (isLeftChild) {
        // Din kod här
    } else {
        // Din kod här
    }
}
```

</details>

2. Implementera nu fall 2

<details>
  <summary>Click to expand</summary>

```java
// Case 2: Node to be deleted has one child
else if (current.rightChild == null) {
    if (current == root) {
        root = current.leftChild;
    } else if (isLeftChild) {
        // Din kod här
    } else {
        // Din kod här
    }
} else if (current.leftChild == null) {
    if (current == root) {
        root = current.rightChild;
    } else if (isLeftChild) {
        // Din kod här
    } else {
        // Din kod här
    }
}

```

</details>

3. För fall 3 behöver vi en hjälpmetod som hittar det minsta elementet
i det högra delträdet. Den ges här:
<details>
  <summary>Hjälpmetod</summary>

```java

    // Find the successor node i.e. the minimum node in the right subtree
    private TreeNode<T> getSuccessor(TreeNode<T> node) {
        TreeNode<T> successorParent = node;
        TreeNode<T> successor = node;
        TreeNode<T> current = node.rightChild;

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }

        // If the successor is not the right child of the node
        if (successor != node.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = node.rightChild;
        }

        return successor;
    }
```

</details>

Här är en början för fall 3

<details>
  <summary>Fall 3</summary>

```java
// Case 3: Node to be deleted has two children
else {
    TreeNode<T> successor = getSuccessor(current);

    if (current == root) {
        root = successor;
    } else if (isLeftChild) {
        // Din kod här
    } else {
        // Din kod här
    }

    successor.leftChild = current.leftChild;
}
```


</details>



 

