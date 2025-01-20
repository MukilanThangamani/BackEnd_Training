package syns.Day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformLetters {
    public static void main(String[] args) {
        List<String> studname = new ArrayList<>(
                Arrays.asList(
                        "George","Karthick","Mani","Bala"
                )
        );
        List<String> transform = transformNames(studname);
        transform.forEach(System.out::println);
    }

    private static List<String> transformNames(List<String> studname) {
        return studname.stream().map(name->"Student:"+name.toUpperCase()).collect(Collectors.toList());
    }
}
