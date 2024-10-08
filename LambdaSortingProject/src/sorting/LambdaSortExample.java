package sorting;

import java.util.ArrayList;
import java.util.List;

public class LambdaSortExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("Banana");
        strings.add("Apple");
        strings.add("Mango");
        strings.add("Pineapple");
        strings.add("Cherry");

        // Print the original list
        System.out.println("Original List: " + strings);

        // Sort the list in descending order using a lambda expression
        strings.sort((s1, s2) -> s2.compareTo(s1));

        // Print the sorted list
        System.out.println("Sorted List (Descending Order): " + strings);
    }
}
