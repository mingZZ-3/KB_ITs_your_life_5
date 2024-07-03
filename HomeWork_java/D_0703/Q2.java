package D_0703;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> over3numbers = numbers.stream().filter(x -> x > 3).collect(Collectors.toList());
        List<Integer> x10numbers = numbers.stream().map(x -> x * 10).collect(Collectors.toList());
        System.out.println(over3numbers);
        System.out.println(x10numbers);
    }
}
