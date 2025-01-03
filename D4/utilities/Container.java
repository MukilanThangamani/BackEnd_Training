package D4.utilities;

public class Container<T> {
    T ob1;
   public Container( T o){
        this.ob1 = o;
    }
    public void showtype(){
        System.out.println("Type of T: "+ob1.getClass().getName());
    }
}
