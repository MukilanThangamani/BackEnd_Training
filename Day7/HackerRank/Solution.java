package HackerRank;

//Write your code here
class Arithmetic{
    public int add(int x,int y){
        int sum=x+y;
        return sum;
    }
}
class Adder extends Arithmetic{
    public int adding(int x,int y){
        return add(x, y);
    }
}

public class Solution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}