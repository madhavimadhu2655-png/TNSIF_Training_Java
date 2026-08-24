package org.tnsif.acc.c2tc.streamapi;

import java.util.List;
import java.util.Optional;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AllTerminalOps {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 6, 8, 3, 9, 5, 7);


        // 1. forEach() - print each number
        System.out.println("Numbers printed using forEach:");

        numbers.stream().forEach(n -> System.out.print(n + " "));

        System.out.println();


        // 2. toArray() - convert Stream to Array

        Integer[] array = numbers.stream().toArray(size -> new Integer[size]);

        System.out.println("Array: " + Arrays.toString(array));


        // 3. reduce() - sum of all numbers

        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
                         

        System.out.println("Sum of numbers: " + sum);


        // 4. collect() - collect unique numbers into List

        List<Integer> uniqueNumbers = numbers.stream()
                                             .distinct()
                                             .collect(Collectors.toList());

        System.out.println("Unique numbers: " + uniqueNumbers);


        // 5. min() - find minimum number

        Optional<Integer> min = numbers.stream().min((a, b) -> a.compareTo(b));
                                       

        min.ifPresent(value ->
                System.out.println("Minimum number: " + value));


        // 6. max() - find maximum number

        Optional<Integer> max = numbers.stream().max((a, b) -> a.compareTo(b));
                                       

        max.ifPresent(value ->
                System.out.println("Maximum number: " + value));


        // 7. count() - count number of elements

        long count = numbers.stream()
                            .count();

        System.out.println("Count of numbers: " + count);


        // 8. anyMatch() - check if ANY number is greater than 6

        boolean anyGreaterThan = numbers.stream().anyMatch(n -> n > 6);
                                        

        System.out.println("Any number greater than 6: "
                           + anyGreaterThan);


        // 9. allMatch() - check if ALL numbers are positive

        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
                                     

        System.out.println("All numbers are positive: "
                           + allPositive);


        // 10. noneMatch() - check if NO number is negative

        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
                                      

        System.out.println("No number is negative: " + noneNegative);


        // 11. findFirst() - find the first element

        Optional<Integer> first = numbers.stream().findFirst();
                                         

        first.ifPresent(value ->
                System.out.println("First number: " + value));


        // 12. findAny() - find any element

        Optional<Integer> any = numbers.stream().findAny();
                                       

        any.ifPresent(value ->
                System.out.println("Any number: " + value));
    }
}