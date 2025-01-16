package Factorial;

public class Factorial {
    public int fact(int num){
        if(num==0){
            return 0;
        }
        if(num<0){
            throw new ArithmeticException("Factorial is not defined for negative numbers");
        }
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }

}
