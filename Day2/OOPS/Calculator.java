package OOPS;

public class Calculator {
    public void add(int a,int b ){
        System.out.println(a+b);
    }
    public double add(double a,double b){
        return a+b;
    }
    public int add(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(5,5);
        System.out.println(c.add(3.21,4.21));
        int[] arr = {1,2,3,4,5};
        System.out.println(c.add(arr));
    }
}
