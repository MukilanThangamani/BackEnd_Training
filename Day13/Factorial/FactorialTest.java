package Factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FactorialTest {
     Factorial fact = new Factorial();
     @Test
     void findFact(){
         Assertions.assertEquals(6,fact.fact(3));
     }
     @Test
     void zeroFact(){
         Assertions.assertEquals(0,fact.fact(0));
     }
     @Test
    void negFact(){
         Assertions.assertThrows(Exception.class,()->{
             fact.fact(-1);
         });
     }
}