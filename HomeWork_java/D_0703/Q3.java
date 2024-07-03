package D_0703;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "HI", "smile");
        List<String> upper4words = words.stream().map(String::toUpperCase).filter(word -> word.length() > 3).collect(Collectors.toList());
        List<String> appendWords = words.stream().map(word -> word + "님").collect(Collectors.toList());
        System.out.println(upper4words);
        System.out.println(appendWords);
    }
}
