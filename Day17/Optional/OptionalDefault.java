package Optional;
import java.util.Optional;
public class OptionalDefault {
    public static void main(String[] args) {
        String name = null;
        String res = Optional.ofNullable(name).orElse("Guest");
        System.out.println("Default value of string: "+res);
    }
}