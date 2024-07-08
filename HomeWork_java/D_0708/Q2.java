package D_0708;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 5, 6, 8};
        IntStream stream1 = IntStream.of(arr);
        stream1.filter(s -> s <= 3).distinct().forEach(s -> System.out.print(s + " "));
        System.out.println();

        double[] arr2 = {5.0, 3.0, 1.0, 33.0, 35.0};
        DoubleStream stream2 = DoubleStream.of(arr2);
        double result = stream2.sum();
        System.out.println(result);

        String[] arr3 = {"정신과", "내과", "신경과", "정형외과"};
        Stream<String> stream3 = Stream.of(arr3);
        stream3.map(s -> s + "사무실").forEach(s -> System.out.print(s + " "));
    }
}
