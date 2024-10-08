package stack;

public class StackTest {
    public static void main(String[] args) {
        // Test ArrayStack with Integer
        Stack<Integer> arrayStack = new ArrayStack<>();
        arrayStack.push(10);
        arrayStack.push(20);
        System.out.println("ArrayStack Integer Peek: " + arrayStack.peek()); // Output: 20
        System.out.println("ArrayStack Integer Pop: " + arrayStack.pop());   // Output: 20

        // Test LinkedListStack with String
        Stack<String> linkedListStack = new LinkedListStack<>();
        linkedListStack.push("Hello");
        linkedListStack.push("World");
        System.out.println("LinkedListStack String Peek: " + linkedListStack.peek()); // Output: World
        System.out.println("LinkedListStack String Pop: " + linkedListStack.pop());   // Output: World

        // Test LinkedListStack with Integer
        Stack<Integer> linkedListStackInt = new LinkedListStack<>();
        linkedListStackInt.push(100);
        linkedListStackInt.push(200);
        System.out.println("LinkedListStack Integer Peek: " + linkedListStackInt.peek()); // Output: 200
        System.out.println("LinkedListStack Integer Pop: " + linkedListStackInt.pop());   // Output: 200
    }
}
