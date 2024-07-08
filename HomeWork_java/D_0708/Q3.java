package D_0708;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Q3 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("hong", 100),
                new Student("kim", 90),
                new Student("jung", 80),
                new Student("park", 70),
                new Student("moon", 95));

        IntStream stream = list.stream().mapToInt(Student::getScore);
        OptionalDouble result = stream.average();
        if (result.isPresent()) {
            System.out.println(result.getAsDouble());
        } else {
            System.out.println("평균값을 구할 수 없음");
        }
    }
}