package StaticMethod;
@FunctionalInterface
interface square{
    void sqrt(int num);
}
public class Maths {
    public static void sqrt(int num){
        System.out.println("square root is : "+Math.sqrt(num));
    }
    public static void main(String[] args) {
        square sq  = Maths::sqrt;
        sq.sqrt(4);
    }
}
