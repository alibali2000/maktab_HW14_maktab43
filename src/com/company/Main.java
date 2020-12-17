package com.company;

public class Main {

    public static void main(String[] args)
    {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 1.2, 1.3, 1.4};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);

        printArray(intArray,1,3);
        printArray(doubleArray,1,3);
        printArray(charArray,1,3);

    }

    public static <E> void printArray(E[] input)
    {
        for (E element : input)
        {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    public static <E> void printArray(E[] input, int lowSubscript, int highSubscript)
    {
        if (lowSubscript<0||lowSubscript>input.length)
            throw new IllegalArgumentException("wrong subcript");
        if (highSubscript<0||highSubscript>input.length)
            throw new IllegalArgumentException("wrong subcript");
        for (int i = 0; i < input.length; i++)
        {
            if (i <= highSubscript & i >= lowSubscript)
                System.out.print(input[i] + ", ");
        }
        System.out.println();
    }

}
