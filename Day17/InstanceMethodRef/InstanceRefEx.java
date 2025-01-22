package InstanceMethodRef;
@FunctionalInterface
interface Compare{
    void compare(String str);
}
public class InstanceRefEx {
    public  void comparing(String name){
        System.out.println(name.compareToIgnoreCase("passed"));
    }

    public static void main(String[] args) {
        InstanceRefEx ins = new InstanceRefEx();
        Compare comp = ins::comparing;
        comp.compare("given");
    }
}
