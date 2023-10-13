import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {

    private List<T> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        try {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            int lastIndex = stack.size() - 1;
            T poppedElement = stack.get(lastIndex);
            stack.remove(lastIndex);
            return poppedElement;
        } catch (EmptyStackException e) {
            System.err.println("The stack is empty");
            return null;
        } 
    }

    public T peek() {
        try {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return stack.get(stack.size() - 1);
        } catch (EmptyStackException e) {
            System.err.println("The stack is empty");
            return null;
        } 
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        System.out.println("Test the stack with integers"); 
        Stack<Integer> intStack = new Stack<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println("Stack size: " + intStack.size());
        System.out.println("Top element: " + intStack.peek());

        while (!intStack.isEmpty()) {
            System.out.println("Popped element: " + intStack.pop());
        }
    }





}