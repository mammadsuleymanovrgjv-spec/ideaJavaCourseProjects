package streams.task1To10;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------FilterEvenNumbers---------");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(numbers.stream().
                filter(n -> n % 2 == 0).
                toList());
        System.out.println("-------ConvertToUppercase---------");
        List<String> names = List.of("java", "stream", "api");
        System.out.println(names.stream().
                map(String::toUpperCase).
                toList());
        System.out.println("-------CountElementsGreaterThan10---------");
        List<Integer> nums = List.of(5, 10, 15, 20);
        System.out.println(nums.stream().
                filter(n -> n > 10).
                count());
        System.out.println("-------RemoveNullValues---------");
        List<String> data = Arrays.asList("A", null, "B", null, "C");
        System.out.println(data.stream().
                filter(Objects::nonNull).
                toList());
        System.out.println("-------FindFirstElementStartingWithA---------");
        List<String> nameList = List.of("Bob", "Alice", "Andrew", "Charlie");
        System.out.println(nameList.stream().
                filter(x -> x.startsWith("A")).
                findFirst().
                orElse("Not Found"));
        System.out.println("-------SquareAndSortNumbers---------");
        List<Integer> numList = List.of(3, 1, 4, 2);
        System.out.println(numList.stream().
                map(n -> n * n).
                sorted().
                toList());
        System.out.println("-------SumOfAllEvenNumbers---------");
        List<Integer> evenNumbers = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(evenNumbers.stream().filter(x -> x % 2 == 0).
                reduce(0, Integer::sum));
        System.out.println("-------ConvertListToMap---------");
        List<String> words = List.of("apple", "banana", "kiwi");
        System.out.println(words.stream().
                collect(Collectors.
                        toMap(w -> w, String::length)));
        System.out.println("-------FindMaximumValue---------");
        List<Integer> numberList = List.of(10, 50, 30);
        System.out.println(numberList.stream().
                max(Integer::compareTo));
        System.out.println("-------GroupStringsByLength---------");
        List<String> wordList = List.of("a", "bb", "ccc", "dd");
        System.out.println(wordList.stream().
                map(String::length).distinct().
                toList());

    }


}