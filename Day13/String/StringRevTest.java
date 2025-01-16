package String;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringRevTest {
    StringRev strrev = new StringRev();

    @Test
    void rev() {
        Assertions.assertEquals("nalikum", strrev.reverse("mukilan"));
    }

    @Test
    void emptStr() {
        Assertions.assertEquals("", strrev.reverse(""));
    }
    @Test
    void singlechar(){
        Assertions.assertEquals("m",strrev.reverse("m"));
    }
    @Test
    void revSpecialChar() {
        Assertions.assertEquals("!@#", strrev.reverse("#@!"));
    }
}
