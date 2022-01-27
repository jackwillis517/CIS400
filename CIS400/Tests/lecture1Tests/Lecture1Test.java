import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lecture1Test {
    public static void main(String[] args) {
        test1();
    }

    @Test
    public static void test1() {
        Assertions.assertEquals("Hello", Lecture1.speak());
    }
}