package com.generics;

public class Main {
    public static void main(String[] args) {
        MinMaxImpl<Integer> intMinMax = new MinMaxImpl<>();
        Integer[] intArray = { 12, 4, 56, 19, 7 };
        System.out.println("Integer Array Min: " + intMinMax.min(intArray));
        System.out.println("Integer Array Max: " + intMinMax.max(intArray));

        MinMaxImpl<String> stringMinMax = new MinMaxImpl<>();
        String[] strArray = { "apple", "orange", "banana", "grape" };
        System.out.println("String Array Min: " + stringMinMax.min(strArray));
        System.out.println("String Array Max: " + stringMinMax.max(strArray));

        MinMaxImpl<Character> charMinMax = new MinMaxImpl<>();
        Character[] charArray = { 'b', 'e', 'a', 'd' };
        System.out.println("Character Array Min: " + charMinMax.min(charArray));
        System.out.println("Character Array Max: " + charMinMax.max(charArray));

        MinMaxImpl<Float> floatMinMax = new MinMaxImpl<>();
        Float[] floatArray = { 12.5f, 3.4f, 7.9f, 1.1f };
        System.out.println("Float Array Min: " + floatMinMax.min(floatArray));
        System.out.println("Float Array Max: " + floatMinMax.max(floatArray));
    }
}

