package SupplierConsumer;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.Supplier;

public class RandomSupplier {
    public static void main(String[] args) {
       Supplier<Number> supplier = ()->{
            Random random = new Random();
            return random.nextInt(100)+1;
       };
       for(int i=1;i<=5;i++){
           System.out.println(supplier.get());
       }
    }
}
