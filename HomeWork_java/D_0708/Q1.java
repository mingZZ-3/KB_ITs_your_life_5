package D_0708;

import java.util.Arrays;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("파인애플", "송아지", "양", "스마일", "소");
        strings.stream().filter(s -> s.length() > 1).forEach(s -> System.out.print(s + " "));
        System.out.println();

        List<String> images = Arrays.asList("1.png", "2.png", "3.jpeg", "4.jpeg");
        images.stream().filter(s -> !s.contains(".jpeg")).forEach(s -> System.out.print(s + " "));
    }
}
