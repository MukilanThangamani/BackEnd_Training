package Palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {
    Palindrome palin = new Palindrome();
    @Test
    void strpal(){
        Assertions.assertTrue(palin.strpalin("madam"));
    }
    @Test
    void nonpalin(){
        Assertions.assertTrue(palin.strpalin("madam"));
    }
    @Test
    void caseSen(){
        Assertions.assertTrue(palin.strpalin("Madam"));
    }
}