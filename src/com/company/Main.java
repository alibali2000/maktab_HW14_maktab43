package com.company;

public class Main {

    public static void main(String[] args)
    {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 1.2, 1.3, 1.4 };
        Character[] charArray = { 'a', 'b', 'c', 'd', 'e' };
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);

    }
    public static <E> void printArray(E[] input)
    {
        for (E element:input)
        {
            System.out.print(element+", ");
        }
        System.out.println();
    }
}
