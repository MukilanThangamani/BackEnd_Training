package Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArraySortTest {
   ArraySort arrsort = new ArraySort();
   @Test
   void sorting(){
       int[] ex = {1,3,4,4,7};
       int[] ac = {1,4,3,4,7};
       Assertions.assertArrayEquals(ex, arrsort.sort(ac));
   }
   @Test
    void alreadySorted(){
       int[] ex = {1,2,2,3,4};
       int[] ac = {1,2,2,3,4};
       Assertions.assertArrayEquals(ex, arrsort.sort(ac));
   }
   @Test
    void empArray(){
       int[] ex = {};
       Assertions.assertThrows(NullPointerException.class,()->{
           arrsort.sort(null);
       });
   }
}