package PrimeNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class PrimeNumberTest {
    PrimeNumber primnum = new PrimeNumber();
    @Test
    void checkPrime(){
        Assertions.assertTrue(primnum.isPrime(2));
    }
    @Test
    void negNum(){
        Assertions.assertFalse(primnum.isPrime(-1));
    }
    @Test
    void largePrime(){
        Assertions.assertTrue(primnum.isPrime(101));
    }
}