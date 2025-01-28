package parallelStream;

import java.util.Arrays;
import java.util.List;
public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45,63,52,76,39,54,56,58,60,62,66,68,78,82);
         list.stream()
                 .parallel()
                .filter(num->num>50)
                .map(num1->num1*num1)
                 .limit(10)
                .forEach(System.out::println);
    }
}