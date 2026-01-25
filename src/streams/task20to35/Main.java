package streams.task20to35;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------Check If Any Number Is Even---------");
        List<Integer> numbers = List.of(1, 3, 5, 6);
        System.out.println(numbers.stream().anyMatch(x -> x % 2 == 0));
        System.out.println("---------Check If All Numbers Are Positive---------");
        List<Integer> numbers2 = List.of(1, 2, 3, -1);
        System.out.println(numbers2.stream().allMatch(x -> x > 0));
        System.out.println("---------Check If No Number Is Negative---------");
        List<Integer> numbers3 = List.of(1, 2, 3);
        System.out.println(numbers3.stream().noneMatch(x -> x < 0));
        System.out.println("---------Sort Strings Alphabetically---------");
        List<String> names = List.of("Banana", "Apple", "Mango");
        System.out.println(names.stream().sorted().toList());
        System.out.println("---------Sort Numbers in Descending Order---------");
        List<Integer> descNumbers = List.of(4, 1, 7, 2);
        System.out.println(descNumbers.stream().sorted(Comparator.reverseOrder()).toList());
        System.out.println("---------Find Minimum Number---------");
        List<Integer> minNumbers = List.of(9, 3, 6);
        System.out.println(minNumbers.stream().min(Integer::compareTo).orElseThrow());
        System.out.println("---------Find First Element---------");
        List<String> firstNames = List.of("Java", "Python", "C++");
        System.out.println(firstNames.stream().findFirst().orElseThrow());
        System.out.println("---------Skip First 2 Elements---------");
        List<Integer> skipNumbers = List.of(1, 2, 3, 4, 5);
        System.out.println(skipNumbers.stream().limit(2).toList());
        System.out.println("---------Limit to First 3 Elements---------");
        List<Integer> limitNumbers = List.of(10, 20, 30, 40, 50);
        System.out.println(limitNumbers.stream().limit(3).toList());
        System.out.println("---------Remove Duplicate Elements---------");
        List<Integer> dupNumbers = List.of(1, 2, 2, 3, 3, 4);
        System.out.println(dupNumbers.stream().distinct().toList());
        System.out.println("---------Convert Integer List to String List---------");
        List<Integer> intNumbers = List.of(1, 2, 3);
        System.out.println(intNumbers.stream().map(String::valueOf).toList());
        System.out.println("---------Join Strings with Comma---------");
        List<String> words = List.of("A", "B", "C");
        System.out.println(String.join(",", words));
        System.out.println("---------Find Sum of All Numbers---------");
        List<Integer> sumNumbers = List.of(1, 2, 3, 4);
        System.out.println(sumNumbers.stream().reduce(0, Integer::sum));
        System.out.println("---------Count Total Elements---------");
        List<String> items = List.of("pen", "pencil", "eraser");
        System.out.println((long) items.size());
        System.out.println("---------Check If List Is Empty Using Stream---------");
        List<String> emptyList = List.of();
        System.out.println(emptyList.stream().count() == 0);
        System.out.println("---------Convert List to Set---------");

    }

}