package D4.Generics;

public class Pair<K,V> {
    K ob1;
    V ob2;
    Pair(K o,V o1){
        this.ob1 = o;
        this.ob2 = o1;
    }
    void showtype(){
        System.out.println("Type of K :"+ob1.getClass().getName());
        System.out.println("Type of V :"+ob2.getClass().getName());
    }
}
class gen{
    public static void main(String[] args) {
        Pair<String,Integer> obj = new Pair<String,Integer>("generics",45);
        obj.showtype();
    }
}