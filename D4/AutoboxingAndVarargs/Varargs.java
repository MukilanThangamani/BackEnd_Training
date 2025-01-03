package AutoboxingAndVarargs;

public class Varargs {
    public int sum(int sum,int ... numbers){
        for(int num: numbers){
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Varargs obj = new Varargs();
        System.out.println("Sum is: "+obj.sum(0,2,3,5));
    }
}
