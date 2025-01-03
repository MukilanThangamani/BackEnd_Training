package AutoboxingAndVarargs;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
    public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      list.add(2);
      list.add(3);
      list.add(5);
      int sum=0;
      for(int num : list){
          sum+=num;
      }
        System.out.println("sum is: "+sum);
    }
}
