package com.streamline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberStream {
    public static void main(String[] args) {
        // Step 1: Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Step 2: Stream pipeline to filter, double, and collect even numbers
        List<Integer> evenDoubledNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)    // Filters even numbers
                .map(n -> n * 2)            // Doubles each even number
                .collect(Collectors.toList());  // Collects the result into a list
        
        // Step 3: Print the result
        System.out.println(evenDoubledNumbers);
    }
}
