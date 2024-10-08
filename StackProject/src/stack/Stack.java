package stack;

public interface Stack<T> {
    void push(T element);        // Add element to the top of the stack
    T pop();                     // Remove and return the top element
    T peek();                    // Return the top element without removing it
    boolean isEmpty();           // Check if the stack is empty
}
