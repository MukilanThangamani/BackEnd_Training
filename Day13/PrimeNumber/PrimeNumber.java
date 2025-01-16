package PrimeNumber;

public class PrimeNumber {
   public boolean isPrime(int num){
       if(num<=0){
           return false;
       }
       int c=0;
       for(int i=1;i<=num;i++){
           if(num%i==0){
               c++;
           }
       }
       return c==2;
   }
}
