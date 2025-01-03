package D4.utilities.pack;

import D4.utilities.Container;
import D4.utilities.Priority;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        Container<Integer> obj1 = new Container<Integer>(25);
        obj1.showtype();
        Priority s = Priority.HIGH;
        System.out.println(s);
    }


}
