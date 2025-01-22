package Optional;
import java.util.Optional;
import java.util.Scanner;

public class StringOptional{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        Optional<String> opt = Optional.of(str1);
        opt.ifPresent(str-> System.out.println(str.toUpperCase()));
    }
}