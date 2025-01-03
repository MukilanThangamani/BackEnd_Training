package D4.Generics;

public class GenMet<T,U,V> {
    T ob1;
    U ob2;
    V ob3;
    GenMet(T o1,U o2,V o3){
        this.ob1 = o1;
        this.ob2 = o2;
        this.ob3 = o3;
    }
    void printArray(GenMet<String, Integer, Double> array){
        System.out.println("Value of T :"+ob1.getClass().getName());
        System.out.println("Value of U :"+ob2.getClass().getName());
        System.out.println("Value of V :"+ob3.getClass().getName());
    }
}
class demo{
    public static void main(String[] args) {
        GenMet<String,Integer,Double> obj = new GenMet<String,Integer,Double>("generics",75,23.45);
        obj.printArray(obj);
    }
}

